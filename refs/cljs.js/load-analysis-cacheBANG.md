## cljs.js/load-analysis-cache!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(load-analysis-cache! state ns cache)</samp><br>

---

 <samp>
(__load-analysis-cache!__ state ns cache)<br>
</samp>

---







Source code @ [github]():

```clj
(defn load-analysis-cache! [state ns cache]
  (swap! state assoc-in [::ana/namespaces ns] cache))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.js/load-analysis-cache!` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/load-analysis-cache%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/load-analysis-cacheBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "load-analysis-cache!",
 :signature ["[state ns cache]"],
 :name-encode "load-analysis-cacheBANG",
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.js/load-analysis-cacheBANG",
 :source {:code "(defn load-analysis-cache! [state ns cache]\n  (swap! state assoc-in [::ana/namespaces ns] cache))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [121 122],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/js.cljs#L121-L122"},
 :usage ["(load-analysis-cache! state ns cache)"],
 :full-name "cljs.js/load-analysis-cache!",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/load-analysis-cacheBANG.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/load-analysis-cache!"]))
```

-->
