## cljs.core/take-nth



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-nth</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-nth)
</td>
</tr>
</table>


 <samp>
(__take-nth__ n)<br>
</samp>
 <samp>
(__take-nth__ n coll)<br>
</samp>

---

Returns a lazy seq of every `n`th item in `coll`.

Returns a stateful transducer when no collection is provided.



---




Source docstring:

```
Returns a lazy seq of every nth item in coll.  Returns a stateful
transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L8212-L8229):

```clj
(defn take-nth
  ([n]
     (fn [rf]
       (let [ia (volatile! -1)]
         (fn
           ([] (rf))
           ([result] (rf result))
           ([result input]
              (let [i (vswap! ia inc)]
                (if (zero? (rem i n))
                  (rf result input)
                  result)))))))
  ([n coll]
     (lazy-seq
       (when-let [s (seq coll)]
         (cons (first s) (take-nth n (drop n s)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8212-8229](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L8212-L8229)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/take-nth` @ clojuredocs](http://clojuredocs.org/clojure.core/take-nth)<br>
[`clojure.core/take-nth` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/take-nth/)<br>
[`clojure.core/take-nth` @ crossclj](http://crossclj.info/fun/clojure.core/take-nth.html)<br>
[`cljs.core/take-nth` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/take-nth.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/take-nth.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy seq of every `n`th item in `coll`.\n\nReturns a stateful transducer when no collection is provided.",
 :ns "cljs.core",
 :name "take-nth",
 :signature ["[n]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/take-nth",
 :source {:code "(defn take-nth\n  ([n]\n     (fn [rf]\n       (let [ia (volatile! -1)]\n         (fn\n           ([] (rf))\n           ([result] (rf result))\n           ([result input]\n              (let [i (vswap! ia inc)]\n                (if (zero? (rem i n))\n                  (rf result input)\n                  result)))))))\n  ([n coll]\n     (lazy-seq\n       (when-let [s (seq coll)]\n         (cons (first s) (take-nth n (drop n s)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8212 8229]},
 :full-name "cljs.core/take-nth",
 :clj-symbol "clojure.core/take-nth",
 :docstring "Returns a lazy seq of every nth item in coll.  Returns a stateful\ntransducer when no collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-nth"]))
```

-->
