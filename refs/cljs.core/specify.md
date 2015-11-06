## cljs.core/specify



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2138"><img valign="middle" alt="[+] 0.0-2138" title="Added in 0.0-2138" src="https://img.shields.io/badge/+-0.0--2138-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__specify__ expr & impls)<br>
</samp>

---





Source docstring:

```
Identical to specify but does not mutate its first argument. The first
argument must be an ICloneable instance.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/core.clj#L695-L700):

```clj
(defmacro specify
  [expr & impls]
  `(cljs.core/specify! (cljs.core/clone ~expr)
     ~@impls))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3169
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:695-700](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/core.clj#L695-L700)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/specify` @ crossclj](http://crossclj.info/fun/cljs.core/specify.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/specify.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "specify",
 :signature ["[expr & impls]"],
 :history [["+" "0.0-2138"]],
 :type "macro",
 :full-name-encode "cljs.core/specify",
 :source {:code "(defmacro specify\n  [expr & impls]\n  `(cljs.core/specify! (cljs.core/clone ~expr)\n     ~@impls))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/clj/cljs/core.clj",
          :lines [695 700]},
 :full-name "cljs.core/specify",
 :docstring "Identical to specify but does not mutate its first argument. The first\nargument must be an ICloneable instance."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/specify"]))
```

-->
