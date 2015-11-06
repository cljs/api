## clojure.string/trimr



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trimr</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trimr)
</td>
</tr>
</table>


 <samp>
(__trimr__ s)<br>
</samp>

---

Removes whitespace from the right side of string.



---




Source docstring:

```
Removes whitespace from the right side of string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/clojure/string.cljs#L157-L160):

```clj
(defn trimr
    [s]
    (gstring/trimRight s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:157-160](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/clojure/string.cljs#L157-L160)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/trimr` @ clojuredocs](http://clojuredocs.org/clojure.string/trimr)<br>
[`clojure.string/trimr` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/trimr/)<br>
[`clojure.string/trimr` @ crossclj](http://crossclj.info/fun/clojure.string/trimr.html)<br>
[`clojure.string/trimr` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/trimr.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/trimr.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Removes whitespace from the right side of string.",
 :ns "clojure.string",
 :name "trimr",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/trimr",
 :source {:code "(defn trimr\n    [s]\n    (gstring/trimRight s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/clojure/string.cljs",
          :lines [157 160]},
 :full-name "clojure.string/trimr",
 :clj-symbol "clojure.string/trimr",
 :docstring "Removes whitespace from the right side of string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/trimr"]))
```

-->
