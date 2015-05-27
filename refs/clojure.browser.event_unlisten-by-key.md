## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/unlisten-by-key

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unlisten-by-key__ key)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:71-73](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/event.cljs#L71-L73)</ins>
</pre>

```clj
(defn unlisten-by-key
  [key]
  (goog.events/unlistenByKey key))
```


---

```clj
{:full-name "clojure.browser.event/unlisten-by-key",
 :ns "clojure.browser.event",
 :name "unlisten-by-key",
 :type "function",
 :signature ["[key]"],
 :source {:code "(defn unlisten-by-key\n  [key]\n  (goog.events/unlistenByKey key))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [71 73],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/event.cljs#L71-L73"},
 :full-name-encode "clojure.browser.event_unlisten-by-key",
 :history [["+" "0.0-927"]]}

```
