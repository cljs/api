## cljs.repl.node/load-javascript



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-javascript__ repl-env provides url)<br>
</samp>

---





Source docstring:

```
Load a Closure JavaScript file into the Node REPL process.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/repl/node.clj#L69-L73):

```clj
(defn load-javascript
  [repl-env provides url]
  (node-eval repl-env
    (str "goog.require('" (comp/munge (first provides)) "')")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3169
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:69-73](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/repl/node.clj#L69-L73)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/load-javascript` @ crossclj](http://crossclj.info/fun/cljs.repl.node/load-javascript.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/load-javascript.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "load-javascript",
 :signature ["[repl-env provides url]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node/load-javascript",
 :source {:code "(defn load-javascript\n  [repl-env provides url]\n  (node-eval repl-env\n    (str \"goog.require('\" (comp/munge (first provides)) \"')\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [69 73]},
 :full-name "cljs.repl.node/load-javascript",
 :docstring "Load a Closure JavaScript file into the Node REPL process."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/load-javascript"]))
```

-->
