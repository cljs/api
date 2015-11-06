## cljs.repl.browser/run-in-order



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__run-in-order__ {:keys \[expecting fns\]})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl/browser.clj#L132-L138):

```clj
(defn run-in-order [{:keys [expecting fns]}]
  (loop [order expecting fns fns]
    (if-let [f (get fns order)]
      (do
        (f)
        (recur (inc order) (dissoc fns order)))
      {:expecting order :fns fns})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:132-138](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl/browser.clj#L132-L138)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/run-in-order` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/run-in-order.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/run-in-order.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "run-in-order",
 :type "function",
 :signature ["[{:keys [expecting fns]}]"],
 :source {:code "(defn run-in-order [{:keys [expecting fns]}]\n  (loop [order expecting fns fns]\n    (if-let [f (get fns order)]\n      (do\n        (f)\n        (recur (inc order) (dissoc fns order)))\n      {:expecting order :fns fns})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [132 138]},
 :full-name "cljs.repl.browser/run-in-order",
 :full-name-encode "cljs.repl.browser/run-in-order",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/run-in-order"]))
```

-->
