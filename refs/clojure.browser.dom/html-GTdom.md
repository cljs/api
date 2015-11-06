## clojure.browser.dom/html->dom



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__html->dom__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/clojure/browser/dom.cljs#L101-L102):

```clj
(defn html->dom [s]
  (gdom/htmlToDocumentFragment s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:101-102](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/clojure/browser/dom.cljs#L101-L102)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/html->dom` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/html-%3Edom.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/html-GTdom.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "html->dom",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn html->dom [s]\n  (gdom/htmlToDocumentFragment s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [101 102]},
 :full-name "clojure.browser.dom/html->dom",
 :full-name-encode "clojure.browser.dom/html-GTdom",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/html->dom"]))
```

-->
