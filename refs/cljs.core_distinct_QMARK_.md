## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/distinct?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/distinct?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/distinct?)
</td>
</tr>
</table>

 <samp>
(__distinct?__ x)<br>
(__distinct?__ x y)<br>
(__distinct?__ x y & more)<br>
</samp>

```
Returns true if no two of the arguments are =
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1061-1075](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1061-L1075)</ins>
</pre>

```clj
(defn ^boolean distinct?
  ([x] true)
  ([x y] (not (= x y)))
  ([x y & more]
     (if (not (= x y))
     (loop [s #{x y} xs more]
       (let [x (first xs)
             etc (next xs)]
         (if xs
           (if (contains? s x)
             false
             (recur (conj s x) etc))
           true)))
     false)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "distinct?",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_distinct_QMARK_",
 :source {:code "(defn ^boolean distinct?\n  ([x] true)\n  ([x y] (not (= x y)))\n  ([x y & more]\n     (if (not (= x y))\n     (loop [s #{x y} xs more]\n       (let [x (first xs)\n             etc (next xs)]\n         (if xs\n           (if (contains? s x)\n             false\n             (recur (conj s x) etc))\n           true)))\n     false)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1061 1075],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L1061-L1075"},
 :full-name "cljs.core/distinct?",
 :clj-symbol "clojure.core/distinct?",
 :docstring "Returns true if no two of the arguments are ="}

```
