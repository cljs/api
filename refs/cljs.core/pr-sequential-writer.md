## cljs.core/pr-sequential-writer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__pr-sequential-writer__ writer print-one begin sep end opts coll)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L6963-L6980):

```clj
(defn pr-sequential-writer [writer print-one begin sep end opts coll]
  (binding [*print-level* (when-not (nil? *print-level*) (dec *print-level*))]
    (if (and (not (nil? *print-level*)) (neg? *print-level*))
      (-write writer "#")
      (do
        (-write writer begin)
        (when (seq coll)
          (print-one (first coll) writer opts))
        (loop [coll (next coll) n (dec (:print-length opts))]
          (if (and coll (or (nil? n) (not (zero? n))))
            (do
              (-write writer sep)
              (print-one (first coll) writer opts)
              (recur (next coll) (dec n)))
            (when (and (seq coll) (zero? n))
              (-write writer sep)
              (-write writer "..."))))
        (-write writer end)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6963-6980](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L6963-L6980)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/pr-sequential-writer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pr-sequential-writer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pr-sequential-writer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pr-sequential-writer",
 :type "function",
 :signature ["[writer print-one begin sep end opts coll]"],
 :source {:code "(defn pr-sequential-writer [writer print-one begin sep end opts coll]\n  (binding [*print-level* (when-not (nil? *print-level*) (dec *print-level*))]\n    (if (and (not (nil? *print-level*)) (neg? *print-level*))\n      (-write writer \"#\")\n      (do\n        (-write writer begin)\n        (when (seq coll)\n          (print-one (first coll) writer opts))\n        (loop [coll (next coll) n (dec (:print-length opts))]\n          (if (and coll (or (nil? n) (not (zero? n))))\n            (do\n              (-write writer sep)\n              (print-one (first coll) writer opts)\n              (recur (next coll) (dec n)))\n            (when (and (seq coll) (zero? n))\n              (-write writer sep)\n              (-write writer \"...\"))))\n        (-write writer end)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6963 6980]},
 :full-name "cljs.core/pr-sequential-writer",
 :full-name-encode "cljs.core/pr-sequential-writer",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-sequential-writer"]))
```

-->
