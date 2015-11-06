## cljs.core/iterate



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/iterate</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/iterate)
</td>
</tr>
</table>


 <samp>
(__iterate__ f x)<br>
</samp>

---

Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.

`f` must be free of side-effects.



---


###### See Also:

[`cljs.core/cycle`](../cljs.core/cycle.md)<br>
[`cljs.core/repeatedly`](../cljs.core/repeatedly.md)<br>
[`cljs.core/repeat`](../cljs.core/repeat.md)<br>

---


Source docstring:

```
Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L3810-L3813):

```clj
(defn iterate
  [f x] (cons x (lazy-seq (iterate f (f x)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3810-3813](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L3810-L3813)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/iterate` @ clojuredocs](http://clojuredocs.org/clojure.core/iterate)<br>
[`clojure.core/iterate` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/iterate/)<br>
[`clojure.core/iterate` @ crossclj](http://crossclj.info/fun/clojure.core/iterate.html)<br>
[`cljs.core/iterate` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/iterate.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/iterate.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.\n\n`f` must be free of side-effects.",
 :ns "cljs.core",
 :name "iterate",
 :signature ["[f x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/cycle"
           "cljs.core/repeatedly"
           "cljs.core/repeat"],
 :full-name-encode "cljs.core/iterate",
 :source {:code "(defn iterate\n  [f x] (cons x (lazy-seq (iterate f (f x)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3810 3813]},
 :full-name "cljs.core/iterate",
 :clj-symbol "clojure.core/iterate",
 :docstring "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/iterate"]))
```

-->
