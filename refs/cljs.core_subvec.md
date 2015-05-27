## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subvec

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subvec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subvec)
</td>
</tr>
</table>

 <samp>
(__subvec__ v start)<br>
(__subvec__ v start end)<br>
</samp>

```
Returns a persistent vector of the items in vector from
start (inclusive) to end (exclusive).  If end is not supplied,
defaults to (count vector). This operation is O(1) and very fast, as
the resulting vector shares structure with the original and no
trimming is done.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3192-3201](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3192-L3201)</ins>
</pre>

```clj
(defn subvec
  ([v start]
     (subvec v start (count v)))
  ([v start end]
     (Subvec. nil v start end nil)))
```


---

```clj
{:ns "cljs.core",
 :name "subvec",
 :signature ["[v start]" "[v start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_subvec",
 :source {:code "(defn subvec\n  ([v start]\n     (subvec v start (count v)))\n  ([v start end]\n     (Subvec. nil v start end nil)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3192 3201],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3192-L3201"},
 :full-name "cljs.core/subvec",
 :clj-symbol "clojure.core/subvec",
 :docstring "Returns a persistent vector of the items in vector from\nstart (inclusive) to end (exclusive).  If end is not supplied,\ndefaults to (count vector). This operation is O(1) and very fast, as\nthe resulting vector shares structure with the original and no\ntrimming is done."}

```
