## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/remove-watch

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-watch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-watch)
</td>
</tr>
</table>

 <samp>
(__remove-watch__ iref key)<br>
</samp>

```
Alpha - subject to change.

Removes a watch (set by add-watch) from a reference
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3152-3157](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3152-L3157)</ins>
</pre>

```clj
(defn remove-watch
  [iref key]
  (-remove-watch iref key))
```


---

```clj
{:ns "cljs.core",
 :name "remove-watch",
 :signature ["[iref key]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_remove-watch",
 :source {:code "(defn remove-watch\n  [iref key]\n  (-remove-watch iref key))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3152 3157],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L3152-L3157"},
 :full-name "cljs.core/remove-watch",
 :clj-symbol "clojure.core/remove-watch",
 :docstring "Alpha - subject to change.\n\nRemoves a watch (set by add-watch) from a reference"}

```
