## cljs.core/take-while



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-while)
</td>
</tr>
</table>


 <samp>
(__take-while__ pred)<br>
</samp>
 <samp>
(__take-while__ pred coll)<br>
</samp>

---

Returns a lazy sequence of successive items from `coll` while `(pred item)`
returns true. `pred` must be free of side-effects.

Returns a transducer when no collection is provided.



---


###### See Also:

[`cljs.core/drop-while`](../cljs.core/drop-while.md)<br>
[`cljs.core/split-with`](../cljs.core/split-with.md)<br>

---


Source docstring:

```
Returns a lazy sequence of successive items from coll while
(pred item) returns true. pred must be free of side-effects.
Returns a transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L8080-L8097):

```clj
(defn take-while
  ([pred]
     (fn [rf]
       (fn
         ([] (rf))
         ([result] (rf result))
         ([result input]
            (if (pred input)
              (rf result input)
              (reduced result))))))
  ([pred coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (when (pred (first s))
           (cons (first s) (take-while pred (rest s))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8080-8097](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L8080-L8097)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/take-while` @ clojuredocs](http://clojuredocs.org/clojure.core/take-while)<br>
[`clojure.core/take-while` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/take-while/)<br>
[`clojure.core/take-while` @ crossclj](http://crossclj.info/fun/clojure.core/take-while.html)<br>
[`cljs.core/take-while` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/take-while.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/take-while.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of successive items from `coll` while `(pred item)`\nreturns true. `pred` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "take-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/drop-while" "cljs.core/split-with"],
 :full-name-encode "cljs.core/take-while",
 :source {:code "(defn take-while\n  ([pred]\n     (fn [rf]\n       (fn\n         ([] (rf))\n         ([result] (rf result))\n         ([result input]\n            (if (pred input)\n              (rf result input)\n              (reduced result))))))\n  ([pred coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (when (pred (first s))\n           (cons (first s) (take-while pred (rest s))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8080 8097]},
 :full-name "cljs.core/take-while",
 :clj-symbol "clojure.core/take-while",
 :docstring "Returns a lazy sequence of successive items from coll while\n(pred item) returns true. pred must be free of side-effects.\nReturns a transducer when no collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-while"]))
```

-->
