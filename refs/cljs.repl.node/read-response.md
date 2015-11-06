## cljs.repl.node/read-response



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-response__ in)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl/node.clj#L40-L50):

```clj
(defn read-response [^BufferedReader in]
  (let [sb (StringBuilder.)]
    (loop [sb sb c (.read in)]
      (cond
       (= c 1) (let [ret (str sb)]
                 (print ret)
                 (recur (StringBuilder.) (.read in)))
       (= c 0) (str sb)
       :else (do
               (.append sb (char c))
               (recur sb (.read in)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:40-50](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/repl/node.clj#L40-L50)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/read-response` @ crossclj](http://crossclj.info/fun/cljs.repl.node/read-response.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/read-response.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "read-response",
 :type "function",
 :signature ["[in]"],
 :source {:code "(defn read-response [^BufferedReader in]\n  (let [sb (StringBuilder.)]\n    (loop [sb sb c (.read in)]\n      (cond\n       (= c 1) (let [ret (str sb)]\n                 (print ret)\n                 (recur (StringBuilder.) (.read in)))\n       (= c 0) (str sb)\n       :else (do\n               (.append sb (char c))\n               (recur sb (.read in)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [40 50]},
 :full-name "cljs.repl.node/read-response",
 :full-name-encode "cljs.repl.node/read-response",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/read-response"]))
```

-->
