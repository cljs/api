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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L8546-L8550):

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
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8546-8550](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L8546-L8550)</ins>
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
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8546 8550]},
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
