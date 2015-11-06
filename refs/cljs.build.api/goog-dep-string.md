## cljs.build.api/goog-dep-string



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__goog-dep-string__ opts ijs)<br>
</samp>

---





Source docstring:

```
Given compiler options and a IJavaScript instance return the corresponding
goog.addDependency string
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/clojure/cljs/build/api.clj#L127-L131):

```clj
(defn goog-dep-string
  [opts ijs]
  (closure/add-dep-string opts ijs))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:127-131](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/clojure/cljs/build/api.clj#L127-L131)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/goog-dep-string` @ crossclj](http://crossclj.info/fun/cljs.build.api/goog-dep-string.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/goog-dep-string.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "goog-dep-string",
 :signature ["[opts ijs]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api/goog-dep-string",
 :source {:code "(defn goog-dep-string\n  [opts ijs]\n  (closure/add-dep-string opts ijs))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [127 131]},
 :full-name "cljs.build.api/goog-dep-string",
 :docstring "Given compiler options and a IJavaScript instance return the corresponding\ngoog.addDependency string"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/goog-dep-string"]))
```

-->
