## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/some

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some)
</td>
</tr>
</table>

 <samp>
(__some__ pred coll)<br>
</samp>

```
Returns the first logical true value of (pred x) for any x in coll,
else nil.  One common idiom is to use a set as pred, for example
this will return :fred if :fred is in the sequence, otherwise nil:
(some #{:fred} coll)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2225-2232](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L2225-L2232)</ins>
</pre>

```clj
(defn some
  [pred coll]
    (when (seq coll)
      (or (pred (first coll)) (recur pred (next coll)))))
```


---

```clj
{:ns "cljs.core",
 :name "some",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_some",
 :source {:code "(defn some\n  [pred coll]\n    (when (seq coll)\n      (or (pred (first coll)) (recur pred (next coll)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2225 2232],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L2225-L2232"},
 :full-name "cljs.core/some",
 :clj-symbol "clojure.core/some",
 :docstring "Returns the first logical true value of (pred x) for any x in coll,\nelse nil.  One common idiom is to use a set as pred, for example\nthis will return :fred if :fred is in the sequence, otherwise nil:\n(some #{:fred} coll)"}

```
