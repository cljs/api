## clojure.browser.repl/get-ua-product



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3058"><img valign="middle" alt="[+] 0.0-3058" title="Added in 0.0-3058" src="https://img.shields.io/badge/+-0.0--3058-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__get-ua-product__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/clojure/browser/repl.cljs#L36-L41):

```clj
(defn get-ua-product []
  (cond
    (gbrowser/isSafari) :safari
    (gbrowser/isChrome) :chrome
    (gbrowser/isFirefox) :firefox
    (gbrowser/isIE) :ie))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:36-41](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/clojure/browser/repl.cljs#L36-L41)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/get-ua-product` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/get-ua-product.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/get-ua-product.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "get-ua-product",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn get-ua-product []\n  (cond\n    (gbrowser/isSafari) :safari\n    (gbrowser/isChrome) :chrome\n    (gbrowser/isFirefox) :firefox\n    (gbrowser/isIE) :ie))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [36 41]},
 :full-name "clojure.browser.repl/get-ua-product",
 :full-name-encode "clojure.browser.repl/get-ua-product",
 :history [["+" "0.0-3058"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/get-ua-product"]))
```

-->
