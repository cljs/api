## cljs.core/IMap



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for adding mapping functionality to collections.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L406-L410):

```clj
(defprotocol IMap
  "Protocol for adding mapping functionality to collections."
  #_(-assoc-ex [coll k v])
  (^clj -dissoc [coll k]
    "Returns a new collection of coll without the mapping for key k."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:406-410](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L406-L410)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IMap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IMap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IMap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IMap",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IMap",
 :source {:code "(defprotocol IMap\n  \"Protocol for adding mapping functionality to collections.\"\n  #_(-assoc-ex [coll k v])\n  (^clj -dissoc [coll k]\n    \"Returns a new collection of coll without the mapping for key k.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [406 410]},
 :methods [{:name "-dissoc",
            :signature ["[coll k]"],
            :docstring "Returns a new collection of coll without the mapping for key k."}],
 :full-name "cljs.core/IMap",
 :docstring "Protocol for adding mapping functionality to collections."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMap"]))
```

-->
