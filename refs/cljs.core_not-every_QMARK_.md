## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not-every?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not-every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not-every?)
</td>
</tr>
</table>

 <samp>
(__not-every?__ pred coll)<br>
</samp>

```
Returns false if (pred x) is logical true for every x in
coll, else true.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2154-2157](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2154-L2157)</ins>
</pre>

```clj
(defn ^boolean not-every?
  [pred coll] (not (every? pred coll)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "not-every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not-every_QMARK_",
 :source {:code "(defn ^boolean not-every?\n  [pred coll] (not (every? pred coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2154 2157],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2154-L2157"},
 :full-name "cljs.core/not-every?",
 :clj-symbol "clojure.core/not-every?",
 :docstring "Returns false if (pred x) is logical true for every x in\ncoll, else true."}

```
