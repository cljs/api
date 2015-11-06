## cljs.repl/IParseError



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" title="Added in 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L117-L120):

```clj
(defprotocol IParseError
  (-parse-error [repl-env error build-options]
    "Given the original JavaScript error return the error to actually
     use."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:117-120](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L117-L120)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/IParseError` @ crossclj](http://crossclj.info/fun/cljs.repl/IParseError.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IParseError.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IParseError",
 :type "protocol",
 :full-name-encode "cljs.repl/IParseError",
 :source {:code "(defprotocol IParseError\n  (-parse-error [repl-env error build-options]\n    \"Given the original JavaScript error return the error to actually\n     use.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/clj/cljs/repl.clj",
          :lines [117 120]},
 :methods [{:name "-parse-error",
            :signature ["[repl-env error build-options]"],
            :docstring "Given the original JavaScript error return the error to actually\n     use."}],
 :full-name "cljs.repl/IParseError",
 :history [["+" "0.0-3030"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IParseError"]))
```

-->
