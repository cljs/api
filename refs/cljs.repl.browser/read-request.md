## ~~cljs.repl.browser/read-request~~


> __MOVED__, please see [`cljs.repl.server/read-request`](../cljs.repl.server/read-request.md)

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[×] 0.0-1503" title="Removed in 0.0-1503" src="https://img.shields.io/badge/×-0.0--1503-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-request__ rdr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L161-L165):

```clj
(defn read-request [rdr]
  (let [line (.readLine rdr)]
    (cond (.startsWith line "POST") (read-post line rdr)
          (.startsWith line "GET") (read-get line rdr)
          :else {:method :unknown :content line})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:161-165](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L161-L165)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/read-request` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/read-request.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/read-request.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:moved "cljs.repl.server/read-request",
 :ns "cljs.repl.browser",
 :name "read-request",
 :signature ["[rdr]"],
 :history [["+" "0.0-927"] ["-" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/read-request",
 :source {:code "(defn read-request [rdr]\n  (let [line (.readLine rdr)]\n    (cond (.startsWith line \"POST\") (read-post line rdr)\n          (.startsWith line \"GET\") (read-get line rdr)\n          :else {:method :unknown :content line})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [161 165]},
 :full-name "cljs.repl.browser/read-request",
 :removed {:in "0.0-1503", :last-seen "0.0-1450"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/read-request"]))
```

-->
