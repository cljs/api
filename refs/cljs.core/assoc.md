## cljs.core/assoc

_known as "associate"_


 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc)
</td>
</tr>
</table>


 <samp>
(__assoc__ coll k v)<br>
</samp>
 <samp>
(__assoc__ coll k v & kvs)<br>
</samp>

---

assoc(iate)

When applied to a map, returns a new map that contains the mapping of key(s) to
val(s).

Has no effect on the map type (hashed/sorted).

When applied to a vector, returns a new vector that contains value `v` at index
`k`.



---

###### Examples:

```clj
(def my-map {:foo 1})

(assoc my-map :foo 2)
;;=> {:foo 2}

(assoc my-map :bar 2)
;;=> {:foo 1 :bar 2}

(assoc my-map :a 3 :b 4 :c 5 :d 6)
;;=> {:foo 1 :a 3 :b 4 :c 5 :d 6}

;; you must pass a value for every key
(assoc my-map :foo)
;;=> WARNING: Wrong number of args (2) passed to cljs.core/assoc
```



---
###### Examples:

```clj
(def my-vec [1 2 3])

(assoc my-vec 0 "foo")
;;=> ["foo" 2 3]

(assoc my-vec 3 "foo")
;;=> Error: Index 3 out of bounds  [0,0]
```



---

###### See Also:

[`cljs.core/assoc-in`](../cljs.core/assoc-in.md)<br>
[`cljs.core/dissoc`](../cljs.core/dissoc.md)<br>
[`cljs.core/merge`](../cljs.core/merge.md)<br>

---


Source docstring:

```
assoc[iate]. When applied to a map, returns a new map of the
same (hashed/sorted) type, that contains the mapping of key(s) to
val(s). When applied to a vector, returns a new vector that
contains val at index.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L1606-L1619):

```clj
(defn assoc
  ([coll k v]
    (if-not (nil? coll)
      (-assoc coll k v)
      (hash-map k v)))
  ([coll k v & kvs]
     (let [ret (assoc coll k v)]
       (if kvs
         (recur ret (first kvs) (second kvs) (nnext kvs))
         ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1606-1619](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L1606-L1619)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/assoc` @ clojuredocs](http://clojuredocs.org/clojure.core/assoc)<br>
[`clojure.core/assoc` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/assoc/)<br>
[`clojure.core/assoc` @ crossclj](http://crossclj.info/fun/clojure.core/assoc.html)<br>
[`cljs.core/assoc` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/assoc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/assoc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "assoc(iate)\n\nWhen applied to a map, returns a new map that contains the mapping of key(s) to\nval(s).\n\nHas no effect on the map type (hashed/sorted).\n\nWhen applied to a vector, returns a new vector that contains value `v` at index\n`k`.",
 :ns "cljs.core",
 :name "assoc",
 :signature ["[coll k v]" "[coll k v & kvs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc-in" "cljs.core/dissoc" "cljs.core/merge"],
 :full-name-encode "cljs.core/assoc",
 :source {:code "(defn assoc\n  ([coll k v]\n    (if-not (nil? coll)\n      (-assoc coll k v)\n      (hash-map k v)))\n  ([coll k v & kvs]\n     (let [ret (assoc coll k v)]\n       (if kvs\n         (recur ret (first kvs) (second kvs) (nnext kvs))\n         ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1606 1619]},
 :examples [{:id "2fa7e0",
             :content "```clj\n(def my-map {:foo 1})\n\n(assoc my-map :foo 2)\n;;=> {:foo 2}\n\n(assoc my-map :bar 2)\n;;=> {:foo 1 :bar 2}\n\n(assoc my-map :a 3 :b 4 :c 5 :d 6)\n;;=> {:foo 1 :a 3 :b 4 :c 5 :d 6}\n\n;; you must pass a value for every key\n(assoc my-map :foo)\n;;=> WARNING: Wrong number of args (2) passed to cljs.core/assoc\n```"}
            {:id "c06eac",
             :content "```clj\n(def my-vec [1 2 3])\n\n(assoc my-vec 0 \"foo\")\n;;=> [\"foo\" 2 3]\n\n(assoc my-vec 3 \"foo\")\n;;=> Error: Index 3 out of bounds  [0,0]\n```"}],
 :known-as "associate",
 :full-name "cljs.core/assoc",
 :clj-symbol "clojure.core/assoc",
 :docstring "assoc[iate]. When applied to a map, returns a new map of the\nsame (hashed/sorted) type, that contains the mapping of key(s) to\nval(s). When applied to a vector, returns a new vector that\ncontains val at index."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/assoc"]))
```

-->
