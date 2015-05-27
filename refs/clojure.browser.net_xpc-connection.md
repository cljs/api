## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.net/xpc-connection

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__xpc-connection__)<br>
(__xpc-connection__ config)<br>
</samp>

```
When passed with a config hash-map, returns a parent
CrossPageChannel object. Keys in the config hash map are downcased
versions of the goog.net.xpc.CfgFields enum keys,
e.g. goog.net.xpc.CfgFields.PEER_URI becomes :peer_uri in the config
hash.

When passed with no args, creates a child CrossPageChannel object,
and the config is automatically taken from the URL param 'xpc', as
per the CrossPageChannel API.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:118-140](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/browser/net.cljs#L118-L140)</ins>
</pre>

```clj
(defn xpc-connection
  ([]
     (when-let [config (.getParameterValue
                        (goog.Uri. (.-href (.-location js/window)))
                        "xpc")]
       (goog.net.xpc.CrossPageChannel. (gjson/parse config))))
  ([config]
     (goog.net.xpc.CrossPageChannel.
      (reduce (fn [sum [k v]]
                (if-let [field (get xpc-config-fields k)]
                  (doto sum (aset field v))
                  sum))
              (js-obj)
              config))))
```


---

```clj
{:full-name "clojure.browser.net/xpc-connection",
 :ns "clojure.browser.net",
 :name "xpc-connection",
 :docstring "When passed with a config hash-map, returns a parent\nCrossPageChannel object. Keys in the config hash map are downcased\nversions of the goog.net.xpc.CfgFields enum keys,\ne.g. goog.net.xpc.CfgFields.PEER_URI becomes :peer_uri in the config\nhash.\n\nWhen passed with no args, creates a child CrossPageChannel object,\nand the config is automatically taken from the URL param 'xpc', as\nper the CrossPageChannel API.",
 :type "function",
 :signature ["[]" "[config]"],
 :source {:code "(defn xpc-connection\n  ([]\n     (when-let [config (.getParameterValue\n                        (goog.Uri. (.-href (.-location js/window)))\n                        \"xpc\")]\n       (goog.net.xpc.CrossPageChannel. (gjson/parse config))))\n  ([config]\n     (goog.net.xpc.CrossPageChannel.\n      (reduce (fn [sum [k v]]\n                (if-let [field (get xpc-config-fields k)]\n                  (doto sum (aset field v))\n                  sum))\n              (js-obj)\n              config))))",
          :filename "clojurescript/src/cljs/clojure/browser/net.cljs",
          :lines [118 140],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/browser/net.cljs#L118-L140"},
 :full-name-encode "clojure.browser.net_xpc-connection",
 :history [["+" "0.0-927"]]}

```
