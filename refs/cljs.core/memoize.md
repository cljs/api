## cljs.core/memoize



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memoize</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memoize)
</td>
</tr>
</table>


 <samp>
(__memoize__ f)<br>
</samp>

---

Returns a memoized version of a referentially transparent function.

A memoized version of a function keeps a cache of the mappings from arguments to
results in memory. When calls with the same arguments are repeated often, a
memoized function has higher performance at the expense of higher memory usage.



---




Source docstring:

```
Returns a memoized version of a referentially transparent function. The
memoized version of the function keeps a cache of the mapping from arguments
to results and, when calls with the same arguments are repeated often, has
higher performance at the expense of higher memory use.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L8584-L8597):

```clj
(defn memoize
  [f]
  (let [mem (atom {})]
    (fn [& args]
      (let [v (get @mem args lookup-sentinel)]
        (if (identical? v lookup-sentinel)
          (let [ret (apply f args)]
            (swap! mem assoc args ret)
            ret)
          v)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8584-8597](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L8584-L8597)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/memoize` @ clojuredocs](http://clojuredocs.org/clojure.core/memoize)<br>
[`clojure.core/memoize` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/memoize/)<br>
[`clojure.core/memoize` @ crossclj](http://crossclj.info/fun/clojure.core/memoize.html)<br>
[`cljs.core/memoize` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/memoize.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/memoize.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a memoized version of a referentially transparent function.\n\nA memoized version of a function keeps a cache of the mappings from arguments to\nresults in memory. When calls with the same arguments are repeated often, a\nmemoized function has higher performance at the expense of higher memory usage.",
 :ns "cljs.core",
 :name "memoize",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/memoize",
 :source {:code "(defn memoize\n  [f]\n  (let [mem (atom {})]\n    (fn [& args]\n      (let [v (get @mem args lookup-sentinel)]\n        (if (identical? v lookup-sentinel)\n          (let [ret (apply f args)]\n            (swap! mem assoc args ret)\n            ret)\n          v)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8584 8597]},
 :full-name "cljs.core/memoize",
 :clj-symbol "clojure.core/memoize",
 :docstring "Returns a memoized version of a referentially transparent function. The\nmemoized version of the function keeps a cache of the mapping from arguments\nto results and, when calls with the same arguments are repeated often, has\nhigher performance at the expense of higher memory use."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/memoize"]))
```

-->
