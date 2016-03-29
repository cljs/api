## cljs.core/IChunkedNext



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for accessing the chunks of a collection.
```


Source code @ [github]():

```clj
(defprotocol IChunkedNext
  "Protocol for accessing the chunks of a collection."
  (-chunked-next [coll]
    "Returns a new collection of coll without the first chunk."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/IChunkedNext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IChunkedNext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunkedNext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IChunkedNext",
 :name-encode "IChunkedNext",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core/IChunkedNext",
 :source {:code "(defprotocol IChunkedNext\n  \"Protocol for accessing the chunks of a collection.\"\n  (-chunked-next [coll]\n    \"Returns a new collection of coll without the first chunk.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [728 731],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L728-L731"},
 :methods [{:name "-chunked-next",
            :signature ["[coll]"],
            :docstring "Returns a new collection of coll without the first chunk."}],
 :full-name "cljs.core/IChunkedNext",
 :docstring "Protocol for accessing the chunks of a collection.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunkedNext.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunkedNext"]))
```

-->
