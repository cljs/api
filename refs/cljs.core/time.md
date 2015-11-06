## cljs.core/time



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/time</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/time)
</td>
</tr>
</table>


 <samp>
(__time__ expr)<br>
</samp>

---





Source docstring:

```
Evaluates expr and prints the time it took. Returns the value of expr.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/core.clj#L1595-L1601):

```clj
(defmacro time
  [expr]
  `(let [start# (.getTime (js/Date.))
         ret# ~expr]
     (prn (core/str "Elapsed time: " (- (.getTime (js/Date.)) start#) " msecs"))
     ret#))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1595-1601](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/core.clj#L1595-L1601)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/time` @ clojuredocs](http://clojuredocs.org/clojure.core/time)<br>
[`clojure.core/time` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/time/)<br>
[`clojure.core/time` @ crossclj](http://crossclj.info/fun/clojure.core/time.html)<br>
[`cljs.core/time` @ crossclj](http://crossclj.info/fun/cljs.core/time.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/time.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "time",
 :signature ["[expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core/time",
 :source {:code "(defmacro time\n  [expr]\n  `(let [start# (.getTime (js/Date.))\n         ret# ~expr]\n     (prn (core/str \"Elapsed time: \" (- (.getTime (js/Date.)) start#) \" msecs\"))\n     ret#))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/core.clj",
          :lines [1595 1601]},
 :full-name "cljs.core/time",
 :clj-symbol "clojure.core/time",
 :docstring "Evaluates expr and prints the time it took. Returns the value of expr."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/time"]))
```

-->
