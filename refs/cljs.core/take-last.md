## cljs.core/take-last



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/take-last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/take-last)
</td>
</tr>
</table>


 <samp>
(__take-last__ n coll)<br>
</samp>

---

Returns a sequence of the last `n` items in `coll`.

Depending on the type of collection, `take-last` may be no faster than linear
time. For vectors, please use `subvec`.



---


###### See Also:

[`cljs.core/last`](../cljs.core/last.md)<br>
[`cljs.core/butlast`](../cljs.core/butlast.md)<br>
[`cljs.core/drop-last`](../cljs.core/drop-last.md)<br>

---


Source docstring:

```
Returns a seq of the last n items in coll.  Depending on the type
of coll may be no better than linear time.  For vectors, see also subvec.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L2837-L2844):

```clj
(defn take-last
  [n coll]
  (loop [s (seq coll), lead (seq (drop n coll))]
    (if lead
      (recur (next s) (next lead))
      s)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2837-2844](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L2837-L2844)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/take-last` @ clojuredocs](http://clojuredocs.org/clojure.core/take-last)<br>
[`clojure.core/take-last` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/take-last/)<br>
[`clojure.core/take-last` @ crossclj](http://crossclj.info/fun/clojure.core/take-last.html)<br>
[`cljs.core/take-last` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/take-last.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/take-last.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the last `n` items in `coll`.\n\nDepending on the type of collection, `take-last` may be no faster than linear\ntime. For vectors, please use `subvec`.",
 :ns "cljs.core",
 :name "take-last",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/last" "cljs.core/butlast" "cljs.core/drop-last"],
 :full-name-encode "cljs.core/take-last",
 :source {:code "(defn take-last\n  [n coll]\n  (loop [s (seq coll), lead (seq (drop n coll))]\n    (if lead\n      (recur (next s) (next lead))\n      s)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2837 2844]},
 :full-name "cljs.core/take-last",
 :clj-symbol "clojure.core/take-last",
 :docstring "Returns a seq of the last n items in coll.  Depending on the type\nof coll may be no better than linear time.  For vectors, see also subvec."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/take-last"]))
```

-->
