## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/ICrossPageChannel

 <table border="1">
<tr>
<td>protocol</td>
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
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:88-89](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/net.cljs#L88-L89)</ins>
</pre>

```clj
(defprotocol ICrossPageChannel
  (register-service [this service-name fn] [this service-name fn encode-json?]))
```


---

```clj
{:ns "clojure.browser.net",
 :name "ICrossPageChannel",
 :type "protocol",
 :full-name-encode "clojure.browser.net_ICrossPageChannel",
 :source {:code "(defprotocol ICrossPageChannel\n  (register-service [this service-name fn] [this service-name fn encode-json?]))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [88 89],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/net.cljs#L88-L89"},
 :methods [{:name "register-service",
            :signature ["[this service-name fn]"
                        "[this service-name fn encode-json?]"],
            :docstring nil}],
 :full-name "clojure.browser.net/ICrossPageChannel",
 :history [["+" "0.0-927"]]}

```
