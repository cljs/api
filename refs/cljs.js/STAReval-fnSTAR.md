## cljs.js/\*eval-fn\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Each runtime environment provides various ways to eval JavaScript
source. Whatever function *eval-fn* is bound to will be passed a map
containing the following keys:

:source - the source of the library (string)
:name   - used to unique identify the script (symbol)
:cache  - if the source was originally ClojureScript, will be given the
          analysis cache.

The result of evaluation should be the return value.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/js.cljs#L79-L93):

```clj
(defonce
  ^{:doc "Each runtime environment provides various ways to eval JavaScript
  source. Whatever function *eval-fn* is bound to will be passed a map
  containing the following keys:

  :source - the source of the library (string)
  :name   - used to unique identify the script (symbol)
  :cache  - if the source was originally ClojureScript, will be given the
            analysis cache.

  The result of evaluation should be the return value."
    :dynamic true}
  *eval-fn*
  (fn [js-source]
    (throw (js/Error. "No *eval-fn* set"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:79-93](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/js.cljs#L79-L93)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/*eval-fn*` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/*eval-fn*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/STAReval-fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "*eval-fn*",
 :docstring "Each runtime environment provides various ways to eval JavaScript\nsource. Whatever function *eval-fn* is bound to will be passed a map\ncontaining the following keys:\n\n:source - the source of the library (string)\n:name   - used to unique identify the script (symbol)\n:cache  - if the source was originally ClojureScript, will be given the\n          analysis cache.\n\nThe result of evaluation should be the return value.",
 :type "dynamic var",
 :source {:code "(defonce\n  ^{:doc \"Each runtime environment provides various ways to eval JavaScript\n  source. Whatever function *eval-fn* is bound to will be passed a map\n  containing the following keys:\n\n  :source - the source of the library (string)\n  :name   - used to unique identify the script (symbol)\n  :cache  - if the source was originally ClojureScript, will be given the\n            analysis cache.\n\n  The result of evaluation should be the return value.\"\n    :dynamic true}\n  *eval-fn*\n  (fn [js-source]\n    (throw (js/Error. \"No *eval-fn* set\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [79 93]},
 :full-name "cljs.js/*eval-fn*",
 :full-name-encode "cljs.js/STAReval-fnSTAR",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/*eval-fn*"]))
```

-->
