## cljs.core/IChunk



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IChunk</samp>](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/IChunk.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for accessing the items of a chunk.
```


Source code @ [github]():

```clj
(defprotocol IChunk
  "Protocol for accessing the items of a chunk."
  (-drop-first [coll]
    "Return a new chunk of coll with the first item removed."))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :name-encode "IChunk",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :clj-equiv {:full-name "clojure.lang/IChunk",
             :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/jvm/clojure/lang/IChunk.java"},
 :full-name-encode "cljs.core/IChunk",
 :source {:code "(defprotocol IChunk\n  \"Protocol for accessing the items of a chunk.\"\n  (-drop-first [coll]\n    \"Return a new chunk of coll with the first item removed.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [716 719],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L716-L719"},
 :methods [{:name "-drop-first",
            :signature ["[coll]"],
            :docstring "Return a new chunk of coll with the first item removed."}],
 :full-name "cljs.core/IChunk",
 :docstring "Protocol for accessing the items of a chunk.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunk.cljsdoc"}

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
