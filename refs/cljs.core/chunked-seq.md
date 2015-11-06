## cljs.core/chunked-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunked-seq__ vec i off)<br>
</samp>
 <samp>
(__chunked-seq__ vec node i off)<br>
</samp>
 <samp>
(__chunked-seq__ vec node i off meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L4662-L4666):

```clj
(defn chunked-seq
  ([vec i off] (ChunkedSeq. vec (array-for vec i) i off nil nil))
  ([vec node i off] (ChunkedSeq. vec node i off nil nil))
  ([vec node i off meta]
     (ChunkedSeq. vec node i off meta nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4662-4666](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L4662-L4666)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunked-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunked-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunked-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunked-seq",
 :type "function",
 :signature ["[vec i off]" "[vec node i off]" "[vec node i off meta]"],
 :source {:code "(defn chunked-seq\n  ([vec i off] (ChunkedSeq. vec (array-for vec i) i off nil nil))\n  ([vec node i off] (ChunkedSeq. vec node i off nil nil))\n  ([vec node i off meta]\n     (ChunkedSeq. vec node i off meta nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4662 4666]},
 :full-name "cljs.core/chunked-seq",
 :full-name-encode "cljs.core/chunked-seq",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunked-seq"]))
```

-->
