## cljs.core/IEmptyableCollection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L232-L233):

```clj
(defprotocol IEmptyableCollection
  (-empty [coll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2156
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:232-233](https://github.com/clojure/clojurescript/blob/r2156/src/cljs/cljs/core.cljs#L232-L233)</ins>
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
 :type "protocol",
 :full-name-encode "cljs.core/IEmptyableCollection",
 :source {:code "(defprotocol IEmptyableCollection\n  (-empty [coll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2156",
          :filename "src/cljs/cljs/core.cljs",
          :lines [232 233]},
 :methods [{:name "-empty", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IEmptyableCollection",
 :history [["+" "0.0-927"]]}

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
