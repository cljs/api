## cljs.core/IKVReduce



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/core.cljs#L331-L332):

```clj
(defprotocol IKVReduce
  (-kv-reduce [coll f init]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:331-332](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/core.cljs#L331-L332)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IKVReduce` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IKVReduce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IKVReduce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IKVReduce",
 :type "protocol",
 :full-name-encode "cljs.core/IKVReduce",
 :source {:code "(defprotocol IKVReduce\n  (-kv-reduce [coll f init]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/cljs/core.cljs",
          :lines [331 332]},
 :methods [{:name "-kv-reduce",
            :signature ["[coll f init]"],
            :docstring nil}],
 :full-name "cljs.core/IKVReduce",
 :history [["+" "0.0-1211"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IKVReduce"]))
```

-->
