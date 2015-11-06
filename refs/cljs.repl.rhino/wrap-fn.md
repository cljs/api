## cljs.repl.rhino/wrap-fn



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__wrap-fn__ form)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl/rhino.clj#L160-L171):

```clj
(defn wrap-fn [form]
  (cond
    (and (seq? form) (= 'ns (first form))) identity
    ('#{*1 *2 *3 *e} form) (fn [x] `(cljs.core.pr-str ~x))
    :else
    (fn [x]
      `(cljs.core.pr-str
         (let [ret# ~x]
           (set! *3 *2)
           (set! *2 *1)
           (set! *1 ret#)
           ret#)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[rhino.clj:160-171](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl/rhino.clj#L160-L171)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/wrap-fn` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/wrap-fn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/wrap-fn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "wrap-fn",
 :type "function",
 :signature ["[form]"],
 :source {:code "(defn wrap-fn [form]\n  (cond\n    (and (seq? form) (= 'ns (first form))) identity\n    ('#{*1 *2 *3 *e} form) (fn [x] `(cljs.core.pr-str ~x))\n    :else\n    (fn [x]\n      `(cljs.core.pr-str\n         (let [ret# ~x]\n           (set! *3 *2)\n           (set! *2 *1)\n           (set! *1 ret#)\n           ret#)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [160 171]},
 :full-name "cljs.repl.rhino/wrap-fn",
 :full-name-encode "cljs.repl.rhino/wrap-fn",
 :history [["+" "0.0-2985"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/wrap-fn"]))
```

-->
