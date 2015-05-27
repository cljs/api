## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/get

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/get</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/get)
</td>
</tr>
</table>

 <samp>
(__get__ o k)<br>
(__get__ o k not-found)<br>
</samp>

```
Returns the value mapped to key, not-found or nil if key not present.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:909-949](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L909-L949)</ins>
</pre>

```clj
(defn get
  ([o k]
    (when-not (nil? o)
      (cond
        (satisfies? ILookup o false)
        (-lookup ^not-native o k)

        (array? o)
        (when (< k (.-length o))
          (aget o k))
        
        (string? o)
        (when (< k (.-length o))
          (aget o k))

        (type_satisfies_ ILookup o)
        (-lookup o k)
        
        :else nil)))
  ([o k not-found]
    (if-not (nil? o)
      (cond
        (satisfies? ILookup o false)
        (-lookup ^not-native o k not-found)

        (array? o)
        (if (< k (.-length o))
          (aget o k)
          not-found)
        
        (string? o)
        (if (< k (.-length o))
          (aget o k)
          not-found)

        (type_satisfies_ ILookup o)
        (-lookup o k not-found)

        :else not-found)
      not-found)))
```


---

```clj
{:ns "cljs.core",
 :name "get",
 :signature ["[o k]" "[o k not-found]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_get",
 :source {:code "(defn get\n  ([o k]\n    (when-not (nil? o)\n      (cond\n        (satisfies? ILookup o false)\n        (-lookup ^not-native o k)\n\n        (array? o)\n        (when (< k (.-length o))\n          (aget o k))\n        \n        (string? o)\n        (when (< k (.-length o))\n          (aget o k))\n\n        (type_satisfies_ ILookup o)\n        (-lookup o k)\n        \n        :else nil)))\n  ([o k not-found]\n    (if-not (nil? o)\n      (cond\n        (satisfies? ILookup o false)\n        (-lookup ^not-native o k not-found)\n\n        (array? o)\n        (if (< k (.-length o))\n          (aget o k)\n          not-found)\n        \n        (string? o)\n        (if (< k (.-length o))\n          (aget o k)\n          not-found)\n\n        (type_satisfies_ ILookup o)\n        (-lookup o k not-found)\n\n        :else not-found)\n      not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [909 949],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L909-L949"},
 :full-name "cljs.core/get",
 :clj-symbol "clojure.core/get",
 :docstring "Returns the value mapped to key, not-found or nil if key not present."}

```
