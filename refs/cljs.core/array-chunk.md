## cljs.core/array-chunk



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(array-chunk arr)</samp><br>
<samp>(array-chunk arr off)</samp><br>
<samp>(array-chunk arr off end)</samp><br>

---

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







Source code @ [github]():

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
 :signature ["[arr]" "[arr off]" "[arr off end]"],
 :name-encode "array-chunk",
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core/array-chunk",
 :source {:code "(defn array-chunk\n  ([arr]\n     (ArrayChunk. arr 0 (alength arr)))\n  ([arr off]\n     (ArrayChunk. arr off (alength arr)))\n  ([arr off end]\n     (ArrayChunk. arr off end)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3225 3231],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L3225-L3231"},
 :usage ["(array-chunk arr)"
         "(array-chunk arr off)"
         "(array-chunk arr off end)"],
 :full-name "cljs.core/array-chunk",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/array-chunk.cljsdoc"}

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
