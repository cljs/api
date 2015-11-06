## clojure.browser.dom/DOMBuilder



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/clojure/browser/dom.cljs#L17-L18):

```clj
(defprotocol DOMBuilder
  (-element [this] [this attrs-or-children] [this attrs children]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:17-18](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/clojure/browser/dom.cljs#L17-L18)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/DOMBuilder` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/DOMBuilder.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/DOMBuilder.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "DOMBuilder",
 :type "protocol",
 :full-name-encode "clojure.browser.dom/DOMBuilder",
 :source {:code "(defprotocol DOMBuilder\n  (-element [this] [this attrs-or-children] [this attrs children]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [17 18]},
 :methods [{:name "-element",
            :signature ["[this]"
                        "[this attrs-or-children]"
                        "[this attrs children]"],
            :docstring nil}],
 :full-name "clojure.browser.dom/DOMBuilder",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/DOMBuilder"]))
```

-->
