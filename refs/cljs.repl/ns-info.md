## cljs.repl/ns-info



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(ns-info f)</samp><br>

---

 <samp>
(__ns-info__ f)<br>
</samp>

---





Source docstring:

```
Given a path to a js source file return the ns info for the corresponding
ClojureScript file if it exists.
```


Source code @ [github]():

```clj
(defn ns-info
  [f]
  (let [f' (js-src->cljs-src f)]
    (when (and f' (.exists f'))
      (ana/parse-ns f'))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/ns-info` @ crossclj](http://crossclj.info/fun/cljs.repl/ns-info.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/ns-info.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "ns-info",
 :signature ["[f]"],
 :name-encode "ns-info",
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl/ns-info",
 :source {:code "(defn ns-info\n  [f]\n  (let [f' (js-src->cljs-src f)]\n    (when (and f' (.exists f'))\n      (ana/parse-ns f'))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [253 259],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/repl.cljc#L253-L259"},
 :usage ["(ns-info f)"],
 :full-name "cljs.repl/ns-info",
 :docstring "Given a path to a js source file return the ns info for the corresponding\nClojureScript file if it exists.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/ns-info.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/ns-info"]))
```

-->
