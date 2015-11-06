## cljs.core/ISet



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentSet.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L287-L288):

```clj
(defprotocol ISet
  (^clj -disjoin [coll v]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:287-288](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L287-L288)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IPersistentSet` @ clojuredocs](http://clojuredocs.org/clojure.lang/IPersistentSet)<br>
[`clojure.lang/IPersistentSet` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IPersistentSet/)<br>
[`clojure.lang/IPersistentSet` @ crossclj](http://crossclj.info/fun/clojure.lang/IPersistentSet.html)<br>
[`cljs.core/ISet` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISet.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISet.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISet",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISet",
 :source {:code "(defprotocol ISet\n  (^clj -disjoin [coll v]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [287 288]},
 :methods [{:name "-disjoin", :signature ["[coll v]"], :docstring nil}],
 :full-name "cljs.core/ISet",
 :clj-symbol "clojure.lang/IPersistentSet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISet"]))
```

-->
