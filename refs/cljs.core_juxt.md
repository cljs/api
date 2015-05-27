## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/juxt

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/juxt</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/juxt)
</td>
</tr>
</table>

 <samp>
(__juxt__ f)<br>
(__juxt__ f g)<br>
(__juxt__ f g h)<br>
(__juxt__ f g h & fs)<br>
</samp>

```
Takes a set of functions and returns a fn that is the juxtaposition
of those fns.  The returned fn takes a variable number of args, and
returns a vector containing the result of applying each fn to the
args (left-to-right).
((juxt a b c) x) => [(a x) (b x) (c x)]
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6107-6141](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6107-L6141)</ins>
</pre>

```clj
(defn juxt
  ([f]
     (fn
       ([] (vector (f)))
       ([x] (vector (f x)))
       ([x y] (vector (f x y)))
       ([x y z] (vector (f x y z)))
       ([x y z & args] (vector (apply f x y z args)))))
  ([f g]
     (fn
       ([] (vector (f) (g)))
       ([x] (vector (f x) (g x)))
       ([x y] (vector (f x y) (g x y)))
       ([x y z] (vector (f x y z) (g x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (vector (f) (g) (h)))
       ([x] (vector (f x) (g x) (h x)))
       ([x y] (vector (f x y) (g x y) (h x y)))
       ([x y z] (vector (f x y z) (g x y z) (h x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args) (apply h x y z args)))))
  ([f g h & fs]
     (let [fs (list* f g h fs)]
       (fn
         ([] (reduce #(conj %1 (%2)) [] fs))
         ([x] (reduce #(conj %1 (%2 x)) [] fs))
         ([x y] (reduce #(conj %1 (%2 x y)) [] fs))
         ([x y z] (reduce #(conj %1 (%2 x y z)) [] fs))
         ([x y z & args] (reduce #(conj %1 (apply %2 x y z args)) [] fs))))))
```


---

```clj
{:ns "cljs.core",
 :name "juxt",
 :signature ["[f]" "[f g]" "[f g h]" "[f g h & fs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_juxt",
 :source {:code "(defn juxt\n  ([f]\n     (fn\n       ([] (vector (f)))\n       ([x] (vector (f x)))\n       ([x y] (vector (f x y)))\n       ([x y z] (vector (f x y z)))\n       ([x y z & args] (vector (apply f x y z args)))))\n  ([f g]\n     (fn\n       ([] (vector (f) (g)))\n       ([x] (vector (f x) (g x)))\n       ([x y] (vector (f x y) (g x y)))\n       ([x y z] (vector (f x y z) (g x y z)))\n       ([x y z & args] (vector (apply f x y z args) (apply g x y z args)))))\n  ([f g h]\n     (fn\n       ([] (vector (f) (g) (h)))\n       ([x] (vector (f x) (g x) (h x)))\n       ([x y] (vector (f x y) (g x y) (h x y)))\n       ([x y z] (vector (f x y z) (g x y z) (h x y z)))\n       ([x y z & args] (vector (apply f x y z args) (apply g x y z args) (apply h x y z args)))))\n  ([f g h & fs]\n     (let [fs (list* f g h fs)]\n       (fn\n         ([] (reduce #(conj %1 (%2)) [] fs))\n         ([x] (reduce #(conj %1 (%2 x)) [] fs))\n         ([x y] (reduce #(conj %1 (%2 x y)) [] fs))\n         ([x y z] (reduce #(conj %1 (%2 x y z)) [] fs))\n         ([x y z & args] (reduce #(conj %1 (apply %2 x y z args)) [] fs))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6107 6141],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L6107-L6141"},
 :full-name "cljs.core/juxt",
 :clj-symbol "clojure.core/juxt",
 :docstring "Takes a set of functions and returns a fn that is the juxtaposition\nof those fns.  The returned fn takes a variable number of args, and\nreturns a vector containing the result of applying each fn to the\nargs (left-to-right).\n((juxt a b c) x) => [(a x) (b x) (c x)]"}

```
