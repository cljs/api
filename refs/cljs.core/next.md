## cljs.core/next



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/next</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/next)
</td>
</tr>
</table>


 <samp>
(__next__ coll)<br>
</samp>

---

Returns a sequence of the items after the first and calls `seq` on its argument.

Returns nil if `coll` is empty.



---

###### Examples:

```clj
(next [1 2 3])
;;=> (2 3)

(next [1 2])
;;=> (2)

(next [1])
;;=> nil

(next [])
;;=> nil
```



---

###### See Also:

[`cljs.core/rest`](../cljs.core/rest.md)<br>
[`cljs.core/first`](../cljs.core/first.md)<br>
[`cljs.core/fnext`](../cljs.core/fnext.md)<br>

---


Source docstring:

```
Returns a seq of the items after the first. Calls seq on its
argument.  If there are no more items, returns nil
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L977-L984):

```clj
(defn ^seq next
  [coll]
  (when-not (nil? coll)
    (if (implements? INext coll)
      (-next ^not-native coll)
      (seq (rest coll)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:977-984](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L977-L984)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/next` @ clojuredocs](http://clojuredocs.org/clojure.core/next)<br>
[`clojure.core/next` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/next/)<br>
[`clojure.core/next` @ crossclj](http://crossclj.info/fun/clojure.core/next.html)<br>
[`cljs.core/next` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/next.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/next.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the items after the first and calls `seq` on its argument.\n\nReturns nil if `coll` is empty.",
 :return-type seq,
 :ns "cljs.core",
 :name "next",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rest" "cljs.core/first" "cljs.core/fnext"],
 :full-name-encode "cljs.core/next",
 :source {:code "(defn ^seq next\n  [coll]\n  (when-not (nil? coll)\n    (if (implements? INext coll)\n      (-next ^not-native coll)\n      (seq (rest coll)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [977 984]},
 :examples [{:id "7db59a",
             :content "```clj\n(next [1 2 3])\n;;=> (2 3)\n\n(next [1 2])\n;;=> (2)\n\n(next [1])\n;;=> nil\n\n(next [])\n;;=> nil\n```"}],
 :full-name "cljs.core/next",
 :clj-symbol "clojure.core/next",
 :docstring "Returns a seq of the items after the first. Calls seq on its\nargument.  If there are no more items, returns nil"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/next"]))
```

-->
