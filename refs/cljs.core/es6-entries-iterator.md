## cljs.core/es6-entries-iterator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(es6-entries-iterator coll)</samp><br>

---

 <samp>
(__es6-entries-iterator__ coll)<br>
</samp>

---







Source code @ [github]():

```clj
(defn es6-entries-iterator [coll]
  (ES6EntriesIterator. (seq coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.core/es6-entries-iterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/es6-entries-iterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/es6-entries-iterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "es6-entries-iterator",
 :signature ["[coll]"],
 :name-encode "es6-entries-iterator",
 :history [["+" "0.0-2371"]],
 :type "function",
 :full-name-encode "cljs.core/es6-entries-iterator",
 :source {:code "(defn es6-entries-iterator [coll]\n  (ES6EntriesIterator. (seq coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [5847 5848],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/core.cljs#L5847-L5848"},
 :usage ["(es6-entries-iterator coll)"],
 :full-name "cljs.core/es6-entries-iterator",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/es6-entries-iterator.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/es6-entries-iterator"]))
```

-->
