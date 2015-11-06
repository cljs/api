## cljs.core/IIterable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2356"><img valign="middle" alt="[+] 0.0-2356" title="Added in 0.0-2356" src="https://img.shields.io/badge/+-0.0--2356-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for iterating over a collection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L633-L636):

```clj
(defprotocol IIterable
  "Protocol for iterating over a collection."
  (-iterator [coll]
    "Returns an iterator for coll."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:633-636](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L633-L636)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IIterable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IIterable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IIterable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IIterable",
 :history [["+" "0.0-2356"]],
 :type "protocol",
 :full-name-encode "cljs.core/IIterable",
 :source {:code "(defprotocol IIterable\n  \"Protocol for iterating over a collection.\"\n  (-iterator [coll]\n    \"Returns an iterator for coll.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [633 636]},
 :methods [{:name "-iterator",
            :signature ["[coll]"],
            :docstring "Returns an iterator for coll."}],
 :full-name "cljs.core/IIterable",
 :docstring "Protocol for iterating over a collection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIterable"]))
```

-->
