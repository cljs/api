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
Returns a lazy seq of every nth item in coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5470-L5475):

```clj
(defn take-nth
  [n coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (cons (first s) (take-nth n (drop n s))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5470-5475](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5470-L5475)</ins>
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
 :source {:code "(defn take-nth\n  [n coll]\n  (lazy-seq\n   (when-let [s (seq coll)]\n     (cons (first s) (take-nth n (drop n s))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5470 5475]},
 :full-name "cljs.core/take-nth",
 :clj-symbol "clojure.core/take-nth",
 :docstring "Returns a lazy seq of every nth item in coll."}

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
