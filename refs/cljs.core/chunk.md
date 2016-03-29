## cljs.core/chunk



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(chunk b)</samp><br>

---

 <samp>
(__chunk__ b)<br>
</samp>

---







Source code @ [github]():

```clj
(defn chunk [b]
  (.chunk b))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/chunk` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk",
 :signature ["[b]"],
 :name-encode "chunk",
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core/chunk",
 :source {:code "(defn chunk [b]\n  (.chunk b))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3307 3308],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L3307-L3308"},
 :usage ["(chunk b)"],
 :full-name "cljs.core/chunk",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk"]))
```

-->
