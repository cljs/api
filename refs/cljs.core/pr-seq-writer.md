## cljs.core/pr-seq-writer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__pr-seq-writer__ objs writer opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L8105-L8109):

```clj
(defn pr-seq-writer [objs writer opts]
  (pr-writer (first objs) writer opts)
  (doseq [obj (next objs)]
    (-write writer " ")
    (pr-writer obj writer opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8105-8109](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L8105-L8109)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/pr-seq-writer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pr-seq-writer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pr-seq-writer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pr-seq-writer",
 :type "function",
 :signature ["[objs writer opts]"],
 :source {:code "(defn pr-seq-writer [objs writer opts]\n  (pr-writer (first objs) writer opts)\n  (doseq [obj (next objs)]\n    (-write writer \" \")\n    (pr-writer obj writer opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8105 8109]},
 :full-name "cljs.core/pr-seq-writer",
 :full-name-encode "cljs.core/pr-seq-writer",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-seq-writer"]))
```

-->
