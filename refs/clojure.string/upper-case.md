## clojure.string/upper-case



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/upper-case</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/upper-case)
</td>
</tr>
</table>


 <samp>
(__upper-case__ s)<br>
</samp>

---

Converts string to all upper-case.



---




Source docstring:

```
Converts string to all upper-case.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/string.cljs#L68-L71):

```clj
(defn upper-case
  [s]
  (.toUpperCase s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:68-71](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/string.cljs#L68-L71)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.string/upper-case` @ clojuredocs](http://clojuredocs.org/clojure.string/upper-case)<br>
[`clojure.string/upper-case` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.string/upper-case/)<br>
[`clojure.string/upper-case` @ crossclj](http://crossclj.info/fun/clojure.string/upper-case.html)<br>
[`clojure.string/upper-case` @ crossclj](http://crossclj.info/fun/clojure.string.cljs/upper-case.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string/upper-case.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Converts string to all upper-case.",
 :ns "clojure.string",
 :name "upper-case",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string/upper-case",
 :source {:code "(defn upper-case\n  [s]\n  (.toUpperCase s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/clojure/string.cljs",
          :lines [68 71]},
 :full-name "clojure.string/upper-case",
 :clj-symbol "clojure.string/upper-case",
 :docstring "Converts string to all upper-case."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/upper-case"]))
```

-->
