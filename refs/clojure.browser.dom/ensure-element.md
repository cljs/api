## clojure.browser.dom/ensure-element



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ensure-element__ e)<br>
</samp>

---





Source docstring:

```
Coerce the argument to a dom element if possible.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/clojure/browser/dom.cljs#L107-L112):

```clj
(defn ensure-element
  [e]
  (cond (keyword? e) (get-element e)
        (string? e) (html->dom e)
        :else e))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:107-112](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/clojure/browser/dom.cljs#L107-L112)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/ensure-element` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/ensure-element.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/ensure-element.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "ensure-element",
 :signature ["[e]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/ensure-element",
 :source {:code "(defn ensure-element\n  [e]\n  (cond (keyword? e) (get-element e)\n        (string? e) (html->dom e)\n        :else e))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [107 112]},
 :full-name "clojure.browser.dom/ensure-element",
 :docstring "Coerce the argument to a dom element if possible."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/ensure-element"]))
```

-->
