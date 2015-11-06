## cljs.core/string-iter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__string-iter__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L3001-L3002):

```clj
(defn string-iter [x]
  (StringIter. x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3001-3002](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L3001-L3002)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/string-iter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/string-iter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/string-iter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "string-iter",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string-iter [x]\n  (StringIter. x 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3001 3002]},
 :full-name "cljs.core/string-iter",
 :full-name-encode "cljs.core/string-iter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string-iter"]))
```

-->
