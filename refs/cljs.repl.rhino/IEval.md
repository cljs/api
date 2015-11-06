## cljs.repl.rhino/IEval



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/repl/rhino.clj#L25-L26):

```clj
(defprotocol IEval
  (-eval [this env filename line]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:25-26](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/repl/rhino.clj#L25-L26)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/IEval` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/IEval.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/IEval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "IEval",
 :type "protocol",
 :full-name-encode "cljs.repl.rhino/IEval",
 :source {:code "(defprotocol IEval\n  (-eval [this env filename line]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [25 26]},
 :methods [{:name "-eval",
            :signature ["[this env filename line]"],
            :docstring nil}],
 :full-name "cljs.repl.rhino/IEval",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/IEval"]))
```

-->
