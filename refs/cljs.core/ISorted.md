## cljs.core/ISorted



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Sorted</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Sorted.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L309-L313):

```clj
(defprotocol ISorted
  (^clj -sorted-seq [coll ascending?])
  (^clj -sorted-seq-from [coll k ascending?])
  (-entry-key [coll entry])
  (-comparator [coll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:309-313](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L309-L313)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Sorted` @ clojuredocs](http://clojuredocs.org/clojure.lang/Sorted)<br>
[`clojure.lang/Sorted` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Sorted/)<br>
[`clojure.lang/Sorted` @ crossclj](http://crossclj.info/fun/clojure.lang/Sorted.html)<br>
[`cljs.core/ISorted` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISorted.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISorted.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISorted",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISorted",
 :source {:code "(defprotocol ISorted\n  (^clj -sorted-seq [coll ascending?])\n  (^clj -sorted-seq-from [coll k ascending?])\n  (-entry-key [coll entry])\n  (-comparator [coll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [309 313]},
 :methods [{:name "-sorted-seq",
            :signature ["[coll ascending?]"],
            :docstring nil}
           {:name "-sorted-seq-from",
            :signature ["[coll k ascending?]"],
            :docstring nil}
           {:name "-entry-key",
            :signature ["[coll entry]"],
            :docstring nil}
           {:name "-comparator",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/ISorted",
 :clj-symbol "clojure.lang/Sorted"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISorted"]))
```

-->
