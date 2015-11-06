## cljs.core/dedupe



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dedupe</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dedupe)
</td>
</tr>
</table>


 <samp>
(__dedupe__)<br>
</samp>
 <samp>
(__dedupe__ coll)<br>
</samp>

---





Source docstring:

```
Returns a lazy sequence removing consecutive duplicates in coll.
Returns a transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L8898-L8913):

```clj
(defn dedupe
  ([]
   (fn [rf]
     (let [pa (volatile! ::none)]
       (fn
         ([] (rf))
         ([result] (rf result))
         ([result input]
            (let [prior @pa]
              (vreset! pa input)
              (if (= prior input)
                result
                (rf result input))))))))
  ([coll] (sequence (dedupe) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8898-8913](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L8898-L8913)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/dedupe` @ clojuredocs](http://clojuredocs.org/clojure.core/dedupe)<br>
[`clojure.core/dedupe` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/dedupe/)<br>
[`clojure.core/dedupe` @ crossclj](http://crossclj.info/fun/clojure.core/dedupe.html)<br>
[`cljs.core/dedupe` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/dedupe.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/dedupe.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "dedupe",
 :signature ["[]" "[coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core/dedupe",
 :source {:code "(defn dedupe\n  ([]\n   (fn [rf]\n     (let [pa (volatile! ::none)]\n       (fn\n         ([] (rf))\n         ([result] (rf result))\n         ([result input]\n            (let [prior @pa]\n              (vreset! pa input)\n              (if (= prior input)\n                result\n                (rf result input))))))))\n  ([coll] (sequence (dedupe) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8898 8913]},
 :full-name "cljs.core/dedupe",
 :clj-symbol "clojure.core/dedupe",
 :docstring "Returns a lazy sequence removing consecutive duplicates in coll.\nReturns a transducer when no collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dedupe"]))
```

-->
