## cljs.core/newline



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/newline)
</td>
</tr>
</table>


 <samp>
(__newline__ opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L8595-L8598):

```clj
(defn newline [opts]
  (string-print "\n")
  (when (get opts :flush-on-newline)
    (flush)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8595-8598](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/core.cljs#L8595-L8598)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/newline` @ clojuredocs](http://clojuredocs.org/clojure.core/newline)<br>
[`clojure.core/newline` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/newline/)<br>
[`clojure.core/newline` @ crossclj](http://crossclj.info/fun/clojure.core/newline.html)<br>
[`cljs.core/newline` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/newline.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/newline.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "newline",
 :signature ["[opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/newline",
 :source {:code "(defn newline [opts]\n  (string-print \"\\n\")\n  (when (get opts :flush-on-newline)\n    (flush)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8595 8598]},
 :full-name "cljs.core/newline",
 :clj-symbol "clojure.core/newline"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/newline"]))
```

-->
