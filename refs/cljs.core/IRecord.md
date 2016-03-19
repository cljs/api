## cljs.core/IRecord



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IRecord</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IRecord.java)
</td>
</tr>
</table>







Source docstring:

```
Marker interface indicating a record object
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L619-L620):

```clj
(defprotocol IRecord
  "Marker interface indicating a record object")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:619-620](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L619-L620)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/IRecord` @ clojuredocs](http://clojuredocs.org/clojure.lang/IRecord)<br>
[`clojure.lang/IRecord` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/IRecord/)<br>
[`clojure.lang/IRecord` @ crossclj](http://crossclj.info/fun/clojure.lang/IRecord.html)<br>
[`cljs.core/IRecord` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IRecord.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IRecord.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IRecord",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IRecord",
 :source {:code "(defprotocol IRecord\n  \"Marker interface indicating a record object\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [619 620]},
 :full-name "cljs.core/IRecord",
 :clj-symbol "clojure.lang/IRecord",
 :docstring "Marker interface indicating a record object"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IRecord"]))
```

-->
