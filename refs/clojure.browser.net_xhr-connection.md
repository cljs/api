## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xhr-connection

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__xhr-connection__)<br>
</samp>

```
Returns an XhrIo connection
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:83-86](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/browser/net.cljs#L83-L86)</ins>
</pre>

```clj
(defn xhr-connection
  []
  (goog.net.XhrIo.))
```


---

```clj
{:full-name "clojure.browser.net/xhr-connection",
 :ns "clojure.browser.net",
 :name "xhr-connection",
 :docstring "Returns an XhrIo connection",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn xhr-connection\n  []\n  (goog.net.XhrIo.))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [83 86],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/browser/net.cljs#L83-L86"},
 :full-name-encode "clojure.browser.net_xhr-connection",
 :history [["+" "0.0-927"]]}

```
