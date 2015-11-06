## cljs.core/repeat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeat)
</td>
</tr>
</table>


 <samp>
(__repeat__ x)<br>
</samp>
 <samp>
(__repeat__ n x)<br>
</samp>

---

Returns a lazy sequence of `x`s.

The length of the sequence is infinite, or `n` if provided.



---


###### See Also:

[`cljs.core/repeatedly`](../cljs.core/repeatedly.md)<br>
[`cljs.core/cycle`](../cljs.core/cycle.md)<br>
[`cljs.core/constantly`](../cljs.core/constantly.md)<br>
[`cljs.core/dotimes`](../cljs.core/dotimes.md)<br>

---


Source docstring:

```
Returns a lazy (infinite!, or length n if supplied) sequence of xs.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L3653-L3656):

```clj
(defn repeat
  ([x] (lazy-seq (cons x (repeat x))))
  ([n x] (take n (repeat x))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2341
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3653-3656](https://github.com/clojure/clojurescript/blob/r2341/src/cljs/cljs/core.cljs#L3653-L3656)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/repeat` @ clojuredocs](http://clojuredocs.org/clojure.core/repeat)<br>
[`clojure.core/repeat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/repeat/)<br>
[`clojure.core/repeat` @ crossclj](http://crossclj.info/fun/clojure.core/repeat.html)<br>
[`cljs.core/repeat` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/repeat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/repeat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of `x`s.\n\nThe length of the sequence is infinite, or `n` if provided.",
 :ns "cljs.core",
 :name "repeat",
 :signature ["[x]" "[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeatedly"
           "cljs.core/cycle"
           "cljs.core/constantly"
           "cljs.core/dotimes"],
 :full-name-encode "cljs.core/repeat",
 :source {:code "(defn repeat\n  ([x] (lazy-seq (cons x (repeat x))))\n  ([n x] (take n (repeat x))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2341",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3653 3656]},
 :full-name "cljs.core/repeat",
 :clj-symbol "clojure.core/repeat",
 :docstring "Returns a lazy (infinite!, or length n if supplied) sequence of xs."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/repeat"]))
```

-->
