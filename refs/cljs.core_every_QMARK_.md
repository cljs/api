## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/every?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/every?)
</td>
</tr>
</table>

 <samp>
(__every?__ pred coll)<br>
</samp>

```
Returns true if (pred x) is logical true for every x in coll, else
false.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2145-2152](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2145-L2152)</ins>
</pre>

```clj
(defn ^boolean every?
  [pred coll]
  (cond
   (nil? (seq coll)) true
   (pred (first coll)) (recur pred (next coll))
   :else false))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_every_QMARK_",
 :source {:code "(defn ^boolean every?\n  [pred coll]\n  (cond\n   (nil? (seq coll)) true\n   (pred (first coll)) (recur pred (next coll))\n   :else false))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2145 2152],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2145-L2152"},
 :full-name "cljs.core/every?",
 :clj-symbol "clojure.core/every?",
 :docstring "Returns true if (pred x) is logical true for every x in coll, else\nfalse."}

```
