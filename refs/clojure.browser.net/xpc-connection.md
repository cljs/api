## clojure.browser.net/xpc-connection



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__xpc-connection__)<br>
</samp>
 <samp>
(__xpc-connection__ config)<br>
</samp>

---





Source docstring:

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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/clojure/browser/net.cljs#L118-L140):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2173
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:118-140](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/clojure/browser/net.cljs#L118-L140)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/xpc-connection` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/xpc-connection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/xpc-connection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "xpc-connection",
 :signature ["[]" "[config]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.net/xpc-connection",
 :source {:code "(defn xpc-connection\n  ([]\n     (when-let [config (.getParameterValue\n                        (goog.Uri. (.-href (.-location js/window)))\n                        \"xpc\")]\n       (goog.net.xpc.CrossPageChannel. (gjson/parse config))))\n  ([config]\n     (goog.net.xpc.CrossPageChannel.\n      (reduce (fn [sum [k v]]\n                (if-let [field (get xpc-config-fields k)]\n                  (doto sum (aset field v))\n                  sum))\n              (js-obj)\n              config))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [118 140]},
 :full-name "clojure.browser.net/xpc-connection",
 :docstring "When passed with a config hash-map, returns a parent\nCrossPageChannel object. Keys in the config hash map are downcased\nversions of the goog.net.xpc.CfgFields enum keys,\ne.g. goog.net.xpc.CfgFields.PEER_URI becomes :peer_uri in the config\nhash.\n\nWhen passed with no args, creates a child CrossPageChannel object,\nand the config is automatically taken from the URL param 'xpc', as\nper the CrossPageChannel API."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/xpc-connection"]))
```

-->
