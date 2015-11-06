## cljs.core/iterable?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2356"><img valign="middle" alt="[+] 0.0-2356" title="Added in 0.0-2356" src="https://img.shields.io/badge/+-0.0--2356-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__iterable?__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L634-L635):

```clj
(defn iterable? [x]
  (satisfies? IIterable x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:634-635](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L634-L635)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/iterable?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/iterable%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/iterableQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "iterable?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn iterable? [x]\n  (satisfies? IIterable x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [634 635]},
 :full-name "cljs.core/iterable?",
 :full-name-encode "cljs.core/iterableQMARK",
 :history [["+" "0.0-2356"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iterable?"]))
```

-->
