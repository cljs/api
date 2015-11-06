## cljs.repl.nashorn/load-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-ns__ engine ns)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/repl/nashorn.clj#L134-L136):

```clj
(defn load-ns [engine ns]
  (eval-str engine
    (format "goog.require(\"%s\");" (comp/munge (first ns)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:134-136](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/repl/nashorn.clj#L134-L136)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/load-ns` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/load-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/load-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "load-ns",
 :type "function",
 :signature ["[engine ns]"],
 :source {:code "(defn load-ns [engine ns]\n  (eval-str engine\n    (format \"goog.require(\\\"%s\\\");\" (comp/munge (first ns)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [134 136]},
 :full-name "cljs.repl.nashorn/load-ns",
 :full-name-encode "cljs.repl.nashorn/load-ns",
 :history [["+" "0.0-2814"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/load-ns"]))
```

-->
