## cljs.core/ns-interns\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ns-interns\*__ sym)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L10131-L10139):

```clj
(defn ns-interns* [sym]
  (let [ns-obj (find-ns-obj sym)
        ns     (Namespace. ns-obj sym)]
    (letfn [(step [ret k]
              (let [var-sym (symbol (demunge k))]
                (assoc ret
                  var-sym (Var. #(gobject/get ns-obj k)
                            (symbol (str sym) (str var-sym)) {:ns ns}))))]
      (reduce step {} (js-keys ns-obj)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10131-10139](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L10131-L10139)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ns-interns*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ns-interns*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ns-internsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ns-interns*",
 :type "function",
 :signature ["[sym]"],
 :source {:code "(defn ns-interns* [sym]\n  (let [ns-obj (find-ns-obj sym)\n        ns     (Namespace. ns-obj sym)]\n    (letfn [(step [ret k]\n              (let [var-sym (symbol (demunge k))]\n                (assoc ret\n                  var-sym (Var. #(gobject/get ns-obj k)\n                            (symbol (str sym) (str var-sym)) {:ns ns}))))]\n      (reduce step {} (js-keys ns-obj)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10131 10139]},
 :full-name "cljs.core/ns-interns*",
 :full-name-encode "cljs.core/ns-internsSTAR",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ns-interns*"]))
```

-->
