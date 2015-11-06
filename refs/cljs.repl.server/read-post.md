## cljs.repl.server/read-post



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-post__ line rdr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/repl/server.clj#L77-L86):

```clj
(defn read-post [line rdr]
  (let [[_ path _] (str/split line #" ")
        headers (parse-headers (read-headers rdr))
        content-length (Integer/parseInt (:content-length headers))
        content (char-array content-length)]
    (io! (.read rdr content 0 content-length)
         {:method :post
          :path path
          :headers headers
          :content (String. content)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:77-86](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/repl/server.clj#L77-L86)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/read-post` @ crossclj](http://crossclj.info/fun/cljs.repl.server/read-post.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/read-post.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "read-post",
 :type "function",
 :signature ["[line rdr]"],
 :source {:code "(defn read-post [line rdr]\n  (let [[_ path _] (str/split line #\" \")\n        headers (parse-headers (read-headers rdr))\n        content-length (Integer/parseInt (:content-length headers))\n        content (char-array content-length)]\n    (io! (.read rdr content 0 content-length)\n         {:method :post\n          :path path\n          :headers headers\n          :content (String. content)})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [77 86]},
 :full-name "cljs.repl.server/read-post",
 :full-name-encode "cljs.repl.server/read-post",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-post"]))
```

-->
