## cljs.core/array-chunk



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__array-chunk__ arr)<br>
</samp>
 <samp>
(__array-chunk__ arr off)<br>
</samp>
 <samp>
(__array-chunk__ arr off end)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L2660-L2666):

```clj
(defn array-chunk
  ([arr]
     (ArrayChunk. arr 0 (alength arr)))
  ([arr off]
     (ArrayChunk. arr off (alength arr)))
  ([arr off end]
     (ArrayChunk. arr off end)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2660-2666](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L2660-L2666)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/array-chunk` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/array-chunk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-chunk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "array-chunk",
 :type "function",
 :signature ["[arr]" "[arr off]" "[arr off end]"],
 :source {:code "(defn array-chunk\n  ([arr]\n     (ArrayChunk. arr 0 (alength arr)))\n  ([arr off]\n     (ArrayChunk. arr off (alength arr)))\n  ([arr off end]\n     (ArrayChunk. arr off end)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2660 2666]},
 :full-name "cljs.core/array-chunk",
 :full-name-encode "cljs.core/array-chunk",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array-chunk"]))
```

-->
