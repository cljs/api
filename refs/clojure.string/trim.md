## clojure.string/trim



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trim</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trim)
</td>
</tr>
</table>


 <samp>
(__trim__ s)<br>
</samp>

---

Removes whitespace from both ends of string.



---




Source docstring:

```
Removes whitespace from both ends of string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/clojure/string.cljs#L132-L135):

```clj
(defn trim
    [s]
    (gstring/trim s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:132-135](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/clojure/string.cljs#L132-L135)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/trim` @ clojuredocs](http://clojuredocs.org/clojure.string/trim)<br>
[`clojure.string/trim` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/trim/)<br>
[`clojure.string/trim` @ crossclj](http://crossclj.info/fun/clojure.string/trim.html)<br>
[`clojure.string/trim` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/trim.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/trim.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Removes whitespace from both ends of string.",
 :ns "clojure.string",
 :name "trim",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/trim",
 :source {:code "(defn trim\n    [s]\n    (gstring/trim s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/clojure/string.cljs",
          :lines [132 135]},
 :full-name "clojure.string/trim",
 :clj-symbol "clojure.string/trim",
 :docstring "Removes whitespace from both ends of string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/trim"]))
```

-->
