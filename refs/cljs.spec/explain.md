## cljs.spec/explain



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.9.14"><img valign="middle" alt="[+] 1.9.14" title="Added in 1.9.14" src="https://img.shields.io/badge/+-1.9.14-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.spec/explain</samp>](http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/explain)
</td>
</tr>
</table>

<samp>(explain spec x)</samp><br>

---

 <samp>
(__explain__ spec x)<br>
</samp>

---





Source docstring:

```
Given a spec and a value that fails to conform, prints an explanation to *out*.
```


Source code @ [github]():

```clj
(defn explain
  [spec x]
  (explain-out (explain-data spec x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.spec/explain` @ clojuredocs](http://clojuredocs.org/clojure.spec/explain)<br>
[`clojure.spec/explain` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.spec/explain/)<br>
[`clojure.spec/explain` @ crossclj](http://crossclj.info/fun/clojure.spec/explain.html)<br>
[`cljs.spec/explain` @ crossclj](http://crossclj.info/fun/cljs.spec.cljs/explain.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.spec",
 :name "explain",
 :signature ["[spec x]"],
 :name-encode "explain",
 :history [["+" "1.9.14"]],
 :type "function",
 :clj-equiv {:full-name "clojure.spec/explain",
             :url "http://clojure.github.io/clojure/branch-master/clojure.spec-api.html#clojure.spec/explain"},
 :full-name-encode "cljs.spec/explain",
 :source {:code "(defn explain\n  [spec x]\n  (explain-out (explain-data spec x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/spec.cljs",
          :lines [186 189],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/spec.cljs#L186-L189"},
 :usage ["(explain spec x)"],
 :full-name "cljs.spec/explain",
 :docstring "Given a spec and a value that fails to conform, prints an explanation to *out*.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.spec/explain.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.spec/explain"]))
```

-->
