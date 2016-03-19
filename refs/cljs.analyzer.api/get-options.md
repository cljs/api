## cljs.analyzer.api/get-options



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__get-options__)<br>
</samp>
 <samp>
(__get-options__ state)<br>
</samp>

---





Source docstring:

```
Return the compiler options from compiler state.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/analyzer/api.clj#L55-L59):

```clj
(defn get-options
  ([] (get-options env/*compiler*))
  ([state]
   (get @state :options)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:55-59](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/analyzer/api.clj#L55-L59)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/get-options` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/get-options.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/get-options.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "get-options",
 :signature ["[]" "[state]"],
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/get-options",
 :source {:code "(defn get-options\n  ([] (get-options env/*compiler*))\n  ([state]\n   (get @state :options)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [55 59]},
 :full-name "cljs.analyzer.api/get-options",
 :docstring "Return the compiler options from compiler state."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/get-options"]))
```

-->
