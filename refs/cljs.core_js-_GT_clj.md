## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js->clj

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js->clj__ x)<br>
(__js->clj__ x & opts)<br>
</samp>

```
Recursively transforms JavaScript arrays into ClojureScript
vectors, and JavaScript objects into ClojureScript maps.  With
option ':keywordize-keys true' will convert object fields from
strings to keywords.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6858-6888](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6858-L6888)</ins>
</pre>

```clj
(defn js->clj
  ([x] (js->clj x {:keywordize-keys false}))
  ([x & opts]
    (cond
      (satisfies? x IEncodeClojure)
      (-js->clj x (apply array-map opts))

      (seq opts)
      (let [{:keys [keywordize-keys]} opts
            keyfn (if keywordize-keys keyword str)
            f (fn thisfn [x]
                (cond
                  (seq? x)
                  (doall (map thisfn x))

                  (coll? x)
                  (into (empty x) (map thisfn x))

                  (array? x)
                  (vec (map thisfn x))
                   
                  (identical? (type x) js/Object)
                  (into {} (for [k (js-keys x)]
                             [(keyfn k) (thisfn (aget x k))]))

                  :else x))]
        (f x)))))
```


---

```clj
{:full-name "cljs.core/js->clj",
 :ns "cljs.core",
 :name "js->clj",
 :docstring "Recursively transforms JavaScript arrays into ClojureScript\nvectors, and JavaScript objects into ClojureScript maps.  With\noption ':keywordize-keys true' will convert object fields from\nstrings to keywords.",
 :type "function",
 :signature ["[x]" "[x & opts]"],
 :source {:code "(defn js->clj\n  ([x] (js->clj x {:keywordize-keys false}))\n  ([x & opts]\n    (cond\n      (satisfies? x IEncodeClojure)\n      (-js->clj x (apply array-map opts))\n\n      (seq opts)\n      (let [{:keys [keywordize-keys]} opts\n            keyfn (if keywordize-keys keyword str)\n            f (fn thisfn [x]\n                (cond\n                  (seq? x)\n                  (doall (map thisfn x))\n\n                  (coll? x)\n                  (into (empty x) (map thisfn x))\n\n                  (array? x)\n                  (vec (map thisfn x))\n                   \n                  (identical? (type x) js/Object)\n                  (into {} (for [k (js-keys x)]\n                             [(keyfn k) (thisfn (aget x k))]))\n\n                  :else x))]\n        (f x)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6858 6888],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6858-L6888"},
 :full-name-encode "cljs.core_js-_GT_clj",
 :history [["+" "0.0-927"]]}

```
