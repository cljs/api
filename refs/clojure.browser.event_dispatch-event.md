## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/dispatch-event

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-event__ src event)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:75-77](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L75-L77)</ins>
</pre>

```clj
(defn dispatch-event
  [src event]
  (goog.events/dispatchEvent src event))
```


---

```clj
{:full-name "clojure.browser.event/dispatch-event",
 :ns "clojure.browser.event",
 :name "dispatch-event",
 :type "function",
 :signature ["[src event]"],
 :source {:code "(defn dispatch-event\n  [src event]\n  (goog.events/dispatchEvent src event))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [75 77],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L75-L77"},
 :full-name-encode "clojure.browser.event_dispatch-event",
 :history [["+" "0.0-927"]]}

```
