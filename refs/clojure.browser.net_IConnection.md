## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/IConnection

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
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:32-44](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/browser/net.cljs#L32-L44)</ins>
</pre>

```clj
(defprotocol IConnection
  (connect
    [this]
    [this opt1]
    [this opt1 opt2]
    [this opt1 opt2 opt3])
  (transmit
    [this opt]
    [this opt opt2]
    [this opt opt2 opt3]
    [this opt opt2 opt3 opt4]
    [this opt opt2 opt3 opt4 opt5])
  (close [this]))
```


---

```clj
{:ns "clojure.browser.net",
 :name "IConnection",
 :type "protocol",
 :full-name-encode "clojure.browser.net_IConnection",
 :source {:code "(defprotocol IConnection\n  (connect\n    [this]\n    [this opt1]\n    [this opt1 opt2]\n    [this opt1 opt2 opt3])\n  (transmit\n    [this opt]\n    [this opt opt2]\n    [this opt opt2 opt3]\n    [this opt opt2 opt3 opt4]\n    [this opt opt2 opt3 opt4 opt5])\n  (close [this]))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [32 44],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/browser/net.cljs#L32-L44"},
 :methods [{:name "connect",
            :signature ["[this]"
                        "[this opt1]"
                        "[this opt1 opt2]"
                        "[this opt1 opt2 opt3]"],
            :docstring nil}
           {:name "transmit",
            :signature ["[this opt]"
                        "[this opt opt2]"
                        "[this opt opt2 opt3]"
                        "[this opt opt2 opt3 opt4]"
                        "[this opt opt2 opt3 opt4 opt5]"],
            :docstring nil}
           {:name "close", :signature ["[this]"], :docstring nil}],
 :full-name "clojure.browser.net/IConnection",
 :history [["+" "0.0-927"]]}

```
