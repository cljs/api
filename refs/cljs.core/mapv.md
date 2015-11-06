## cljs.core/mapv



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mapv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mapv)
</td>
</tr>
</table>


 <samp>
(__mapv__ f coll)<br>
</samp>
 <samp>
(__mapv__ f c1 c2)<br>
</samp>
 <samp>
(__mapv__ f c1 c2 c3)<br>
</samp>
 <samp>
(__mapv__ f c1 c2 c3 & colls)<br>
</samp>

---

Returns a vector consisting of the result of applying `f` to the set of first
items of each coll, followed by applying `f` to the set of second items in each
coll, until any one of the colls is exhausted. Any remaining items in other
colls are ignored.

Function `f` should accept number-of-colls arguments.



---


###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>

---


Source docstring:

```
Returns a vector consisting of the result of applying f to the
set of first items of each coll, followed by applying f to the set
of second items in each coll, until any one of the colls is
exhausted.  Any remaining items in other colls are ignored. Function
f should accept number-of-colls arguments.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/cljs/core.cljs#L2976-L2990):

```clj
(defn mapv
  ([f coll]
     (-> (reduce (fn [v o] (conj! v (f o))) (transient []) coll)
         persistent!))
  ([f c1 c2]
     (into [] (map f c1 c2)))
  ([f c1 c2 c3]
     (into [] (map f c1 c2 c3)))
  ([f c1 c2 c3 & colls]
     (into [] (apply map f c1 c2 c3 colls))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1877
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2976-2990](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/cljs/core.cljs#L2976-L2990)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/mapv` @ clojuredocs](http://clojuredocs.org/clojure.core/mapv)<br>
[`clojure.core/mapv` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/mapv/)<br>
[`clojure.core/mapv` @ crossclj](http://crossclj.info/fun/clojure.core/mapv.html)<br>
[`cljs.core/mapv` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/mapv.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mapv.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a vector consisting of the result of applying `f` to the set of first\nitems of each coll, followed by applying `f` to the set of second items in each\ncoll, until any one of the colls is exhausted. Any remaining items in other\ncolls are ignored.\n\nFunction `f` should accept number-of-colls arguments.",
 :ns "cljs.core",
 :name "mapv",
 :signature ["[f coll]"
             "[f c1 c2]"
             "[f c1 c2 c3]"
             "[f c1 c2 c3 & colls]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/map"],
 :full-name-encode "cljs.core/mapv",
 :source {:code "(defn mapv\n  ([f coll]\n     (-> (reduce (fn [v o] (conj! v (f o))) (transient []) coll)\n         persistent!))\n  ([f c1 c2]\n     (into [] (map f c1 c2)))\n  ([f c1 c2 c3]\n     (into [] (map f c1 c2 c3)))\n  ([f c1 c2 c3 & colls]\n     (into [] (apply map f c1 c2 c3 colls))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1877",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2976 2990]},
 :full-name "cljs.core/mapv",
 :clj-symbol "clojure.core/mapv",
 :docstring "Returns a vector consisting of the result of applying f to the\nset of first items of each coll, followed by applying f to the set\nof second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mapv"]))
```

-->
