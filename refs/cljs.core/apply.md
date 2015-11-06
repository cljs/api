## cljs.core/apply



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/apply</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/apply)
</td>
</tr>
</table>


 <samp>
(__apply__ f args)<br>
</samp>
 <samp>
(__apply__ f x args)<br>
</samp>
 <samp>
(__apply__ f x y args)<br>
</samp>
 <samp>
(__apply__ f x y z args)<br>
</samp>
 <samp>
(__apply__ f a b c d & args)<br>
</samp>

---

Applies function `f` to the argument list formed by prepending intervening
arguments to `args`.



---

###### Examples:

```clj
(max 1 2 3)
;;=> 3

(apply max [1 2 3])
;;=> 3

(apply max 1 [2 3])
;;=> 3
```



---

###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>

---


Source docstring:

```
Applies fn f to the argument list formed by prepending intervening arguments to args.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L3075-L3120):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3075-3120](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L3075-L3120)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/apply` @ clojuredocs](http://clojuredocs.org/clojure.core/apply)<br>
[`clojure.core/apply` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/apply/)<br>
[`clojure.core/apply` @ crossclj](http://crossclj.info/fun/clojure.core/apply.html)<br>
[`cljs.core/apply` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/apply.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/apply.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Applies function `f` to the argument list formed by prepending intervening\narguments to `args`.",
 :ns "cljs.core",
 :name "apply",
 :signature ["[f args]"
             "[f x args]"
             "[f x y args]"
             "[f x y z args]"
             "[f a b c d & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map"],
 :full-name-encode "cljs.core/apply",
 :source {:code "(defn apply\n  ([f args]\n     (let [fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count args (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc args)\n            (.cljs$lang$applyTo f args)))\n         (.apply f f (to-array args)))))\n  ([f x args]\n     (let [arglist (list* x args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f x y args]\n     (let [arglist (list* x y args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f x y z args]\n     (let [arglist (list* x y z args)\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist)))))\n  ([f a b c d & args]\n     (let [arglist (cons a (cons b (cons c (cons d (spread args)))))\n           fixed-arity (.-cljs$lang$maxFixedArity f)]\n       (if (.-cljs$lang$applyTo f)\n         (let [bc (bounded-count arglist (inc fixed-arity))]\n          (if (<= bc fixed-arity)\n            (apply-to f bc arglist)\n            (.cljs$lang$applyTo f arglist)))\n         (.apply f f (to-array arglist))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3075 3120]},
 :examples [{:id "174052",
             :content "```clj\n(max 1 2 3)\n;;=> 3\n\n(apply max [1 2 3])\n;;=> 3\n\n(apply max 1 [2 3])\n;;=> 3\n```"}],
 :full-name "cljs.core/apply",
 :clj-symbol "clojure.core/apply",
 :docstring "Applies fn f to the argument list formed by prepending intervening arguments to args."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/apply"]))
```

-->
