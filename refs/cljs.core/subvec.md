## cljs.core/subvec



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subvec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subvec)
</td>
</tr>
</table>


 <samp>
(__subvec__ v start)<br>
</samp>
 <samp>
(__subvec__ v start end)<br>
</samp>

---

Returns a persistent vector of the items in `v` from `start` inclusive to `end`
exclusive.

If `end` is not supplied, defaults to `(count v)`.

This operation is O(1) and very fast, as the resulting vector shares structure
with the original and no trimming is done.



---


###### See Also:

[`cljs.core/vector`](../cljs.core/vector.md)<br>
[`cljs.core/vector?`](../cljs.core/vectorQMARK.md)<br>

---


Source docstring:

```
Returns a persistent vector of the items in vector from
start (inclusive) to end (exclusive).  If end is not supplied,
defaults to (count vector). This operation is O(1) and very fast, as
the resulting vector shares structure with the original and no
trimming is done.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L3522-L3531):

```clj
(defn subvec
  ([v start]
     (subvec v start (count v)))
  ([v start end]
     (build-subvec nil v start end nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3522-3531](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L3522-L3531)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/subvec` @ clojuredocs](http://clojuredocs.org/clojure.core/subvec)<br>
[`clojure.core/subvec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/subvec/)<br>
[`clojure.core/subvec` @ crossclj](http://crossclj.info/fun/clojure.core/subvec.html)<br>
[`cljs.core/subvec` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/subvec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/subvec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a persistent vector of the items in `v` from `start` inclusive to `end`\nexclusive.\n\nIf `end` is not supplied, defaults to `(count v)`.\n\nThis operation is O(1) and very fast, as the resulting vector shares structure\nwith the original and no trimming is done.",
 :ns "cljs.core",
 :name "subvec",
 :signature ["[v start]" "[v start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/vector?"],
 :full-name-encode "cljs.core/subvec",
 :source {:code "(defn subvec\n  ([v start]\n     (subvec v start (count v)))\n  ([v start end]\n     (build-subvec nil v start end nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3522 3531]},
 :full-name "cljs.core/subvec",
 :clj-symbol "clojure.core/subvec",
 :docstring "Returns a persistent vector of the items in vector from\nstart (inclusive) to end (exclusive).  If end is not supplied,\ndefaults to (count vector). This operation is O(1) and very fast, as\nthe resulting vector shares structure with the original and no\ntrimming is done."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/subvec"]))
```

-->
