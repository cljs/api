(ns cljs-api-gen.repo-cljs
  (:require
    [clojure.java.shell :refer [sh]]
    [me.raynes.fs :refer [exists? mkdir base-name]]
    [clojure.string :refer [trim split-lines]]
    [cljs-api-gen.config :refer [repo-dir]]
    ))

(defn clone-or-fetch!
  [repo-url]
  (let [repo-name (base-name repo-url)
        repo-path (str repo-dir "/" repo-name)]
    (if-not (exists? repo-path)
      (sh "git" "clone" repo-url :dir repo-dir)
      (sh "git" "fetch" :dir repo-path))))

(defn clone-or-fetch-repos!
  []
  (when-not (exists? repo-dir)
    (mkdir repo-dir))
  (clone-or-fetch! "https://github.com/clojure/clojurescript")
  (clone-or-fetch! "https://github.com/clojure/clojure"))

(defn get-current-repo-tag
  [repo]
  (trim (:out (sh "git" "describe" "--tags" :dir (str repo-dir "/" repo)))))

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

(defn get-cljs-version-tags
  []
  (let [sh-return (sh "git" "tag" :dir (str repo-dir "/clojurescript"))
        tags (split-lines (:out sh-return))]
    (->> tags
         (filter #(re-find #"^r" %))
         (sort-by cljs-tag->num))))

(defn get-cljs-tags-to-parse
  [latest]
  (let [tags (get-cljs-version-tags)]
    (if-not latest
      [nil tags]
      (let [latest-num (cljs-tag->num latest)]
        (split-with #(<= (cljs-tag->num %) latest-num) tags)))))

(defn cljs-tag->clj-tag
  [cljs-tag]
  (let [bootstrap (:out (sh "git" "show" (str cljs-tag ":script/bootstrap")
                            :dir (str repo-dir "/clojurescript")))
        [_ m1] (re-find #"(?m)^CLOJURE_RELEASE=\"(.*)\"" bootstrap)
        [_ m2] (re-find #"(?m)^unzip .*clojure-(.*)\.zip" bootstrap)
        version (or m1 m2)]
    (when version
      (str "clojure-" version))))

(defn checkout-cljs-tag!
  [tag]
  (sh "git" "checkout" tag :dir (str repo-dir "/clojurescript"))
  (sh "git" "checkout" (cljs-tag->clj-tag tag) :dir (str repo-dir "/clojure")))

(defn get-github-file-link
  ([repo path] (get-github-file-link repo path nil))
  ([repo path [start-line end-line]]
   (let [version (get *repo-version* repo)
         strip-path (subs path (inc (count repo)))]
     (cond-> (str "https://github.com/clojure/" repo "/blob/" version "/" strip-path)
       start-line (str "#L" start-line)
       (and start-line end-line) (str "-L" end-line)))))

(defmacro with-versions
  [cljs-tag clj-tag & body]
  `(binding [*cljs-tag*     ~cljs-tag
             *clj-tag*      ~clj-tag

             *cljs-version* (cljs-tag->version ~cljs-tag)
             *cljs-num*     (cljs-tag->num     ~cljs-tag)
             *clj-version*  (clj-tag->version  ~clj-tag)
             ]
     ~@body))

(comment

  ;; TESTS

  (def repo-dir "repos")
  (require '[clojure.java.shell :refer [sh]])
  (require '[me.raynes.fs :refer [exists? mkdir base-name]])
  (require '[clojure.string :refer [trim split-lines]])

  (clone-or-fetch-repos!)

  (get-cljs-version-tags)

  (cljs-tag->clj-tag "r927")
  (cljs-tag->clj-tag "r1885")
  (cljs-tag->clj-tag "r3211")

  (checkout-cljs-tag! "r927")
  (get-current-repo-tag "clojure")
  (get-current-repo-tag "clojurescript")

  (checkout-cljs-tag! "r1885")
  (get-current-repo-tag "clojure")
  (get-current-repo-tag "clojurescript")
  )

