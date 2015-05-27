## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/force

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/force</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/force)
</td>
</tr>
</table>

 <samp>
(__force__ x)<br>
</samp>

```
If x is a Delay, returns the (possibly cached) value of its expression, else returns x
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6575-6580](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6575-L6580)</ins>
</pre>

```clj
(defn force
  [x]
  (if (delay? x)
    (deref x)
    x))
```


---

```clj
{:ns "cljs.core",
 :name "force",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_force",
 :source {:code "(defn force\n  [x]\n  (if (delay? x)\n    (deref x)\n    x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6575 6580],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6575-L6580"},
 :full-name "cljs.core/force",
 :clj-symbol "clojure.core/force",
 :docstring "If x is a Delay, returns the (possibly cached) value of its expression, else returns x"}

```
