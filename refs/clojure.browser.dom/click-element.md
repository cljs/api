## clojure.browser.dom/click-element



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__click-element__ e)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/clojure/browser/dom.cljs#L147-L149):

```clj
(defn click-element
  [e]
  (.click (ensure-element e) ()))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:147-149](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/clojure/browser/dom.cljs#L147-L149)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/click-element` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/click-element.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/click-element.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "click-element",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn click-element\n  [e]\n  (.click (ensure-element e) ()))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [147 149]},
 :full-name "clojure.browser.dom/click-element",
 :full-name-encode "clojure.browser.dom/click-element",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/click-element"]))
```

-->
