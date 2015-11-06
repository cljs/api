## cljs.repl.browser/read-get



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-get__ line rdr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/repl/browser.clj#L154-L159):

```clj
(defn read-get [line rdr]
  (let [[_ path _] (str/split line #" ")
        headers (parse-headers (read-headers rdr))]
    {:method :get
     :path path
     :headers headers}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:154-159](https://github.com/clojure/clojurescript/blob/r1424/src/clj/cljs/repl/browser.clj#L154-L159)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/read-get` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/read-get.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/read-get.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "read-get",
 :type "function",
 :signature ["[line rdr]"],
 :source {:code "(defn read-get [line rdr]\n  (let [[_ path _] (str/split line #\" \")\n        headers (parse-headers (read-headers rdr))]\n    {:method :get\n     :path path\n     :headers headers}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [154 159]},
 :full-name "cljs.repl.browser/read-get",
 :full-name-encode "cljs.repl.browser/read-get",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/read-get"]))
```

-->
