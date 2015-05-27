## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list)
</td>
</tr>
</table>

 <samp>
(__list__)<br>
(__list__ x)<br>
(__list__ x y)<br>
(__list__ x y z)<br>
(__list__ x y z & items)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1634-1641](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1634-L1641)</ins>
</pre>

```clj
(defn list
  ([] ())
  ([x] (conj () x))
  ([x y] (conj (list y) x))
  ([x y z] (conj (list y z) x))
  ([x y z & items]
     (conj (conj (conj (reduce conj () (reverse items))
                       z) y) x)))
```


---

```clj
{:full-name "cljs.core/list",
 :ns "cljs.core",
 :name "list",
 :type "function",
 :signature ["[]" "[x]" "[x y]" "[x y z]" "[x y z & items]"],
 :source {:code "(defn list\n  ([] ())\n  ([x] (conj () x))\n  ([x y] (conj (list y) x))\n  ([x y z] (conj (list y z) x))\n  ([x y z & items]\n     (conj (conj (conj (reduce conj () (reverse items))\n                       z) y) x)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1634 1641],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1634-L1641"},
 :full-name-encode "cljs.core_list",
 :clj-symbol "clojure.core/list",
 :history [["+" "0.0-927"]]}

```
