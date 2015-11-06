## cljs.repl/repl-quit-prompt



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" title="Added in 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-quit-prompt__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/repl.cljc#L729-L730):

```clj
(defn repl-quit-prompt []
  (println "To quit, type:" :cljs/quit))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:729-730](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/repl.cljc#L729-L730)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl-quit-prompt` @ crossclj](http://crossclj.info/fun/cljs.repl/repl-quit-prompt.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl-quit-prompt.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl-quit-prompt",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn repl-quit-prompt []\n  (println \"To quit, type:\" :cljs/quit))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [729 730]},
 :full-name "cljs.repl/repl-quit-prompt",
 :full-name-encode "cljs.repl/repl-quit-prompt",
 :history [["+" "0.0-3148"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-quit-prompt"]))
```

-->
