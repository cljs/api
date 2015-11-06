## cljs.core/ITransientSet



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientSet.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L332-L333):

```clj
(defprotocol ITransientSet
  (-disjoin! [tcoll v]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:332-333](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L332-L333)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ITransientSet` @ clojuredocs](http://clojuredocs.org/clojure.lang/ITransientSet)<br>
[`clojure.lang/ITransientSet` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ITransientSet/)<br>
[`clojure.lang/ITransientSet` @ crossclj](http://crossclj.info/fun/clojure.lang/ITransientSet.html)<br>
[`cljs.core/ITransientSet` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ITransientSet.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ITransientSet.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ITransientSet",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ITransientSet",
 :source {:code "(defprotocol ITransientSet\n  (-disjoin! [tcoll v]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [332 333]},
 :methods [{:name "-disjoin!",
            :signature ["[tcoll v]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientSet",
 :clj-symbol "clojure.lang/ITransientSet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientSet"]))
```

-->
