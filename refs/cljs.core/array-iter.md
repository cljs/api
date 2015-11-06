## cljs.core/array-iter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array-iter__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3385-L3386):

```clj
(defn array-iter [x]
  (ArrayIter. x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3385-3386](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3385-L3386)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/array-iter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array-iter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-iter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "array-iter",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn array-iter [x]\n  (ArrayIter. x 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3385 3386]},
 :full-name "cljs.core/array-iter",
 :full-name-encode "cljs.core/array-iter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-iter"]))
```

-->
