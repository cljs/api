## cljs.core/print



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print)
</td>
</tr>
</table>







Source docstring:

```
Prints the object(s) using string-print.
print and println produce output for human consumption.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L8285-L8290):

```clj
(def ^{:doc
  "Prints the object(s) using string-print.
  print and println produce output for human consumption."}
  print
  (fn cljs-core-print [& objs]
    (pr-with-opts objs (assoc (pr-opts) :readably false))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8285-8290](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L8285-L8290)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/print` @ clojuredocs](http://clojuredocs.org/clojure.core/print)<br>
[`clojure.core/print` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/print/)<br>
[`clojure.core/print` @ crossclj](http://crossclj.info/fun/clojure.core/print.html)<br>
[`cljs.core/print` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/print.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/print.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "print",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/print",
 :source {:code "(def ^{:doc\n  \"Prints the object(s) using string-print.\n  print and println produce output for human consumption.\"}\n  print\n  (fn cljs-core-print [& objs]\n    (pr-with-opts objs (assoc (pr-opts) :readably false))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8285 8290]},
 :full-name "cljs.core/print",
 :clj-symbol "clojure.core/print",
 :docstring "Prints the object(s) using string-print.\nprint and println produce output for human consumption."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/print"]))
```

-->
