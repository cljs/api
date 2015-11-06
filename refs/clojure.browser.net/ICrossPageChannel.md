## clojure.browser.net/ICrossPageChannel



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/clojure/browser/net.cljs#L88-L89):

```clj
(defprotocol ICrossPageChannel
  (register-service [this service-name fn] [this service-name fn encode-json?]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:88-89](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/clojure/browser/net.cljs#L88-L89)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/ICrossPageChannel` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/ICrossPageChannel.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/ICrossPageChannel.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "ICrossPageChannel",
 :type "protocol",
 :full-name-encode "clojure.browser.net/ICrossPageChannel",
 :source {:code "(defprotocol ICrossPageChannel\n  (register-service [this service-name fn] [this service-name fn encode-json?]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [88 89]},
 :methods [{:name "register-service",
            :signature ["[this service-name fn]"
                        "[this service-name fn encode-json?]"],
            :docstring nil}],
 :full-name "clojure.browser.net/ICrossPageChannel",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/ICrossPageChannel"]))
```

-->
