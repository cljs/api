## cljs.spec/explain-data



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/explain-data</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/explain-data)
</td>
</tr>
</table>

<samp>(explain-data spec x)</samp><br>

---

 <samp>
(__explain-data__ spec x)<br>
</samp>

---





Source docstring:

```
Given a spec and a value x which ought to conform, returns nil if x
conforms, else a map with at least the key ::problems whose value is
a path->problem-map, where problem-map has at least :pred and :val
keys describing the predicate and the value that failed at that
path.
```


Source code @ [github]():

```clj
(defn explain-data
  [spec x]
  (explain-data* spec [] (if-let [name (spec-name spec)] [name] []) [] x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/explain-data` @ clojuredocs](http://clojuredocs.org/clojure.spec/explain-data)<br>
[`clojure.spec/explain-data` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/explain-data/)<br>
[`clojure.spec/explain-data` @ crossclj](http://crossclj.info/fun/clojure.spec/explain-data.html)<br>
[`cljs.spec/explain-data` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/explain-data.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-data.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "explain-data",
 :signature ["[spec x]"],
 :name-encode "explain-data",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/explain-data",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/explain-data"},
 :full-name-encode "cljs.spec/explain-data",
 :source {:code "(defn explain-data\n  [spec x]\n  (explain-data* spec [] (if-let [name (spec-name spec)] [name] []) [] x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [149 156],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/spec.cljs#L149-L156"},
 :usage ["(explain-data spec x)"],
 :full-name "cljs.spec/explain-data",
 :docstring "Given a spec and a value x which ought to conform, returns nil if x\nconforms, else a map with at least the key ::problems whose value is\na path->problem-map, where problem-map has at least :pred and :val\nkeys describing the predicate and the value that failed at that\npath.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain-data.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/explain-data"]))
```

-->
