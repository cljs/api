## cljs.core/some



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some)
</td>
</tr>
</table>


 <samp>
(__some__ pred coll)<br>
</samp>

---

Returns the first logical true value of `(pred x)` for any `x` in `coll`, else
nil.

A common idiom is to use a set as pred, for example this will return `:fred` if
`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`



---


###### See Also:

[`cljs.core/every?`](../cljs.core/everyQMARK.md)<br>
[`cljs.core/not-any?`](../cljs.core/not-anyQMARK.md)<br>
[`cljs.core/keep`](../cljs.core/keep.md)<br>
[`cljs.core/keep-indexed`](../cljs.core/keep-indexed.md)<br>
[`cljs.core/some-fn`](../cljs.core/some-fn.md)<br>

---


Source docstring:

```
Returns the first logical true value of (pred x) for any x in coll,
else nil.  One common idiom is to use a set as pred, for example
this will return :fred if :fred is in the sequence, otherwise nil:
(some #{:fred} coll)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2507-L2514):

```clj
(defn some
  [pred coll]
    (when (seq coll)
      (or (pred (first coll)) (recur pred (next coll)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2507-2514](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2507-L2514)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/some` @ clojuredocs](http://clojuredocs.org/clojure.core/some)<br>
[`clojure.core/some` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/some/)<br>
[`clojure.core/some` @ crossclj](http://crossclj.info/fun/clojure.core/some.html)<br>
[`cljs.core/some` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/some.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/some.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the first logical true value of `(pred x)` for any `x` in `coll`, else\nnil.\n\nA common idiom is to use a set as pred, for example this will return `:fred` if\n`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`",
 :ns "cljs.core",
 :name "some",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every?"
           "cljs.core/not-any?"
           "cljs.core/keep"
           "cljs.core/keep-indexed"
           "cljs.core/some-fn"],
 :full-name-encode "cljs.core/some",
 :source {:code "(defn some\n  [pred coll]\n    (when (seq coll)\n      (or (pred (first coll)) (recur pred (next coll)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2507 2514]},
 :full-name "cljs.core/some",
 :clj-symbol "clojure.core/some",
 :docstring "Returns the first logical true value of (pred x) for any x in coll,\nelse nil.  One common idiom is to use a set as pred, for example\nthis will return :fred if :fred is in the sequence, otherwise nil:\n(some #{:fred} coll)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some"]))
```

-->
