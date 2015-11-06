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







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L8944-L9127):

```clj
(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy
                  method-table prefer-table method-cache cached-hierarchy]
  IFn
  (-invoke [mf]
    (let [dispatch-val (dispatch-fn)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn)))
  (-invoke [mf a]
    (let [dispatch-val (dispatch-fn a)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a)))
  (-invoke [mf a b]
    (let [dispatch-val (dispatch-fn a b)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b)))
  (-invoke [mf a b c]
    (let [dispatch-val (dispatch-fn a b c)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c)))
  (-invoke [mf a b c d]
    (let [dispatch-val (dispatch-fn a b c d)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d)))
  (-invoke [mf a b c d e]
    (let [dispatch-val (dispatch-fn a b c d e)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e)))
  (-invoke [mf a b c d e f]
    (let [dispatch-val (dispatch-fn a b c d e f)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f)))
  (-invoke [mf a b c d e f g]
    (let [dispatch-val (dispatch-fn a b c d e f g)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g)))
  (-invoke [mf a b c d e f g h]
    (let [dispatch-val (dispatch-fn a b c d e f g h)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h)))
  (-invoke [mf a b c d e f g h i]
    (let [dispatch-val (dispatch-fn a b c d e f g h i)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i)))
  (-invoke [mf a b c d e f g h i j]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j)))
  (-invoke [mf a b c d e f g h i j k]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k)))
  (-invoke [mf a b c d e f g h i j k l]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l)))
  (-invoke [mf a b c d e f g h i j k l m]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m)))
  (-invoke [mf a b c d e f g h i j k l m n]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n)))
  (-invoke [mf a b c d e f g h i j k l m n o]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o)))
  (-invoke [mf a b c d e f g h i j k l m n o p]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o p)))
  (-invoke [mf a b c d e f g h i j k l m n o p q]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o p q)))
  (-invoke [mf a b c d e f g h i j k l m n o p q r]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o p q r)))
  (-invoke [mf a b c d e f g h i j k l m n o p q r s]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r s)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o p q r s)))
  (-invoke [mf a b c d e f g h i j k l m n o p q r s t]
    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r s t)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (target-fn a b c d e f g h i j k l m n o p q r s t)))
  (-invoke [mf a b c d e f g h i j k l m n o p q r s t rest]
    (let [dispatch-val (apply dispatch-fn a b c d e f g h i j k l m n o p q r s t rest)
          target-fn (-get-method mf dispatch-val)]
      (when-not target-fn
        (throw-no-method-error name dispatch-val))
      (apply target-fn a b c d e f g h i j k l m n o p q r s t rest)))
    
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
  
  INamed
  (-name [this] (-name name))
  (-namespace [this] (-namespace name))

  IHash
  (-hash [this] (goog/getUid this)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8944-9127](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L8944-L9127)</ins>
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
 :source {:code "(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy\n                  method-table prefer-table method-cache cached-hierarchy]\n  IFn\n  (-invoke [mf]\n    (let [dispatch-val (dispatch-fn)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn)))\n  (-invoke [mf a]\n    (let [dispatch-val (dispatch-fn a)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a)))\n  (-invoke [mf a b]\n    (let [dispatch-val (dispatch-fn a b)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b)))\n  (-invoke [mf a b c]\n    (let [dispatch-val (dispatch-fn a b c)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c)))\n  (-invoke [mf a b c d]\n    (let [dispatch-val (dispatch-fn a b c d)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d)))\n  (-invoke [mf a b c d e]\n    (let [dispatch-val (dispatch-fn a b c d e)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e)))\n  (-invoke [mf a b c d e f]\n    (let [dispatch-val (dispatch-fn a b c d e f)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f)))\n  (-invoke [mf a b c d e f g]\n    (let [dispatch-val (dispatch-fn a b c d e f g)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g)))\n  (-invoke [mf a b c d e f g h]\n    (let [dispatch-val (dispatch-fn a b c d e f g h)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h)))\n  (-invoke [mf a b c d e f g h i]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i)))\n  (-invoke [mf a b c d e f g h i j]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j)))\n  (-invoke [mf a b c d e f g h i j k]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k)))\n  (-invoke [mf a b c d e f g h i j k l]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l)))\n  (-invoke [mf a b c d e f g h i j k l m]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m)))\n  (-invoke [mf a b c d e f g h i j k l m n]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n)))\n  (-invoke [mf a b c d e f g h i j k l m n o]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o)))\n  (-invoke [mf a b c d e f g h i j k l m n o p]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o p)))\n  (-invoke [mf a b c d e f g h i j k l m n o p q]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o p q)))\n  (-invoke [mf a b c d e f g h i j k l m n o p q r]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o p q r)))\n  (-invoke [mf a b c d e f g h i j k l m n o p q r s]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r s)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o p q r s)))\n  (-invoke [mf a b c d e f g h i j k l m n o p q r s t]\n    (let [dispatch-val (dispatch-fn a b c d e f g h i j k l m n o p q r s t)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (target-fn a b c d e f g h i j k l m n o p q r s t)))\n  (-invoke [mf a b c d e f g h i j k l m n o p q r s t rest]\n    (let [dispatch-val (apply dispatch-fn a b c d e f g h i j k l m n o p q r s t rest)\n          target-fn (-get-method mf dispatch-val)]\n      (when-not target-fn\n        (throw-no-method-error name dispatch-val))\n      (apply target-fn a b c d e f g h i j k l m n o p q r s t rest)))\n    \n  IMultiFn\n  (-reset [mf]\n    (swap! method-table (fn [mf] {}))\n    (swap! method-cache (fn [mf] {}))\n    (swap! prefer-table (fn [mf] {}))\n    (swap! cached-hierarchy (fn [mf] nil))\n    mf)\n\n  (-add-method [mf dispatch-val method]\n    (swap! method-table assoc dispatch-val method)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-remove-method [mf dispatch-val]\n    (swap! method-table dissoc dispatch-val)\n    (reset-cache method-cache method-table cached-hierarchy hierarchy)\n    mf)\n\n  (-get-method [mf dispatch-val]\n    (when-not (= @cached-hierarchy @hierarchy)\n      (reset-cache method-cache method-table cached-hierarchy hierarchy))\n    (if-let [target-fn (@method-cache dispatch-val)]\n      target-fn\n      (if-let [target-fn (find-and-cache-best-method name dispatch-val hierarchy method-table\n                                                     prefer-table method-cache cached-hierarchy)]\n        target-fn\n        (@method-table default-dispatch-val))))\n\n  (-prefer-method [mf dispatch-val-x dispatch-val-y]\n    (when (prefers* dispatch-val-x dispatch-val-y prefer-table)\n      (throw (js/Error. (str \"Preference conflict in multimethod '\" name \"': \" dispatch-val-y\n                   \" is already preferred to \" dispatch-val-x))))\n    (swap! prefer-table\n           (fn [old]\n             (assoc old dispatch-val-x\n                    (conj (get old dispatch-val-x #{})\n                          dispatch-val-y))))\n    (reset-cache method-cache method-table cached-hierarchy hierarchy))\n\n  (-methods [mf] @method-table)\n  (-prefers [mf] @prefer-table)\n  \n  INamed\n  (-name [this] (-name name))\n  (-namespace [this] (-namespace name))\n\n  IHash\n  (-hash [this] (goog/getUid this)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8944 9127]},
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
