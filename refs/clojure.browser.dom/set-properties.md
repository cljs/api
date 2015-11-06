## clojure.browser.dom/set-properties



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__set-properties__ e m)<br>
</samp>

---





Source docstring:

```
Set properties on an element
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/dom.cljs#L136-L140):

```clj
(defn set-properties
  [e m]
  (gdom/setProperties (ensure-element e)
                      (apply gobject/create (interleave (keys m) (vals m)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:136-140](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/dom.cljs#L136-L140)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/set-properties` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/set-properties.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/set-properties.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "set-properties",
 :signature ["[e m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/set-properties",
 :source {:code "(defn set-properties\n  [e m]\n  (gdom/setProperties (ensure-element e)\n                      (apply gobject/create (interleave (keys m) (vals m)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [136 140]},
 :full-name "clojure.browser.dom/set-properties",
 :docstring "Set properties on an element"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-properties"]))
```

-->
