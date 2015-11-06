## cljs.core/regexp?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__regexp?__ x)<br>
</samp>

---





Source docstring:

```
Returns true if x is a JavaScript RegExp instance.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L8388-L8391):

```clj
(defn regexp?
  [x]
  (instance? js/RegExp x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8388-8391](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L8388-L8391)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/regexp?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/regexp%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/regexpQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "regexp?",
 :signature ["[x]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core/regexpQMARK",
 :source {:code "(defn regexp?\n  [x]\n  (instance? js/RegExp x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8388 8391]},
 :full-name "cljs.core/regexp?",
 :docstring "Returns true if x is a JavaScript RegExp instance."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/regexp?"]))
```

-->
