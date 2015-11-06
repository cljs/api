## clojure.browser.event/all-listeners



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__all-listeners__ obj type capture)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/clojure/browser/event.cljs#L92):

```clj
(defn all-listeners [obj type capture])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:92](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/clojure/browser/event.cljs#L92)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.event/all-listeners` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/all-listeners.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/all-listeners.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.event",
 :name "all-listeners",
 :type "function",
 :signature ["[obj type capture]"],
 :source {:code "(defn all-listeners [obj type capture])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [92]},
 :full-name "clojure.browser.event/all-listeners",
 :full-name-encode "clojure.browser.event/all-listeners",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/all-listeners"]))
```

-->
