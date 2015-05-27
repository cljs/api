## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/select

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/select</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/select)
</td>
</tr>
</table>

 <samp>
(__select__ pred xset)<br>
</samp>

```
Returns a set of the elements for which pred is true
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:61-65](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/set.cljs#L61-L65)</ins>
</pre>

```clj
(defn select
  [pred xset]
    (reduce (fn [s k] (if (pred k) s (disj s k)))
            xset xset))
```


---

```clj
{:ns "clojure.set",
 :name "select",
 :signature ["[pred xset]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_select",
 :source {:code "(defn select\n  [pred xset]\n    (reduce (fn [s k] (if (pred k) s (disj s k)))\n            xset xset))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [61 65],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/set.cljs#L61-L65"},
 :full-name "clojure.set/select",
 :clj-symbol "clojure.set/select",
 :docstring "Returns a set of the elements for which pred is true"}

```
