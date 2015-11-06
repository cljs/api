## cljs.core/IEmptyableCollection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for creating an empty collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L456-L460):

```clj
(defprotocol IEmptyableCollection
  "Protocol for creating an empty collection."
  (-empty [coll]
    "Returns an empty collection of the same category as coll. Used
     by cljs.core/count."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:456-460](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L456-L460)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IEmptyableCollection` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IEmptyableCollection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IEmptyableCollection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IEmptyableCollection",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IEmptyableCollection",
 :source {:code "(defprotocol IEmptyableCollection\n  \"Protocol for creating an empty collection.\"\n  (-empty [coll]\n    \"Returns an empty collection of the same category as coll. Used\n     by cljs.core/count.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [456 460]},
 :methods [{:name "-empty",
            :signature ["[coll]"],
            :docstring "Returns an empty collection of the same category as coll. Used\n     by cljs.core/count."}],
 :full-name "cljs.core/IEmptyableCollection",
 :docstring "Protocol for creating an empty collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IEmptyableCollection"]))
```

-->
