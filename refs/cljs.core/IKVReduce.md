## cljs.core/IKVReduce



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for associative types that can reduce themselves
  via a function of key and val. Called by cljs.core/reduce-kv.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L465-L470):

```clj
(defprotocol IKVReduce
  "Protocol for associative types that can reduce themselves
  via a function of key and val. Called by cljs.core/reduce-kv."
  (-kv-reduce [coll f init]
    "Reduces an associative collection and returns the result. f should be
     a function that takes three arguments."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:465-470](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L465-L470)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IKVReduce` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IKVReduce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IKVReduce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IKVReduce",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/IKVReduce",
 :source {:code "(defprotocol IKVReduce\n  \"Protocol for associative types that can reduce themselves\n  via a function of key and val. Called by cljs.core/reduce-kv.\"\n  (-kv-reduce [coll f init]\n    \"Reduces an associative collection and returns the result. f should be\n     a function that takes three arguments.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [465 470]},
 :methods [{:name "-kv-reduce",
            :signature ["[coll f init]"],
            :docstring "Reduces an associative collection and returns the result. f should be\n     a function that takes three arguments."}],
 :full-name "cljs.core/IKVReduce",
 :docstring "Protocol for associative types that can reduce themselves\n  via a function of key and val. Called by cljs.core/reduce-kv."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IKVReduce"]))
```

-->
