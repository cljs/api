## cljs.core/coll?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/coll?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/coll?)
</td>
</tr>
</table>


 <samp>
(__coll?__ x)<br>
</samp>

---

Returns true if `x` is a collection, false otherwise.

Lists, maps, sets, and vectors are collections.



---

###### Examples:

```clj
(coll? [1 2 3])
;;=> true

(coll? '(1 2 3))
;;=> true

(coll? #{1 2 3})
;;=> true

(coll? {:foo 1 :bar 2})
;;=> true
```

Not collections:

```clj
(coll? "foo")
;;=> false

(coll? 123)
;;=> false

(coll? nil)
;;=> false
```



---

###### See Also:

[`cljs.core/seq?`](../cljs.core/seqQMARK.md)<br>
[`cljs.core/list?`](../cljs.core/listQMARK.md)<br>
[`cljs.core/sequential?`](../cljs.core/sequentialQMARK.md)<br>

---


Source docstring:

```
Returns true if x satisfies ICollection
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L1309-L1314):

```clj
(defn ^boolean coll?
  [x]
  (if (nil? x)
    false
    (satisfies? ICollection x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1309-1314](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L1309-L1314)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/coll?` @ clojuredocs](http://clojuredocs.org/clojure.core/coll_q)<br>
[`clojure.core/coll?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/coll%3F/)<br>
[`clojure.core/coll?` @ crossclj](http://crossclj.info/fun/clojure.core/coll%3F.html)<br>
[`cljs.core/coll?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/coll%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/collQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a collection, false otherwise.\n\nLists, maps, sets, and vectors are collections.",
 :return-type boolean,
 :ns "cljs.core",
 :name "coll?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/list?" "cljs.core/sequential?"],
 :full-name-encode "cljs.core/collQMARK",
 :source {:code "(defn ^boolean coll?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ICollection x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1309 1314]},
 :examples [{:id "d30884",
             :content "```clj\n(coll? [1 2 3])\n;;=> true\n\n(coll? '(1 2 3))\n;;=> true\n\n(coll? #{1 2 3})\n;;=> true\n\n(coll? {:foo 1 :bar 2})\n;;=> true\n```\n\nNot collections:\n\n```clj\n(coll? \"foo\")\n;;=> false\n\n(coll? 123)\n;;=> false\n\n(coll? nil)\n;;=> false\n```"}],
 :full-name "cljs.core/coll?",
 :clj-symbol "clojure.core/coll?",
 :docstring "Returns true if x satisfies ICollection"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/coll?"]))
```

-->
