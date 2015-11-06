## cljs.core/iter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__iter__ coll)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L3113-L3120):

```clj
(defn iter [coll]
  (cond
    (nil? coll) (nil-iter)
    (string? coll) (string-iter coll)
    (array? coll) (array-iter coll)
    (iterable? coll) (-iterator coll)
    (seqable? coll) (seq-iter coll)
    :else (throw (js/Error. (str "Cannot create iterator from " coll)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3113-3120](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L3113-L3120)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/iter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/iter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/iter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "iter",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn iter [coll]\n  (cond\n    (nil? coll) (nil-iter)\n    (string? coll) (string-iter coll)\n    (array? coll) (array-iter coll)\n    (iterable? coll) (-iterator coll)\n    (seqable? coll) (seq-iter coll)\n    :else (throw (js/Error. (str \"Cannot create iterator from \" coll)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3113 3120]},
 :full-name "cljs.core/iter",
 :full-name-encode "cljs.core/iter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iter"]))
```

-->
