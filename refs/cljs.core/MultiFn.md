## cljs.core/MultiFn



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/MultiFn</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/MultiFn.java)
</td>
</tr>
</table>


 <samp>
(__MultiFn.__ name dispatch-fn default-dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L7627-L7676):

```clj
(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy
                  method-table prefer-table method-cache cached-hierarchy]
  IFn

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

  (-dispatch [mf args] (do-dispatch mf name dispatch-fn args))

  IHash
  (-hash [this] (goog/getUid this)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7627-7676](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/core.cljs#L7627-L7676)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/MultiFn` @ clojuredocs](http://clojuredocs.org/clojure.lang/MultiFn)<br>
[`clojure.lang/MultiFn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/MultiFn/)<br>
[`clojure.lang/MultiFn` @ crossclj](http://crossclj.info/fun/clojure.lang/MultiFn.html)<br>
[`cljs.core/MultiFn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/MultiFn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/MultiFn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "MultiFn",
 :signature ["[name dispatch-fn default-dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core/MultiFn",
 :source {:code "(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy\n                  method-table prefer-table method-cache cached-hierarchy]\n  IFn\n\n  IMultiFn\n  (-reset [mf]\n    (swap! method-table (fn [mf] {}))\n    (swap! method-cache (fn [mf] {}))\n    (swap! prefer-table (fn [mf] {}))\n    (swap! cached-hierarchy (fn [mf] nil))\n    mf)\n\n  (-add-method [mf dispatch-val method]\n    (swap! method-table assoc dispatch-val method)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-remove-method [mf dispatch-val]\n    (swap! method-table dissoc dispatch-val)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-get-method [mf dispatch-val]\n    (when-not (= @cached-hierarchy @hierarchy)\n      (reset-cache method-cache method-table cached-hierarchy hierarchy))\n    (if-let [target-fn (@method-cache dispatch-val)]\n      target-fn\n      (if-let [target-fn (find-and-cache-best-method name dispatch-val hierarchy method-table\n                                                     prefer-table method-cache cached-hierarchy)]\n        target-fn\n        (@method-table default-dispatch-val))))\n\n  (-prefer-method [mf dispatch-val-x dispatch-val-y]\n    (when (prefers* dispatch-val-x dispatch-val-y prefer-table)\n      (throw (js/Error. (str \"Preference conflict in multimethod '\" name \"': \" dispatch-val-y\n                   \" is already preferred to \" dispatch-val-x))))\n    (swap! prefer-table\n           (fn [old]\n             (assoc old dispatch-val-x\n                    (conj (get old dispatch-val-x #{})\n                          dispatch-val-y))))\n    (reset-cache method-cache method-table cached-hierarchy hierarchy))\n\n  (-methods [mf] @method-table)\n  (-prefers [mf] @prefer-table)\n\n  (-dispatch [mf args] (do-dispatch mf name dispatch-fn args))\n\n  IHash\n  (-hash [this] (goog/getUid this)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7627 7676]},
 :full-name "cljs.core/MultiFn",
 :clj-symbol "clojure.lang/MultiFn"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/MultiFn"]))
```

-->
