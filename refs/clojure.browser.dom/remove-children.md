## clojure.browser.dom/remove-children



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__remove-children__ id)<br>
</samp>

---





Source docstring:

```
Remove all children from the element with the passed id.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/clojure/browser/dom.cljs#L92-L96):

```clj
(defn remove-children
  [id]
  (let [parent (gdom/getElement (name id))]
    (do (gdom/removeChildren parent))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:92-96](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/clojure/browser/dom.cljs#L92-L96)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/remove-children` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/remove-children.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/remove-children.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "remove-children",
 :signature ["[id]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/remove-children",
 :source {:code "(defn remove-children\n  [id]\n  (let [parent (gdom/getElement (name id))]\n    (do (gdom/removeChildren parent))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [92 96]},
 :full-name "clojure.browser.dom/remove-children",
 :docstring "Remove all children from the element with the passed id."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/remove-children"]))
```

-->
