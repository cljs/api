## cljs.build.api/ns->source



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ns->source__ ns)<br>
</samp>

---





Source docstring:

```
Given a namespace as a symbol return the corresponding resource if it exists.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/build/api.clj#L139-L142):

```clj
(defn ns->source
  [ns]
  (util/ns->source ns))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:139-142](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/build/api.clj#L139-L142)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/ns->source` @ crossclj](http://crossclj.info/fun/cljs.build.api/ns-%3Esource.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/ns-GTsource.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "ns->source",
 :signature ["[ns]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api/ns-GTsource",
 :source {:code "(defn ns->source\n  [ns]\n  (util/ns->source ns))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [139 142]},
 :full-name "cljs.build.api/ns->source",
 :docstring "Given a namespace as a symbol return the corresponding resource if it exists."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/ns->source"]))
```

-->
