## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/listen

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__listen__ src type fn)<br>
(__listen__ src type fn capture?)<br>
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
                └── <ins>[event.cljs:44-51](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/event.cljs#L44-L51)</ins>
</pre>

```clj
(defn listen
  ([src type fn]
     (listen src type fn false))
  ([src type fn capture?]
     (goog.events/listen src
                         (get (event-types src) type type)
                         fn
                         capture?)))
```


---

```clj
{:full-name "clojure.browser.event/listen",
 :ns "clojure.browser.event",
 :name "listen",
 :type "function",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :source {:code "(defn listen\n  ([src type fn]\n     (listen src type fn false))\n  ([src type fn capture?]\n     (goog.events/listen src\n                         (get (event-types src) type type)\n                         fn\n                         capture?)))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [44 51],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/event.cljs#L44-L51"},
 :full-name-encode "clojure.browser.event_listen",
 :history [["+" "0.0-927"]]}

```
