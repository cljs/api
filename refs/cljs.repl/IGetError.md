## cljs.repl/IGetError



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L122-L132):

```clj
(defprotocol IGetError
  (-get-error [repl-env name env build-options]
    "Given a symbol representing a var holding an error, an analysis
     environment, and the REPL/compiler options return the canonical error
     representation:

     {:value <string>
      :stacktrace <string>}

    :value should be the host environment JavaScript error message string.
    :stacktrace should be the host JavaScript environment stacktrace string."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:122-132](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/repl.clj#L122-L132)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/IGetError` @ crossclj](http://crossclj.info/fun/cljs.repl/IGetError.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/IGetError.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "IGetError",
 :type "protocol",
 :full-name-encode "cljs.repl/IGetError",
 :source {:code "(defprotocol IGetError\n  (-get-error [repl-env name env build-options]\n    \"Given a symbol representing a var holding an error, an analysis\n     environment, and the REPL/compiler options return the canonical error\n     representation:\n\n     {:value <string>\n      :stacktrace <string>}\n\n    :value should be the host environment JavaScript error message string.\n    :stacktrace should be the host JavaScript environment stacktrace string.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/repl.clj",
          :lines [122 132]},
 :methods [{:name "-get-error",
            :signature ["[repl-env name env build-options]"],
            :docstring "Given a symbol representing a var holding an error, an analysis\n     environment, and the REPL/compiler options return the canonical error\n     representation:\n\n     {:value <string>\n      :stacktrace <string>}\n\n    :value should be the host environment JavaScript error message string.\n    :stacktrace should be the host JavaScript environment stacktrace string."}],
 :full-name "cljs.repl/IGetError",
 :history [["+" "0.0-2985"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/IGetError"]))
```

-->
