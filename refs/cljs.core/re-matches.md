## cljs.core/re-matches



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-matches</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-matches)
</td>
</tr>
</table>


 <samp>
(__re-matches__ re s)<br>
</samp>

---

Returns the result of `(re-find re s)` if `re` fully matches `s`.



---




Source docstring:

```
Returns the result of (re-find re s) if re fully matches s.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L8065-L8074):

```clj
(defn re-matches
  [re s]
  (if (string? s)
    (let [matches (.exec re s)]
      (when (= (first matches) s)
        (if (== (count matches) 1)
          (first matches)
          (vec matches))))
    (throw (js/TypeError. "re-matches must match against a string."))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8065-8074](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L8065-L8074)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/re-matches` @ clojuredocs](http://clojuredocs.org/clojure.core/re-matches)<br>
[`clojure.core/re-matches` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/re-matches/)<br>
[`clojure.core/re-matches` @ crossclj](http://crossclj.info/fun/clojure.core/re-matches.html)<br>
[`cljs.core/re-matches` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/re-matches.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/re-matches.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the result of `(re-find re s)` if `re` fully matches `s`.",
 :ns "cljs.core",
 :name "re-matches",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/re-matches",
 :source {:code "(defn re-matches\n  [re s]\n  (if (string? s)\n    (let [matches (.exec re s)]\n      (when (= (first matches) s)\n        (if (== (count matches) 1)\n          (first matches)\n          (vec matches))))\n    (throw (js/TypeError. \"re-matches must match against a string.\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8065 8074]},
 :full-name "cljs.core/re-matches",
 :clj-symbol "clojure.core/re-matches",
 :docstring "Returns the result of (re-find re s) if re fully matches s."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-matches"]))
```

-->
