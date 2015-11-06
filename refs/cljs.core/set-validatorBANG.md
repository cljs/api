## cljs.core/set-validator!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set-validator!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-validator!)
</td>
</tr>
</table>


 <samp>
(__set-validator!__ a fn)<br>
</samp>

---

Sets a validator function for atom `a`.

`fn` must be nil or a side-effect-free function of one argument, which will be
passed the intended new state on any state change. `fn` should return false or
throw an Error if the new state is unacceptable.

If the current value of `a` is unacceptable to `fn` when `set-validator!` is
called, an Error will be thrown and the validator will not be set.

`(set-validator! my-atom nil)` will remove the validator from `my-atom`.



---


###### See Also:

[`cljs.core/atom`](../cljs.core/atom.md)<br>
[`cljs.core/get-validator`](../cljs.core/get-validator.md)<br>

---


Source docstring:

```
Sets the validator-fn for an atom. validator-fn must be nil or a
side-effect-free fn of one argument, which will be passed the intended
new state on any state change. If the new state is unacceptable, the
validator-fn should return false or throw an Error. If the current state
is not acceptable to the new validator, an Error will be thrown and the
validator will not be changed.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L3869-L3877):

```clj
(defn set-validator!
  [iref val]
  (set! (.-validator iref) val))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3869-3877](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L3869-L3877)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/set-validator!` @ clojuredocs](http://clojuredocs.org/clojure.core/set-validator!)<br>
[`clojure.core/set-validator!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/set-validator%21/)<br>
[`clojure.core/set-validator!` @ crossclj](http://crossclj.info/fun/clojure.core/set-validator%21.html)<br>
[`cljs.core/set-validator!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/set-validator%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/set-validatorBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Sets a validator function for atom `a`.\n\n`fn` must be nil or a side-effect-free function of one argument, which will be\npassed the intended new state on any state change. `fn` should return false or\nthrow an Error if the new state is unacceptable.\n\nIf the current value of `a` is unacceptable to `fn` when `set-validator!` is\ncalled, an Error will be thrown and the validator will not be set.\n\n`(set-validator! my-atom nil)` will remove the validator from `my-atom`.",
 :ns "cljs.core",
 :name "set-validator!",
 :signature ["[a fn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/get-validator"],
 :full-name-encode "cljs.core/set-validatorBANG",
 :source {:code "(defn set-validator!\n  [iref val]\n  (set! (.-validator iref) val))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3869 3877]},
 :full-name "cljs.core/set-validator!",
 :clj-symbol "clojure.core/set-validator!",
 :docstring "Sets the validator-fn for an atom. validator-fn must be nil or a\nside-effect-free fn of one argument, which will be passed the intended\nnew state on any state change. If the new state is unacceptable, the\nvalidator-fn should return false or throw an Error. If the current state\nis not acceptable to the new validator, an Error will be thrown and the\nvalidator will not be changed."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set-validator!"]))
```

-->
