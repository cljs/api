## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/MultiFn

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__MultiFn.__ name dispatch-fn default-dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7102-7149](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L7102-L7149)</ins>
</pre>

```clj
(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy
                  method-table prefer-table method-cache cached-hierarchy]
  IMultiFn
  (-reset [mf]
    (swap! method-table (fn [mf] {}))
    (swap! method-cache (fn [mf] {}))
    (swap! prefer-table (fn [mf] {}))
    (swap! cached-hierarchy (fn [mf] nil))
    mf)

  (-add-method [mf dispatch-val method]
    (swap! method-table assoc dispatch-val method)
    (reset-cache method-cache method-table cached-hierarchy hierarchy)
    mf)

  (-remove-method [mf dispatch-val]
    (swap! method-table dissoc dispatch-val)
    (reset-cache method-cache method-table cached-hierarchy hierarchy)
    mf)

  (-get-method [mf dispatch-val]
    (when-not (= @cached-hierarchy @hierarchy)
      (reset-cache method-cache method-table cached-hierarchy hierarchy))
    (if-let [target-fn (@method-cache dispatch-val)]
      target-fn
      (if-let [target-fn (find-and-cache-best-method name dispatch-val hierarchy method-table
                                                     prefer-table method-cache cached-hierarchy)]
        target-fn
        (@method-table default-dispatch-val))))

  (-prefer-method [mf dispatch-val-x dispatch-val-y]
    (when (prefers* dispatch-val-x dispatch-val-y prefer-table)
      (throw (js/Error. (str "Preference conflict in multimethod '" name "': " dispatch-val-y
                   " is already preferred to " dispatch-val-x))))
    (swap! prefer-table
           (fn [old]
             (assoc old dispatch-val-x
                    (conj (get old dispatch-val-x #{})
                          dispatch-val-y))))
    (reset-cache method-cache method-table cached-hierarchy hierarchy))

  (-methods [mf] @method-table)
  (-prefers [mf] @prefer-table)

  (-dispatch [mf args] (do-dispatch mf dispatch-fn args))

  IHash
  (-hash [this] (goog.getUid this)))
```


---

```clj
{:full-name "cljs.core/MultiFn",
 :ns "cljs.core",
 :name "MultiFn",
 :type "type",
 :signature ["[name dispatch-fn default-dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy]"],
 :source {:code "(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy\n                  method-table prefer-table method-cache cached-hierarchy]\n  IMultiFn\n  (-reset [mf]\n    (swap! method-table (fn [mf] {}))\n    (swap! method-cache (fn [mf] {}))\n    (swap! prefer-table (fn [mf] {}))\n    (swap! cached-hierarchy (fn [mf] nil))\n    mf)\n\n  (-add-method [mf dispatch-val method]\n    (swap! method-table assoc dispatch-val method)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-remove-method [mf dispatch-val]\n    (swap! method-table dissoc dispatch-val)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-get-method [mf dispatch-val]\n    (when-not (= @cached-hierarchy @hierarchy)\n      (reset-cache method-cache method-table cached-hierarchy hierarchy))\n    (if-let [target-fn (@method-cache dispatch-val)]\n      target-fn\n      (if-let [target-fn (find-and-cache-best-method name dispatch-val hierarchy method-table\n                                                     prefer-table method-cache cached-hierarchy)]\n        target-fn\n        (@method-table default-dispatch-val))))\n\n  (-prefer-method [mf dispatch-val-x dispatch-val-y]\n    (when (prefers* dispatch-val-x dispatch-val-y prefer-table)\n      (throw (js/Error. (str \"Preference conflict in multimethod '\" name \"': \" dispatch-val-y\n                   \" is already preferred to \" dispatch-val-x))))\n    (swap! prefer-table\n           (fn [old]\n             (assoc old dispatch-val-x\n                    (conj (get old dispatch-val-x #{})\n                          dispatch-val-y))))\n    (reset-cache method-cache method-table cached-hierarchy hierarchy))\n\n  (-methods [mf] @method-table)\n  (-prefers [mf] @prefer-table)\n\n  (-dispatch [mf args] (do-dispatch mf dispatch-fn args))\n\n  IHash\n  (-hash [this] (goog.getUid this)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7102 7149],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L7102-L7149"},
 :full-name-encode "cljs.core_MultiFn",
 :history [["+" "0.0-927"]]}

```
