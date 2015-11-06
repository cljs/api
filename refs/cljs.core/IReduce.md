## cljs.core/IReduce



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IReduce</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IReduce.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for seq types that can reduce themselves.
  Called by cljs.core/reduce.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L551-L557):

```clj
(defprotocol IReduce
  "Protocol for seq types that can reduce themselves.
  Called by cljs.core/reduce."
  (-reduce [coll f] [coll f start]
    "f should be a function of 2 arguments. If start is not supplied,
     returns the result of applying f to the first 2 items in coll, then
     applying f to that result and the 3rd item, etc."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:551-557](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L551-L557)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IReduce` @ clojuredocs](http://clojuredocs.org/clojure.lang/IReduce)<br>
[`clojure.lang/IReduce` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IReduce/)<br>
[`clojure.lang/IReduce` @ crossclj](http://crossclj.info/fun/clojure.lang/IReduce.html)<br>
[`cljs.core/IReduce` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IReduce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IReduce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IReduce",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IReduce",
 :source {:code "(defprotocol IReduce\n  \"Protocol for seq types that can reduce themselves.\n  Called by cljs.core/reduce.\"\n  (-reduce [coll f] [coll f start]\n    \"f should be a function of 2 arguments. If start is not supplied,\n     returns the result of applying f to the first 2 items in coll, then\n     applying f to that result and the 3rd item, etc.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [551 557]},
 :methods [{:name "-reduce",
            :signature ["[coll f]" "[coll f start]"],
            :docstring "f should be a function of 2 arguments. If start is not supplied,\n     returns the result of applying f to the first 2 items in coll, then\n     applying f to that result and the 3rd item, etc."}],
 :full-name "cljs.core/IReduce",
 :clj-symbol "clojure.lang/IReduce",
 :docstring "Protocol for seq types that can reduce themselves.\n  Called by cljs.core/reduce."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IReduce"]))
```

-->
