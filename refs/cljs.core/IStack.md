## cljs.core/IStack



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IPersistentStack</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IPersistentStack.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L277-L279):

```clj
(defprotocol IStack
  (-peek [coll])
  (^clj -pop [coll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:277-279](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L277-L279)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IPersistentStack` @ clojuredocs](http://clojuredocs.org/clojure.lang/IPersistentStack)<br>
[`clojure.lang/IPersistentStack` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IPersistentStack/)<br>
[`clojure.lang/IPersistentStack` @ crossclj](http://crossclj.info/fun/clojure.lang/IPersistentStack.html)<br>
[`cljs.core/IStack` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IStack.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IStack.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IStack",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IStack",
 :source {:code "(defprotocol IStack\n  (-peek [coll])\n  (^clj -pop [coll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [277 279]},
 :methods [{:name "-peek", :signature ["[coll]"], :docstring nil}
           {:name "-pop", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IStack",
 :clj-symbol "clojure.lang/IPersistentStack"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IStack"]))
```

-->
