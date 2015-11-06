## cljs.repl.reflect/macroexpand



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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/clj/cljs/repl/reflect.clj#L32-L37):

```clj
(defn macroexpand [form]
  "Fully expands a cljs macro form."
  (let [mform (analyzer/macroexpand-1 {} form)]
    (if (identical? form mform)
      mform
      (macroexpand mform))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:32-37](https://github.com/clojure/clojurescript/blob/r1896/src/clj/cljs/repl/reflect.clj#L32-L37)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.reflect/macroexpand` @ crossclj](http://crossclj.info/fun/cljs.repl.reflect/macroexpand.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect/macroexpand.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.reflect",
 :name "macroexpand",
 :type "function",
 :signature ["[form]"],
 :source {:code "(defn macroexpand [form]\n  \"Fully expands a cljs macro form.\"\n  (let [mform (analyzer/macroexpand-1 {} form)]\n    (if (identical? form mform)\n      mform\n      (macroexpand mform))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [32 37]},
 :full-name "cljs.repl.reflect/macroexpand",
 :full-name-encode "cljs.repl.reflect/macroexpand",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/macroexpand"]))
```

-->
