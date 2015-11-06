## cljs.core/keep



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keep</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keep)
</td>
</tr>
</table>


 <samp>
(__keep__ f)<br>
</samp>
 <samp>
(__keep__ f coll)<br>
</samp>

---

Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means
false return values will be included.

`f` must be free of side-effects.

Returns a transducer when no collection is provided.



---


###### See Also:

[`cljs.core/keep-indexed`](../cljs.core/keep-indexed.md)<br>
[`cljs.core/map`](../cljs.core/map.md)<br>
[`cljs.core/filter`](../cljs.core/filter.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the non-nil results of (f item). Note,
this means false return values will be included.  f must be free of
side-effects.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1945-L1955):

```clj
(defn keep
  ([f coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (let [x (f (first s))]
        (if (nil? x)
          (keep f (rest s))
          (cons x (keep f (rest s)))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1945-1955](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1945-L1955)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/keep` @ clojuredocs](http://clojuredocs.org/clojure.core/keep)<br>
[`clojure.core/keep` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/keep/)<br>
[`clojure.core/keep` @ crossclj](http://crossclj.info/fun/clojure.core/keep.html)<br>
[`cljs.core/keep` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/keep.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/keep.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means\nfalse return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "keep",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keep-indexed"
           "cljs.core/map"
           "cljs.core/filter"],
 :full-name-encode "cljs.core/keep",
 :source {:code "(defn keep\n  ([f coll]\n   (lazy-seq\n    (when-let [s (seq coll)]\n      (let [x (f (first s))]\n        (if (nil? x)\n          (keep f (rest s))\n          (cons x (keep f (rest s)))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1945 1955]},
 :full-name "cljs.core/keep",
 :clj-symbol "clojure.core/keep",
 :docstring "Returns a lazy sequence of the non-nil results of (f item). Note,\nthis means false return values will be included.  f must be free of\nside-effects."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keep"]))
```

-->
