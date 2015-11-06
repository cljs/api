## cljs.core/amap



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/amap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/amap)
</td>
</tr>
</table>


 <samp>
(__amap__ a idx ret expr)<br>
</samp>

---

For quickly creating a new JavaScript array by mapping an expression `expr`
across a JavaScript array `a`.  The expression can use `ret` as the current
result, which is initialized to `a`.  It can also use `idx` to get the current
index.



---

###### Examples:

```clj
(def a #js [1 2 3])
(amap a i ret (* 10 (aget a i)))
;;=> #js [10 20 30]
```



---
###### Examples:

You can also use `ret` inside the mapped expression if you want to use the
current result:

```clj
(def a #js [1 2 3])
(amap a i ret (+ (if (pos? i)
                   (aget ret (dec i))
                   0)
                 (* 10 (aget a i))))
;;=> #js [10 30 60]
```



---

###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>

---


Source docstring:

```
Maps an expression across an array a, using an index named idx, and
return value named ret, initialized to a clone of a, then setting
each element of ret to the evaluation of expr, returning the new
array ret.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L1727-L1740):

```clj
(defmacro amap
  [a idx ret expr]
  `(let [a# ~a
         ~ret (aclone a#)]
     (loop  [~idx 0]
       (if (< ~idx  (alength a#))
         (do
           (aset ~ret ~idx ~expr)
           (recur (inc ~idx)))
         ~ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1727-1740](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L1727-L1740)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/amap` @ clojuredocs](http://clojuredocs.org/clojure.core/amap)<br>
[`clojure.core/amap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/amap/)<br>
[`clojure.core/amap` @ crossclj](http://crossclj.info/fun/clojure.core/amap.html)<br>
[`cljs.core/amap` @ crossclj](http://crossclj.info/fun/cljs.core/amap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/amap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "For quickly creating a new JavaScript array by mapping an expression `expr`\nacross a JavaScript array `a`.  The expression can use `ret` as the current\nresult, which is initialized to `a`.  It can also use `idx` to get the current\nindex.",
 :ns "cljs.core",
 :name "amap",
 :signature ["[a idx ret expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/map"],
 :full-name-encode "cljs.core/amap",
 :source {:code "(defmacro amap\n  [a idx ret expr]\n  `(let [a# ~a\n         ~ret (aclone a#)]\n     (loop  [~idx 0]\n       (if (< ~idx  (alength a#))\n         (do\n           (aset ~ret ~idx ~expr)\n           (recur (inc ~idx)))\n         ~ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/core.clj",
          :lines [1727 1740]},
 :examples [{:id "3a7471",
             :content "```clj\n(def a #js [1 2 3])\n(amap a i ret (* 10 (aget a i)))\n;;=> #js [10 20 30]\n```"}
            {:id "0f57af",
             :content "You can also use `ret` inside the mapped expression if you want to use the\ncurrent result:\n\n```clj\n(def a #js [1 2 3])\n(amap a i ret (+ (if (pos? i)\n                   (aget ret (dec i))\n                   0)\n                 (* 10 (aget a i))))\n;;=> #js [10 30 60]\n```"}],
 :full-name "cljs.core/amap",
 :clj-symbol "clojure.core/amap",
 :docstring "Maps an expression across an array a, using an index named idx, and\nreturn value named ret, initialized to a clone of a, then setting\neach element of ret to the evaluation of expr, returning the new\narray ret."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/amap"]))
```

-->
