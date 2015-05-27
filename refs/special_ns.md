## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/ns

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ns)
</td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:805-847](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L805-L847)</ins>
</pre>

```clj
(defmethod parse 'ns
  [_ env [_ name & args] _]
  (let [excludes
        (reduce (fn [s [k exclude xs]]
                  (if (= k :refer-clojure)
                    (do
                      (assert (= exclude :exclude) "Only [:refer-clojure :exclude [names]] form supported")
                      (into s xs))
                    s))
                #{} args)
        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros :as params}
        (reduce (fn [m [k & libs]]
                  (assert (#{:use :use-macros :require :require-macros} k)
                          "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")
                  (assoc m k (into {}
                                   (mapcat (fn [[lib kw expr]]
                                             (case k
                                               (:require :require-macros)
                                               (do (assert (and expr (= :as kw))
                                                           "Only (:require [lib.ns :as alias]*) form of :require / :require-macros is supported")
                                                   [[expr lib]])
                                               (:use :use-macros)
                                               (do (assert (and expr (= :only kw))
                                                           "Only (:use [lib.ns :only [names]]*) form of :use / :use-macros is supported")
                                                   (map vector expr (repeat lib)))))
                                           libs))))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (set! *cljs-ns* name)
    (require 'cljs.core)
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
    {:env env :op :ns :name name :uses uses :requires requires
     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))
```


---

```clj
{:full-name "special/ns",
 :ns "special",
 :name "ns",
 :type "special form",
 :source {:code "(defmethod parse 'ns\n  [_ env [_ name & args] _]\n  (let [excludes\n        (reduce (fn [s [k exclude xs]]\n                  (if (= k :refer-clojure)\n                    (do\n                      (assert (= exclude :exclude) \"Only [:refer-clojure :exclude [names]] form supported\")\n                      (into s xs))\n                    s))\n                #{} args)\n        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros :as params}\n        (reduce (fn [m [k & libs]]\n                  (assert (#{:use :use-macros :require :require-macros} k)\n                          \"Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported\")\n                  (assoc m k (into {}\n                                   (mapcat (fn [[lib kw expr]]\n                                             (case k\n                                               (:require :require-macros)\n                                               (do (assert (and expr (= :as kw))\n                                                           \"Only (:require [lib.ns :as alias]*) form of :require / :require-macros is supported\")\n                                                   [[expr lib]])\n                                               (:use :use-macros)\n                                               (do (assert (and expr (= :only kw))\n                                                           \"Only (:use [lib.ns :only [names]]*) form of :use / :use-macros is supported\")\n                                                   (map vector expr (repeat lib)))))\n                                           libs))))\n                {} (remove (fn [[r]] (= r :refer-clojure)) args))]\n    (set! *cljs-ns* name)\n    (require 'cljs.core)\n    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]\n      (clojure.core/require nsym))\n    (swap! namespaces #(-> %\n                           (assoc-in [name :name] name)\n                           (assoc-in [name :excludes] excludes)\n                           (assoc-in [name :uses] uses)\n                           (assoc-in [name :requires] requires)\n                           (assoc-in [name :uses-macros] uses-macros)\n                           (assoc-in [name :requires-macros]\n                                     (into {} (map (fn [[alias nsym]]\n                                                     [alias (find-ns nsym)])\n                                                   requires-macros)))))\n    {:env env :op :ns :name name :uses uses :requires requires\n     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [805 847],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L805-L847"},
 :full-name-encode "special_ns",
 :clj-symbol "clojure.core/ns",
 :history [["+" "0.0-927"]]}

```
