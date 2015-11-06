## cljs.core/this-as



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__this-as__ name & body)<br>
</samp>

---





Source docstring:

```
Defines a scope where JavaScript's implicit "this" is bound to the name provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L604-L608):

```clj
(defmacro this-as
  [name & body]
  `(let [~name (js-this)]
     ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:604-608](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L604-L608)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/this-as` @ crossclj](http://crossclj.info/fun/cljs.core/this-as.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/this-as.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "this-as",
 :signature ["[name & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/this-as",
 :source {:code "(defmacro this-as\n  [name & body]\n  `(let [~name (js-this)]\n     ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/clj/cljs/core.clj",
          :lines [604 608]},
 :full-name "cljs.core/this-as",
 :docstring "Defines a scope where JavaScript's implicit \"this\" is bound to the name provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/this-as"]))
```

-->
