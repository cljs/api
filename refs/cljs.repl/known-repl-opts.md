## cljs.repl/known-repl-opts



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.8.34"><img valign="middle" alt="[+] 1.8.34" title="Added in 1.8.34" src="https://img.shields.io/badge/+-1.8.34-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(def known-repl-opts
  "Set of all known REPL options."
  #{:analyze-path :bind-err :caught :compiler-env :def-emits-var :eval :flush
    :init :need-prompt :print :print-no-newline :prompt :quit-prompt :read
    :reader :repl-requires :repl-verbose :source-map-inline :watch :watch-fn
    :wrap})
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/known-repl-opts` @ crossclj](http://crossclj.info/fun/cljs.repl/known-repl-opts.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/known-repl-opts.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "known-repl-opts",
 :name-encode "known-repl-opts",
 :history [["+" "1.8.34"]],
 :type "var",
 :full-name-encode "cljs.repl/known-repl-opts",
 :source {:code "(def known-repl-opts\n  \"Set of all known REPL options.\"\n  #{:analyze-path :bind-err :caught :compiler-env :def-emits-var :eval :flush\n    :init :need-prompt :print :print-no-newline :prompt :quit-prompt :read\n    :reader :repl-requires :repl-verbose :source-map-inline :watch :watch-fn\n    :wrap})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [40 45],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl.cljc#L40-L45"},
 :full-name "cljs.repl/known-repl-opts",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/known-repl-opts.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/known-repl-opts"]))
```

-->
