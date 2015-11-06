## ~~cljs.repl.rhino/loaded-libs~~



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[×] 0.0-1576" title="Removed in 0.0-1576" src="https://img.shields.io/badge/×-0.0--1576-red.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/rhino.clj#L20):

```clj
(def loaded-libs (atom #{}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:20](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/repl/rhino.clj#L20)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/loaded-libs` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/loaded-libs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/loaded-libs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "loaded-libs",
 :type "var",
 :source {:code "(def loaded-libs (atom #{}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [20]},
 :full-name "cljs.repl.rhino/loaded-libs",
 :full-name-encode "cljs.repl.rhino/loaded-libs",
 :history [["+" "0.0-927"] ["-" "0.0-1576"]],
 :removed {:in "0.0-1576", :last-seen "0.0-1552"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/loaded-libs"]))
```

-->
