## clojure.browser.dom/replace-node



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__replace-node__ old-node new-node)<br>
</samp>

---





Source docstring:

```
Replace old-node with new-node. old-node can be an element or a
keyword which is the id of the node to replace.  new-node can be an
element or an html string.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/browser/dom.cljs#L114-L122):

```clj
(defn replace-node
  [old-node new-node]
  (let [old-node (ensure-element old-node)
        new-node (ensure-element new-node)]
    (gdom/replaceNode new-node old-node)
    new-node))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:114-122](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/clojure/browser/dom.cljs#L114-L122)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/replace-node` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/replace-node.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/replace-node.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "replace-node",
 :signature ["[old-node new-node]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/replace-node",
 :source {:code "(defn replace-node\n  [old-node new-node]\n  (let [old-node (ensure-element old-node)\n        new-node (ensure-element new-node)]\n    (gdom/replaceNode new-node old-node)\n    new-node))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [114 122]},
 :full-name "clojure.browser.dom/replace-node",
 :docstring "Replace old-node with new-node. old-node can be an element or a\nkeyword which is the id of the node to replace.  new-node can be an\nelement or an html string."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/replace-node"]))
```

-->
