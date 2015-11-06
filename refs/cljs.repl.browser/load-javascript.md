## cljs.repl.browser/load-javascript



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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/repl/browser.clj#L283-L290):

```clj
(defn load-javascript [repl-env ns url]
  (let [missing (remove #(contains? @loaded-libs %) ns)]
    (when (seq missing)
      (let [ret (browser-eval (object-query-str ns))]
        (when-not (and (= (:status ret) :success)
                       (= (:value ret) "true"))
          (browser-eval (slurp url))))
      (swap! loaded-libs (partial apply conj) missing))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:283-290](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/repl/browser.clj#L283-L290)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/load-javascript` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/load-javascript.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/load-javascript.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "load-javascript",
 :type "function",
 :signature ["[repl-env ns url]"],
 :source {:code "(defn load-javascript [repl-env ns url]\n  (let [missing (remove #(contains? @loaded-libs %) ns)]\n    (when (seq missing)\n      (let [ret (browser-eval (object-query-str ns))]\n        (when-not (and (= (:status ret) :success)\n                       (= (:value ret) \"true\"))\n          (browser-eval (slurp url))))\n      (swap! loaded-libs (partial apply conj) missing))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [283 290]},
 :full-name "cljs.repl.browser/load-javascript",
 :full-name-encode "cljs.repl.browser/load-javascript",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/load-javascript"]))
```

-->
