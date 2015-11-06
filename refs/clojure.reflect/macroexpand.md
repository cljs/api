## clojure.reflect/macroexpand



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__macroexpand__ form)<br>
</samp>

---





Source docstring:

```
Queries the reflection api with a quoted macro form, then calls the
callback function with the macroexpanded form, as a string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/clojure/reflect.cljs#L32-L36):

```clj
(defn macroexpand
  [form]
  (query-reflection (str "macroform=" (js/encodeURIComponent (str form))) println))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:32-36](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/clojure/reflect.cljs#L32-L36)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.reflect/macroexpand` @ crossclj](http://crossclj.info/fun/clojure.reflect.cljs/macroexpand.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.reflect/macroexpand.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.reflect",
 :name "macroexpand",
 :signature ["[form]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "clojure.reflect/macroexpand",
 :source {:code "(defn macroexpand\n  [form]\n  (query-reflection (str \"macroform=\" (js/encodeURIComponent (str form))) println))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/clojure/reflect.cljs",
          :lines [32 36]},
 :full-name "clojure.reflect/macroexpand",
 :docstring "Queries the reflection api with a quoted macro form, then calls the\ncallback function with the macroexpanded form, as a string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.reflect/macroexpand"]))
```

-->
