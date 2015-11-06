## clojure.browser.event/IEventType



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/browser/event.cljs#L16-L17):

```clj
(defprotocol IEventType
  (event-types [this]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:16-17](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/clojure/browser/event.cljs#L16-L17)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.event/IEventType` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/IEventType.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/IEventType.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.event",
 :name "IEventType",
 :type "protocol",
 :full-name-encode "clojure.browser.event/IEventType",
 :source {:code "(defprotocol IEventType\n  (event-types [this]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [16 17]},
 :methods [{:name "event-types",
            :signature ["[this]"],
            :docstring nil}],
 :full-name "clojure.browser.event/IEventType",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/IEventType"]))
```

-->
