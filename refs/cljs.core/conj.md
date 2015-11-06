## cljs.core/conj

_known as "conjoin"_


 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj)
</td>
</tr>
</table>


 <samp>
(__conj__)<br>
</samp>
 <samp>
(__conj__ coll)<br>
</samp>
 <samp>
(__conj__ coll x)<br>
</samp>
 <samp>
(__conj__ coll x & xs)<br>
</samp>

---

conj(oin)

Returns a new collection with the `x`s "added" to `coll`.

The "addition" may happen at different "places" depending on the collection
type.

`(conj nil item)` returns `(item)`.



---

###### Examples:

Append a vector:

```clj
(conj [1 2 3] 4)
;;=> [1 2 3 4]
```

Prepend a list:

```clj
(conj (list 1 2 3) 0)
;;=> (0 1 2 3)
```

Prepend a sequence:

```clj
(def x (range 1 4))
;;=> (1 2 3)

(conj x 0)
;;=> (0 1 2 3)
```

Add to set:

```clj
(conj #{"a" "b" "c"} "d")
;;=> #{"a" "b" "c" "d"}
```



---

###### See Also:

[`cljs.core/cons`](../cljs.core/cons.md)<br>
[`cljs.core/into`](../cljs.core/into.md)<br>
[`cljs.core/peek`](../cljs.core/peek.md)<br>
[`cljs.core/pop`](../cljs.core/pop.md)<br>

---


Source docstring:

```
conj[oin]. Returns a new collection with the xs
'added'. (conj nil item) returns (item).  The 'addition' may
happen at different 'places' depending on the concrete type.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L1549-L1562):

```clj
(defn conj
  ([] [])
  ([coll] coll)
  ([coll x]
    (if-not (nil? coll)
      (-conj coll x)
      (list x)))
  ([coll x & xs]
    (if xs
      (recur (conj coll x) (first xs) (next xs))
      (conj coll x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1549-1562](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L1549-L1562)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/conj` @ clojuredocs](http://clojuredocs.org/clojure.core/conj)<br>
[`clojure.core/conj` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/conj/)<br>
[`clojure.core/conj` @ crossclj](http://crossclj.info/fun/clojure.core/conj.html)<br>
[`cljs.core/conj` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/conj.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/conj.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "conj(oin)\n\nReturns a new collection with the `x`s \"added\" to `coll`.\n\nThe \"addition\" may happen at different \"places\" depending on the collection\ntype.\n\n`(conj nil item)` returns `(item)`.",
 :ns "cljs.core",
 :name "conj",
 :signature ["[]" "[coll]" "[coll x]" "[coll x & xs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/cons"
           "cljs.core/into"
           "cljs.core/peek"
           "cljs.core/pop"],
 :full-name-encode "cljs.core/conj",
 :source {:code "(defn conj\n  ([] [])\n  ([coll] coll)\n  ([coll x]\n    (if-not (nil? coll)\n      (-conj coll x)\n      (list x)))\n  ([coll x & xs]\n    (if xs\n      (recur (conj coll x) (first xs) (next xs))\n      (conj coll x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1549 1562]},
 :examples [{:id "8c2a84",
             :content "Append a vector:\n\n```clj\n(conj [1 2 3] 4)\n;;=> [1 2 3 4]\n```\n\nPrepend a list:\n\n```clj\n(conj (list 1 2 3) 0)\n;;=> (0 1 2 3)\n```\n\nPrepend a sequence:\n\n```clj\n(def x (range 1 4))\n;;=> (1 2 3)\n\n(conj x 0)\n;;=> (0 1 2 3)\n```\n\nAdd to set:\n\n```clj\n(conj #{\"a\" \"b\" \"c\"} \"d\")\n;;=> #{\"a\" \"b\" \"c\" \"d\"}\n```"}],
 :known-as "conjoin",
 :full-name "cljs.core/conj",
 :clj-symbol "clojure.core/conj",
 :docstring "conj[oin]. Returns a new collection with the xs\n'added'. (conj nil item) returns (item).  The 'addition' may\nhappen at different 'places' depending on the concrete type."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/conj"]))
```

-->
