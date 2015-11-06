## clojure.browser.event/fire-listeners



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__fire-listeners__ obj type capture event)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/clojure/browser/event.cljs#L84-L85):

```clj
(defn fire-listeners
  [obj type capture event])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[event.cljs:84-85](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/clojure/browser/event.cljs#L84-L85)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.event/fire-listeners` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/fire-listeners.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/fire-listeners.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.event",
 :name "fire-listeners",
 :type "function",
 :signature ["[obj type capture event]"],
 :source {:code "(defn fire-listeners\n  [obj type capture event])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/clojure/browser/event.cljs",
          :lines [84 85]},
 :full-name "clojure.browser.event/fire-listeners",
 :full-name-encode "clojure.browser.event/fire-listeners",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/fire-listeners"]))
```

-->
