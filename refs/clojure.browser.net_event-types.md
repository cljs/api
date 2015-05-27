## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/event-types

 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:23-30](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/browser/net.cljs#L23-L30)</ins>
</pre>

```clj
(def event-types
  (into {}
        (map
         (fn [[k v]]
           [(keyword (. k (toLowerCase)))
            v])
         (merge
          (js->clj goog.net.EventType)))))
```


---

```clj
{:full-name "clojure.browser.net/event-types",
 :ns "clojure.browser.net",
 :name "event-types",
 :type "var",
 :source {:code "(def event-types\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (. k (toLowerCase)))\n            v])\n         (merge\n          (js->clj goog.net.EventType)))))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [23 30],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/browser/net.cljs#L23-L30"},
 :full-name-encode "clojure.browser.net_event-types",
 :history [["+" "0.0-927"]]}

```
