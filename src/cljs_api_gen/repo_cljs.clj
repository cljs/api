(ns cljs-api-gen.repo-cljs
  (:require
    [clansi.core :refer [style]]
    [clojure.data :refer [diff]]
    [clojure.data.json :as json]
    [clojure.java.shell :refer [sh]]
    [me.raynes.fs :refer [exists? mkdir base-name]]
    [clojure.string :refer [trim split split-lines ends-with?]]
    [cljs-api-gen.config :refer [repos-dir]]
    [clj-time.core :as time]
    [clj-time.coerce :as tc]
    [clj-time.format :as tf]))


(defn epoch-now []
  (tc/to-long (time/now)))

(defn timestamp->date-str [t]
  (tf/unparse (tf/formatters :date) (tc/from-long t)))

(def ^:dynamic *cljs-version*    "ClojureScript version string   (e.g. \"0.0-3211\")" nil)
(def ^:dynamic *cljs-tag*        "ClojureScript version git tag  (e.g. \"r3211\")" nil)
(def ^:dynamic *cljs-date*       "ClojureScript version date     (e.g. \"2015-03-09\")" nil)
(def ^:dynamic *clj-version*     "Clojure version string         (e.g. \"1.7.0-beta1\")" nil)
(def ^:dynamic *clj-tag*         "Clojure version git tag        (e.g. \"clojure-1.7.0-beta1\"" nil)
(def ^:dynamic *gclosure-lib*    "Google Closure library         (e.g. \"0.0-20150505-021ed5b3\"" nil)
(def ^:dynamic *gclosure-com*    "Google Closure compiler        (e.g. \"20140625\"" nil)

(def ^:dynamic *treader-version* "tools.reader version string    (e.g. \"0.9.2\"" nil)
(def ^:dynamic *treader-tag*     "tools.reader git tag           (e.g. \"tools.reader-0.9.2\"" nil)

;;--------------------------------------------------------------------------------
;; Git Repo utils
;;--------------------------------------------------------------------------------

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

  (println (style "\nCloning or updating repos:\n" :cyan))

  (println "syncing clojurescript...")
  (clone-or-pull! "https://github.com/clojure/clojurescript")
  (println "syncing clojure...")
  (clone-or-pull! "https://github.com/clojure/clojure")
  (println "syncing tools.reader...")
  (clone-or-pull! "https://github.com/clojure/tools.reader"))

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

(defn get-current-repo-tag
  [repo]
  (trim (:out (sh "git" "describe" "--tags" :dir (str repos-dir "/" repo)))))

(defn get-latest-repo-tag
  [repo]
  (trim (:out (sh "git" "describe" "--abbrev=0" "--tags" "master" :dir (str repos-dir "/" repo)))))

(defn get-master-tag
  [repo]
  (trim (:out (sh "git" "describe" "--tags" "master" :dir (str repos-dir "/" repo)))))

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

;;--------------------------------------------------------------------------------
;; Clojure version utils
;;--------------------------------------------------------------------------------

