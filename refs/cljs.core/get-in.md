## cljs.core/get-in



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get-in)
</td>
</tr>
</table>


 <samp>
(__get-in__ m ks)<br>
</samp>
 <samp>
(__get-in__ m ks not-found)<br>
</samp>

---

Returns the value in a nested associative structure, where `ks` is a sequence of
keys.

Returns nil if the key is not found, or `not-found` if supplied.



---


###### See Also:

[`cljs.core/assoc-in`](../cljs.core/assoc-in.md)<br>
[`cljs.core/update-in`](../cljs.core/update-in.md)<br>
[`cljs.core/find`](../cljs.core/find.md)<br>
[`cljs.core/get`](../cljs.core/get.md)<br>

---


Source docstring:

```
Returns the value in a nested associative structure,
where ks is a sequence of keys. Returns nil if the key is not present,
or the not-found value if supplied.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L4671-L4690):

```clj
(defn get-in
  ([m ks]
     (reduce get m ks))
  ([m ks not-found]
     (loop [sentinel lookup-sentinel
            m m
            ks (seq ks)]
       (if ks
         (if (not (satisfies? ILookup m))
           not-found
           (let [m (get m (first ks) sentinel)]
             (if (identical? sentinel m)
               not-found
               (recur sentinel m (next ks)))))
         m))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4671-4690](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L4671-L4690)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/get-in` @ clojuredocs](http://clojuredocs.org/clojure.core/get-in)<br>
[`clojure.core/get-in` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/get-in/)<br>
[`clojure.core/get-in` @ crossclj](http://crossclj.info/fun/clojure.core/get-in.html)<br>
[`cljs.core/get-in` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/get-in.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/get-in.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the value in a nested associative structure, where `ks` is a sequence of\nkeys.\n\nReturns nil if the key is not found, or `not-found` if supplied.",
 :ns "cljs.core",
 :name "get-in",
 :signature ["[m ks]" "[m ks not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc-in"
           "cljs.core/update-in"
           "cljs.core/find"
           "cljs.core/get"],
 :full-name-encode "cljs.core/get-in",
 :source {:code "(defn get-in\n  ([m ks]\n     (reduce get m ks))\n  ([m ks not-found]\n     (loop [sentinel lookup-sentinel\n            m m\n            ks (seq ks)]\n       (if ks\n         (if (not (satisfies? ILookup m))\n           not-found\n           (let [m (get m (first ks) sentinel)]\n             (if (identical? sentinel m)\n               not-found\n               (recur sentinel m (next ks)))))\n         m))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4671 4690]},
 :full-name "cljs.core/get-in",
 :clj-symbol "clojure.core/get-in",
 :docstring "Returns the value in a nested associative structure,\nwhere ks is a sequence of keys. Returns nil if the key is not present,\nor the not-found value if supplied."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/get-in"]))
```

-->
