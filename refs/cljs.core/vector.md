## cljs.core/vector



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector)
</td>
</tr>
</table>


 <samp>
(__vector__ & args)<br>
</samp>

---

Creates a new vector containing `args`.



---


###### See Also:

[`cljs.core/vec`](../cljs.core/vec.md)<br>
[`cljs.core/vector?`](../cljs.core/vectorQMARK.md)<br>
[`cljs.core/pop`](../cljs.core/pop.md)<br>
[`cljs.core/into`](../cljs.core/into.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L3333):

```clj
(defn vector [& args] (vec args))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3333](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L3333)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vector` @ clojuredocs](http://clojuredocs.org/clojure.core/vector)<br>
[`clojure.core/vector` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vector/)<br>
[`clojure.core/vector` @ crossclj](http://crossclj.info/fun/clojure.core/vector.html)<br>
[`cljs.core/vector` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vector.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a new vector containing `args`.",
 :ns "cljs.core",
 :name "vector",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vec"
           "cljs.core/vector?"
           "cljs.core/pop"
           "cljs.core/into"],
 :full-name-encode "cljs.core/vector",
 :source {:code "(defn vector [& args] (vec args))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3333]},
 :full-name "cljs.core/vector",
 :clj-symbol "clojure.core/vector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector"]))
```

-->
