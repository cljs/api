## cljs.build.api/cljs-ns-dependents



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__cljs-ns-dependents__ ns)<br>
</samp>

---





Source docstring:

```
Given a namespace symbol return a seq of all dependent
namespaces sorted in dependency order. Will include
transient dependents.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/build/api.clj#L69-L74):

```clj
(defn cljs-ns-dependents
  [ns]
  (ana/ns-dependents ns))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:69-74](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/build/api.clj#L69-L74)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/cljs-ns-dependents` @ crossclj](http://crossclj.info/fun/cljs.build.api/cljs-ns-dependents.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/cljs-ns-dependents.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "cljs-ns-dependents",
 :signature ["[ns]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api/cljs-ns-dependents",
 :source {:code "(defn cljs-ns-dependents\n  [ns]\n  (ana/ns-dependents ns))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/build/api.clj",
          :lines [69 74]},
 :full-name "cljs.build.api/cljs-ns-dependents",
 :docstring "Given a namespace symbol return a seq of all dependent\nnamespaces sorted in dependency order. Will include\ntransient dependents."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/cljs-ns-dependents"]))
```

-->
