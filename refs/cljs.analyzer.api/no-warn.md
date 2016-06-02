## cljs.analyzer.api/no-warn



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(no-warn & body)</samp><br>

---

 <samp>
(__no-warn__ & body)<br>
</samp>

---





Source docstring:

```
Disable analyzer warnings for any analysis executed in body.
```


Source code @ [github]():

```clj
(defmacro no-warn
  [& body]
  (let [no-warnings (zipmap (keys ana/*cljs-warnings*) (repeat false))]
    `(binding [ana/*cljs-warnings* ~no-warnings]
       ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/no-warn` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/no-warn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/no-warn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "no-warn",
 :signature ["[& body]"],
 :name-encode "no-warn",
 :history [["+" "0.0-3291"]],
 :type "macro",
 :full-name-encode "cljs.analyzer.api/no-warn",
 :source {:code "(defmacro no-warn\n  [& body]\n  (let [no-warnings (zipmap (keys ana/*cljs-warnings*) (repeat false))]\n    `(binding [ana/*cljs-warnings* ~no-warnings]\n       ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [36 41],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/analyzer/api.cljc#L36-L41"},
 :usage ["(no-warn & body)"],
 :full-name "cljs.analyzer.api/no-warn",
 :docstring "Disable analyzer warnings for any analysis executed in body.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/no-warn.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/no-warn"]))
```

-->
