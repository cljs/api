## cljs.core/find-ns



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/find-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find-ns)
</td>
</tr>
</table>


 <samp>
(__find-ns__ ns)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L10174-L10184):

```clj
(defn find-ns [ns]
  (when (nil? NS_CACHE)
    (set! NS_CACHE (atom {})))
  (let [the-ns (get @NS_CACHE ns)]
    (if-not (nil? the-ns)
      the-ns
      (let [ns-obj (find-ns-obj ns)]
        (when-not (nil? ns-obj)
          (let [new-ns (create-ns ns ns-obj)]
            (swap! NS_CACHE assoc ns new-ns)
            new-ns))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:10174-10184](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L10174-L10184)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/find-ns` @ clojuredocs](http://clojuredocs.org/clojure.core/find-ns)<br>
[`clojure.core/find-ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/find-ns/)<br>
[`clojure.core/find-ns` @ crossclj](http://crossclj.info/fun/clojure.core/find-ns.html)<br>
[`cljs.core/find-ns` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/find-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/find-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "find-ns",
 :signature ["[ns]"],
 :history [["+" "1.7.10"]],
 :type "function",
 :full-name-encode "cljs.core/find-ns",
 :source {:code "(defn find-ns [ns]\n  (when (nil? NS_CACHE)\n    (set! NS_CACHE (atom {})))\n  (let [the-ns (get @NS_CACHE ns)]\n    (if-not (nil? the-ns)\n      the-ns\n      (let [ns-obj (find-ns-obj ns)]\n        (when-not (nil? ns-obj)\n          (let [new-ns (create-ns ns ns-obj)]\n            (swap! NS_CACHE assoc ns new-ns)\n            new-ns))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [10174 10184]},
 :full-name "cljs.core/find-ns",
 :clj-symbol "clojure.core/find-ns"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/find-ns"]))
```

-->
