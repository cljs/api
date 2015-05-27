## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xpc-config-fields

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
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:75-81](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/browser/net.cljs#L75-L81)</ins>
</pre>

```clj
(def xpc-config-fields
  (into {}
        (map
         (fn [[k v]]
           [(keyword (. k (toLowerCase)))
            v])
         (js->clj goog.net.xpc.CfgFields))))
```


---

```clj
{:full-name "clojure.browser.net/xpc-config-fields",
 :ns "clojure.browser.net",
 :name "xpc-config-fields",
 :type "var",
 :source {:code "(def xpc-config-fields\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (. k (toLowerCase)))\n            v])\n         (js->clj goog.net.xpc.CfgFields))))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [75 81],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/browser/net.cljs#L75-L81"},
 :full-name-encode "clojure.browser.net_xpc-config-fields",
 :history [["+" "0.0-927"]]}

```
