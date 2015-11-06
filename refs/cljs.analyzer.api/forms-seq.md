## cljs.analyzer.api/forms-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" title="Added in 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__forms-seq__ rdr)<br>
</samp>
 <samp>
(__forms-seq__ rdr filename)<br>
</samp>

---





Source docstring:

```
Seq of Clojure/ClojureScript forms from rdr, a java.io.Reader. Optionally
accepts a filename argument which will be used in any emitted errors.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer/api.clj#L41-L45):

```clj
(defn forms-seq
  ([rdr] (ana/forms-seq* rdr nil))
  ([rdr filename] (ana/forms-seq* rdr filename)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:41-45](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer/api.clj#L41-L45)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/forms-seq` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/forms-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/forms-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "forms-seq",
 :signature ["[rdr]" "[rdr filename]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/forms-seq",
 :source {:code "(defn forms-seq\n  ([rdr] (ana/forms-seq* rdr nil))\n  ([rdr filename] (ana/forms-seq* rdr filename)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [41 45]},
 :full-name "cljs.analyzer.api/forms-seq",
 :docstring "Seq of Clojure/ClojureScript forms from rdr, a java.io.Reader. Optionally\naccepts a filename argument which will be used in any emitted errors."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/forms-seq"]))
```

-->
