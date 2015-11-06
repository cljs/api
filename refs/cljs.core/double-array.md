## cljs.core/double-array



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/double-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/double-array)
</td>
</tr>
</table>


 <samp>
(__double-array__ size-or-seq)<br>
</samp>
 <samp>
(__double-array__ size init-val-or-seq)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2305-L2323):

```clj
(defn double-array
  ([size-or-seq]
     (if (number? size-or-seq)
       (double-array size-or-seq nil)
       (into-array size-or-seq)))
  ([size init-val-or-seq]
     (let [a (make-array size)]
       (if (seq? init-val-or-seq)
         (let [s (seq init-val-or-seq)]
           (loop [i 0 s s]
             (if (and s (< i size))
               (do
                 (aset a i (first s))
                 (recur (inc i) (next s)))
               a)))
         (do
           (dotimes [i size]
             (aset a i init-val-or-seq))
           a)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2305-2323](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/cljs/core.cljs#L2305-L2323)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/double-array` @ clojuredocs](http://clojuredocs.org/clojure.core/double-array)<br>
[`clojure.core/double-array` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/double-array/)<br>
[`clojure.core/double-array` @ crossclj](http://crossclj.info/fun/clojure.core/double-array.html)<br>
[`cljs.core/double-array` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/double-array.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/double-array.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "double-array",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/double-array",
 :source {:code "(defn double-array\n  ([size-or-seq]\n     (if (number? size-or-seq)\n       (double-array size-or-seq nil)\n       (into-array size-or-seq)))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2305 2323]},
 :full-name "cljs.core/double-array",
 :clj-symbol "clojure.core/double-array"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/double-array"]))
```

-->
