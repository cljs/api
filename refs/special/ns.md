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




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/analyzer.clj#L591-L668):

```clj
(defmethod parse 'ns
  [_ env [_ name & args :as form] _]
  (let [docstring (if (string? (first args)) (first args) nil)
        args      (if docstring (next args) args)
        excludes
        (reduce (fn [s [k exclude xs]]
                  (if (= k :refer-clojure)
                    (do
                      (assert (= exclude :exclude) "Only [:refer-clojure :exclude [names]] form supported")
                      (assert (not (seq s)) "Only one :refer-clojure form is allowed per namespace definition")
                      (into s xs))
                    s))
                #{} args)
        deps (atom #{})
        valid-forms (atom #{:use :use-macros :require :require-macros})
        error-msg (fn [spec msg] (str msg "; offending spec: " (pr-str spec)))
        parse-require-spec (fn parse-require-spec [macros? spec]
                             (assert (or (symbol? spec) (vector? spec))
                                     (error-msg spec "Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros"))
                             (when (vector? spec)
                               (assert (symbol? (first spec))
                                       (error-msg spec "Library name must be specified as a symbol in :require / :require-macros"))
                               (assert (odd? (count spec))
                                       (error-msg spec "Only :as alias and :refer [names] options supported in :require"))
                               (assert (every? #{:as :refer} (map first (partition 2 (next spec))))
                                       (error-msg spec "Only :as and :refer options supported in :require / :require-macros"))
                               (assert (let [fs (frequencies (next spec))]
                                         (and (<= (fs :as 0) 1)
                                              (<= (fs :refer 0) 1)))
                                       (error-msg spec "Each of :as and :refer options may only be specified once in :require / :require-macros")))
                             (if (symbol? spec)
                               (recur macros? [spec])
                               (let [[lib & opts] spec
                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)
                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]
                                 (assert (or (symbol? alias) (nil? alias))
                                         (error-msg spec ":as must be followed by a symbol in :require / :require-macros"))
                                 (assert (or (and (vector? referred) (every? symbol? referred))
                                             (nil? referred))
                                         (error-msg spec ":refer must be followed by a vector of symbols in :require / :require-macros"))
                                 (swap! deps conj lib)
                                 (merge (when alias {rk {alias lib}})
                                        (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))
        use->require (fn use->require [[lib kw referred :as spec]]
                       (assert (and (symbol? lib) (= :only kw) (vector? referred) (every? symbol? referred))
                               (error-msg spec "Only [lib.ns :only [names]] specs supported in :use / :use-macros"))
                       [lib :refer referred])
        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros :as params}
        (reduce (fn [m [k & libs]]
                  (assert (#{:use :use-macros :require :require-macros} k)
                          "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")
                  (assert (@valid-forms k)
                          (str "Only one " k " form is allowed per namespace definition"))
                  (swap! valid-forms disj k)
                  (apply merge-with merge m
                         (map (partial parse-require-spec (contains? #{:require-macros :use-macros} k))
                              (if (contains? #{:use :use-macros} k)
                                (map use->require libs)
                                libs))))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (seq @deps)
      (analyze-deps @deps))
    (set! *cljs-ns* name)
    (load-core)
    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]
      (clojure.core/require nsym))
    (swap! namespaces #(-> %
                           (assoc-in [name :name] name)
                           (assoc-in [name :excludes] excludes)
                           (assoc-in [name :uses] uses)
                           (assoc-in [name :requires] requires)
                           (assoc-in [name :uses-macros] uses-macros)
                           (assoc-in [name :requires-macros]
                                     (into {} (map (fn [[alias nsym]]
                                                     [alias (find-ns nsym)])
                                                   requires-macros)))))
    {:env env :op :ns :form form :name name :uses uses :requires requires
     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:591-668](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/analyzer.clj#L591-L668)</ins>
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
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args :as form] _]\n  (let [docstring (if (string? (first args)) (first args) nil)\n        args      (if docstring (next args) args)\n        excludes\n        (reduce (fn [s [k exclude xs]]\n                  (if (= k :refer-clojure)\n                    (do\n                      (assert (= exclude :exclude) \"Only [:refer-clojure :exclude [names]] form supported\")\n                      (assert (not (seq s)) \"Only one :refer-clojure form is allowed per namespace definition\")\n                      (into s xs))\n                    s))\n                #{} args)\n        deps (atom #{})\n        valid-forms (atom #{:use :use-macros :require :require-macros})\n        error-msg (fn [spec msg] (str msg \"; offending spec: \" (pr-str spec)))\n        parse-require-spec (fn parse-require-spec [macros? spec]\n                             (assert (or (symbol? spec) (vector? spec))\n                                     (error-msg spec \"Only [lib.ns & options] and lib.ns specs supported in :require / :require-macros\"))\n                             (when (vector? spec)\n                               (assert (symbol? (first spec))\n                                       (error-msg spec \"Library name must be specified as a symbol in :require / :require-macros\"))\n                               (assert (odd? (count spec))\n                                       (error-msg spec \"Only :as alias and :refer [names] options supported in :require\"))\n                               (assert (every? #{:as :refer} (map first (partition 2 (next spec))))\n                                       (error-msg spec \"Only :as and :refer options supported in :require / :require-macros\"))\n                               (assert (let [fs (frequencies (next spec))]\n                                         (and (<= (fs :as 0) 1)\n                                              (<= (fs :refer 0) 1)))\n                                       (error-msg spec \"Each of :as and :refer options may only be specified once in :require / :require-macros\")))\n                             (if (symbol? spec)\n                               (recur macros? [spec])\n                               (let [[lib & opts] spec\n                                     {alias :as referred :refer :or {alias lib}} (apply hash-map opts)\n                                     [rk uk] (if macros? [:require-macros :use-macros] [:require :use])]\n                                 (assert (or (symbol? alias) (nil? alias))\n                                         (error-msg spec \":as must be followed by a symbol in :require / :require-macros\"))\n                                 (assert (or (and (vector? referred) (every? symbol? referred))\n                                             (nil? referred))\n                                         (error-msg spec \":refer must be followed by a vector of symbols in :require / :require-macros\"))\n                                 (swap! deps conj lib)\n                                 (merge (when alias {rk {alias lib}})\n                                        (when referred {uk (apply hash-map (interleave referred (repeat lib)))})))))\n        use->require (fn use->require [[lib kw referred :as spec]]\n                       (assert (and (symbol? lib) (= :only kw) (vector? referred) (every? symbol? referred))\n                               (error-msg spec \"Only [lib.ns :only [names]] specs supported in :use / :use-macros\"))\n                       [lib :refer referred])\n        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros :as params}\n        (reduce (fn [m [k & libs]]\n                  (assert (#{:use :use-macros :require :require-macros} k)\n                          \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")\n                  (assert (@valid-forms k)\n                          (str \"Only one \" k \" form is allowed per namespace definition\"))\n                  (swap! valid-forms disj k)\n                  (apply merge-with merge m\n                         (map (partial parse-require-spec (contains? #{:require-macros :use-macros} k))\n                              (if (contains? #{:use :use-macros} k)\n                                (map use->require libs)\n                                libs))))\n                {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (when (seq @deps)\n      (analyze-deps @deps))\n    (set! *cljs-ns* name)\n    (load-core)\n    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]\n      (clojure.core/require nsym))\n    (swap! namespaces #(-> %\n                           (assoc-in [name :name] name)\n                           (assoc-in [name :excludes] excludes)\n                           (assoc-in [name :uses] uses)\n                           (assoc-in [name :requires] requires)\n                           (assoc-in [name :uses-macros] uses-macros)\n                           (assoc-in [name :requires-macros]\n                                     (into {} (map (fn [[alias nsym]]\n                                                     [alias (find-ns nsym)])\n                                                   requires-macros)))))\n    {:env env :op :ns :form form :name name :uses uses :requires requires\n     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [591 668]},
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
