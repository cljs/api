## cljs.core/IChunkedSeq



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IChunkedSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IChunkedSeq.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for accessing a collection as sequential chunks.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L595-L600):

```clj
(defprotocol IChunkedSeq
  "Protocol for accessing a collection as sequential chunks."
  (-chunked-first [coll]
    "Returns the first chunk in coll.")
  (-chunked-rest [coll]
    "Return a new collection of coll with the first chunk removed."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:595-600](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L595-L600)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IChunkedSeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/IChunkedSeq)<br>
[`clojure.lang/IChunkedSeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IChunkedSeq/)<br>
[`clojure.lang/IChunkedSeq` @ crossclj](http://crossclj.info/fun/clojure.lang/IChunkedSeq.html)<br>
[`cljs.core/IChunkedSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IChunkedSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunkedSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IChunkedSeq",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core/IChunkedSeq",
 :source {:code "(defprotocol IChunkedSeq\n  \"Protocol for accessing a collection as sequential chunks.\"\n  (-chunked-first [coll]\n    \"Returns the first chunk in coll.\")\n  (-chunked-rest [coll]\n    \"Return a new collection of coll with the first chunk removed.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [595 600]},
 :methods [{:name "-chunked-first",
            :signature ["[coll]"],
            :docstring "Returns the first chunk in coll."}
           {:name "-chunked-rest",
            :signature ["[coll]"],
            :docstring "Return a new collection of coll with the first chunk removed."}],
 :full-name "cljs.core/IChunkedSeq",
 :clj-symbol "clojure.lang/IChunkedSeq",
 :docstring "Protocol for accessing a collection as sequential chunks."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunkedSeq"]))
```

-->
