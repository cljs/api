## cljs.core/IEditableCollection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IEditableCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IEditableCollection.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for collections which can transformed to transients.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L549-L552):

```clj
(defprotocol IEditableCollection
  "Protocol for collections which can transformed to transients."
  (^clj -as-transient [coll]
    "Returns a new, transient version of the collection, in constant time."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:549-552](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L549-L552)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IEditableCollection` @ clojuredocs](http://clojuredocs.org/clojure.lang/IEditableCollection)<br>
[`clojure.lang/IEditableCollection` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IEditableCollection/)<br>
[`clojure.lang/IEditableCollection` @ crossclj](http://crossclj.info/fun/clojure.lang/IEditableCollection.html)<br>
[`cljs.core/IEditableCollection` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IEditableCollection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IEditableCollection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IEditableCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/IEditableCollection",
 :source {:code "(defprotocol IEditableCollection\n  \"Protocol for collections which can transformed to transients.\"\n  (^clj -as-transient [coll]\n    \"Returns a new, transient version of the collection, in constant time.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [549 552]},
 :methods [{:name "-as-transient",
            :signature ["[coll]"],
            :docstring "Returns a new, transient version of the collection, in constant time."}],
 :full-name "cljs.core/IEditableCollection",
 :clj-symbol "clojure.lang/IEditableCollection",
 :docstring "Protocol for collections which can transformed to transients."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEditableCollection"]))
```

-->
