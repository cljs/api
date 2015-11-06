## cljs.core/IMapEntry



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IMapEntry</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IMapEntry.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for examining a map entry.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L412-L417):

```clj
(defprotocol IMapEntry
  "Protocol for examining a map entry."
  (-key [coll]
    "Returns the key of the map entry.")
  (-val [coll]
    "Returns the value of the map entry."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:412-417](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L412-L417)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IMapEntry` @ clojuredocs](http://clojuredocs.org/clojure.lang/IMapEntry)<br>
[`clojure.lang/IMapEntry` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IMapEntry/)<br>
[`clojure.lang/IMapEntry` @ crossclj](http://crossclj.info/fun/clojure.lang/IMapEntry.html)<br>
[`cljs.core/IMapEntry` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IMapEntry.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IMapEntry.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IMapEntry",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/IMapEntry",
 :source {:code "(defprotocol IMapEntry\n  \"Protocol for examining a map entry.\"\n  (-key [coll]\n    \"Returns the key of the map entry.\")\n  (-val [coll]\n    \"Returns the value of the map entry.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [412 417]},
 :methods [{:name "-key",
            :signature ["[coll]"],
            :docstring "Returns the key of the map entry."}
           {:name "-val",
            :signature ["[coll]"],
            :docstring "Returns the value of the map entry."}],
 :full-name "cljs.core/IMapEntry",
 :clj-symbol "clojure.lang/IMapEntry",
 :docstring "Protocol for examining a map entry."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IMapEntry"]))
```

-->
