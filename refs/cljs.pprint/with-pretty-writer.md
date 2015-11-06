## cljs.pprint/with-pretty-writer



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__with-pretty-writer__ base-writer & body)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L17-L24):

```clj
(defmacro with-pretty-writer [base-writer & body]
  `(let [base-writer# ~base-writer
         new-writer# (not (pretty-writer? base-writer#))]
     (cljs.core/binding [~'*out* (if new-writer#
                         (make-pretty-writer base-writer# *print-right-margin* *print-miser-width*)
                         base-writer#)]
       ~@body
       (-ppflush ~'*out*))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:17-24](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L17-L24)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/with-pretty-writer` @ crossclj](http://crossclj.info/fun/cljs.pprint/with-pretty-writer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/with-pretty-writer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "with-pretty-writer",
 :type "macro",
 :signature ["[base-writer & body]"],
 :source {:code "(defmacro with-pretty-writer [base-writer & body]\n  `(let [base-writer# ~base-writer\n         new-writer# (not (pretty-writer? base-writer#))]\n     (cljs.core/binding [~'*out* (if new-writer#\n                         (make-pretty-writer base-writer# *print-right-margin* *print-miser-width*)\n                         base-writer#)]\n       ~@body\n       (-ppflush ~'*out*))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [17 24]},
 :full-name "cljs.pprint/with-pretty-writer",
 :full-name-encode "cljs.pprint/with-pretty-writer",
 :history [["+" "0.0-3255"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/with-pretty-writer"]))
```

-->
