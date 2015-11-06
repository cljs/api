## cljs.core/range



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/range</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/range)
</td>
</tr>
</table>


 <samp>
(__range__)<br>
</samp>
 <samp>
(__range__ end)<br>
</samp>
 <samp>
(__range__ start end)<br>
</samp>
 <samp>
(__range__ start end step)<br>
</samp>

---

Returns a lazy sequence of nums from `start` (inclusive) to `end` (exclusive),
by `step`, where `start` defaults to 0, `step` to 1, and `end` to infinity.



---


###### See Also:

[`cljs.core/repeat`](../cljs.core/repeat.md)<br>

---


Source docstring:

```
Returns a lazy seq of nums from start (inclusive) to end
(exclusive), by step, where start defaults to 0, step to 1,
and end to infinity.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L5997-L6004):

```clj
(defn range
  ([] (range 0 js/Number.MAX_VALUE 1))
  ([end] (range 0 end 1))
  ([start end] (range start end 1))
  ([start end step] (Range. nil start end step nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5997-6004](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L5997-L6004)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/range` @ clojuredocs](http://clojuredocs.org/clojure.core/range)<br>
[`clojure.core/range` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/range/)<br>
[`clojure.core/range` @ crossclj](http://crossclj.info/fun/clojure.core/range.html)<br>
[`cljs.core/range` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/range.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/range.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of nums from `start` (inclusive) to `end` (exclusive),\nby `step`, where `start` defaults to 0, `step` to 1, and `end` to infinity.",
 :ns "cljs.core",
 :name "range",
 :signature ["[]" "[end]" "[start end]" "[start end step]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeat"],
 :full-name-encode "cljs.core/range",
 :source {:code "(defn range\n  ([] (range 0 js/Number.MAX_VALUE 1))\n  ([end] (range 0 end 1))\n  ([start end] (range start end 1))\n  ([start end step] (Range. nil start end step nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5997 6004]},
 :full-name "cljs.core/range",
 :clj-symbol "clojure.core/range",
 :docstring "Returns a lazy seq of nums from start (inclusive) to end\n(exclusive), by step, where start defaults to 0, step to 1,\nand end to infinity."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/range"]))
```

-->