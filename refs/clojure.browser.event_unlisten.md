## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/unlisten

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unlisten__ src type fn)<br>
(__unlisten__ src type fn capture?)<br>
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
                └── <ins>[event.cljs:62-69](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L62-L69)</ins>
</pre>

```clj
(defn unlisten
  ([src type fn]
     (unlisten src type fn false))
  ([src type fn capture?]
     (goog.events/unlisten src
                           (get (event-types src) type type)
                           fn
                           capture?)))
```


---

```clj
{:full-name "clojure.browser.event/unlisten",
 :ns "clojure.browser.event",
 :name "unlisten",
 :type "function",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :source {:code "(defn unlisten\n  ([src type fn]\n     (unlisten src type fn false))\n  ([src type fn capture?]\n     (goog.events/unlisten src\n                           (get (event-types src) type type)\n                           fn\n                           capture?)))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [62 69],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/browser/event.cljs#L62-L69"},
 :full-name-encode "clojure.browser.event_unlisten",
 :history [["+" "0.0-927"]]}

```
