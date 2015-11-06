## cljs.pprint/PrettyFlush



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/pprint.cljs#L120):

```clj
(defprotocol PrettyFlush (ppflush [this]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[pprint.cljs:120](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/pprint.cljs#L120)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/PrettyFlush` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/PrettyFlush.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/PrettyFlush.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "PrettyFlush",
 :type "protocol",
 :full-name-encode "cljs.pprint/PrettyFlush",
 :source {:code "(defprotocol PrettyFlush (ppflush [this]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/pprint.cljs",
          :lines [120]},
 :methods [{:name "ppflush", :signature ["[this]"], :docstring nil}],
 :full-name "cljs.pprint/PrettyFlush",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/PrettyFlush"]))
```

-->
