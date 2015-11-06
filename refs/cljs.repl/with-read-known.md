## cljs.repl/with-read-known



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__with-read-known__ & body)<br>
</samp>

---





Source docstring:

```
Evaluates body with *read-eval* set to a "known" value,
i.e. substituting true for :unknown if necessary.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2740/src/clj/cljs/repl.clj#L80-L85):

```clj
(defmacro with-read-known
  [& body]
  `(binding [*read-eval* (if (= :unknown *read-eval*) true *read-eval*)]
     ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2740
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:80-85](https://github.com/clojure/clojurescript/blob/r2740/src/clj/cljs/repl.clj#L80-L85)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/with-read-known` @ crossclj](http://crossclj.info/fun/cljs.repl/with-read-known.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/with-read-known.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "with-read-known",
 :signature ["[& body]"],
 :history [["+" "0.0-2719"]],
 :type "macro",
 :full-name-encode "cljs.repl/with-read-known",
 :source {:code "(defmacro with-read-known\n  [& body]\n  `(binding [*read-eval* (if (= :unknown *read-eval*) true *read-eval*)]\n     ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/clj/cljs/repl.clj",
          :lines [80 85]},
 :full-name "cljs.repl/with-read-known",
 :docstring "Evaluates body with *read-eval* set to a \"known\" value,\ni.e. substituting true for :unknown if necessary."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/with-read-known"]))
```

-->