(defn clj-tag->version
  [tag]
  (when-let [[_ v] (re-find #"clojure-(.*)" tag)]
    v))

(defn clj-tag->api-key
  [tag]
  (second (re-find #"clojure-(\d\.\d)" tag)))

(def published-clj-versions
  (atom {})) ;; map version -> index

(defn compare-clj-versions
  [a b]
  (let [index @published-clj-versions]
    (compare (index a) (index b))))

;;--------------------------------------------------------------------------------
;; ClojureScript version utils
;;--------------------------------------------------------------------------------

(defn master? [tag-or-version]
  (re-find #"-\d+-g.*$" tag-or-version))

(defn fake-master-tag [x] (str x "+"))

(defn cljs-tag->version
  "cljs revision tag -> version:

           TAG                 VERSION
  OLD =    rXXXX               0.0-XXXX
  NEW =    r1.7.XXXX           1.7.XXXX
  MASTER = r1.7.XXXX-XX-gXXXX  1.7.XXXX+
  "
  [tag]
  (when tag
    (if-let [[_ revision] (re-find #"^r(\d+)$" tag)]
      (str "0.0-" revision)
      (when-let [[_ full master-commits] (re-find #"^r(\d+\.\d+\.\d+)" tag)]
        (if (master? tag)
          (str full "+")
          full)))))

(defn cljs-version->tag
  "cljs version -> revision tag:

           VERSION    TAG
  OLD =    0.0-XXXX   rXXXX
  NEW =    1.7.XXXX   r1.7.XXXX
  MASTER = 1.7.XXXX+  <ERROR>
  "
  [version]
  (when version
    (when-let [[_ major-minor revision master-signal] (re-find #"^(\d+\.\d+)[.-](\d+)(\+)?" version)]
      (when master-signal
        (println
          (style "Cannot convert master-version to a tag." :red)
          "(fake master version is lossy)")
        (System/exit 1))
      (if (= "0.0" major-minor)
        (str "r" revision)
        (str "r" major-minor "." revision)))))

(def cljs-tag->pub
  "cljs tag -> maven published info {:order _ :date _}"
  (atom {}))

(defn cljs-tag->num
  "cljs tag -> sortable number"
  [tag]
  (when tag
    (if (master? tag)
      ;; some large constant denoting that the master is ahead of all previous versions
      1e10
      (:order (@cljs-tag->pub tag)))))

(defn cljs-version->num
  "cljs version -> sortable number"
  [version]
  (when version
    (-> version cljs-version->tag cljs-tag->num)))

(defn cljs-cmp
  "Compare cljs versions."
  ([cmp version] (cljs-cmp cmp *cljs-tag* version))
  ([cmp version & others]
   (let [versions (cons version others)
         ->num (fn [v]
                 (if (string? v)
                   (if (or (master? v)
                           (.startsWith v "r"))
                     (cljs-tag->num v)
                     (cljs-version->num v))
                   nil))
         nums (map ->num versions)]
     (apply cmp nums))))

(def published-cljs-tags
  "ordered list of maven published cljs tags"
  (atom nil))

(def published-cljs-tag?
  "maven published cljs tag lookup"
  (atom #{}))

(defn get-cljs-tags-to-parse*
  "Given the latest parsed tag, return [old-tags new-tags]"
  [latest]
  (let [tags @published-cljs-tags]
    (if-not latest
      [nil tags]
      (let [latest-num (cljs-tag->num latest)]
        (split-with #(<= (cljs-tag->num %) latest-num) tags)))))

(defn get-cljs-tags-to-parse
  "Return all tags that come after the given tag.
  Second argument can be a number to limit the number of returned tags."
  ([latest-tag] (get-cljs-tags-to-parse latest-tag :all))
  ([latest-tag n-or-all]
   (let [[_old-tags new-tags] (get-cljs-tags-to-parse* latest-tag)]
     (if (= :all n-or-all)
       new-tags
       (try (take n-or-all new-tags)
            (catch Exception e new-tags))))))

(defn get-local-cljs-tags
  "get tags from local cljs checkout"
  []
  (let [sh-return (sh "git" "tag" :dir (str repos-dir "/clojurescript"))
        tags (split-lines (:out sh-return))]
    (->> tags
         (filter #(re-find #"^r" %))
         (sort-by cljs-tag->num))))

;;--------------------------------------------------------------------------------
;; Tools.reader version utils
;;--------------------------------------------------------------------------------

(defn treader-tag->version
  [tag]
  (when-let [[_ v] (re-find #"tools\.reader-(.*)")]
    v))

(defn treader-version->tag
  [version]
  (when version
    (str "tools.reader-" version)))

;;--------------------------------------------------------------------------------
;; Maven release retrieval
;;--------------------------------------------------------------------------------

(defn maven-release-url
  "See: http://search.maven.org/solrsearch/select?q=g:%22org.clojure%22+AND+a:%22clojurescript%22&core=gav&rows=1000&wt=json"
  [group artifact]
  (str "http://search.maven.org/solrsearch/select?q=g:%22" group "%22+AND+a:%22" artifact "%22&core=gav&rows=1000&wt=json"))

(defn maven-releases
  [group artifact]
  (-> (maven-release-url group artifact)
      (slurp)
      (json/read-str :key-fn keyword)
      (:response)
      (:docs)
      (reverse))) ;; properly sorted by version


(def new-maven-release
  "a maven release that is not yet visible from their API (slow to update sometimes)"
  (atom nil))

(defn get-published-cljs-tags!
  []
  (println (style "\nRetrieving published ClojureScript versions from Maven...\n" :cyan))
  (let [releases (cond-> (maven-releases "org.clojure" "clojurescript")
                   @new-maven-release (concat [{:v @new-maven-release :timestamp (epoch-now)}]))
        pub-versions (map :v releases)
        pub-dates (map (comp timestamp->date-str :timestamp) releases)
        pub-tags (map cljs-version->tag pub-versions)
        local-tags (get-local-cljs-tags)
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

    (let [pub-infos (map (fn [date i]
                           {:date date :order i})
                         pub-dates (range))]
      (reset! cljs-tag->pub (zipmap pub-tags pub-infos)))

    (reset! published-cljs-tags (sort-by cljs-tag->num valid-tags))
    (reset! published-cljs-tag? (set valid-tags))

    (println (style "\npublished ClojureScript tags:" :green))
    (apply println @published-cljs-tags)))

(defn get-published-clj-versions!
  []
  (println (style "\nRetrieving published Clojure versions from Maven...\n" :cyan))
  (let [versions (map :v (maven-releases "org.clojure" "clojure"))
        index-map (into {} (map-indexed (fn [i v] [v i]) versions))]
    (reset! published-clj-versions index-map)
    (println (style "published Clojure versions:" :green))
    (apply println versions)))

;;--------------------------------------------------------------------------------
;; Checkout
;;--------------------------------------------------------------------------------

(defn cljs-tag->dep-releases
  [cljs-tag]
  (let [bootstrap (:out (sh "git" "show"
                          (str cljs-tag ":script/bootstrap")
                          :dir (str repos-dir "/clojurescript")))
        clojure
        (cond
          (cljs-cmp >= cljs-tag "0.0-1847") (second (re-find #"(?m)^CLOJURE_RELEASE=\"(.*)\"" bootstrap))
          :else                             (second (re-find #"(?m)^unzip .*clojure-(.*)\.zip" bootstrap)))

        gclosure-com
        (cond
          (cljs-cmp >= cljs-tag "0.0-2629") (second (re-find #"(?m)^CLOSURE_RELEASE=\"(.*)\"" bootstrap))
          :else                             nil)

        gclosure-lib
        (cond
          (cljs-cmp >= cljs-tag "0.0-1847") (second (re-find #"(?m)^GCLOSURE_LIB_RELEASE=\"(.*)\"" bootstrap))
          (cljs-cmp >= cljs-tag "0.0-1798") (second (re-find #"google-closure-library-(.*)\.jar" bootstrap))
          :else                             (second (re-find #"closure-library-(.*)\.zip" bootstrap)))

        treader
        (cond
          (cljs-cmp >= cljs-tag "0.0-1859") (second (re-find #"(?m)^TREADER_RELEASE=\"(.*)\"" bootstrap))
          (cljs-cmp >= cljs-tag "0.0-1853") (second (re-find #"tools\.reader-(.*).jar" bootstrap))
          :else                             nil)] ;; `clojure.lang/LispReader` used instead of tools.reader


    {:clj-version clojure
     :clj-tag (str "clojure-" clojure)
     :treader-version treader
     :treader-tag (treader-version->tag treader)
     :gclosure-lib gclosure-lib
     :gclosure-com gclosure-com}))

(defn checkout-repo!
  [repo tag]
  (sh "git" "checkout" tag :dir (str repos-dir "/" repo)))

(defmacro with-checkout!
  [cljs-tag & body]
  `(let [{clj-tag#          :clj-tag
          clj-version#      :clj-version
          treader-tag#      :treader-tag
          treader-version#  :treader-version
          gclosure-lib#     :gclosure-lib
          gclosure-com#     :gclosure-com} (cljs-tag->dep-releases ~cljs-tag)]

     (checkout-repo! "clojurescript" ~cljs-tag)
     (checkout-repo! "clojure" clj-tag#)
     (when treader-tag#
       (checkout-repo! "tools.reader" treader-tag#))

     (binding [*cljs-tag*     ~cljs-tag
               *cljs-date*    (:date (@cljs-tag->pub ~cljs-tag))
               *cljs-version* (cljs-tag->version ~cljs-tag)

               *clj-tag*      clj-tag#
               *clj-version*  clj-version#

               *treader-tag*     treader-tag#
               *treader-version* treader-version#

               *gclosure-lib* gclosure-lib#
               *gclosure-com* gclosure-com#]
       ~@body)))

(comment

  ;; TESTS

  (def repos-dir "repos")
  (require '[clojure.java.shell :refer [sh]])
  (require '[me.raynes.fs :refer [exists? mkdir base-name]])
  (require '[clojure.string :refer [trim split-lines]])

  (clone-or-fetch-repos!)

  (get-local-cljs-tags)

  (cljs-tag->dep-releases "r927")
  (cljs-tag->dep-releases "r1885")
  (cljs-tag->dep-releases "r3211")

  (doseq [tag (get-local-cljs-tags)]
    (println tag (:gclosure-lib (cljs-tag->dep-releases tag))))

  (checkout-repo! "clojurescript" "r927")
  (checkout-repo! "clojurescript" "r1885")
  (checkout-repo! "clojurescript" "r3211"))
