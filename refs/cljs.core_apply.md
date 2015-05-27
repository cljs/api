## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/apply

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/apply</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/apply)
</td>
</tr>
</table>

 <samp>
(__apply__ f args)<br>
(__apply__ f x args)<br>
(__apply__ f x y args)<br>
(__apply__ f x y z args)<br>
(__apply__ f a b c d & args)<br>
</samp>

```
Applies fn f to the argument list formed by prepending intervening arguments to args.
First cut.  Not lazy.  Needs to use emitted toApply.
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2145-2191](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L2145-L2191)</ins>
</pre>

```clj
(defn apply
  ([f args]
     (let [fixed-arity (.-cljs$lang$maxFixedArity f)]
       (if (.-cljs$lang$applyTo f)
         (let [bc (bounded-count args (inc fixed-arity))]
          (if (<= bc fixed-arity)
            (apply-to f bc args)
            (.cljs$lang$applyTo f args)))
         (.apply f f (to-array args)))))
  ([f x args]
     (let [arglist (list* x args)
           fixed-arity (.-cljs$lang$maxFixedArity f)]
       (if (.-cljs$lang$applyTo f)
         (let [bc (bounded-count arglist (inc fixed-arity))]
          (if (<= bc fixed-arity)
            (apply-to f bc arglist)
            (.cljs$lang$applyTo f arglist)))
         (.apply f f (to-array arglist)))))
  ([f x y args]
     (let [arglist (list* x y args)
           fixed-arity (.-cljs$lang$maxFixedArity f)]
       (if (.-cljs$lang$applyTo f)
         (let [bc (bounded-count arglist (inc fixed-arity))]
          (if (<= bc fixed-arity)
            (apply-to f bc arglist)
            (.cljs$lang$applyTo f arglist)))
         (.apply f f (to-array arglist)))))
  ([f x y z args]
     (let [arglist (list* x y z args)
           fixed-arity (.-cljs$lang$maxFixedArity f)]
       (if (.-cljs$lang$applyTo f)
         (let [bc (bounded-count arglist (inc fixed-arity))]
          (if (<= bc fixed-arity)
            (apply-to f bc arglist)
            (.cljs$lang$applyTo f arglist)))
         (.apply f f (to-array arglist)))))
  ([f a b c d & args]
     (let [arglist (cons a (cons b (cons c (cons d (spread args)))))
           fixed-arity (.-cljs$lang$maxFixedArity f)]
       (if (.-cljs$lang$applyTo f)
         (let [bc (bounded-count arglist (inc fixed-arity))]
          (if (<= bc fixed-arity)
            (apply-to f bc arglist)
            (.cljs$lang$applyTo f arglist)))
         (.apply f f (to-array arglist))))))
```


---

```clj
{:ns "cljs.core",
 :name "apply",
 :signature ["[f args]"
             "[f x args]"
             "[f x y args]"
             "[f x y z args]"
             "[f a b c d & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_apply",
 :source {:code "(defn apply\n  ([f args]\n     (let [fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count args (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc args)\n            (.cljs$lang$applyTo f args)))\n         (.apply f f (to-array args)))))\n  ([f x args]\n     (let [arglist (list* x args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f x y args]\n     (let [arglist (list* x y args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f x y z args]\n     (let [arglist (list* x y z args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f a b c d & args]\n     (let [arglist (cons a (cons b (cons c (cons d (spread args)))))\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2145 2191],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L2145-L2191"},
 :full-name "cljs.core/apply",
 :clj-symbol "clojure.core/apply",
 :docstring "Applies fn f to the argument list formed by prepending intervening arguments to args.\nFirst cut.  Not lazy.  Needs to use emitted toApply."}

```
