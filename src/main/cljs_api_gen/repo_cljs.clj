(ns cljs-api-gen.repo-cljs
  (:require
    [clansi.core :refer [style]]
    [clojure.data :refer [diff]]
    [clojure.data.json :as json]
    [clojure.java.shell :refer [sh]]
    [me.raynes.fs :refer [exists? mkdir base-name]]
    [clojure.string :refer [trim split split-lines]]
    [cljs-api-gen.config :refer [repos-dir]]
    [clj-time.coerce :as tc]
    [clj-time.format :as tf]
    ))

(defn timestamp->date-str
  [t]
  (tf/unparse (tf/formatters :date) (tc/from-long t)))

(def ^:dynamic *cljs-version*    "ClojureScript version string   (e.g. \"0.0-3211\")" nil)
(def ^:dynamic *cljs-num*        "ClojureScript version number   (e.g. 3211)" nil)
(def ^:dynamic *cljs-tag*        "ClojureScript version git tag  (e.g. \"r3211\")" nil)
(def ^:dynamic *cljs-date*       "ClojureScript version date     (e.g. \"2015-03-09\")" nil)
(def ^:dynamic *clj-version*     "Clojure version string         (e.g. \"1.7.0-beta1\")" nil)
(def ^:dynamic *clj-tag*         "Clojure version git tag        (e.g. \"clojure-1.7.0-beta1\"" nil)
(def ^:dynamic *gclosure-lib*    "Google Closure release         (e.g. \"0.0-20150505-021ed5b3\"" nil)

(def ^:dynamic *treader-version* "tools.reader version string    (e.g. \"0.9.2\"" nil)
(def ^:dynamic *treader-tag*     "tools.reader git tag           (e.g. \"tools.reader-0.9.2\"" nil)

(defn clone-or-pull!
  [repo-url]
  (let [repo-name (base-name repo-url)
        repo-dir (str repos-dir "/" repo-name)]
    (when-not (exists? repo-dir)
      (sh "git" "clone" repo-url :dir repos-dir))
    (sh "git" "checkout" "master" :dir repo-dir)
    (sh "git" "pull" :dir repo-dir)))

(defn clone-or-fetch-repos!
  []
  (when-not (exists? repos-dir)
    (mkdir repos-dir))
  (clone-or-pull! "https://github.com/clojure/clojurescript")
  (clone-or-pull! "https://github.com/clojure/clojure")
  (clone-or-pull! "https://github.com/clojure/tools.reader"))

(defn get-current-repo-tag
  [repo]
  (trim (:out (sh "git" "describe" "--tags" :dir (str repos-dir "/" repo)))))

(defn get-latest-repo-tag
  [repo]
  (trim (:out (sh "git" "describe" "--abbrev=0" "--tags" "master" :dir (str repos-dir "/" repo)))))

