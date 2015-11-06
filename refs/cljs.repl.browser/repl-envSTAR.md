## cljs.repl.browser/repl-env\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" title="Added in 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env\*__ {:keys \[output-dir\], :as opts})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl/browser.clj#L524-L535):

```clj
(defn repl-env*
  [{:keys [output-dir] :as opts}]
  (merge (BrowserEnv.)
    {:port 9000
     :working-dir (->> [".repl" (util/clojurescript-version)]
                       (remove empty?) (string/join "-"))
     :serve-static true
     :static-dir (cond-> ["." "out/"] output-dir (conj output-dir))
     :preloaded-libs []
     :optimizations :simple
     :src "src/"}
    opts))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:524-535](https://github.com/clojure/clojurescript/blob/r3123/src/clj/cljs/repl/browser.clj#L524-L535)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/repl-env*` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/repl-env*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/repl-envSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "repl-env*",
 :type "function",
 :signature ["[{:keys [output-dir], :as opts}]"],
 :source {:code "(defn repl-env*\n  [{:keys [output-dir] :as opts}]\n  (merge (BrowserEnv.)\n    {:port 9000\n     :working-dir (->> [\".repl\" (util/clojurescript-version)]\n                       (remove empty?) (string/join \"-\"))\n     :serve-static true\n     :static-dir (cond-> [\".\" \"out/\"] output-dir (conj output-dir))\n     :preloaded-libs []\n     :optimizations :simple\n     :src \"src/\"}\n    opts))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [524 535]},
 :full-name "cljs.repl.browser/repl-env*",
 :full-name-encode "cljs.repl.browser/repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env*"]))
```

-->
