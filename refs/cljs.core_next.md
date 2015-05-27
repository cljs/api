## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/next

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/next</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/next)
</td>
</tr>
</table>

 <samp>
(__next__ coll)<br>
</samp>

```
Returns a seq of the items after the first. Calls seq on its
argument.  If there are no more items, returns nil
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:434-441](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L434-L441)</ins>
</pre>

```clj
(defn ^seq next
  [coll]
  (when-not (nil? coll)
    (if (satisfies? INext coll false)
      (-next ^not-native coll)
      (seq (rest coll)))))
```


---

```clj
{:return-type seq,
 :ns "cljs.core",
 :name "next",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_next",
 :source {:code "(defn ^seq next\n  [coll]\n  (when-not (nil? coll)\n    (if (satisfies? INext coll false)\n      (-next ^not-native coll)\n      (seq (rest coll)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [434 441],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L434-L441"},
 :full-name "cljs.core/next",
 :clj-symbol "clojure.core/next",
 :docstring "Returns a seq of the items after the first. Calls seq on its\nargument.  If there are no more items, returns nil"}

```
