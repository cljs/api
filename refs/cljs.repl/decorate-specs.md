## cljs.repl/decorate-specs



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" title="Added in 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(decorate-specs specs)</samp><br>

---

 <samp>
(__decorate-specs__ specs)<br>
</samp>

---







Source code @ [github]():

```clj
(defn decorate-specs [specs]
  (if-let [k (some #{:reload :reload-all} specs)]
    (->> specs (remove #{k}) (map #(vary-meta % assoc :reload k)))
    specs))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/decorate-specs` @ crossclj](http://crossclj.info/fun/cljs.repl/decorate-specs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/decorate-specs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "decorate-specs",
 :signature ["[specs]"],
 :name-encode "decorate-specs",
 :history [["+" "0.0-3148"]],
 :type "function",
 :full-name-encode "cljs.repl/decorate-specs",
 :source {:code "(defn decorate-specs [specs]\n  (if-let [k (some #{:reload :reload-all} specs)]\n    (->> specs (remove #{k}) (map #(vary-meta % assoc :reload k)))\n    specs))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [587 590],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/repl.cljc#L587-L590"},
 :usage ["(decorate-specs specs)"],
 :full-name "cljs.repl/decorate-specs",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/decorate-specs.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/decorate-specs"]))
```

-->
