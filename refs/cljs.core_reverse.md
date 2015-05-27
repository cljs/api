## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reverse

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reverse)
</td>
</tr>
</table>

 <samp>
(__reverse__ coll)<br>
</samp>

```
Returns a seq of the items in coll in reverse order. Not lazy.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1627-1632](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1627-L1632)</ins>
</pre>

```clj
(defn reverse
  [coll]
  (if (reversible? coll)
    (rseq coll)
    (reduce conj () coll)))
```


---

```clj
{:ns "cljs.core",
 :name "reverse",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reverse",
 :source {:code "(defn reverse\n  [coll]\n  (if (reversible? coll)\n    (rseq coll)\n    (reduce conj () coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1627 1632],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1627-L1632"},
 :full-name "cljs.core/reverse",
 :clj-symbol "clojure.core/reverse",
 :docstring "Returns a seq of the items in coll in reverse order. Not lazy."}

```
