## clojure.browser.dom/append



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__append__ parent & children)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/clojure/browser/dom.cljs#L13-L15):

```clj
(defn append [parent & children]
  (apply gdom/append parent children)
  parent)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:13-15](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/clojure/browser/dom.cljs#L13-L15)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/append` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/append.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/append.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "append",
 :type "function",
 :signature ["[parent & children]"],
 :source {:code "(defn append [parent & children]\n  (apply gdom/append parent children)\n  parent)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [13 15]},
 :full-name "clojure.browser.dom/append",
 :full-name-encode "clojure.browser.dom/append",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/append"]))
```

-->
