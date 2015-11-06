## cljs.core/rsubseq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rsubseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rsubseq)
</td>
</tr>
</table>


 <samp>
(__rsubseq__ sc test key)<br>
</samp>
 <samp>
(__rsubseq__ sc start-test start-key end-test end-key)<br>
</samp>

---

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a reverse sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.



---


###### See Also:

[`cljs.core/subseq`](../cljs.core/subseq.md)<br>

---


Source docstring:

```
sc must be a sorted collection, test(s) one of <, <=, > or
>=. Returns a reverse seq of those entries with keys ek for
which (test (.. sc comparator (compare ek key)) 0) is true
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L6315-L6328):

```clj
(defn rsubseq
  ([sc test key]
     (let [include (mk-bound-fn sc test key)]
       (if (#{< <=} test)
         (when-let [[e :as s] (-sorted-seq-from sc key false)]
           (if (include e) s (next s)))
         (take-while include (-sorted-seq sc false)))))
  ([sc start-test start-key end-test end-key]
     (when-let [[e :as s] (-sorted-seq-from sc end-key false)]
       (take-while (mk-bound-fn sc start-test start-key)
                   (if ((mk-bound-fn sc end-test end-key) e) s (next s))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6315-6328](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L6315-L6328)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rsubseq` @ clojuredocs](http://clojuredocs.org/clojure.core/rsubseq)<br>
[`clojure.core/rsubseq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rsubseq/)<br>
[`clojure.core/rsubseq` @ crossclj](http://crossclj.info/fun/clojure.core/rsubseq.html)<br>
[`cljs.core/rsubseq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rsubseq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rsubseq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`sc` must be a sorted collection.\n\n`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.\n\nReturns a reverse sequence of those entries with keys `ek` for which\n`(test (.. sc comparator (compare ek key)) 0)` is true.",
 :ns "cljs.core",
 :name "rsubseq",
 :signature ["[sc test key]"
             "[sc start-test start-key end-test end-key]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/subseq"],
 :full-name-encode "cljs.core/rsubseq",
 :source {:code "(defn rsubseq\n  ([sc test key]\n     (let [include (mk-bound-fn sc test key)]\n       (if (#{< <=} test)\n         (when-let [[e :as s] (-sorted-seq-from sc key false)]\n           (if (include e) s (next s)))\n         (take-while include (-sorted-seq sc false)))))\n  ([sc start-test start-key end-test end-key]\n     (when-let [[e :as s] (-sorted-seq-from sc end-key false)]\n       (take-while (mk-bound-fn sc start-test start-key)\n                   (if ((mk-bound-fn sc end-test end-key) e) s (next s))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6315 6328]},
 :full-name "cljs.core/rsubseq",
 :clj-symbol "clojure.core/rsubseq",
 :docstring "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a reverse seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rsubseq"]))
```

-->
