## clojure.browser.repl/wrap-message



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__wrap-message__ t data)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/clojure/browser/repl.cljs#L57-L58):

```clj
(defn wrap-message [t data]
  (pr-str {:type t :content data :order (swap! order inc)}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:57-58](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/clojure/browser/repl.cljs#L57-L58)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/wrap-message` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/wrap-message.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/wrap-message.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "wrap-message",
 :type "function",
 :signature ["[t data]"],
 :source {:code "(defn wrap-message [t data]\n  (pr-str {:type t :content data :order (swap! order inc)}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [57 58]},
 :full-name "clojure.browser.repl/wrap-message",
 :full-name-encode "clojure.browser.repl/wrap-message",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/wrap-message"]))
```

-->
