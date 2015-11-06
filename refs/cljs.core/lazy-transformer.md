## cljs.core/lazy-transformer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__lazy-transformer__ stepper)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L3053-L3054):

```clj
(defn lazy-transformer [stepper]
  (LazyTransformer. stepper nil nil nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3053-3054](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L3053-L3054)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/lazy-transformer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/lazy-transformer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/lazy-transformer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "lazy-transformer",
 :type "function",
 :signature ["[stepper]"],
 :source {:code "(defn lazy-transformer [stepper]\n  (LazyTransformer. stepper nil nil nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3053 3054]},
 :full-name "cljs.core/lazy-transformer",
 :full-name-encode "cljs.core/lazy-transformer",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/lazy-transformer"]))
```

-->
