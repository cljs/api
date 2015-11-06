## cljs.core/IWithMeta



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L279-L280):

```clj
(defprotocol IWithMeta
  (^clj -with-meta [o meta]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:279-280](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L279-L280)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IWithMeta` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IWithMeta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IWithMeta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IWithMeta",
 :type "protocol",
 :full-name-encode "cljs.core/IWithMeta",
 :source {:code "(defprotocol IWithMeta\n  (^clj -with-meta [o meta]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [279 280]},
 :methods [{:name "-with-meta",
            :signature ["[o meta]"],
            :docstring nil}],
 :full-name "cljs.core/IWithMeta",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWithMeta"]))
```

-->
