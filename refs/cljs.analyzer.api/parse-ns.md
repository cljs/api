## cljs.analyzer.api/parse-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-ns__ src)<br>
</samp>
 <samp>
(__parse-ns__ src opts)<br>
</samp>
 <samp>
(__parse-ns__ src dest opts)<br>
</samp>

---





Source docstring:

```
Helper for parsing only the essential namespace information from a
ClojureScript source file and returning a cljs.closure/IJavaScript compatible
map _not_ a namespace AST node.

By default does not load macros or perform any analysis of dependencies. If
opts parameter provided :analyze-deps and :load-macros keys their values will
be used for *analyze-deps* and *load-macros* bindings respectively. This
function does _not_ side-effect the ambient compilation environment unless
requested via opts where :restore is false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/analyzer/api.clj#L40-L52):

```clj
(defn parse-ns
  ([src] (ana/parse-ns src nil nil))
  ([src opts] (ana/parse-ns src nil opts))
  ([src dest opts] (ana/parse-ns src dest opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:40-52](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/analyzer/api.clj#L40-L52)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/parse-ns` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/parse-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/parse-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "parse-ns",
 :signature ["[src]" "[src opts]" "[src dest opts]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/parse-ns",
 :source {:code "(defn parse-ns\n  ([src] (ana/parse-ns src nil nil))\n  ([src opts] (ana/parse-ns src nil opts))\n  ([src dest opts] (ana/parse-ns src dest opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [40 52]},
 :full-name "cljs.analyzer.api/parse-ns",
 :docstring "Helper for parsing only the essential namespace information from a\nClojureScript source file and returning a cljs.closure/IJavaScript compatible\nmap _not_ a namespace AST node.\n\nBy default does not load macros or perform any analysis of dependencies. If\nopts parameter provided :analyze-deps and :load-macros keys their values will\nbe used for *analyze-deps* and *load-macros* bindings respectively. This\nfunction does _not_ side-effect the ambient compilation environment unless\nrequested via opts where :restore is false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/parse-ns"]))
```

-->
