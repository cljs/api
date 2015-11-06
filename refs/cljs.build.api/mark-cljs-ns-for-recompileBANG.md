## cljs.build.api/mark-cljs-ns-for-recompile!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mark-cljs-ns-for-recompile!__ ns-sym)<br>
</samp>
 <samp>
(__mark-cljs-ns-for-recompile!__ ns-sym output-dir)<br>
</samp>

---





Source docstring:

```
Backdates a cljs target file so that it the cljs compiler will recompile it.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/build/api.clj#L37-L43):

```clj
(defn mark-cljs-ns-for-recompile!
  ([ns-sym] (mark-cljs-ns-for-recompile! ns-sym nil))
  ([ns-sym output-dir]
    (let [s (target-file-for-cljs-ns output-dir ns-sym)]
      (when (.exists s)
        (.setLastModified s 5000)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:37-43](https://github.com/clojure/clojurescript/blob/r3119/src/clj/cljs/build/api.clj#L37-L43)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/mark-cljs-ns-for-recompile!` @ crossclj](http://crossclj.info/fun/cljs.build.api/mark-cljs-ns-for-recompile%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/mark-cljs-ns-for-recompileBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "mark-cljs-ns-for-recompile!",
 :signature ["[ns-sym]" "[ns-sym output-dir]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.build.api/mark-cljs-ns-for-recompileBANG",
 :source {:code "(defn mark-cljs-ns-for-recompile!\n  ([ns-sym] (mark-cljs-ns-for-recompile! ns-sym nil))\n  ([ns-sym output-dir]\n    (let [s (target-file-for-cljs-ns output-dir ns-sym)]\n      (when (.exists s)\n        (.setLastModified s 5000)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/clj/cljs/build/api.clj",
          :lines [37 43]},
 :full-name "cljs.build.api/mark-cljs-ns-for-recompile!",
 :docstring "Backdates a cljs target file so that it the cljs compiler will recompile it."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/mark-cljs-ns-for-recompile!"]))
```

-->
