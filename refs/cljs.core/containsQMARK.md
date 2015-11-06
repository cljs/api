## cljs.core/contains?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/contains?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/contains?)
</td>
</tr>
</table>


 <samp>
(__contains?__ coll k)<br>
</samp>

---

Returns true if the `coll` contains the lookup key `k`, otherwise returns false.

Note that for numerically indexed collections like vectors and arrays, this
tests if the numeric key is within the range of indexes.

`contains?` operates in constant or logarithmic time, using `get` to perform
the lookup. It will not perform a linear search for a value.  `some` is
used for this purpose:

```clj
(some #{value} coll)
```



---

###### Examples:

Sets and Maps provide key lookups, so `contains?` works as expected:

```clj
(contains? #{:a :b} :a)
;;=> true

(contains? {:a 1, :b 2} :a)
;;=> true

(contains? {:a 1, :b 2} 1)
;;=> false
```

Vectors provide integer index lookups, so `contains?` works appropriately:

```clj
(contains? [:a :b] :b)
;;=> false

(contains? [:a :b] 1)
;;=> true
```

Lists and Sequences do not provide lookups, so `contains?` will not work:

```clj
(contains? '(:a :b) :a)
;;=> false

(contains? '(:a :b) 1)
;;=> false

(contains? (range 3) 1)
;;=> false
```



---

###### See Also:

[`cljs.core/some`](../cljs.core/some.md)<br>
[`cljs.core/get`](../cljs.core/get.md)<br>

---


Source docstring:

```
Returns true if key is present in the given collection, otherwise
returns false.  Note that for numerically indexed collections like
vectors and arrays, this tests if the numeric key is within the
range of indexes. 'contains?' operates constant or logarithmic time;
it will not perform a linear search for a value.  See also 'some'.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L1875-L1884):

```clj
(defn ^boolean contains?
  [coll v]
  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)
    false
    true))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1875-1884](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L1875-L1884)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/contains?` @ clojuredocs](http://clojuredocs.org/clojure.core/contains_q)<br>
[`clojure.core/contains?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/contains%3F/)<br>
[`clojure.core/contains?` @ crossclj](http://crossclj.info/fun/clojure.core/contains%3F.html)<br>
[`cljs.core/contains?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/contains%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/containsQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if the `coll` contains the lookup key `k`, otherwise returns false.\n\nNote that for numerically indexed collections like vectors and arrays, this\ntests if the numeric key is within the range of indexes.\n\n`contains?` operates in constant or logarithmic time, using `get` to perform\nthe lookup. It will not perform a linear search for a value.  `some` is\nused for this purpose:\n\n```clj\n(some #{value} coll)\n```",
 :return-type boolean,
 :ns "cljs.core",
 :name "contains?",
 :signature ["[coll k]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/some" "cljs.core/get"],
 :full-name-encode "cljs.core/containsQMARK",
 :source {:code "(defn ^boolean contains?\n  [coll v]\n  (if (identical? (get coll v lookup-sentinel) lookup-sentinel)\n    false\n    true))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1875 1884]},
 :examples [{:id "2991f0",
             :content "Sets and Maps provide key lookups, so `contains?` works as expected:\n\n```clj\n(contains? #{:a :b} :a)\n;;=> true\n\n(contains? {:a 1, :b 2} :a)\n;;=> true\n\n(contains? {:a 1, :b 2} 1)\n;;=> false\n```\n\nVectors provide integer index lookups, so `contains?` works appropriately:\n\n```clj\n(contains? [:a :b] :b)\n;;=> false\n\n(contains? [:a :b] 1)\n;;=> true\n```\n\nLists and Sequences do not provide lookups, so `contains?` will not work:\n\n```clj\n(contains? '(:a :b) :a)\n;;=> false\n\n(contains? '(:a :b) 1)\n;;=> false\n\n(contains? (range 3) 1)\n;;=> false\n```"}],
 :full-name "cljs.core/contains?",
 :clj-symbol "clojure.core/contains?",
 :docstring "Returns true if key is present in the given collection, otherwise\nreturns false.  Note that for numerically indexed collections like\nvectors and arrays, this tests if the numeric key is within the\nrange of indexes. 'contains?' operates constant or logarithmic time;\nit will not perform a linear search for a value.  See also 'some'."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/contains?"]))
```

-->
