## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/alter-meta!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alter-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alter-meta!)
</td>
</tr>
</table>

 <samp>
(__alter-meta!__ iref f & args)<br>
</samp>

```
Atomically sets the metadata for a namespace/var/ref/agent/atom to be:

(apply f its-current-meta args)

f must be free of side-effects
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6493-6500](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L6493-L6500)</ins>
</pre>

```clj
(defn alter-meta!
  [iref f & args]
  (set! (.-meta iref) (apply f (.-meta iref) args)))
```


---

```clj
{:ns "cljs.core",
 :name "alter-meta!",
 :signature ["[iref f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_alter-meta_BANG_",
 :source {:code "(defn alter-meta!\n  [iref f & args]\n  (set! (.-meta iref) (apply f (.-meta iref) args)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6493 6500],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L6493-L6500"},
 :full-name "cljs.core/alter-meta!",
 :clj-symbol "clojure.core/alter-meta!",
 :docstring "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:\n\n(apply f its-current-meta args)\n\nf must be free of side-effects"}

```
