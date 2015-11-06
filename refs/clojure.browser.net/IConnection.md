## clojure.browser.net/IConnection



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/clojure/browser/net.cljs#L30-L42):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:30-42](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/clojure/browser/net.cljs#L30-L42)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/IConnection` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/IConnection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/IConnection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "IConnection",
 :type "protocol",
 :full-name-encode "clojure.browser.net/IConnection",
 :source {:code "(defprotocol IConnection\n  (connect\n    [this]\n    [this opt1]\n    [this opt1 opt2]\n    [this opt1 opt2 opt3])\n  (transmit\n    [this opt]\n    [this opt opt2]\n    [this opt opt2 opt3]\n    [this opt opt2 opt3 opt4]\n    [this opt opt2 opt3 opt4 opt5])\n  (close [this]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [30 42]},
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

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/IConnection"]))
```

-->
