## cljs.core/re-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-seq)
</td>
</tr>
</table>


 <samp>
(__re-seq__ re s)<br>
</samp>

---

Returns a lazy sequence of successive matches of regex `re` in string `s`.



---


###### See Also:

[`cljs.core/re-find`](../cljs.core/re-find.md)<br>
[`cljs.core/re-pattern`](../cljs.core/re-pattern.md)<br>
[`cljs.core/re-matches`](../cljs.core/re-matches.md)<br>
[`cljs.core/subs`](../cljs.core/subs.md)<br>
[`clojure.string/split`](../clojure.string/split.md)<br>

---


Source docstring:

```
Returns a lazy sequence of successive matches of re in s.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L7670-L7677):

```clj
(defn re-seq
  [re s]
  (let [match-data (re-find re s)
        match-idx (.search s re)
        match-str (if (coll? match-data) (first match-data) match-data)
        post-match (subs s (+ match-idx (count match-str)))]
    (when match-data (lazy-seq (cons match-data (when (seq post-match) (re-seq re post-match)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7670-7677](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L7670-L7677)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/re-seq` @ clojuredocs](http://clojuredocs.org/clojure.core/re-seq)<br>
[`clojure.core/re-seq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/re-seq/)<br>
[`clojure.core/re-seq` @ crossclj](http://crossclj.info/fun/clojure.core/re-seq.html)<br>
[`cljs.core/re-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/re-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/re-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of successive matches of regex `re` in string `s`.",
 :ns "cljs.core",
 :name "re-seq",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/re-find"
           "cljs.core/re-pattern"
           "cljs.core/re-matches"
           "cljs.core/subs"
           "clojure.string/split"],
 :full-name-encode "cljs.core/re-seq",
 :source {:code "(defn re-seq\n  [re s]\n  (let [match-data (re-find re s)\n        match-idx (.search s re)\n        match-str (if (coll? match-data) (first match-data) match-data)\n        post-match (subs s (+ match-idx (count match-str)))]\n    (when match-data (lazy-seq (cons match-data (when (seq post-match) (re-seq re post-match)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7670 7677]},
 :full-name "cljs.core/re-seq",
 :clj-symbol "clojure.core/re-seq",
 :docstring "Returns a lazy sequence of successive matches of re in s."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-seq"]))
```

-->
