## cljs.core/swap!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/swap!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/swap!)
</td>
</tr>
</table>


 <samp>
(__swap!__ a f)<br>
</samp>
 <samp>
(__swap!__ a f x)<br>
</samp>
 <samp>
(__swap!__ a f x y)<br>
</samp>
 <samp>
(__swap!__ a f x y & more)<br>
</samp>

---

Atomically swaps the value of atom to be: `(apply f current-value-of-atom
args)`

Note that `f` may be called multiple times, and thus should be free of side
effects.

Returns the value that was swapped in.



---


###### See Also:

[`cljs.core/atom`](../cljs.core/atom.md)<br>
[`cljs.core/reset!`](../cljs.core/resetBANG.md)<br>

---


Source docstring:

```
Atomically swaps the value of atom to be:
(apply f current-value-of-atom args). Note that f may be called
multiple times, and thus should be free of side effects.  Returns
the value that was swapped in.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6568-L6582):

```clj
(defn swap!
  ([a f]
     (reset! a (f (.-state a))))
  ([a f x]
     (reset! a (f (.-state a) x)))
  ([a f x y]
     (reset! a (f (.-state a) x y)))
  ([a f x y z]
     (reset! a (f (.-state a) x y z)))
  ([a f x y z & more]
     (reset! a (apply f (.-state a) x y z more))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6568-6582](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L6568-L6582)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/swap!` @ clojuredocs](http://clojuredocs.org/clojure.core/swap!)<br>
[`clojure.core/swap!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/swap%21/)<br>
[`clojure.core/swap!` @ crossclj](http://crossclj.info/fun/clojure.core/swap%21.html)<br>
[`cljs.core/swap!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/swap%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/swapBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Atomically swaps the value of atom to be: `(apply f current-value-of-atom\nargs)`\n\nNote that `f` may be called multiple times, and thus should be free of side\neffects.\n\nReturns the value that was swapped in.",
 :ns "cljs.core",
 :name "swap!",
 :signature ["[a f]" "[a f x]" "[a f x y]" "[a f x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/reset!"],
 :full-name-encode "cljs.core/swapBANG",
 :source {:code "(defn swap!\n  ([a f]\n     (reset! a (f (.-state a))))\n  ([a f x]\n     (reset! a (f (.-state a) x)))\n  ([a f x y]\n     (reset! a (f (.-state a) x y)))\n  ([a f x y z]\n     (reset! a (f (.-state a) x y z)))\n  ([a f x y z & more]\n     (reset! a (apply f (.-state a) x y z more))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1798",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6568 6582]},
 :full-name "cljs.core/swap!",
 :clj-symbol "clojure.core/swap!",
 :docstring "Atomically swaps the value of atom to be:\n(apply f current-value-of-atom args). Note that f may be called\nmultiple times, and thus should be free of side effects.  Returns\nthe value that was swapped in."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/swap!"]))
```

-->
