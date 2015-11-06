## cljs.core/ITransientCollection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientCollection</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientCollection.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L351-L353):

```clj
(defprotocol ITransientCollection
  (^clj -conj! [tcoll val])
  (^clj -persistent! [tcoll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:351-353](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L351-L353)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ITransientCollection` @ clojuredocs](http://clojuredocs.org/clojure.lang/ITransientCollection)<br>
[`clojure.lang/ITransientCollection` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ITransientCollection/)<br>
[`clojure.lang/ITransientCollection` @ crossclj](http://crossclj.info/fun/clojure.lang/ITransientCollection.html)<br>
[`cljs.core/ITransientCollection` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ITransientCollection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ITransientCollection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ITransientCollection",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ITransientCollection",
 :source {:code "(defprotocol ITransientCollection\n  (^clj -conj! [tcoll val])\n  (^clj -persistent! [tcoll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [351 353]},
 :methods [{:name "-conj!",
            :signature ["[tcoll val]"],
            :docstring nil}
           {:name "-persistent!",
            :signature ["[tcoll]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientCollection",
 :clj-symbol "clojure.lang/ITransientCollection"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientCollection"]))
```

-->
