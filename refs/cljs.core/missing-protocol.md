## cljs.core/missing-protocol



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__missing-protocol__ proto obj)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L135-L142):

```clj
(defn missing-protocol [proto obj]
  (let [ty (type obj)
        ty (if (and ty (.-cljs$lang$type ty))
             (.-cljs$lang$ctorStr ty)
             (goog/typeOf obj))]
   (js/Error.
     (.join (array "No protocol method " proto
                   " defined for type " ty ": " obj) ""))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:135-142](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L135-L142)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/missing-protocol` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/missing-protocol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/missing-protocol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "missing-protocol",
 :type "function",
 :signature ["[proto obj]"],
 :source {:code "(defn missing-protocol [proto obj]\n  (let [ty (type obj)\n        ty (if (and ty (.-cljs$lang$type ty))\n             (.-cljs$lang$ctorStr ty)\n             (goog/typeOf obj))]\n   (js/Error.\n     (.join (array \"No protocol method \" proto\n                   \" defined for type \" ty \": \" obj) \"\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [135 142]},
 :full-name "cljs.core/missing-protocol",
 :full-name-encode "cljs.core/missing-protocol",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/missing-protocol"]))
```

-->
