## clojure.core.reducers/take-while



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/take-while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/take-while)
</td>
</tr>
</table>


 <samp>
(__take-while__ pred)<br>
</samp>
 <samp>
(__take-while__ pred coll)<br>
</samp>

---





Source docstring:

```
Ends the reduction of coll when (pred val) returns logical false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/clojure/core/reducers.cljs#L152-L162):

```clj
(defcurried take-while
  "Ends the reduction of coll when (pred val) returns logical false."
  {}
  [pred coll]
  (reducer coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               (reduced ret)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:152-162](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/clojure/core/reducers.cljs#L152-L162)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/take-while` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/take-while)<br>
[`clojure.core.reducers/take-while` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/take-while/)<br>
[`clojure.core.reducers/take-while` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/take-while.html)<br>
[`clojure.core.reducers/take-while` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/take-while.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/take-while.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "take-while",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/take-while",
 :source {:code "(defcurried take-while\n  \"Ends the reduction of coll when (pred val) returns logical false.\"\n  {}\n  [pred coll]\n  (reducer coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               (reduced ret)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [152 162]},
 :full-name "clojure.core.reducers/take-while",
 :clj-symbol "clojure.core.reducers/take-while",
 :docstring "Ends the reduction of coll when (pred val) returns logical false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/take-while"]))
```

-->
