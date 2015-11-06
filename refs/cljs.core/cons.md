## cljs.core/cons



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cons</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cons)
</td>
</tr>
</table>


 <samp>
(__cons__ x coll)<br>
</samp>

---

Returns a new sequence where `x` is the first element and `coll` is the rest.



---

###### Examples:

```clj
(cons 1 (list 1 2 3))
;;=> (1 1 2 3)

(cons 1 [1 2 3])
;;=> (1 1 2 3)

(cons 1 nil)
;;=> (1)

(cons nil nil)
;;=> (nil)
```



---

###### See Also:

[`cljs.core/conj`](../cljs.core/conj.md)<br>

---


Source docstring:

```
Returns a new seq where x is the first element and seq is the rest.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L2468-L2474):

```clj
(defn cons
  [x coll]
  (if (or (nil? coll)
          (implements? ISeq coll))
    (Cons. nil x coll nil)
    (Cons. nil x (seq coll) nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2468-2474](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L2468-L2474)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/cons` @ clojuredocs](http://clojuredocs.org/clojure.core/cons)<br>
[`clojure.core/cons` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/cons/)<br>
[`clojure.core/cons` @ crossclj](http://crossclj.info/fun/clojure.core/cons.html)<br>
[`cljs.core/cons` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/cons.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cons.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new sequence where `x` is the first element and `coll` is the rest.",
 :ns "cljs.core",
 :name "cons",
 :signature ["[x coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj"],
 :full-name-encode "cljs.core/cons",
 :source {:code "(defn cons\n  [x coll]\n  (if (or (nil? coll)\n          (implements? ISeq coll))\n    (Cons. nil x coll nil)\n    (Cons. nil x (seq coll) nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2468 2474]},
 :examples [{:id "68c769",
             :content "```clj\n(cons 1 (list 1 2 3))\n;;=> (1 1 2 3)\n\n(cons 1 [1 2 3])\n;;=> (1 1 2 3)\n\n(cons 1 nil)\n;;=> (1)\n\n(cons nil nil)\n;;=> (nil)\n```"}],
 :full-name "cljs.core/cons",
 :clj-symbol "clojure.core/cons",
 :docstring "Returns a new seq where x is the first element and seq is the rest."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cons"]))
```

-->
