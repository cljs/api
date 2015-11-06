## clojure.string/ends-with?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.145"><img valign="middle" alt="[+] 1.7.145" title="Added in 1.7.145" src="https://img.shields.io/badge/+-1.7.145-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ends-with?__ s substr)<br>
</samp>

---





Source docstring:

```
True if s ends with substr.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/clojure/string.cljs#L250-L253):

```clj
(defn ^boolean ends-with?
  [s substr]
  (gstring/endsWith s substr))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[string.cljs:250-253](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/clojure/string.cljs#L250-L253)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/ends-with?` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/ends-with%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/ends-withQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "clojure.string",
 :name "ends-with?",
 :signature ["[s substr]"],
 :history [["+" "1.7.145"]],
 :type "function",
 :full-name-encode "clojure.string/ends-withQMARK",
 :source {:code "(defn ^boolean ends-with?\n  [s substr]\n  (gstring/endsWith s substr))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/clojure/string.cljs",
          :lines [250 253]},
 :full-name "clojure.string/ends-with?",
 :docstring "True if s ends with substr."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/ends-with?"]))
```

-->
