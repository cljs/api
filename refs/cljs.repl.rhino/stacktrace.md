## cljs.repl.rhino/stacktrace



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L45):

```clj
(defmulti stacktrace class)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:45](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L45)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L47-L51):

```clj
(defmethod stacktrace :default [e]
  (apply str
    (interpose "\n"
      (map #(str "        " (.toString %))
        (.getStackTrace e)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:47-51](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L47-L51)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L53-L54):

```clj
(defmethod stacktrace RhinoException [^RhinoException e]
  (.getScriptStackTrace e))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:53-54](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L53-L54)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.repl.rhino/stacktrace` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/stacktrace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/stacktrace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "stacktrace",
 :type "multimethod",
 :source {:code "(defmulti stacktrace class)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [45]},
 :full-name "cljs.repl.rhino/stacktrace",
 :full-name-encode "cljs.repl.rhino/stacktrace",
 :extra-sources ({:code "(defmethod stacktrace :default [e]\n  (apply str\n    (interpose \"\\n\"\n      (map #(str \"        \" (.toString %))\n        (.getStackTrace e)))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r2913",
                  :filename "src/clj/cljs/repl/rhino.clj",
                  :lines [47 51]}
                 {:code "(defmethod stacktrace RhinoException [^RhinoException e]\n  (.getScriptStackTrace e))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r2913",
                  :filename "src/clj/cljs/repl/rhino.clj",
                  :lines [53 54]}),
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/stacktrace"]))
```

-->
