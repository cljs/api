## clojure.string/lower-case



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/lower-case</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/lower-case)
</td>
</tr>
</table>


 <samp>
(__lower-case__ s)<br>
</samp>

---

Converts string to all lower-case.



---




Source docstring:

```
Converts string to all lower-case.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/clojure/string.cljs#L58-L61):

```clj
(defn lower-case
  [s]
  (.toLowerCase s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:58-61](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/clojure/string.cljs#L58-L61)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/lower-case` @ clojuredocs](http://clojuredocs.org/clojure.string/lower-case)<br>
[`clojure.string/lower-case` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/lower-case/)<br>
[`clojure.string/lower-case` @ crossclj](http://crossclj.info/fun/clojure.string/lower-case.html)<br>
[`clojure.string/lower-case` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/lower-case.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/lower-case.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Converts string to all lower-case.",
 :ns "clojure.string",
 :name "lower-case",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/lower-case",
 :source {:code "(defn lower-case\n  [s]\n  (.toLowerCase s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/clojure/string.cljs",
          :lines [58 61]},
 :full-name "clojure.string/lower-case",
 :clj-symbol "clojure.string/lower-case",
 :docstring "Converts string to all lower-case."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/lower-case"]))
```

-->
