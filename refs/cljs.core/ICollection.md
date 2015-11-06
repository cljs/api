## cljs.core/ICollection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for adding to a collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L353-L359):

```clj
(defprotocol ICollection
  "Protocol for adding to a collection."
  (^clj -conj [coll o]
    "Returns a new collection of coll with o added to it. The new item
     should be added to the most efficient place, e.g.
     (conj [1 2 3 4] 5) => [1 2 3 4 5]
     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:353-359](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L353-L359)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ICollection` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ICollection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ICollection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ICollection",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ICollection",
 :source {:code "(defprotocol ICollection\n  \"Protocol for adding to a collection.\"\n  (^clj -conj [coll o]\n    \"Returns a new collection of coll with o added to it. The new item\n     should be added to the most efficient place, e.g.\n     (conj [1 2 3 4] 5) => [1 2 3 4 5]\n     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [353 359]},
 :methods [{:name "-conj",
            :signature ["[coll o]"],
            :docstring "Returns a new collection of coll with o added to it. The new item\n     should be added to the most efficient place, e.g.\n     (conj [1 2 3 4] 5) => [1 2 3 4 5]\n     (conj '(2 3 4 5) 1) => '(1 2 3 4 5)"}],
 :full-name "cljs.core/ICollection",
 :docstring "Protocol for adding to a collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ICollection"]))
```

-->
