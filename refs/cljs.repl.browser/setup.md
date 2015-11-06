## cljs.repl.browser/setup



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2665"><img valign="middle" alt="[+] 0.0-2665" title="Added in 0.0-2665" src="https://img.shields.io/badge/+-0.0--2665-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__setup__ repl-env opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/repl/browser.clj#L194-L198):

```clj
(defn setup [repl-env opts]
  (when (:src repl-env)
    (repl/analyze-source (:src repl-env)))
  (comp/with-core-cljs nil
    (fn [] (server/start repl-env))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:194-198](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/repl/browser.clj#L194-L198)</ins>
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
 :signature ["[repl-env opts]"],
 :source {:code "(defn setup [repl-env opts]\n  (when (:src repl-env)\n    (repl/analyze-source (:src repl-env)))\n  (comp/with-core-cljs nil\n    (fn [] (server/start repl-env))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [194 198]},
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
