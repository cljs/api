## cljs.core/IChunk



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IChunk</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IChunk.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L372-L373):

```clj
(defprotocol IChunk
  (-drop-first [coll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:372-373](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L372-L373)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IChunk` @ clojuredocs](http://clojuredocs.org/clojure.lang/IChunk)<br>
[`clojure.lang/IChunk` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IChunk/)<br>
[`clojure.lang/IChunk` @ crossclj](http://crossclj.info/fun/clojure.lang/IChunk.html)<br>
[`cljs.core/IChunk` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IChunk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IChunk",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core/IChunk",
 :source {:code "(defprotocol IChunk\n  (-drop-first [coll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [372 373]},
 :methods [{:name "-drop-first",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunk",
 :clj-symbol "clojure.lang/IChunk"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunk"]))
```

-->
