## cljs.analyzer.api/default-warning-handler



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(default-warning-handler warning-type env extra)</samp><br>

---

 <samp>
(__default-warning-handler__ warning-type env extra)<br>
</samp>

---





Source docstring:

```
The default warning handler.

Outputs the warning messages to *err*.
```


Source code @ [github]():

```clj
(defn default-warning-handler
  [warning-type env extra]
  (ana/default-warning-handler warning-type env extra))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/default-warning-handler` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/default-warning-handler.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/default-warning-handler.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "default-warning-handler",
 :signature ["[warning-type env extra]"],
 :name-encode "default-warning-handler",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/default-warning-handler",
 :source {:code "(defn default-warning-handler\n  [warning-type env extra]\n  (ana/default-warning-handler warning-type env extra))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [48 53],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/analyzer/api.cljc#L48-L53"},
 :usage ["(default-warning-handler warning-type env extra)"],
 :full-name "cljs.analyzer.api/default-warning-handler",
 :docstring "The default warning handler.\n\nOutputs the warning messages to *err*.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/default-warning-handler.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/default-warning-handler"]))
```

-->
