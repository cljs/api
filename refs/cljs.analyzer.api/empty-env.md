## cljs.analyzer.api/empty-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__empty-env__)<br>
</samp>

---





Source docstring:

```
Creates an empty analysis environment.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/analyzer/api.clj#L18-L21):

```clj
(defn empty-env
  []
  (ana/empty-env))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:18-21](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/analyzer/api.clj#L18-L21)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/empty-env` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/empty-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/empty-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "empty-env",
 :signature ["[]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/empty-env",
 :source {:code "(defn empty-env\n  []\n  (ana/empty-env))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [18 21]},
 :full-name "cljs.analyzer.api/empty-env",
 :docstring "Creates an empty analysis environment."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/empty-env"]))
```

-->
