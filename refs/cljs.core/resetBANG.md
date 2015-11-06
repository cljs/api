## cljs.core/reset!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset!)
</td>
</tr>
</table>


 <samp>
(__reset!__ a new-value)<br>
</samp>

---

Sets the value of atom `a` to `new-value` without regard for the current value.

Returns `new-value`.



---


###### See Also:

[`cljs.core/swap!`](../cljs.core/swapBANG.md)<br>
[`cljs.core/compare-and-set!`](../cljs.core/compare-and-setBANG.md)<br>
[`cljs.core/atom`](../cljs.core/atom.md)<br>

---


Source docstring:

```
Sets the value of atom to newval without regard for the
current value. Returns newval.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L3460-L3473):

```clj
(defn reset!
  [a new-value]
  (if (instance? Atom a)
    (let [validate (.-validator a)]
      (when-not (nil? validate)
        (assert (validate new-value) "Validator rejected reference state"))
      (let [old-value (.-state a)]
        (set! (.-state a) new-value)
        (when-not (nil? (.-watches a))
          (-notify-watches a old-value new-value))
        new-value))
    (-reset! a new-value)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3460-3473](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/core.cljs#L3460-L3473)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reset!` @ clojuredocs](http://clojuredocs.org/clojure.core/reset!)<br>
[`clojure.core/reset!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reset%21/)<br>
[`clojure.core/reset!` @ crossclj](http://crossclj.info/fun/clojure.core/reset%21.html)<br>
[`cljs.core/reset!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reset%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/resetBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Sets the value of atom `a` to `new-value` without regard for the current value.\n\nReturns `new-value`.",
 :ns "cljs.core",
 :name "reset!",
 :signature ["[a new-value]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/swap!"
           "cljs.core/compare-and-set!"
           "cljs.core/atom"],
 :full-name-encode "cljs.core/resetBANG",
 :source {:code "(defn reset!\n  [a new-value]\n  (if (instance? Atom a)\n    (let [validate (.-validator a)]\n      (when-not (nil? validate)\n        (assert (validate new-value) \"Validator rejected reference state\"))\n      (let [old-value (.-state a)]\n        (set! (.-state a) new-value)\n        (when-not (nil? (.-watches a))\n          (-notify-watches a old-value new-value))\n        new-value))\n    (-reset! a new-value)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3460 3473]},
 :full-name "cljs.core/reset!",
 :clj-symbol "clojure.core/reset!",
 :docstring "Sets the value of atom to newval without regard for the\ncurrent value. Returns newval."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reset!"]))
```

-->
