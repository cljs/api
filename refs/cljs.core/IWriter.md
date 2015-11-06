## cljs.core/IWriter



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L353-L355):

```clj
(defprotocol IWriter
  (-write [writer s])
  (-flush [writer]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:353-355](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L353-L355)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IWriter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IWriter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IWriter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IWriter",
 :type "protocol",
 :full-name-encode "cljs.core/IWriter",
 :source {:code "(defprotocol IWriter\n  (-write [writer s])\n  (-flush [writer]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [353 355]},
 :methods [{:name "-write", :signature ["[writer s]"], :docstring nil}
           {:name "-flush", :signature ["[writer]"], :docstring nil}],
 :full-name "cljs.core/IWriter",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWriter"]))
```

-->
