## cljs.core/to-array-2d



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/to-array-2d</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/to-array-2d)
</td>
</tr>
</table>


 <samp>
(__to-array-2d__ coll)<br>
</samp>

---

Returns a (potentially-ragged) 2-dimensional JavaScript array containing the
contents of `coll`.



---


###### See Also:

[`cljs.core/to-array`](../cljs.core/to-array.md)<br>

---


Source docstring:

```
Returns a (potentially-ragged) 2-dimensional array
containing the contents of coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L2234-L2243):

```clj
(defn to-array-2d
  [coll]
    (let [ret (make-array (count coll))]
      (loop [i 0 xs (seq coll)]
        (when xs
          (aset ret i (to-array (first xs)))
          (recur (inc i) (next xs))))
      ret))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2234-2243](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L2234-L2243)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/to-array-2d` @ clojuredocs](http://clojuredocs.org/clojure.core/to-array-2d)<br>
[`clojure.core/to-array-2d` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/to-array-2d/)<br>
[`clojure.core/to-array-2d` @ crossclj](http://crossclj.info/fun/clojure.core/to-array-2d.html)<br>
[`cljs.core/to-array-2d` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/to-array-2d.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/to-array-2d.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a (potentially-ragged) 2-dimensional JavaScript array containing the\ncontents of `coll`.",
 :ns "cljs.core",
 :name "to-array-2d",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/to-array"],
 :full-name-encode "cljs.core/to-array-2d",
 :source {:code "(defn to-array-2d\n  [coll]\n    (let [ret (make-array (count coll))]\n      (loop [i 0 xs (seq coll)]\n        (when xs\n          (aset ret i (to-array (first xs)))\n          (recur (inc i) (next xs))))\n      ret))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2234 2243]},
 :full-name "cljs.core/to-array-2d",
 :clj-symbol "clojure.core/to-array-2d",
 :docstring "Returns a (potentially-ragged) 2-dimensional array\ncontaining the contents of coll."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/to-array-2d"]))
```

-->
