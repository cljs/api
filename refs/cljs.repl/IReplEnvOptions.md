## cljs.repl/IReplEnvOptions



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" title="Added in 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl.cljc#L103-L104):

```clj
(defprotocol IReplEnvOptions
  (-repl-options [repl-env] "Return default REPL options for a REPL Env"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:103-104](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl.cljc#L103-L104)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/IReplEnvOptions` @ crossclj](http://crossclj.info/fun/cljs.repl/IReplEnvOptions.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IReplEnvOptions.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IReplEnvOptions",
 :type "protocol",
 :full-name-encode "cljs.repl/IReplEnvOptions",
 :source {:code "(defprotocol IReplEnvOptions\n  (-repl-options [repl-env] \"Return default REPL options for a REPL Env\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [103 104]},
 :methods [{:name "-repl-options",
            :signature ["[repl-env]"],
            :docstring "Return default REPL options for a REPL Env"}],
 :full-name "cljs.repl/IReplEnvOptions",
 :history [["+" "0.0-2719"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IReplEnvOptions"]))
```

-->
