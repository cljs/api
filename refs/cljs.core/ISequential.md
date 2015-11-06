## cljs.core/ISequential



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Sequential</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Sequential.java)
</td>
</tr>
</table>







Source docstring:

```
Marker interface indicating a persistent collection of sequential items
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L272-L273):

```clj
(defprotocol ISequential
  "Marker interface indicating a persistent collection of sequential items")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:272-273](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L272-L273)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Sequential` @ clojuredocs](http://clojuredocs.org/clojure.lang/Sequential)<br>
[`clojure.lang/Sequential` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Sequential/)<br>
[`clojure.lang/Sequential` @ crossclj](http://crossclj.info/fun/clojure.lang/Sequential.html)<br>
[`cljs.core/ISequential` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ISequential.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ISequential.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ISequential",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/ISequential",
 :source {:code "(defprotocol ISequential\n  \"Marker interface indicating a persistent collection of sequential items\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [272 273]},
 :full-name "cljs.core/ISequential",
 :clj-symbol "clojure.lang/Sequential",
 :docstring "Marker interface indicating a persistent collection of sequential items"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISequential"]))
```

-->
