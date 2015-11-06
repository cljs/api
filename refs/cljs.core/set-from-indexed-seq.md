## cljs.core/set-from-indexed-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1877"><img valign="middle" alt="[+] 0.0-1877" title="Added in 0.0-1877" src="https://img.shields.io/badge/+-0.0--1877-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__set-from-indexed-seq__ iseq)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L7229-L7233):

```clj
(defn set-from-indexed-seq [iseq]
  (let [arr (.-arr iseq)
        ret (areduce arr i ^not-native res (-as-transient #{})
              (-conj! res (aget arr i)))]
    (-persistent! ^not-native ret)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7229-7233](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L7229-L7233)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/set-from-indexed-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/set-from-indexed-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/set-from-indexed-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "set-from-indexed-seq",
 :type "function",
 :signature ["[iseq]"],
 :source {:code "(defn set-from-indexed-seq [iseq]\n  (let [arr (.-arr iseq)\n        ret (areduce arr i ^not-native res (-as-transient #{})\n              (-conj! res (aget arr i)))]\n    (-persistent! ^not-native ret)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7229 7233]},
 :full-name "cljs.core/set-from-indexed-seq",
 :full-name-encode "cljs.core/set-from-indexed-seq",
 :history [["+" "0.0-1877"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set-from-indexed-seq"]))
```

-->
