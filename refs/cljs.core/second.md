## cljs.core/second



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/second</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/second)
</td>
</tr>
</table>


 <samp>
(__second__ coll)<br>
</samp>

---

Returns the second item in `coll`.

Same as `(first (next coll))`



---


###### See Also:

[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/nth`](../cljs.core/nth.md)<br>
[`cljs.core/fnext`](../cljs.core/fnext.md)<br>
[`cljs.core/next`](../cljs.core/next.md)<br>

---


Source docstring:

```
Same as (first (next x))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L802-L805):

```clj
(defn second
  [coll]
  (first (next coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:802-805](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L802-L805)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/second` @ clojuredocs](http://clojuredocs.org/clojure.core/second)<br>
[`clojure.core/second` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/second/)<br>
[`clojure.core/second` @ crossclj](http://crossclj.info/fun/clojure.core/second.html)<br>
[`cljs.core/second` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/second.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/second.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the second item in `coll`.\n\nSame as `(first (next coll))`",
 :ns "cljs.core",
 :name "second",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/nth"
           "cljs.core/fnext"
           "cljs.core/next"],
 :full-name-encode "cljs.core/second",
 :source {:code "(defn second\n  [coll]\n  (first (next coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [802 805]},
 :full-name "cljs.core/second",
 :clj-symbol "clojure.core/second",
 :docstring "Same as (first (next x))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/second"]))
```

-->
