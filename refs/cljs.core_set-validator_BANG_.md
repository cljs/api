## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/set-validator!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set-validator!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set-validator!)
</td>
</tr>
</table>

 <samp>
(__set-validator!__ iref val)<br>
</samp>

```
Sets the validator-fn for an atom. validator-fn must be nil or a
side-effect-free fn of one argument, which will be passed the intended
new state on any state change. If the new state is unacceptable, the
validator-fn should return false or throw an Error. If the current state
is not acceptable to the new validator, an Error will be thrown and the
validator will not be changed.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5955-5963](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5955-L5963)</ins>
</pre>

```clj
(defn set-validator!
  [iref val]
  (set! (.-validator iref) val))
```


---

```clj
{:ns "cljs.core",
 :name "set-validator!",
 :signature ["[iref val]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_set-validator_BANG_",
 :source {:code "(defn set-validator!\n  [iref val]\n  (set! (.-validator iref) val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5955 5963],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5955-L5963"},
 :full-name "cljs.core/set-validator!",
 :clj-symbol "clojure.core/set-validator!",
 :docstring "Sets the validator-fn for an atom. validator-fn must be nil or a\nside-effect-free fn of one argument, which will be passed the intended\nnew state on any state change. If the new state is unacceptable, the\nvalidator-fn should return false or throw an Error. If the current state\nis not acceptable to the new validator, an Error will be thrown and the\nvalidator will not be changed."}

```
