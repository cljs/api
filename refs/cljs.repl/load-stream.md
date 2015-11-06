## cljs.repl/load-stream



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-stream__ repl-env filename stream)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl.clj#L87-L96):

```clj
(defn load-stream [repl-env filename stream]
  (with-open [r (io/reader stream)]
    (let [env {:ns (@comp/namespaces comp/*cljs-ns*) :context :statement :locals {}}
          pbr (clojure.lang.LineNumberingPushbackReader. r)
          eof (Object.)]
      (loop [r (read pbr false eof false)]
        (let [env (assoc env :ns (@comp/namespaces comp/*cljs-ns*))]
          (when-not (identical? eof r)
            (evaluate-form repl-env env filename r)
            (recur (read pbr false eof false))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:87-96](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/repl.clj#L87-L96)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/load-stream` @ crossclj](http://crossclj.info/fun/cljs.repl/load-stream.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/load-stream.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "load-stream",
 :type "function",
 :signature ["[repl-env filename stream]"],
 :source {:code "(defn load-stream [repl-env filename stream]\n  (with-open [r (io/reader stream)]\n    (let [env {:ns (@comp/namespaces comp/*cljs-ns*) :context :statement :locals {}}\n          pbr (clojure.lang.LineNumberingPushbackReader. r)\n          eof (Object.)]\n      (loop [r (read pbr false eof false)]\n        (let [env (assoc env :ns (@comp/namespaces comp/*cljs-ns*))]\n          (when-not (identical? eof r)\n            (evaluate-form repl-env env filename r)\n            (recur (read pbr false eof false))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/clj/cljs/repl.clj",
          :lines [87 96]},
 :full-name "cljs.repl/load-stream",
 :full-name-encode "cljs.repl/load-stream",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-stream"]))
```

-->
