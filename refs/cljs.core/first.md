## cljs.core/first



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/first</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/first)
</td>
</tr>
</table>


 <samp>
(__first__ coll)<br>
</samp>

---

Returns the first item in `coll` and calls `seq` on its argument.

Returns nil when `coll` is nil.



---

###### Examples:

```clj
(first [1 2 3])
;;=> 1

(first [])
;;=> nil
```



---

###### See Also:

[`cljs.core/rest`](../cljs.core/rest.md)<br>
[`cljs.core/next`](../cljs.core/next.md)<br>
[`cljs.core/nth`](../cljs.core/nth.md)<br>
[`cljs.core/second`](../cljs.core/second.md)<br>
[`cljs.core/take`](../cljs.core/take.md)<br>
[`cljs.core/ffirst`](../cljs.core/ffirst.md)<br>

---


Source docstring:

```
Returns the first item in the collection. Calls seq on its
argument. If coll is nil, returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L636-L645):

```clj
(defn first
  [coll]
  (when-not (nil? coll)
    (if (implements? ISeq coll)
      (-first ^not-native coll)
      (let [s (seq coll)]
        (when-not (nil? s)
          (-first s))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:636-645](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L636-L645)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/first` @ clojuredocs](http://clojuredocs.org/clojure.core/first)<br>
[`clojure.core/first` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/first/)<br>
[`clojure.core/first` @ crossclj](http://crossclj.info/fun/clojure.core/first.html)<br>
[`cljs.core/first` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/first.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/first.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the first item in `coll` and calls `seq` on its argument.\n\nReturns nil when `coll` is nil.",
 :ns "cljs.core",
 :name "first",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rest"
           "cljs.core/next"
           "cljs.core/nth"
           "cljs.core/second"
           "cljs.core/take"
           "cljs.core/ffirst"],
 :full-name-encode "cljs.core/first",
 :source {:code "(defn first\n  [coll]\n  (when-not (nil? coll)\n    (if (implements? ISeq coll)\n      (-first ^not-native coll)\n      (let [s (seq coll)]\n        (when-not (nil? s)\n          (-first s))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [636 645]},
 :examples [{:id "40e413",
             :content "```clj\n(first [1 2 3])\n;;=> 1\n\n(first [])\n;;=> nil\n```"}],
 :full-name "cljs.core/first",
 :clj-symbol "clojure.core/first",
 :docstring "Returns the first item in the collection. Calls seq on its\nargument. If coll is nil, returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/first"]))
```

-->
