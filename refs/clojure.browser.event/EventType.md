## ~~clojure.browser.event/EventType~~


> __MOVED__, please see [`clojure.browser.event/IEventType`](../clojure.browser.event/IEventType.md)

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[×] 0.0-2301" title="Removed in 0.0-2301" src="https://img.shields.io/badge/×-0.0--2301-red.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(defprotocol EventType
  (event-types [this]))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.event/EventType` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/EventType.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/EventType.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:moved "clojure.browser.event/IEventType",
 :ns "clojure.browser.event",
 :name "EventType",
 :history [["+" "0.0-927"] ["-" "0.0-2301"]],
 :type "protocol",
 :full-name-encode "clojure.browser.event/EventType",
 :source {:code "(defprotocol EventType\n  (event-types [this]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/clojure/browser/event.cljs",
          :lines [17 18]},
 :methods [{:name "event-types",
            :signature ["[this]"],
            :docstring nil}],
 :full-name "clojure.browser.event/EventType",
 :removed {:in "0.0-2301", :last-seen "0.0-2280"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/EventType"]))
```

-->
