## cljs.pprint/with-pprint-dispatch



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/with-pprint-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/with-pprint-dispatch)
</td>
</tr>
</table>


 <samp>
(__with-pprint-dispatch__ function & body)<br>
</samp>

---





Source docstring:

```
Execute body with the pretty print dispatch function bound to function.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.clj#L147-L151):

```clj
(defmacro with-pprint-dispatch
  [function & body]
  `(cljs.core/binding [cljs.pprint/*print-pprint-dispatch* ~function]
     ~@body))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:147-151](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.clj#L147-L151)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/with-pprint-dispatch` @ clojuredocs](http://clojuredocs.org/clojure.pprint/with-pprint-dispatch)<br>
[`clojure.pprint/with-pprint-dispatch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/with-pprint-dispatch/)<br>
[`clojure.pprint/with-pprint-dispatch` @ crossclj](http://crossclj.info/fun/clojure.pprint/with-pprint-dispatch.html)<br>
[`cljs.pprint/with-pprint-dispatch` @ crossclj](http://crossclj.info/fun/cljs.pprint/with-pprint-dispatch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/with-pprint-dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "with-pprint-dispatch",
 :signature ["[function & body]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/with-pprint-dispatch",
 :source {:code "(defmacro with-pprint-dispatch\n  [function & body]\n  `(cljs.core/binding [cljs.pprint/*print-pprint-dispatch* ~function]\n     ~@body))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [147 151]},
 :full-name "cljs.pprint/with-pprint-dispatch",
 :clj-symbol "clojure.pprint/with-pprint-dispatch",
 :docstring "Execute body with the pretty print dispatch function bound to function."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/with-pprint-dispatch"]))
```

-->
