## cljs.core/Volatile



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__Volatile.__ state)<br>
</samp>

---



###### See Also:

[`cljs.core/volatile!`](../cljs.core/volatileBANG.md)<br>
[`cljs.core/volatile?`](../cljs.core/volatileQMARK.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L3530-L3536):

```clj
(deftype Volatile [^:mutable state]
  IVolatile
  (-vreset! [_ new-state]
    (set! state new-state))

  IDeref
  (-deref [_] state))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3530-3536](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L3530-L3536)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Volatile` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Volatile.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Volatile.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Volatile",
 :type "type",
 :signature ["[state]"],
 :source {:code "(deftype Volatile [^:mutable state]\n  IVolatile\n  (-vreset! [_ new-state]\n    (set! state new-state))\n\n  IDeref\n  (-deref [_] state))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3530 3536]},
 :full-name "cljs.core/Volatile",
 :full-name-encode "cljs.core/Volatile",
 :history [["+" "0.0-2496"]],
 :related ["cljs.core/volatile!" "cljs.core/volatile?"]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Volatile"]))
```

-->
