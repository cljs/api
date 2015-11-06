## clojure.string/triml



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/triml</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/triml)
</td>
</tr>
</table>


 <samp>
(__triml__ s)<br>
</samp>

---

Removes whitespace from the left side of string.



---




Source docstring:

```
Removes whitespace from the left side of string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/clojure/string.cljs#L156-L159):

```clj
(defn triml
  [s]
  (gstring/trimLeft s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[string.cljs:156-159](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/clojure/string.cljs#L156-L159)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/triml` @ clojuredocs](http://clojuredocs.org/clojure.string/triml)<br>
[`clojure.string/triml` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/triml/)<br>
[`clojure.string/triml` @ crossclj](http://crossclj.info/fun/clojure.string/triml.html)<br>
[`clojure.string/triml` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/triml.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/triml.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Removes whitespace from the left side of string.",
 :ns "clojure.string",
 :name "triml",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/triml",
 :source {:code "(defn triml\n  [s]\n  (gstring/trimLeft s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/clojure/string.cljs",
          :lines [156 159]},
 :full-name "clojure.string/triml",
 :clj-symbol "clojure.string/triml",
 :docstring "Removes whitespace from the left side of string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/triml"]))
```

-->
