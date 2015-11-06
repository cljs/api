## cljs.test/inc-report-counter!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__inc-report-counter!__ name)<br>
</samp>

---





Source docstring:

```
Increments the named counter in *report-counters*, a ref to a map.
Does nothing if *report-counters* is nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/test.cljs#L305-L310):

```clj
(defn inc-report-counter!
  [name]
  (if (:report-counters (get-current-env))
    (update-current-env! [:report-counters name] (fnil inc 0))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:305-310](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/test.cljs#L305-L310)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/inc-report-counter!` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/inc-report-counter%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/inc-report-counterBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "inc-report-counter!",
 :signature ["[name]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/inc-report-counterBANG",
 :source {:code "(defn inc-report-counter!\n  [name]\n  (if (:report-counters (get-current-env))\n    (update-current-env! [:report-counters name] (fnil inc 0))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [305 310]},
 :full-name "cljs.test/inc-report-counter!",
 :docstring "Increments the named counter in *report-counters*, a ref to a map.\nDoes nothing if *report-counters* is nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/inc-report-counter!"]))
```

-->
