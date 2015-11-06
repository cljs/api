## cljs.core/INext



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for accessing the next items of a collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L383-L389):

```clj
(defprotocol INext
  "Protocol for accessing the next items of a collection."
  (^clj-or-nil -next [coll]
    "Returns a new collection of coll without the first item. In contrast to
     rest, it should return nil if there are no more items, e.g.
     (next []) => nil
     (next nil) => nil"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:383-389](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L383-L389)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/INext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/INext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/INext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "INext",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core/INext",
 :source {:code "(defprotocol INext\n  \"Protocol for accessing the next items of a collection.\"\n  (^clj-or-nil -next [coll]\n    \"Returns a new collection of coll without the first item. In contrast to\n     rest, it should return nil if there are no more items, e.g.\n     (next []) => nil\n     (next nil) => nil\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [383 389]},
 :methods [{:name "-next",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first item. In contrast to\n     rest, it should return nil if there are no more items, e.g.\n     (next []) => nil\n     (next nil) => nil"}],
 :full-name "cljs.core/INext",
 :docstring "Protocol for accessing the next items of a collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INext"]))
```

-->
