## cljs.core/count



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/count</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/count)
</td>
</tr>
</table>


 <samp>
(__count__ x)<br>
</samp>

---

Returns the number of items in `x`.

`count` works on arrays, lists, maps, sets, strings, and vectors.

`(count nil)` returns 0.



---

###### Examples:

```clj
(count [1 2 3])
;;=> 3

(count [])
;;=> 0

(count nil)
;;=> 0

(count #{:a :b})
;;=> 2

(count {:key "value" :key2 "value2"})
;;=> 2
```



---



Source docstring:

```
Returns the number of items in the collection. (count nil) returns
0.  Also works on strings, arrays, and Maps
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L862-L881):

```clj
(defn count
  [coll]
  (if-not (nil? coll)
    (cond
      (implements? ICounted coll)
      (-count ^not-native coll)

      (array? coll)
      (alength coll)
    
      (string? coll)
      (alength coll)

      (native-satisfies? ICounted coll)
      (-count coll)

      :else (accumulating-seq-count coll))
    0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:862-881](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L862-L881)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/count` @ clojuredocs](http://clojuredocs.org/clojure.core/count)<br>
[`clojure.core/count` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/count/)<br>
[`clojure.core/count` @ crossclj](http://crossclj.info/fun/clojure.core/count.html)<br>
[`cljs.core/count` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/count.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/count.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the number of items in `x`.\n\n`count` works on arrays, lists, maps, sets, strings, and vectors.\n\n`(count nil)` returns 0.",
 :ns "cljs.core",
 :name "count",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/count",
 :source {:code "(defn count\n  [coll]\n  (if-not (nil? coll)\n    (cond\n      (implements? ICounted coll)\n      (-count ^not-native coll)\n\n      (array? coll)\n      (alength coll)\n    \n      (string? coll)\n      (alength coll)\n\n      (native-satisfies? ICounted coll)\n      (-count coll)\n\n      :else (accumulating-seq-count coll))\n    0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [862 881]},
 :examples [{:id "96e470",
             :content "```clj\n(count [1 2 3])\n;;=> 3\n\n(count [])\n;;=> 0\n\n(count nil)\n;;=> 0\n\n(count #{:a :b})\n;;=> 2\n\n(count {:key \"value\" :key2 \"value2\"})\n;;=> 2\n```"}],
 :full-name "cljs.core/count",
 :clj-symbol "clojure.core/count",
 :docstring "Returns the number of items in the collection. (count nil) returns\n0.  Also works on strings, arrays, and Maps"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/count"]))
```

-->
