## cljs.core/repeatedly



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeatedly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeatedly)
</td>
</tr>
</table>


 <samp>
(__repeatedly__ f)<br>
</samp>
 <samp>
(__repeatedly__ n f)<br>
</samp>

---

Takes a function `f` of no args, presumably with side effects, and returns an
infinite (or length `n` if supplied) lazy sequence of calls to it.



---


###### See Also:

[`cljs.core/repeat`](../cljs.core/repeat.md)<br>
[`cljs.core/iterate`](../cljs.core/iterate.md)<br>
[`cljs.core/lazy-seq`](../cljs.core/lazy-seq.md)<br>
[`cljs.core/dotimes`](../cljs.core/dotimes.md)<br>
[`cljs.core/constantly`](../cljs.core/constantly.md)<br>

---


Source docstring:

```
Takes a function of no args, presumably with side effects, and
returns an infinite (or length n if supplied) lazy sequence of calls
to it
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L3639-L3644):

```clj
(defn repeatedly
  ([f] (lazy-seq (cons (f) (repeatedly f))))
  ([n f] (take n (repeatedly f))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3639-3644](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L3639-L3644)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/repeatedly` @ clojuredocs](http://clojuredocs.org/clojure.core/repeatedly)<br>
[`clojure.core/repeatedly` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/repeatedly/)<br>
[`clojure.core/repeatedly` @ crossclj](http://crossclj.info/fun/clojure.core/repeatedly.html)<br>
[`cljs.core/repeatedly` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/repeatedly.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/repeatedly.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a function `f` of no args, presumably with side effects, and returns an\ninfinite (or length `n` if supplied) lazy sequence of calls to it.",
 :ns "cljs.core",
 :name "repeatedly",
 :signature ["[f]" "[n f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeat"
           "cljs.core/iterate"
           "cljs.core/lazy-seq"
           "cljs.core/dotimes"
           "cljs.core/constantly"],
 :full-name-encode "cljs.core/repeatedly",
 :source {:code "(defn repeatedly\n  ([f] (lazy-seq (cons (f) (repeatedly f))))\n  ([n f] (take n (repeatedly f))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3639 3644]},
 :full-name "cljs.core/repeatedly",
 :clj-symbol "clojure.core/repeatedly",
 :docstring "Takes a function of no args, presumably with side effects, and\nreturns an infinite (or length n if supplied) lazy sequence of calls\nto it"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/repeatedly"]))
```

-->
