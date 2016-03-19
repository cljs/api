## cljs.pprint/IPrettyFlush



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/pprint.cljs#L144-L145):

```clj
(defprotocol IPrettyFlush
  (-ppflush [pp]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:144-145](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/pprint.cljs#L144-L145)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.pprint/IPrettyFlush` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/IPrettyFlush.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/IPrettyFlush.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "IPrettyFlush",
 :type "protocol",
 :full-name-encode "cljs.pprint/IPrettyFlush",
 :source {:code "(defprotocol IPrettyFlush\n  (-ppflush [pp]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [144 145]},
 :methods [{:name "-ppflush", :signature ["[pp]"], :docstring nil}],
 :full-name "cljs.pprint/IPrettyFlush",
 :history [["+" "0.0-3255"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/IPrettyFlush"]))
```

-->
