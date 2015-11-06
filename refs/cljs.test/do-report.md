## cljs.test/do-report



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/do-report</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/do-report)
</td>
</tr>
</table>


 <samp>
(__do-report__ m)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/test.cljs#L389-L394):

```clj
(defn do-report [m]
  (let [m (case (:type m)
            :fail (merge (file-and-line (js/Error.) 4) m)
            :error (merge (file-and-line (:actual m) 0) m)
            m)]
    (report m)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2985
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:389-394](https://github.com/clojure/clojurescript/blob/r2985/src/cljs/cljs/test.cljs#L389-L394)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/do-report` @ clojuredocs](http://clojuredocs.org/clojure.test/do-report)<br>
[`clojure.test/do-report` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/do-report/)<br>
[`clojure.test/do-report` @ crossclj](http://crossclj.info/fun/clojure.test/do-report.html)<br>
[`cljs.test/do-report` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/do-report.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/do-report.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "do-report",
 :signature ["[m]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/do-report",
 :source {:code "(defn do-report [m]\n  (let [m (case (:type m)\n            :fail (merge (file-and-line (js/Error.) 4) m)\n            :error (merge (file-and-line (:actual m) 0) m)\n            m)]\n    (report m)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/cljs/cljs/test.cljs",
          :lines [389 394]},
 :full-name "cljs.test/do-report",
 :clj-symbol "clojure.test/do-report"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/do-report"]))
```

-->
