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









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L265-L266):

```clj
(defprotocol IReduce
  (-reduce [coll f] [coll f start]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:265-266](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L265-L266)</ins>
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
 :source {:code "(defprotocol IReduce\n  (-reduce [coll f] [coll f start]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/cljs/cljs/core.cljs",
          :lines [265 266]},
 :methods [{:name "-reduce",
            :signature ["[coll f]" "[coll f start]"],
            :docstring nil}],
 :full-name "cljs.core/IReduce",
 :clj-symbol "clojure.lang/IReduce"}

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
