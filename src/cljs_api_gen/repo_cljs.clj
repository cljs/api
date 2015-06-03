(ns cljs-api-gen.repo-cljs
  (:require
    [clansi.core :refer [style]]
    [clojure.data :refer [diff]]
    [clojure.data.json :as json]
    [clojure.java.shell :refer [sh]]
    [me.raynes.fs :refer [exists? mkdir base-name]]
    [clojure.string :refer [trim split split-lines]]
    [cljs-api-gen.config :refer [repos-dir]]
    ))

(def ^:dynamic *cljs-version* "ClojureScript version string   (e.g. \"0.0-3211\")" nil)
(def ^:dynamic *cljs-num*     "ClojureScript version number   (e.g. 3211)" nil)
(def ^:dynamic *cljs-tag*     "ClojureScript version git tag  (e.g. \"r3211\")" nil)
(def ^:dynamic *cljs-date*    "ClojureScript version date     (e.g. \"2015-03-09\")" nil)
(def ^:dynamic *clj-version*  "Clojure version string         (e.g. \"1.7.0-beta1\")" nil)
(def ^:dynamic *clj-tag*      "Clojure version git tag        (e.g. \"clojure-1.7.0-beta1\"" nil)
(def ^:dynamic *gclosure-lib* "Google Closure release         (e.g. \"0.0-20150505-021ed5b3\"" nil)

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
  (clone-or-pull! "https://github.com/clojure/clojure"))

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

(defn cljs-tag->version
  [tag]
  (when-let [[_ number] (re-find #"r(.*)" tag)]
    (str "0.0-" number)))

(defn cljs-tag->num
  [tag]
  (when-let [[_ number] (re-find #"r(.*)" tag)]
    (Integer/parseInt number)))

(defn cljs-version->tag
  [version]
  (when-let [[_ n] (re-find #"\d\.\d-(.*)" version)]
    (str "r" n)))

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

(def maven-cljs-url
  "http://search.maven.org/solrsearch/select?q=g:%22org.clojure%22+AND+a:%22clojurescript%22&core=gav&rows=1000&wt=json")

(defn get-published-versions
  []
  (let [data (json/read-str (slurp maven-cljs-url) :key-fn keyword)
        versions (map :v (-> data :response :docs))]
    versions))

(defn get-cljs-version-tags
  []
  (let [sh-return (sh "git" "tag" :dir (str repos-dir "/clojurescript"))
        tags (split-lines (:out sh-return))]
    (->> tags
         (filter #(re-find #"^r" %))
         (sort-by cljs-tag->num))))

(def published-tags
  (atom nil))

(defn assert-published-versions-have-local-tags!
  []
  (let [pub-versions (get-published-versions)
        pub-tags (set (map cljs-version->tag pub-versions))
        local-tags (set (get-cljs-version-tags))
        [not-local not-published valid-tags] (diff pub-tags local-tags)]

    (when not-local
      (println (style "Error:" :red) "Found no local tags for the following published versions:")
      (doseq [tag not-local]
        (println "  " tag))
      (System/exit 1))

    (when not-published
      (println (style "Warning:" :yellow) "Found no published versions for the following local tags:")
      (doseq [tag not-published]
        (println "  " tag)))

    (reset! published-tags (sort-by cljs-tag->num valid-tags))
    ))

(defn get-cljs-tags-to-parse*
  [latest]
  (let [tags @published-tags]
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
        ]
    {:clj-version clojure
     :clj-tag (str "clojure-" clojure)
     :gclosure-lib gclosure-lib}))

(defn checkout-repo!
  [repo tag]
  (sh "git" "checkout" tag :dir (str repos-dir "/" repo)))

(defmacro with-checkout!
  [cljs-tag & body]
  `(let [{clj-tag# :clj-tag
          clj-version# :clj-version
          gclosure-lib# :gclosure-lib} (cljs-tag->dep-releases ~cljs-tag)]
     (checkout-repo! "clojurescript" ~cljs-tag)
     (checkout-repo! "clojure" clj-tag#)
     (binding [*cljs-tag*     ~cljs-tag
               *cljs-date*    (repo-tag-date "clojurescript" ~cljs-tag)
               *cljs-version* (cljs-tag->version ~cljs-tag)
               *cljs-num*     (cljs-tag->num     ~cljs-tag)

               *clj-tag*      clj-tag#
               *clj-version*  clj-version#

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

  (checkout-cljs-tag! "r927")
  (checkout-cljs-tag! "r1885")
  (checkout-cljs-tag! "r3211")

  )

