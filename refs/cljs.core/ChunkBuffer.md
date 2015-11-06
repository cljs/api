## cljs.core/ChunkBuffer



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ChunkBuffer</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ChunkBuffer.java)
</td>
</tr>
</table>


 <samp>
(__ChunkBuffer.__ buf end)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2900-L2912):

```clj
(deftype ChunkBuffer [^:mutable buf ^:mutable end]
  Object
  (add [_ o]
    (aset buf end o)
    (set! end (inc end)))

  (chunk [_ o]
    (let [ret (ArrayChunk. buf 0 end)]
      (set! buf nil)
      ret))

  ICounted
  (-count [_] end))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2900-2912](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2900-L2912)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ChunkBuffer` @ clojuredocs](http://clojuredocs.org/clojure.lang/ChunkBuffer)<br>
[`clojure.lang/ChunkBuffer` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ChunkBuffer/)<br>
[`clojure.lang/ChunkBuffer` @ crossclj](http://crossclj.info/fun/clojure.lang/ChunkBuffer.html)<br>
[`cljs.core/ChunkBuffer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ChunkBuffer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ChunkBuffer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ChunkBuffer",
 :signature ["[buf end]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/ChunkBuffer",
 :source {:code "(deftype ChunkBuffer [^:mutable buf ^:mutable end]\n  Object\n  (add [_ o]\n    (aset buf end o)\n    (set! end (inc end)))\n\n  (chunk [_ o]\n    (let [ret (ArrayChunk. buf 0 end)]\n      (set! buf nil)\n      ret))\n\n  ICounted\n  (-count [_] end))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2900 2912]},
 :full-name "cljs.core/ChunkBuffer",
 :clj-symbol "clojure.lang/ChunkBuffer"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ChunkBuffer"]))
```

-->