(defn clj-tag->version
  [tag]
  (when-let [[_ v] (re-find #"clojure-(.*)" tag)]
    v))

(defn clj-tag->api-key
  [tag]
  (second (re-find #"clojure-(\d\.\d)" tag)))

(defn cljs-tag->version
  [tag]
  (when-let [[_ number] (re-find #"r(.*)" tag)]
    (str "0.0-" number)))

(defn cljs-tag->num
  [tag]
  (if (= "master" tag)
    ;; some large constant denoting that the master is ahead of all previous versions
    100000
    (when-let [[_ number] (re-find #"r(.*)" tag)]
      (Integer/parseInt number))))

(defn cljs-version->tag
  [version]
  (when-let [[_ n] (re-find #"\d\.\d-(.*)" version)]
    (str "r" n)))

(defn cljs-version->num
  [version]
  (-> version cljs-version->tag cljs-tag->num))

(defn treader-tag->version
  [tag]
  (when-let [[_ v] (re-find #"tools\.reader-(.*)")]
    v))

(defn treader-version->tag
  [version]
  (when version
    (str "tools.reader-" version)))

(defn ls-files
  [repo tag dir]
  (-> (sh "git" "ls-tree" "-r" "--name-only" tag dir :dir (str repos-dir "/" repo))
      :out
      split-lines))

(defn repo-tag-date
  [repo tag]
  (-> (sh "git" "log" "-1" "--format=%ai" tag :dir (str repos-dir "/" repo))
      :out
      trim
      (split #"\s+")
      first))

(defn maven-release-url
  [group artifact]
  (str "http://search.maven.org/solrsearch/select?q=g:%22" group "%22+AND+a:%22" artifact "%22&core=gav&rows=1000&wt=json"))

(defn maven-releases
  [group artifact]
  (-> (maven-release-url group artifact)
      (slurp)
      (json/read-str :key-fn keyword)
      (:response)
      (:docs)))

(defn get-cljs-version-tags
  []
  (let [sh-return (sh "git" "tag" :dir (str repos-dir "/clojurescript"))
        tags (split-lines (:out sh-return))]
    (->> tags
         (filter #(re-find #"^r" %))
         (sort-by cljs-tag->num))))

(def published-cljs-tags
  (atom nil)) ;; list

(def cljs-tag->pub-date
  (atom {}))

(def published-clj-versions
  (atom {})) ;; map version -> index

(defn compare-clj-versions
  [a b]
  (let [index @published-clj-versions]
    (compare (index a) (index b))))

(defn get-published-cljs-tags!
  []
  (let [releases (maven-releases "org.clojure" "clojurescript")
        pub-versions (map :v releases)
        pub-dates (map (comp timestamp->date-str :timestamp) releases)
        pub-tags (map cljs-version->tag pub-versions)
        local-tags (get-cljs-version-tags)
        [not-local not-published valid-tags] (diff (set pub-tags) (set local-tags))]

    (when not-local
      (println (style "Error:" :red) "Found no local tags for the following published versions:")
      (doseq [tag not-local]
        (println "  " tag))
      (System/exit 1))

    (when not-published
      (println (style "Warning:" :yellow) "Found no published versions for the following local tags:")
      (doseq [tag not-published]
        (println "  " tag)))

    (reset! cljs-tag->pub-date (zipmap pub-tags pub-dates))
    (reset! published-cljs-tags (sort-by cljs-tag->num valid-tags))
    ))

(defn get-published-clj-versions!
  []
  (let [versions (reverse (map :v (maven-releases "org.clojure" "clojure")))
        index-map (into {} (map-indexed (fn [i v] [v i]) versions))]
    (reset! published-clj-versions index-map)))

(defn get-cljs-tags-to-parse*
  [latest]
  (let [tags @published-cljs-tags]
    (if-not latest
      [nil tags]
      (let [latest-num (cljs-tag->num latest)]
        (split-with #(<= (cljs-tag->num %) latest-num) tags)))))

(defn get-cljs-tags-to-parse
  ([latest-tag] (get-cljs-tags-to-parse latest-tag :all))
  ([latest-tag n-or-all]
   (let [[_past-tags tags-left] (get-cljs-tags-to-parse* latest-tag)]
     (if (= :all n-or-all)
       tags-left
       (try (take n-or-all tags-left)
            (catch Exception e tags-left))))))

(defn get-github-file-link
  ([repo path] (get-github-file-link repo path nil))
  ([repo path [start-line end-line]]
   (let [strip-path (subs path (inc (count repo)))
         tag (case repo
               "clojure" *clj-tag*
               "clojurescript" *cljs-tag*
               nil)]
     (cond-> (str "https://github.com/clojure/" repo "/blob/" tag "/" strip-path)
       start-line (str "#L" start-line)
       (and start-line end-line) (str "-L" end-line)))))

(defn cljs-tag->dep-releases
  [cljs-tag]
  (let [cljs-num (cljs-tag->num cljs-tag)
        bootstrap (:out (sh "git" "show" (str cljs-tag ":script/bootstrap")
                            :dir (str repos-dir "/clojurescript")))
        clojure
        (cond
          (>= cljs-num 1847) (second (re-find #"(?m)^CLOJURE_RELEASE=\"(.*)\"" bootstrap))
          (>= cljs-num 0)    (second (re-find #"(?m)^unzip .*clojure-(.*)\.zip" bootstrap)))

        gclosure-lib
        (cond
          (>= cljs-num 1847) (second (re-find #"(?m)^GCLOSURE_LIB_RELEASE=\"(.*)\"" bootstrap))
          (>= cljs-num 1798) (second (re-find #"google-closure-library-(.*)\.jar" bootstrap))
          (>= cljs-num 0)    (second (re-find #"closure-library-(.*)\.zip" bootstrap)))

        treader
        (cond
          (>= cljs-num 1859) (second (re-find #"(?m)^TREADER_RELEASE=\"(.*)\"" bootstrap))
          (>= cljs-num 1853) (second (re-find #"tools\.reader-(.*).jar" bootstrap))
          (>= cljs-num 0)    nil ;; `clojure.lang/LispReader` used instead of tools.reader
          )
        ]
    {:clj-version clojure
     :clj-tag (str "clojure-" clojure)
     :treader-version treader
     :treader-tag (treader-version->tag treader)
     :gclosure-lib gclosure-lib}))

(defn checkout-repo!
  [repo tag]
  (sh "git" "checkout" tag :dir (str repos-dir "/" repo)))

(defmacro with-checkout!
  [cljs-tag & body]
  `(let [{clj-tag#          :clj-tag
          clj-version#      :clj-version
          treader-tag#      :treader-tag
          treader-version#  :treader-version
          gclosure-lib#     :gclosure-lib}    (cljs-tag->dep-releases ~cljs-tag)]

     (checkout-repo! "clojurescript" ~cljs-tag)
     (checkout-repo! "clojure" clj-tag#)
     (when treader-tag#
       (checkout-repo! "tools.reader" treader-tag#))

     (binding [*cljs-tag*     ~cljs-tag
               *cljs-date*    (@cljs-tag->pub-date ~cljs-tag)
               *cljs-version* (cljs-tag->version ~cljs-tag)
               *cljs-num*     (cljs-tag->num     ~cljs-tag)

               *clj-tag*      clj-tag#
               *clj-version*  clj-version#

               *treader-tag*     treader-tag#
               *treader-version* treader-version#

               *gclosure-lib* gclosure-lib#]
       ~@body)))

(comment

  ;; TESTS

  (def repos-dir "repos")
  (require '[clojure.java.shell :refer [sh]])
  (require '[me.raynes.fs :refer [exists? mkdir base-name]])
  (require '[clojure.string :refer [trim split-lines]])

  (clone-or-fetch-repos!)

  (get-cljs-version-tags)

  (cljs-tag->dep-releases "r927")
  (cljs-tag->dep-releases "r1885")
  (cljs-tag->dep-releases "r3211")

  (doseq [tag (get-cljs-version-tags)]
    (println tag (:gclosure-lib (cljs-tag->dep-releases tag))))

  (checkout-repo! "clojurescript" "r927")
  (checkout-repo! "clojurescript" "r1885")
  (checkout-repo! "clojurescript" "r3211")

  )

