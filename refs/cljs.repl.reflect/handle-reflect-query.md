## cljs.repl.reflect/handle-reflect-query



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__handle-reflect-query__ \[param _\] & _)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L60):

```clj
(defmulti handle-reflect-query (fn [[param _] & _] param))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[reflect.clj:60](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L60)</ins>
</pre>

-->

---

Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L62-L65):

```clj
(defmethod handle-reflect-query "var"
  [[_ sym] req conn opts]
  (let [sym (read-url-string sym)]
    (compile-and-return conn (get-meta sym))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[reflect.clj:62-65](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L62-L65)</ins>
</pre>
-->

---
Dispatch method @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L67-L70):

```clj
(defmethod handle-reflect-query "macroform"
  [[_ mform] req conn opts]
  (let [mform (-> mform read-url-string macroexpand)]
    (server/send-and-close conn 200 (with-out-str (pprint/pprint mform)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[reflect.clj:67-70](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/reflect.clj#L67-L70)</ins>
</pre>
-->

---


###### External doc links:

[`cljs.repl.reflect/handle-reflect-query` @ crossclj](http://crossclj.info/fun/cljs.repl.reflect/handle-reflect-query.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect/handle-reflect-query.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.reflect",
 :name "handle-reflect-query",
 :signature ["[[param _] & _]"],
 :history [["+" "0.0-1503"]],
 :type "multimethod",
 :full-name-encode "cljs.repl.reflect/handle-reflect-query",
 :source {:code "(defmulti handle-reflect-query (fn [[param _] & _] param))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/repl/reflect.clj",
          :lines [60]},
 :extra-sources ({:code "(defmethod handle-reflect-query \"var\"\n  [[_ sym] req conn opts]\n  (let [sym (read-url-string sym)]\n    (compile-and-return conn (get-meta sym))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3269",
                  :filename "src/main/clojure/cljs/repl/reflect.clj",
                  :lines [62 65]}
                 {:code "(defmethod handle-reflect-query \"macroform\"\n  [[_ mform] req conn opts]\n  (let [mform (-> mform read-url-string macroexpand)]\n    (server/send-and-close conn 200 (with-out-str (pprint/pprint mform)))))",
                  :title "Dispatch method",
                  :repo "clojurescript",
                  :tag "r3269",
                  :filename "src/main/clojure/cljs/repl/reflect.clj",
                  :lines [67 70]}),
 :full-name "cljs.repl.reflect/handle-reflect-query"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/handle-reflect-query"]))
```

-->
