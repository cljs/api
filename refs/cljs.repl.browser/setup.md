## cljs.repl.browser/setup



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2665"><img valign="middle" alt="[+] 0.0-2665" title="Added in 0.0-2665" src="https://img.shields.io/badge/+-0.0--2665-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__setup__ {:keys \[working-dir\], :as repl-env} opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/repl/browser.clj#L235-L248):

```clj
(defn setup [{:keys [working-dir] :as repl-env} opts]
  (binding [browser-state (:browser-state repl-env)
            ordering (:ordering repl-env)
            es (:es repl-env)
            server/state (:server-state repl-env)]
    (repl/err-out (println "Compiling client js ..."))
    (swap! browser-state
      (fn [old]
        (assoc old :client-js
          (create-client-js-file
            repl-env (io/file working-dir "client.js")))))
    (repl/err-out (println "Waiting for browser to connect ..."))
    opts
    (server/start repl-env)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:235-248](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/repl/browser.clj#L235-L248)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/setup` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/setup.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/setup.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "setup",
 :type "function",
 :signature ["[{:keys [working-dir], :as repl-env} opts]"],
 :source {:code "(defn setup [{:keys [working-dir] :as repl-env} opts]\n  (binding [browser-state (:browser-state repl-env)\n            ordering (:ordering repl-env)\n            es (:es repl-env)\n            server/state (:server-state repl-env)]\n    (repl/err-out (println \"Compiling client js ...\"))\n    (swap! browser-state\n      (fn [old]\n        (assoc old :client-js\n          (create-client-js-file\n            repl-env (io/file working-dir \"client.js\")))))\n    (repl/err-out (println \"Waiting for browser to connect ...\"))\n    opts\n    (server/start repl-env)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [235 248]},
 :full-name "cljs.repl.browser/setup",
 :full-name-encode "cljs.repl.browser/setup",
 :history [["+" "0.0-2665"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/setup"]))
```

-->
