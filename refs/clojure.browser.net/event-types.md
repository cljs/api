## clojure.browser.net/event-types



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/clojure/browser/net.cljs#L21-L28):

```clj
(def event-types
  (into {}
        (map
         (fn [[k v]]
           [(keyword (.toLowerCase k))
            v])
         (merge
          (js->clj EventType)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:21-28](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/clojure/browser/net.cljs#L21-L28)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/event-types` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/event-types.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/event-types.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "event-types",
 :type "var",
 :source {:code "(def event-types\n  (into {}\n        (map\n         (fn [[k v]]\n           [(keyword (.toLowerCase k))\n            v])\n         (merge\n          (js->clj EventType)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [21 28]},
 :full-name "clojure.browser.net/event-types",
 :full-name-encode "clojure.browser.net/event-types",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/event-types"]))
```

-->
