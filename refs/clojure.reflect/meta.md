## clojure.reflect/meta



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__meta__ sym cb)<br>
</samp>

---





Source docstring:

```
Queries the reflection api with a fully qualified symbol, then calls
callback fn cb with the evaluated cljs map containing that symbol's
meta information.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/clojure/reflect.cljs#L24-L30):

```clj
(defn meta
  [sym cb]
  (query-reflection (str "var=" (js/encodeURIComponent (str sym)))
                    #(cb (evaluate-javascript %))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:24-30](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/clojure/reflect.cljs#L24-L30)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.reflect/meta` @ crossclj](http://crossclj.info/fun/clojure.reflect.cljs/meta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect/meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.reflect",
 :name "meta",
 :signature ["[sym cb]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect/meta",
 :source {:code "(defn meta\n  [sym cb]\n  (query-reflection (str \"var=\" (js/encodeURIComponent (str sym)))\n                    #(cb (evaluate-javascript %))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/clojure/reflect.cljs",
          :lines [24 30]},
 :full-name "clojure.reflect/meta",
 :docstring "Queries the reflection api with a fully qualified symbol, then calls\ncallback fn cb with the evaluated cljs map containing that symbol's\nmeta information."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/meta"]))
```

-->
