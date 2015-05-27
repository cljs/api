## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/comp

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comp</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comp)
</td>
</tr>
</table>

 <samp>
(__comp__)<br>
(__comp__ f)<br>
(__comp__ f g)<br>
(__comp__ f g h)<br>
(__comp__ f1 f2 f3 & fs)<br>
</samp>

```
Takes a set of functions and returns a fn that is the composition
of those fns.  The returned fn takes a variable number of args,
applies the rightmost of fns to the args, the next
fn (right-to-left) to the result, etc.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2199-2226](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2199-L2226)</ins>
</pre>

```clj
(defn comp
  ([] identity)
  ([f] f)
  ([f g]
     (fn
       ([] (f (g)))
       ([x] (f (g x)))
       ([x y] (f (g x y)))
       ([x y z] (f (g x y z)))
       ([x y z & args] (f (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (f (g (h))))
       ([x] (f (g (h x))))
       ([x y] (f (g (h x y))))
       ([x y z] (f (g (h x y z))))
       ([x y z & args] (f (g (apply h x y z args))))))
  ([f1 f2 f3 & fs]
    (let [fs (reverse (list* f1 f2 f3 fs))]
      (fn [& args]
        (loop [ret (apply (first fs) args) fs (next fs)]
          (if fs
            (recur ((first fs) ret) (next fs))
            ret))))))
```


---

```clj
{:ns "cljs.core",
 :name "comp",
 :signature ["[]" "[f]" "[f g]" "[f g h]" "[f1 f2 f3 & fs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_comp",
 :source {:code "(defn comp\n  ([] identity)\n  ([f] f)\n  ([f g]\n     (fn\n       ([] (f (g)))\n       ([x] (f (g x)))\n       ([x y] (f (g x y)))\n       ([x y z] (f (g x y z)))\n       ([x y z & args] (f (apply g x y z args)))))\n  ([f g h]\n     (fn\n       ([] (f (g (h))))\n       ([x] (f (g (h x))))\n       ([x y] (f (g (h x y))))\n       ([x y z] (f (g (h x y z))))\n       ([x y z & args] (f (g (apply h x y z args))))))\n  ([f1 f2 f3 & fs]\n    (let [fs (reverse (list* f1 f2 f3 fs))]\n      (fn [& args]\n        (loop [ret (apply (first fs) args) fs (next fs)]\n          (if fs\n            (recur ((first fs) ret) (next fs))\n            ret))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2199 2226],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2199-L2226"},
 :full-name "cljs.core/comp",
 :clj-symbol "clojure.core/comp",
 :docstring "Takes a set of functions and returns a fn that is the composition\nof those fns.  The returned fn takes a variable number of args,\napplies the rightmost of fns to the args, the next\nfn (right-to-left) to the result, etc."}

```
