## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/repeatedly

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeatedly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeatedly)
</td>
</tr>
</table>

 <samp>
(__repeatedly__ f)<br>
(__repeatedly__ n f)<br>
</samp>

```
Takes a function of no args, presumably with side effects, and
returns an infinite (or length n if supplied) lazy sequence of calls
to it
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2546-2551](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2546-L2551)</ins>
</pre>

```clj
(defn repeatedly
  ([f] (lazy-seq (cons (f) (repeatedly f))))
  ([n f] (take n (repeatedly f))))
```


---

```clj
{:ns "cljs.core",
 :name "repeatedly",
 :signature ["[f]" "[n f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_repeatedly",
 :source {:code "(defn repeatedly\n  ([f] (lazy-seq (cons (f) (repeatedly f))))\n  ([n f] (take n (repeatedly f))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2546 2551],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2546-L2551"},
 :full-name "cljs.core/repeatedly",
 :clj-symbol "clojure.core/repeatedly",
 :docstring "Takes a function of no args, presumably with side effects, and\nreturns an infinite (or length n if supplied) lazy sequence of calls\nto it"}

```
