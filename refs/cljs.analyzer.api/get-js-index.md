## cljs.analyzer.api/get-js-index



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.122"><img valign="middle" alt="[+] 1.7.122" title="Added in 1.7.122" src="https://img.shields.io/badge/+-1.7.122-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(get-js-index)</samp><br>
<samp>(get-js-index state)</samp><br>

---

 <samp>
(__get-js-index__)<br>
</samp>
 <samp>
(__get-js-index__ state)<br>
</samp>

---





Source docstring:

```
Return the currently computed Google Closure js dependency index from the
compiler state.
```


Source code @ [github]():

```clj
(defn get-js-index
  ([] (get-options env/*compiler*))
  ([state]
   (get @state :js-dependency-index)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.analyzer.api/get-js-index` @ crossclj](http://crossclj.info/fun/cljs.analyzer.api/get-js-index.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/get-js-index.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.analyzer.api",
 :name "get-js-index",
 :signature ["[]" "[state]"],
 :name-encode "get-js-index",
 :history [["+" "1.7.122"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api/get-js-index",
 :source {:code "(defn get-js-index\n  ([] (get-options env/*compiler*))\n  ([state]\n   (get @state :js-dependency-index)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/clojure/cljs/analyzer/api.cljc",
          :lines [61 66],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/clojure/cljs/analyzer/api.cljc#L61-L66"},
 :usage ["(get-js-index)" "(get-js-index state)"],
 :full-name "cljs.analyzer.api/get-js-index",
 :docstring "Return the currently computed Google Closure js dependency index from the\ncompiler state.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api/get-js-index.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/get-js-index"]))
```

-->
