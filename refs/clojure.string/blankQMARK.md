## clojure.string/blank?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/blank?</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/blank?)
</td>
</tr>
</table>


 <samp>
(__blank?__ s)<br>
</samp>

---

True if `s` is nil, empty, or contains only whitespace.



---




Source docstring:

```
True is s is nil, empty, or contains only whitespace.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/clojure/string.cljs#L159-L162):

```clj
(defn blank?
  [s]
  (gstring/isEmptySafe s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1886
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:159-162](https://github.com/clojure/clojurescript/blob/r1886/src/cljs/clojure/string.cljs#L159-L162)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/blank?` @ clojuredocs](http://clojuredocs.org/clojure.string/blank_q)<br>
[`clojure.string/blank?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/blank%3F/)<br>
[`clojure.string/blank?` @ crossclj](http://crossclj.info/fun/clojure.string/blank%3F.html)<br>
[`clojure.string/blank?` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/blank%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/blankQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "True if `s` is nil, empty, or contains only whitespace.",
 :ns "clojure.string",
 :name "blank?",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/blankQMARK",
 :source {:code "(defn blank?\n  [s]\n  (gstring/isEmptySafe s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/cljs/clojure/string.cljs",
          :lines [159 162]},
 :full-name "clojure.string/blank?",
 :clj-symbol "clojure.string/blank?",
 :docstring "True is s is nil, empty, or contains only whitespace."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/blank?"]))
```

-->
