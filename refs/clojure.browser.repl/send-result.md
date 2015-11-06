## clojure.browser.repl/send-result



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__send-result__ connection url data)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/clojure/browser/repl.cljs#L38-L39):

```clj
(defn send-result [connection url data]
  (net/transmit connection url "POST" data nil 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2758
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:38-39](https://github.com/clojure/clojurescript/blob/r2758/src/cljs/clojure/browser/repl.cljs#L38-L39)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/send-result` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/send-result.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/send-result.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "send-result",
 :type "function",
 :signature ["[connection url data]"],
 :source {:code "(defn send-result [connection url data]\n  (net/transmit connection url \"POST\" data nil 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [38 39]},
 :full-name "clojure.browser.repl/send-result",
 :full-name-encode "clojure.browser.repl/send-result",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/send-result"]))
```

-->
