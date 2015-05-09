(ns cljs-api-gen.repo-cljs
  (:require
    [clojure.java.shell :refer [sh]]
    [clojure.string :refer [trim split-lines]]
    [cljs-api-gen.config :refer [repo-dir
                                 *repo-version*]]
    ))

(defn clone-or-fetch-repos
  []
  (sh "script/get-repos.sh"))

(defn get-repo-version
  [repo]
  (trim (:out (sh "git" "describe" "--tags" :dir (str repo-dir "/" repo)))))

(defn get-repo-versions
  []
  (let [sh-return (sh "script/versions.sh")
        versions (split-lines (:out sh-return))]
    versions))

(defn get-version-num
  [v]
  (Integer/parseInt (subs v 1)))

(defn get-versions-to-parse
  [latest]
  (let [versions (get-repo-versions)]
    (if-not latest
      [nil versions]
      (let [latest-num (get-version-num latest)]
        (split-with #(<= (get-version-num %) latest-num) versions)))))

(defn checkout-version!
  [v]
  (sh "script/checkout.sh" v))

(defn get-github-file-link
  ([repo path] (get-github-file-link repo path nil))
  ([repo path [start-line end-line]]
   (let [version (get *repo-version* repo)
         strip-path (subs path (inc (count repo)))]
     (cond-> (str "https://github.com/clojure/" repo "/blob/" version "/" strip-path)
       start-line (str "#L" start-line)
       (and start-line end-line) (str "-L" end-line)))))

(defn clj-tag->version
  [v]
  (if-let [[_ semver] (re-find #"clojure-(.*)" v)]
    semver
    v))

(defn cljs-tag->version
  [v]
  (if-let [[_ number] (re-find #"r(.*)"v )]
    (str "0.0-" number)
    v))

