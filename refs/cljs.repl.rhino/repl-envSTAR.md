## cljs.repl.rhino/repl-env\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" title="Added in 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env\*__ opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl/rhino.clj#L211-L219):

```clj
(defn repl-env*
  [opts]
  (let [cx (Context/enter)]
    ;; just avoid the 64K method limit
    ;; Rhino is slow even with optimizations enabled
    (.setOptimizationLevel cx -1)
    (merge (RhinoEnv.)
      {:cx cx
       :scope (.initStandardObjects cx)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:211-219](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl/rhino.clj#L211-L219)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/repl-env*` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/repl-env*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/repl-envSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "repl-env*",
 :type "function",
 :signature ["[opts]"],
 :source {:code "(defn repl-env*\n  [opts]\n  (let [cx (Context/enter)]\n    ;; just avoid the 64K method limit\n    ;; Rhino is slow even with optimizations enabled\n    (.setOptimizationLevel cx -1)\n    (merge (RhinoEnv.)\n      {:cx cx\n       :scope (.initStandardObjects cx)})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [211 219]},
 :full-name "cljs.repl.rhino/repl-env*",
 :full-name-encode "cljs.repl.rhino/repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/repl-env*"]))
```

-->
