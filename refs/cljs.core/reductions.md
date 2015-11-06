## cljs.core/reductions



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reductions</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reductions)
</td>
</tr>
</table>


 <samp>
(__reductions__ f coll)<br>
</samp>
 <samp>
(__reductions__ f init coll)<br>
</samp>

---

Returns a lazy sequence of the intermediate values of the reduction (as per
`reduce`) of `coll` by `f`, starting with `init`.



---


###### See Also:

[`cljs.core/reduce`](../cljs.core/reduce.md)<br>

---


Source docstring:

```
Returns a lazy seq of the intermediate values of the reduction (as
per reduce) of coll by f, starting with init.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L7817-L7829):

```clj
(defn reductions
  ([f coll]
     (lazy-seq
      (if-let [s (seq coll)]
        (reductions f (first s) (rest s))
        (list (f)))))
  ([f init coll]
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (reductions f (f init (first s)) (rest s)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7817-7829](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L7817-L7829)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reductions` @ clojuredocs](http://clojuredocs.org/clojure.core/reductions)<br>
[`clojure.core/reductions` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reductions/)<br>
[`clojure.core/reductions` @ crossclj](http://crossclj.info/fun/clojure.core/reductions.html)<br>
[`cljs.core/reductions` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reductions.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reductions.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the intermediate values of the reduction (as per\n`reduce`) of `coll` by `f`, starting with `init`.",
 :ns "cljs.core",
 :name "reductions",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/reduce"],
 :full-name-encode "cljs.core/reductions",
 :source {:code "(defn reductions\n  ([f coll]\n     (lazy-seq\n      (if-let [s (seq coll)]\n        (reductions f (first s) (rest s))\n        (list (f)))))\n  ([f init coll]\n     (cons init\n           (lazy-seq\n            (when-let [s (seq coll)]\n              (reductions f (f init (first s)) (rest s)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7817 7829]},
 :full-name "cljs.core/reductions",
 :clj-symbol "clojure.core/reductions",
 :docstring "Returns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reductions"]))
```

-->
