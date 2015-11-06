## cljs.core/exists?



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__exists?__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/clj/cljs/core.clj#L240-L241):

```clj
(defmacro exists? [x]
  (bool-expr (list 'js* "typeof ~{} !== 'undefined'" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:240-241](https://github.com/clojure/clojurescript/blob/r1896/src/clj/cljs/core.clj#L240-L241)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/exists?` @ crossclj](http://crossclj.info/fun/cljs.core/exists%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/existsQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "exists?",
 :type "macro",
 :signature ["[x]"],
 :source {:code "(defmacro exists? [x]\n  (bool-expr (list 'js* \"typeof ~{} !== 'undefined'\" x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/clj/cljs/core.clj",
          :lines [240 241]},
 :full-name "cljs.core/exists?",
 :full-name-encode "cljs.core/existsQMARK",
 :history [["+" "0.0-1798"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/exists?"]))
```

-->
