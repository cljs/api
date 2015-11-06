## cljs.core/cycle



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cycle</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cycle)
</td>
</tr>
</table>


 <samp>
(__cycle__ coll)<br>
</samp>

---

Returns an infinite lazy sequence of repetitions of the items in `coll`.



---


###### See Also:

[`cljs.core/lazy-seq`](../cljs.core/lazy-seq.md)<br>
[`cljs.core/repeatedly`](../cljs.core/repeatedly.md)<br>

---


Source docstring:

```
Returns a lazy (infinite!) sequence of repetitions of the items in coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L2814-L2818):

```clj
(defn cycle
  [coll] (lazy-seq
          (when-let [s (seq coll)]
            (concat s (cycle s)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2814-2818](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L2814-L2818)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/cycle` @ clojuredocs](http://clojuredocs.org/clojure.core/cycle)<br>
[`clojure.core/cycle` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/cycle/)<br>
[`clojure.core/cycle` @ crossclj](http://crossclj.info/fun/clojure.core/cycle.html)<br>
[`cljs.core/cycle` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/cycle.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cycle.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns an infinite lazy sequence of repetitions of the items in `coll`.",
 :ns "cljs.core",
 :name "cycle",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/lazy-seq" "cljs.core/repeatedly"],
 :full-name-encode "cljs.core/cycle",
 :source {:code "(defn cycle\n  [coll] (lazy-seq\n          (when-let [s (seq coll)]\n            (concat s (cycle s)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2814 2818]},
 :full-name "cljs.core/cycle",
 :clj-symbol "clojure.core/cycle",
 :docstring "Returns a lazy (infinite!) sequence of repetitions of the items in coll."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cycle"]))
```

-->
