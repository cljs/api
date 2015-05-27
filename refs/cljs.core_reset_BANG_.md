## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reset!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset!)
</td>
</tr>
</table>

 <samp>
(__reset!__ a new-value)<br>
</samp>

```
Sets the value of atom to newval without regard for the
current value. Returns newval.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6668-6677](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6668-L6677)</ins>
</pre>

```clj
(defn reset!
  [a new-value]
  (when-let [validate (.-validator a)]
    (assert (validate new-value) "Validator rejected reference state"))
  (let [old-value (.-state a)]
    (set! (.-state a) new-value)
    (-notify-watches a old-value new-value))
  new-value)
```


---

```clj
{:ns "cljs.core",
 :name "reset!",
 :signature ["[a new-value]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reset_BANG_",
 :source {:code "(defn reset!\n  [a new-value]\n  (when-let [validate (.-validator a)]\n    (assert (validate new-value) \"Validator rejected reference state\"))\n  (let [old-value (.-state a)]\n    (set! (.-state a) new-value)\n    (-notify-watches a old-value new-value))\n  new-value)",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6668 6677],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6668-L6677"},
 :full-name "cljs.core/reset!",
 :clj-symbol "clojure.core/reset!",
 :docstring "Sets the value of atom to newval without regard for the\ncurrent value. Returns newval."}

```
