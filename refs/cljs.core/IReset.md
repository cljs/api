## cljs.core/IReset



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" title="Added in 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L416-L417):

```clj
(defprotocol IReset
  (-reset! [o new-value]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:416-417](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L416-L417)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IReset` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IReset.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IReset.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IReset",
 :type "protocol",
 :full-name-encode "cljs.core/IReset",
 :source {:code "(defprotocol IReset\n  (-reset! [o new-value]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [416 417]},
 :methods [{:name "-reset!",
            :signature ["[o new-value]"],
            :docstring nil}],
 :full-name "cljs.core/IReset",
 :history [["+" "0.0-2173"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IReset"]))
```

-->
