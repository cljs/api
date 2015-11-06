## cljs.core/Fn



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" title="Added in 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Fn</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Fn.java)
</td>
</tr>
</table>







Source docstring:

```
Marker protocol
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L415-L416):

```clj
(defprotocol Fn
  "Marker protocol")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:415-416](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L415-L416)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Fn` @ clojuredocs](http://clojuredocs.org/clojure.lang/Fn)<br>
[`clojure.lang/Fn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Fn/)<br>
[`clojure.lang/Fn` @ crossclj](http://crossclj.info/fun/clojure.lang/Fn.html)<br>
[`cljs.core/Fn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Fn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Fn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Fn",
 :history [["+" "0.0-1552"]],
 :type "protocol",
 :full-name-encode "cljs.core/Fn",
 :source {:code "(defprotocol Fn\n  \"Marker protocol\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [415 416]},
 :full-name "cljs.core/Fn",
 :clj-symbol "clojure.lang/Fn",
 :docstring "Marker protocol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Fn"]))
```

-->
