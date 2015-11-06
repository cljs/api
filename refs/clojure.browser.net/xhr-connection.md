## clojure.browser.net/xhr-connection



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__xhr-connection__)<br>
</samp>

---





Source docstring:

```
Returns an XhrIo connection
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/clojure/browser/net.cljs#L83-L86):

```clj
(defn xhr-connection
  []
  (goog.net.XhrIo.))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:83-86](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/clojure/browser/net.cljs#L83-L86)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/xhr-connection` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/xhr-connection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/xhr-connection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "xhr-connection",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.net/xhr-connection",
 :source {:code "(defn xhr-connection\n  []\n  (goog.net.XhrIo.))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [83 86]},
 :full-name "clojure.browser.net/xhr-connection",
 :docstring "Returns an XhrIo connection"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/xhr-connection"]))
```

-->
