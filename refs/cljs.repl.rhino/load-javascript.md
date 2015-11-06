## cljs.repl.rhino/load-javascript



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-javascript__ repl-env ns url)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/repl/rhino.clj#L96-L101):

```clj
(defn load-javascript [repl-env ns url]
  (try
    (with-open [reader (io/reader url)]
      (-eval reader repl-env (.toString url) 1))
    ;; TODO: don't show errors for goog/base.js line number 105
    (catch Throwable ex (println (.getMessage ex)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:96-101](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/repl/rhino.clj#L96-L101)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/load-javascript` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/load-javascript.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/load-javascript.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "load-javascript",
 :type "function",
 :signature ["[repl-env ns url]"],
 :source {:code "(defn load-javascript [repl-env ns url]\n  (try\n    (with-open [reader (io/reader url)]\n      (-eval reader repl-env (.toString url) 1))\n    ;; TODO: don't show errors for goog/base.js line number 105\n    (catch Throwable ex (println (.getMessage ex)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [96 101]},
 :full-name "cljs.repl.rhino/load-javascript",
 :full-name-encode "cljs.repl.rhino/load-javascript",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/load-javascript"]))
```

-->
