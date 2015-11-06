## cljs.build.api/parse-js-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-js-ns__ f)<br>
</samp>

---





Source docstring:

```
Given a Google Closure style JavaScript file or resource return the namespace
information for the given file. Only returns the value extracted from the
first provide statement.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/build/api.clj#L73-L78):

```clj
(defn parse-js-ns
  [f]
  (closure/parse-js-ns f))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:73-78](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/build/api.clj#L73-L78)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/parse-js-ns` @ crossclj](http://crossclj.info/fun/cljs.build.api/parse-js-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/parse-js-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "parse-js-ns",
 :signature ["[f]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api/parse-js-ns",
 :source {:code "(defn parse-js-ns\n  [f]\n  (closure/parse-js-ns f))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/build/api.clj",
          :lines [73 78]},
 :full-name "cljs.build.api/parse-js-ns",
 :docstring "Given a Google Closure style JavaScript file or resource return the namespace\ninformation for the given file. Only returns the value extracted from the\nfirst provide statement."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/parse-js-ns"]))
```

-->
