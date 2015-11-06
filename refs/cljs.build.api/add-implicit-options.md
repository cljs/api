## cljs.build.api/add-implicit-options



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__add-implicit-options__ opts)<br>
</samp>

---





Source docstring:

```
Given a valid map of build options add any standard implicit options. For
example :optimizations :none implies :cache-analysis true and :source-map
true.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/build/api.clj#L164-L169):

```clj
(defn add-implicit-options
  [opts]
  (closure/add-implicit-options opts))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:164-169](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/build/api.clj#L164-L169)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/add-implicit-options` @ crossclj](http://crossclj.info/fun/cljs.build.api/add-implicit-options.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/add-implicit-options.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "add-implicit-options",
 :signature ["[opts]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api/add-implicit-options",
 :source {:code "(defn add-implicit-options\n  [opts]\n  (closure/add-implicit-options opts))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [164 169]},
 :full-name "cljs.build.api/add-implicit-options",
 :docstring "Given a valid map of build options add any standard implicit options. For\nexample :optimizations :none implies :cache-analysis true and :source-map\ntrue."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/add-implicit-options"]))
```

-->
