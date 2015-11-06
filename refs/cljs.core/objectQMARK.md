## cljs.core/object?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__object?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript object, false otherwise.



---


###### See Also:

[`cljs.core/array?`](../cljs.core/arrayQMARK.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L102-L105):

```clj
(defn ^boolean object? [x]
  (if-not (nil? x)
    (identical? (.-constructor x) js/Object)
    false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:102-105](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L102-L105)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/object?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/object%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/objectQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a JavaScript object, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "object?",
 :signature ["[x]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :related ["cljs.core/array?"],
 :full-name-encode "cljs.core/objectQMARK",
 :source {:code "(defn ^boolean object? [x]\n  (if-not (nil? x)\n    (identical? (.-constructor x) js/Object)\n    false))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [102 105]},
 :full-name "cljs.core/object?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/object?"]))
```

-->
