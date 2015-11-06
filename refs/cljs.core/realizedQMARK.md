## cljs.core/realized?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/realized?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/realized?)
</td>
</tr>
</table>


 <samp>
(__realized?__ x)<br>
</samp>

---

Returns true if a value has been produced for a lazy sequence.



---


###### See Also:

[`cljs.core/lazy-seq`](../cljs.core/lazy-seq.md)<br>

---


Source docstring:

```
Returns true if a value has been produced for a promise, delay, future or lazy sequence.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L6047-L6050):

```clj
(defn ^boolean realized?
  [d]
  (-realized? d))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6047-6050](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L6047-L6050)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/realized?` @ clojuredocs](http://clojuredocs.org/clojure.core/realized_q)<br>
[`clojure.core/realized?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/realized%3F/)<br>
[`clojure.core/realized?` @ crossclj](http://crossclj.info/fun/clojure.core/realized%3F.html)<br>
[`cljs.core/realized?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/realized%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/realizedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if a value has been produced for a lazy sequence.",
 :return-type boolean,
 :ns "cljs.core",
 :name "realized?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/lazy-seq"],
 :full-name-encode "cljs.core/realizedQMARK",
 :source {:code "(defn ^boolean realized?\n  [d]\n  (-realized? d))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6047 6050]},
 :full-name "cljs.core/realized?",
 :clj-symbol "clojure.core/realized?",
 :docstring "Returns true if a value has been produced for a promise, delay, future or lazy sequence."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/realized?"]))
```

-->
