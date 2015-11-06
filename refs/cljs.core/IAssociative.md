## cljs.core/IAssociative



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Associative</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Associative.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L247-L250):

```clj
(defprotocol IAssociative
  (^boolean -contains-key? [coll k])
  #_(-entry-at [coll k])
  (^clj -assoc [coll k v]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:247-250](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L247-L250)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Associative` @ clojuredocs](http://clojuredocs.org/clojure.lang/Associative)<br>
[`clojure.lang/Associative` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Associative/)<br>
[`clojure.lang/Associative` @ crossclj](http://crossclj.info/fun/clojure.lang/Associative.html)<br>
[`cljs.core/IAssociative` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IAssociative.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IAssociative.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IAssociative",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IAssociative",
 :source {:code "(defprotocol IAssociative\n  (^boolean -contains-key? [coll k])\n  #_(-entry-at [coll k])\n  (^clj -assoc [coll k v]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [247 250]},
 :methods [{:name "-contains-key?",
            :signature ["[coll k]"],
            :docstring nil}
           {:name "-assoc", :signature ["[coll k v]"], :docstring nil}],
 :full-name "cljs.core/IAssociative",
 :clj-symbol "clojure.lang/Associative"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAssociative"]))
```

-->
