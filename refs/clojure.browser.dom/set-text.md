## clojure.browser.dom/set-text



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__set-text__ e s)<br>
</samp>

---





Source docstring:

```
Set the text content for the passed element returning the
element. If a keyword is passed in the place of e, the element with
that id will be used and returned.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/browser/dom.cljs#L124-L129):

```clj
(defn set-text
  [e s]
  (gdom/setTextContent (ensure-element e) s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:124-129](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/browser/dom.cljs#L124-L129)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/set-text` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/set-text.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/set-text.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "set-text",
 :signature ["[e s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom/set-text",
 :source {:code "(defn set-text\n  [e s]\n  (gdom/setTextContent (ensure-element e) s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [124 129]},
 :full-name "clojure.browser.dom/set-text",
 :docstring "Set the text content for the passed element returning the\nelement. If a keyword is passed in the place of e, the element with\nthat id will be used and returned."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-text"]))
```

-->
