## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/repeat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeat)
</td>
</tr>
</table>

 <samp>
(__repeat__ x)<br>
(__repeat__ n x)<br>
</samp>

```
Returns a lazy (infinite!, or length n if supplied) sequence of xs.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1767-1770](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1767-L1770)</ins>
</pre>

```clj
(defn repeat
  ([x] (lazy-seq (cons x (repeat x))))
  ([n x] (take n (repeat x))))
```


---

```clj
{:ns "cljs.core",
 :name "repeat",
 :signature ["[x]" "[n x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_repeat",
 :source {:code "(defn repeat\n  ([x] (lazy-seq (cons x (repeat x))))\n  ([n x] (take n (repeat x))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1767 1770],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L1767-L1770"},
 :full-name "cljs.core/repeat",
 :clj-symbol "clojure.core/repeat",
 :docstring "Returns a lazy (infinite!, or length n if supplied) sequence of xs."}

```
