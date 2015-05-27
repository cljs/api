## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.event/listen-once

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__listen-once__ src type fn)<br>
(__listen-once__ src type fn capture?)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[event.cljs:53-60](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/browser/event.cljs#L53-L60)</ins>
</pre>

```clj
(defn listen-once
  ([src type fn]
     (listen-once src type fn false))
  ([src type fn capture?]
     (goog.events/listenOnce src
                             (get (event-types src) type type)
                             fn
                             capture?)))
```


---

```clj
{:full-name "clojure.browser.event/listen-once",
 :ns "clojure.browser.event",
 :name "listen-once",
 :type "function",
 :signature ["[src type fn]" "[src type fn capture?]"],
 :source {:code "(defn listen-once\n  ([src type fn]\n     (listen-once src type fn false))\n  ([src type fn capture?]\n     (goog.events/listenOnce src\n                             (get (event-types src) type type)\n                             fn\n                             capture?)))",
          :filename "clojurescript/src/cljs/clojure/browser/event.cljs",
          :lines [53 60],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/browser/event.cljs#L53-L60"},
 :full-name-encode "clojure.browser.event_listen-once",
 :history [["+" "0.0-927"]]}

```
