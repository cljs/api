## ns



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)
</td>
</tr>
</table>


 <samp>
(__ns__ name & references)<br>
</samp>

---

Sets the namespace of the file.

`ns` must be the first form in a `.cljs` file and there can only be one `ns`
declaration per file. Namespaces must match the file name of their respective
`.cljs` files, with the exception that dashes in namespaces become underscores
in filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file
`foo/bar_biz/baz.cljs`.

`references` can be zero or more forms used to import other namespaces, symbols,
and libraries into the current namespace.

```clj
(ns example.core

  ;; for excluding clojure symbols
  (:refer-clojure :exclude [])

  ;; for importing goog classes and enums
  (:import
    lib.ns
    [lib.ns Ctor*])

  (:require-macros
    [lib.ns :refer []
            :as alias
            :reload
            :reload-all])

  (:require
    [lib.ns :refer []
            :refer-macros []
            :include-macros true|false
            :as alias
            :reload
            :reload-all])

  (:use
    [lib.ns :only []
            :reload
            :reload-all])

  (:use-macros
    [lib.ns :only []
            :reload
            :reload-all]))
```



---


###### See Also:

[`in-ns (repl)`](../specialrepl/in-ns.md)<br>
[`load-namespace (repl)`](../specialrepl/load-namespace.md)<br>
[``](../specialrepl/import.md)<br>
[``](../specialrepl/require.md)<br>
[``](../specialrepl/require-macros.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/clj/cljs/analyzer.clj#L818-L930):

```clj
(defmethod parse 'ns
  [_ env [_ name & args :as form] _]
  (when-not (symbol? name) 
    (throw (error env "Namespaces must be named by a symbol.")))
  (let [docstring (if (string? (first args)) (first args))
        args      (if docstring (next args) args)
        metadata  (if (map? (first args)) (first args))
        args      (if metadata (next args) args)
        excludes
        (reduce (fn [s [k exclude xs]]
                  (if (= k :refer-clojure)
                    (do
                      (when-not (= exclude :exclude) 
                        (throw (error env "Only [:refer-clojure :exclude (names)] form supported")))
                      (when (seq s)
                        (throw (error env "Only one :refer-clojure form is allowed per namespace definition")))
                      (into s xs))
                    s))
                #{} args)
        deps (atom #{})
        aliases (atom {:fns #{} :macros #{}})
        valid-forms (atom #{:use :use-macros :require :require-macros :import})
        error-msg (fn [spec msg] (str msg "; offending spec: " (pr-str spec)))
        parse-require-spec (fn parse-require-spec [macros? spec]
                             (when-not (or (symbol? spec) (vector? spec))
                               (throw (error env (error-msg spec "Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros"))))
                             (when (vector? spec)
                               (when-not (symbol? (first spec))
                                 (throw (error env (error-msg spec "Library name must be specified as a symbol in :require / :require-macros"))))
                               (when-not (odd? (count spec))
                                 (throw (error env (error-msg spec "Only :as alias and :refer (names) options supported in :require"))))
                               (when-not (every? #{:as :refer} (map first (partition 2 (next spec))))
                                 (throw (error env (error-msg spec "Only :as and :refer options supported in :require / :require-macros"))))
                               (when-not (let [fs (frequencies (next spec))]
                                           (and (<= (fs :as 0) 1)
                                                (<= (fs :refer 0) 1)))
                                 (throw (error env (error-msg spec "Each of :as and :refer options may only be specified once in :require / :require-macros")))))
                             (if (symbol? spec)
                               (recur macros? [spec])
                               (let [[lib & opts] spec
                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)
                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]
                                 (when-not (or (symbol? alias) (nil? alias))
                                   (throw (error env (error-msg spec ":as must be followed by a symbol in :require / :require-macros"))))
                                 (when alias
                                   (let [alias-type (if macros? :macros :fns)]
                                     (when (contains? (alias-type @aliases) alias)
                                       (throw (error env (error-msg spec ":as alias must be unique"))))
                                     (swap! aliases
                                            update-in [alias-type]
                                            conj alias)))
                                 (when-not (or (and (sequential? referred) (every? symbol? referred))
                                               (nil? referred))
                                   (throw (error env (error-msg spec ":refer must be followed by a sequence of symbols in :require / :require-macros"))))
                                 (when-not macros?
                                   (swap! deps conj lib))
                                 (merge
                                   (when alias
                                     {rk (merge {alias lib} {lib lib})})
                                   (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))
        use->require (fn use->require [[lib kw referred :as spec]]
                       (when-not (and (symbol? lib) (= :only kw) (sequential? referred) (every? symbol? referred))
                         (throw (error env (error-msg spec "Only [lib.ns :only (names)] specs supported in :use / :use-macros"))))
                       [lib :refer referred])
        parse-import-spec (fn parse-import-spec [spec]
                            (when-not (or (and (sequential? spec)
                                               (every? symbol? spec))
                                          (and (symbol? spec) (nil? (namespace spec))))
                              (throw (error env (error-msg spec "Only lib.ns.Ctor or [lib.ns Ctor*] spec supported in :import"))))
                            (let [import-map (if (sequential? spec)
                                               (->> (rest spec)
                                                 (map #(vector % (symbol (str (first spec) "." %))))
                                                 (into {}))
                                               {(symbol (last (string/split (str spec) #"\."))) spec})]
                              (doseq [[_ spec] import-map]
                                (swap! deps conj spec))
                              {:import  import-map
                               :require import-map}))
        spec-parsers {:require        (partial parse-require-spec false)
                      :require-macros (partial parse-require-spec true)
                      :use            (comp (partial parse-require-spec false) use->require)
                      :use-macros     (comp (partial parse-require-spec true) use->require)
                      :import         parse-import-spec}
        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}
        (reduce (fn [m [k & libs]]
                  (when-not (#{:use :use-macros :require :require-macros :import} k)
                    (throw (error env "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")))
                  (when-not (@valid-forms k)
                    (throw (error env (str "Only one " k " form is allowed per namespace definition"))))
                  (swap! valid-forms disj k)
                  (apply merge-with merge m (map (spec-parsers k) libs)))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (seq @deps)
      (analyze-deps @deps))
    (when (seq uses)
      (check-uses uses env))
    (set! *cljs-ns* name)
    (load-core)
    (doseq [nsym (concat (vals require-macros) (vals use-macros))]
      (clojure.core/require nsym))
    (when (seq use-macros)
      (check-use-macros use-macros env))
    (swap! env/*compiler* update-in [::namespaces name] assoc
           :name name
           :doc docstring
           :excludes excludes
           :uses uses
           :requires requires
           :use-macros use-macros
           :require-macros require-macros
           :imports imports)
    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports
     :use-macros use-macros :require-macros require-macros :excludes excludes}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:818-930](https://github.com/clojure/clojurescript/blob/r2024/src/clj/cljs/analyzer.clj#L818-L930)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/ns` @ clojuredocs](http://clojuredocs.org/clojure.core/ns)<br>
[`clojure.core/ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/ns/)<br>
[`clojure.core/ns` @ crossclj](http://crossclj.info/fun/clojure.core/ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Sets the namespace of the file.\n\n`ns` must be the first form in a `.cljs` file and there can only be one `ns`\ndeclaration per file. Namespaces must match the file name of their respective\n`.cljs` files, with the exception that dashes in namespaces become underscores\nin filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file\n`foo/bar_biz/baz.cljs`.\n\n`references` can be zero or more forms used to import other namespaces, symbols,\nand libraries into the current namespace.\n\n```clj\n(ns example.core\n\n  ;; for excluding clojure symbols\n  (:refer-clojure :exclude [])\n\n  ;; for importing goog classes and enums\n  (:import\n    lib.ns\n    [lib.ns Ctor*])\n\n  (:require-macros\n    [lib.ns :refer []\n            :as alias\n            :reload\n            :reload-all])\n\n  (:require\n    [lib.ns :refer []\n            :refer-macros []\n            :include-macros true|false\n            :as alias\n            :reload\n            :reload-all])\n\n  (:use\n    [lib.ns :only []\n            :reload\n            :reload-all])\n\n  (:use-macros\n    [lib.ns :only []\n            :reload\n            :reload-all]))\n```",
 :ns "special",
 :name "ns",
 :signature ["[name & references]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["specialrepl/in-ns"
           "specialrepl/load-namespace"
           "specialrepl/import"
           "specialrepl/require"
           "specialrepl/require-macros"],
 :full-name-encode "special/ns",
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _]\n  (when-not (symbol? name) \n    (throw (error env \"Namespaces must be named by a symbol.\")))\n  (let [docstring (if (string? (first args)) (first args))\n        args      (if docstring (next args) args)\n        metadata  (if (map? (first args)) (first args))\n        args      (if metadata (next args) args)\n        excludes\n        (reduce (fn [s [k exclude xs]]\n                  (if (= k :refer-clojure)\n                    (do\n                      (when-not (= exclude :exclude) \n                        (throw (error env \"Only [:refer-clojure :exclude (names)] form supported\")))\n                      (when (seq s)\n                        (throw (error env \"Only one :refer-clojure form is allowed per namespace definition\")))\n                      (into s xs))\n                    s))\n                #{} args)\n        deps (atom #{})\n        aliases (atom {:fns #{} :macros #{}})\n        valid-forms (atom #{:use :use-macros :require :require-macros :import})\n        error-msg (fn [spec msg] (str msg \"; offending spec: \" (pr-str spec)))\n        parse-require-spec (fn parse-require-spec [macros? spec]\n                             (when-not (or (symbol? spec) (vector? spec))\n                               (throw (error env (error-msg spec \"Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros\"))))\n                             (when (vector? spec)\n                               (when-not (symbol? (first spec))\n                                 (throw (error env (error-msg spec \"Library name must be specified as a symbol in :require / :require-macros\"))))\n                               (when-not (odd? (count spec))\n                                 (throw (error env (error-msg spec \"Only :as alias and :refer (names) options supported in :require\"))))\n                               (when-not (every? #{:as :refer} (map first (partition 2 (next spec))))\n                                 (throw (error env (error-msg spec \"Only :as and :refer options supported in :require / :require-macros\"))))\n                               (when-not (let [fs (frequencies (next spec))]\n                                           (and (<= (fs :as 0) 1)\n                                                (<= (fs :refer 0) 1)))\n                                 (throw (error env (error-msg spec \"Each of :as and :refer options may only be specified once in :require / :require-macros\")))))\n                             (if (symbol? spec)\n                               (recur macros? [spec])\n                               (let [[lib & opts] spec\n                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)\n                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]\n                                 (when-not (or (symbol? alias) (nil? alias))\n                                   (throw (error env (error-msg spec \":as must be followed by a symbol in :require / :require-macros\"))))\n                                 (when alias\n                                   (let [alias-type (if macros? :macros :fns)]\n                                     (when (contains? (alias-type @aliases) alias)\n                                       (throw (error env (error-msg spec \":as alias must be unique\"))))\n                                     (swap! aliases\n                                            update-in [alias-type]\n                                            conj alias)))\n                                 (when-not (or (and (sequential? referred) (every? symbol? referred))\n                                               (nil? referred))\n                                   (throw (error env (error-msg spec \":refer must be followed by a sequence of symbols in :require / :require-macros\"))))\n                                 (when-not macros?\n                                   (swap! deps conj lib))\n                                 (merge\n                                   (when alias\n                                     {rk (merge {alias lib} {lib lib})})\n                                   (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))\n        use->require (fn use->require [[lib kw referred :as spec]]\n                       (when-not (and (symbol? lib) (= :only kw) (sequential? referred) (every? symbol? referred))\n                         (throw (error env (error-msg spec \"Only [lib.ns :only (names)] specs supported in :use / :use-macros\"))))\n                       [lib :refer referred])\n        parse-import-spec (fn parse-import-spec [spec]\n                            (when-not (or (and (sequential? spec)\n                                               (every? symbol? spec))\n                                          (and (symbol? spec) (nil? (namespace spec))))\n                              (throw (error env (error-msg spec \"Only lib.ns.Ctor or [lib.ns Ctor*] spec supported in :import\"))))\n                            (let [import-map (if (sequential? spec)\n                                               (->> (rest spec)\n                                                 (map #(vector % (symbol (str (first spec) \".\" %))))\n                                                 (into {}))\n                                               {(symbol (last (string/split (str spec) #\"\\.\"))) spec})]\n                              (doseq [[_ spec] import-map]\n                                (swap! deps conj spec))\n                              {:import  import-map\n                               :require import-map}))\n        spec-parsers {:require        (partial parse-require-spec false)\n                      :require-macros (partial parse-require-spec true)\n                      :use            (comp (partial parse-require-spec false) use->require)\n                      :use-macros     (comp (partial parse-require-spec true) use->require)\n                      :import         parse-import-spec}\n        {uses :use requires :require use-macros :use-macros require-macros :require-macros imports :import :as params}\n        (reduce (fn [m [k & libs]]\n                  (when-not (#{:use :use-macros :require :require-macros :import} k)\n                    (throw (error env \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")))\n                  (when-not (@valid-forms k)\n                    (throw (error env (str \"Only one \" k \" form is allowed per namespace definition\"))))\n                  (swap! valid-forms disj k)\n                  (apply merge-with merge m (map (spec-parsers k) libs)))\n                {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (when (seq @deps)\n      (analyze-deps @deps))\n    (when (seq uses)\n      (check-uses uses env))\n    (set! *cljs-ns* name)\n    (load-core)\n    (doseq [nsym (concat (vals require-macros) (vals use-macros))]\n      (clojure.core/require nsym))\n    (when (seq use-macros)\n      (check-use-macros use-macros env))\n    (swap! env/*compiler* update-in [::namespaces name] assoc\n           :name name\n           :doc docstring\n           :excludes excludes\n           :uses uses\n           :requires requires\n           :use-macros use-macros\n           :require-macros require-macros\n           :imports imports)\n    {:env env :op :ns :form form :name name :doc docstring :uses uses :requires requires :imports imports\n     :use-macros use-macros :require-macros require-macros :excludes excludes}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [818 930]},
 :full-name "special/ns",
 :clj-symbol "clojure.core/ns"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/ns"]))
```

-->
