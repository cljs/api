## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/total-listener-count

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__total-listener-count__)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:85-86](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/browser/event.cljs#L85-L86)</ins>
</pre>

```clj
(defn total-listener-count []
  (goog.events/getTotalListenerCount))
```


---

```clj
{:full-name "clojure.browser.event/total-listener-count",
 :ns "clojure.browser.event",
 :name "total-listener-count",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn total-listener-count []\n  (goog.events/getTotalListenerCount))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [85 86],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/browser/event.cljs#L85-L86"},
 :full-name-encode "clojure.browser.event_total-listener-count",
 :history [["+" "0.0-927"]]}

```
