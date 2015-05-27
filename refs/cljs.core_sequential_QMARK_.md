## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/sequential?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sequential?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequential?)
</td>
</tr>
</table>

 <samp>
(__sequential?__ x)<br>
</samp>

```
Returns true if coll satisfies ISequential
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1076-1078](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1076-L1078)</ins>
</pre>

```clj
(defn ^boolean sequential?
  [x] (satisfies? ISequential x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "sequential?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_sequential_QMARK_",
 :source {:code "(defn ^boolean sequential?\n  [x] (satisfies? ISequential x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1076 1078],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1076-L1078"},
 :full-name "cljs.core/sequential?",
 :clj-symbol "clojure.core/sequential?",
 :docstring "Returns true if coll satisfies ISequential"}

```
