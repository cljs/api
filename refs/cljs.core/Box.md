## cljs.core/Box



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Box</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Box.java)
</td>
</tr>
</table>


 <samp>
(__Box.__ val)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L4727):

```clj
(deftype Box [^:mutable val])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4727](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L4727)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Box` @ clojuredocs](http://clojuredocs.org/clojure.lang/Box)<br>
[`clojure.lang/Box` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Box/)<br>
[`clojure.lang/Box` @ crossclj](http://crossclj.info/fun/clojure.lang/Box.html)<br>
[`cljs.core/Box` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Box.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Box.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Box",
 :signature ["[val]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/Box",
 :source {:code "(deftype Box [^:mutable val])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4727]},
 :full-name "cljs.core/Box",
 :clj-symbol "clojure.lang/Box"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Box"]))
```

-->
