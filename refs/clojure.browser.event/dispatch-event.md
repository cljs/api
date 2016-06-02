## clojure.browser.event/dispatch-event



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(dispatch-event src event)</samp><br>

---

 <samp>
(__dispatch-event__ src event)<br>
</samp>

---







Source code @ [github]():

```clj
(defn dispatch-event
  [src event]
  (events/dispatchEvent src event))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.browser.event/dispatch-event` @ crossclj](http://crossclj.info/fun/clojure.browser.event.cljs/dispatch-event.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/dispatch-event.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.event",
 :name "dispatch-event",
 :signature ["[src event]"],
 :name-encode "dispatch-event",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.event/dispatch-event",
 :source {:code "(defn dispatch-event\n  [src event]\n  (events/dispatchEvent src event))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/clojure/browser/event.cljs",
          :lines [77 79],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/clojure/browser/event.cljs#L77-L79"},
 :usage ["(dispatch-event src event)"],
 :full-name "clojure.browser.event/dispatch-event",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.event/dispatch-event.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.event/dispatch-event"]))
```

-->
