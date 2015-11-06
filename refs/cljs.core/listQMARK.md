## cljs.core/list?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list?)
</td>
</tr>
</table>


 <samp>
(__list?__ x)<br>
</samp>

---

Returns true if `x` is a list, false otherwise.



---


###### See Also:

[`cljs.core/seq?`](../cljs.core/seqQMARK.md)<br>
[`cljs.core/sequential?`](../cljs.core/sequentialQMARK.md)<br>
[`cljs.core/coll?`](../cljs.core/collQMARK.md)<br>

---


Source docstring:

```
Returns true if x implements IList
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2747-L2750):

```clj
(defn ^boolean list?
  [x]
  (satisfies? IList x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2747-2750](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2747-L2750)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/list?` @ clojuredocs](http://clojuredocs.org/clojure.core/list_q)<br>
[`clojure.core/list?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/list%3F/)<br>
[`clojure.core/list?` @ crossclj](http://crossclj.info/fun/clojure.core/list%3F.html)<br>
[`cljs.core/list?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/list%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/listQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a list, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "list?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/sequential?" "cljs.core/coll?"],
 :full-name-encode "cljs.core/listQMARK",
 :source {:code "(defn ^boolean list?\n  [x]\n  (satisfies? IList x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2747 2750]},
 :full-name "cljs.core/list?",
 :clj-symbol "clojure.core/list?",
 :docstring "Returns true if x implements IList"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list?"]))
```

-->
