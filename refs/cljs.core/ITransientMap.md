## cljs.core/ITransientMap



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ITransientMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ITransientMap.java)
</td>
</tr>
</table>







Source docstring:

```
Protocol for adding mapping functionality to transient collections.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L661-L664):

```clj
(defprotocol ITransientMap
  "Protocol for adding mapping functionality to transient collections."
  (^clj -dissoc! [tcoll key]
    "Returns a new transient collection of tcoll without the mapping for key."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:661-664](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L661-L664)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ITransientMap` @ clojuredocs](http://clojuredocs.org/clojure.lang/ITransientMap)<br>
[`clojure.lang/ITransientMap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ITransientMap/)<br>
[`clojure.lang/ITransientMap` @ crossclj](http://crossclj.info/fun/clojure.lang/ITransientMap.html)<br>
[`cljs.core/ITransientMap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ITransientMap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ITransientMap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ITransientMap",
 :history [["+" "0.0-1211"]],
 :type "protocol",
 :full-name-encode "cljs.core/ITransientMap",
 :source {:code "(defprotocol ITransientMap\n  \"Protocol for adding mapping functionality to transient collections.\"\n  (^clj -dissoc! [tcoll key]\n    \"Returns a new transient collection of tcoll without the mapping for key.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [661 664]},
 :methods [{:name "-dissoc!",
            :signature ["[tcoll key]"],
            :docstring "Returns a new transient collection of tcoll without the mapping for key."}],
 :full-name "cljs.core/ITransientMap",
 :clj-symbol "clojure.lang/ITransientMap",
 :docstring "Protocol for adding mapping functionality to transient collections."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ITransientMap"]))
```

-->
