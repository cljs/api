## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reset-meta!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset-meta!)
</td>
</tr>
</table>

 <samp>
(__reset-meta!__ iref m)<br>
</samp>

```
Atomically resets the metadata for an atom
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6502-6505](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6502-L6505)</ins>
</pre>

```clj
(defn reset-meta!
  [iref m]
  (set! (.-meta iref) m))
```


---

```clj
{:ns "cljs.core",
 :name "reset-meta!",
 :signature ["[iref m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reset-meta_BANG_",
 :source {:code "(defn reset-meta!\n  [iref m]\n  (set! (.-meta iref) m))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6502 6505],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6502-L6505"},
 :full-name "cljs.core/reset-meta!",
 :clj-symbol "clojure.core/reset-meta!",
 :docstring "Atomically resets the metadata for an atom"}

```
