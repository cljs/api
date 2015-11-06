## cljs.core/mk-bound-fn



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mk-bound-fn__ sc test key)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L6377-L6381):

```clj
(defn mk-bound-fn
  [sc test key]
  (fn [e]
    (let [comp (-comparator sc)]
      (test (comp (-entry-key sc e) key) 0))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6377-6381](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L6377-L6381)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/mk-bound-fn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/mk-bound-fn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mk-bound-fn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "mk-bound-fn",
 :type "function",
 :signature ["[sc test key]"],
 :source {:code "(defn mk-bound-fn\n  [sc test key]\n  (fn [e]\n    (let [comp (-comparator sc)]\n      (test (comp (-entry-key sc e) key) 0))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6377 6381]},
 :full-name "cljs.core/mk-bound-fn",
 :full-name-encode "cljs.core/mk-bound-fn",
 :history [["+" "0.0-1211"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mk-bound-fn"]))
```

-->
