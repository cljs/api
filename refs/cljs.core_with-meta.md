## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-meta

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-meta)
</td>
</tr>
</table>

 <samp>
(__with-meta__ o meta)<br>
</samp>

```
Returns an object of the same type and value as obj, with
map m as its metadata.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:977-989](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L977-L989)</ins>
</pre>

```clj
(defn with-meta
  [o meta]
  (if (and (fn? o) (not (satisfies? IWithMeta o)))
    (with-meta
      (reify
        Fn
        IFn
        (-invoke [_ & args]
          (apply o args)))
      meta)
    (-with-meta o meta)))
```


---

```clj
{:ns "cljs.core",
 :name "with-meta",
 :signature ["[o meta]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_with-meta",
 :source {:code "(defn with-meta\n  [o meta]\n  (if (and (fn? o) (not (satisfies? IWithMeta o)))\n    (with-meta\n      (reify\n        Fn\n        IFn\n        (-invoke [_ & args]\n          (apply o args)))\n      meta)\n    (-with-meta o meta)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [977 989],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L977-L989"},
 :full-name "cljs.core/with-meta",
 :clj-symbol "clojure.core/with-meta",
 :docstring "Returns an object of the same type and value as obj, with\nmap m as its metadata."}

```
