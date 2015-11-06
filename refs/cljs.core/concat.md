## cljs.core/concat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/concat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/concat)
</td>
</tr>
</table>


 <samp>
(__concat__)<br>
</samp>
 <samp>
(__concat__ x)<br>
</samp>
 <samp>
(__concat__ x y)<br>
</samp>
 <samp>
(__concat__ x y & zs)<br>
</samp>

---

Returns a lazy sequence representing the concatenation of the elements in the
supplied collections.



---

###### Examples:

```clj
(concat (list 1 2 3) (list 4 5 6))
;;=> (1 2 3 4 5 6)

(concat [1 2 3] (list 4 5 6))
;; => (1 2 3 4 5 6)

(concat [1] [2] [3])
;; => (1 2 3)
```



---

###### See Also:

[`cljs.core/conj`](../cljs.core/conj.md)<br>
[`cljs.core/into`](../cljs.core/into.md)<br>

---


Source docstring:

```
Returns a lazy seq representing the concatenation of the elements in the supplied colls.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3173-L3196):

```clj
(defn concat
  ([] (lazy-seq nil))
  ([x] (lazy-seq x))
  ([x y]
    (lazy-seq
      (let [s (seq x)]
        (if s
          (if (chunked-seq? s)
            (chunk-cons (chunk-first s) (concat (chunk-rest s) y))
            (cons (first s) (concat (rest s) y)))
          y))))
  ([x y & zs]
     (let [cat (fn cat [xys zs]
                 (lazy-seq
                   (let [xys (seq xys)]
                     (if xys
                       (if (chunked-seq? xys)
                         (chunk-cons (chunk-first xys)
                                     (cat (chunk-rest xys) zs))
                         (cons (first xys) (cat (rest xys) zs)))
                       (when zs
                         (cat (first zs) (next zs)))))))]
       (cat (concat x y) zs))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3173-3196](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3173-L3196)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/concat` @ clojuredocs](http://clojuredocs.org/clojure.core/concat)<br>
[`clojure.core/concat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/concat/)<br>
[`clojure.core/concat` @ crossclj](http://crossclj.info/fun/clojure.core/concat.html)<br>
[`cljs.core/concat` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/concat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/concat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence representing the concatenation of the elements in the\nsupplied collections.",
 :ns "cljs.core",
 :name "concat",
 :signature ["[]" "[x]" "[x y]" "[x y & zs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj" "cljs.core/into"],
 :full-name-encode "cljs.core/concat",
 :source {:code "(defn concat\n  ([] (lazy-seq nil))\n  ([x] (lazy-seq x))\n  ([x y]\n    (lazy-seq\n      (let [s (seq x)]\n        (if s\n          (if (chunked-seq? s)\n            (chunk-cons (chunk-first s) (concat (chunk-rest s) y))\n            (cons (first s) (concat (rest s) y)))\n          y))))\n  ([x y & zs]\n     (let [cat (fn cat [xys zs]\n                 (lazy-seq\n                   (let [xys (seq xys)]\n                     (if xys\n                       (if (chunked-seq? xys)\n                         (chunk-cons (chunk-first xys)\n                                     (cat (chunk-rest xys) zs))\n                         (cons (first xys) (cat (rest xys) zs)))\n                       (when zs\n                         (cat (first zs) (next zs)))))))]\n       (cat (concat x y) zs))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3173 3196]},
 :examples [{:id "dcc019",
             :content "```clj\n(concat (list 1 2 3) (list 4 5 6))\n;;=> (1 2 3 4 5 6)\n\n(concat [1 2 3] (list 4 5 6))\n;; => (1 2 3 4 5 6)\n\n(concat [1] [2] [3])\n;; => (1 2 3)\n```"}],
 :full-name "cljs.core/concat",
 :clj-symbol "clojure.core/concat",
 :docstring "Returns a lazy seq representing the concatenation of the elements in the supplied colls."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/concat"]))
```

-->
