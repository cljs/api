## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/expose

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__expose__ e)<br>
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
                └── <ins>[event.cljs:79-80](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L79-L80)</ins>
</pre>

```clj
(defn expose [e]
  (goog.events/expose e))
```


---

```clj
{:full-name "clojure.browser.event/expose",
 :ns "clojure.browser.event",
 :name "expose",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn expose [e]\n  (goog.events/expose e))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [79 80],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L79-L80"},
 :full-name-encode "clojure.browser.event_expose",
 :history [["+" "0.0-927"]]}

```
