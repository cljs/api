## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/every-pred

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/every-pred</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/every-pred)
</td>
</tr>
</table>

 <samp>
(__every-pred__ p)<br>
(__every-pred__ p1 p2)<br>
(__every-pred__ p1 p2 p3)<br>
(__every-pred__ p1 p2 p3 & ps)<br>
</samp>

```
Takes a set of predicates and returns a function f that returns true if all of its
composing predicates return a logical true value against all of its arguments, else it returns
false. Note that f is short-circuiting in that it will stop execution on the first
argument that triggers a logical false result against the original predicates.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2367-2404](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2367-L2404)</ins>
</pre>

```clj
(defn every-pred
  ([p]
     (fn ep1
       ([] true)
       ([x] (boolean (p x)))
       ([x y] (boolean (and (p x) (p y))))
       ([x y z] (boolean (and (p x) (p y) (p z))))
       ([x y z & args] (boolean (and (ep1 x y z)
                                     (every? p args))))))
  ([p1 p2]
     (fn ep2
       ([] true)
       ([x] (boolean (and (p1 x) (p2 x))))
       ([x y] (boolean (and (p1 x) (p1 y) (p2 x) (p2 y))))
       ([x y z] (boolean (and (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z))))
       ([x y z & args] (boolean (and (ep2 x y z)
                                     (every? #(and (p1 %) (p2 %)) args))))))
  ([p1 p2 p3]
     (fn ep3
       ([] true)
       ([x] (boolean (and (p1 x) (p2 x) (p3 x))))
       ([x y] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y))))
       ([x y z] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z))))
       ([x y z & args] (boolean (and (ep3 x y z)
                                     (every? #(and (p1 %) (p2 %) (p3 %)) args))))))
  ([p1 p2 p3 & ps]
     (let [ps (list* p1 p2 p3 ps)]
       (fn epn
         ([] true)
         ([x] (every? #(% x) ps))
         ([x y] (every? #(and (% x) (% y)) ps))
         ([x y z] (every? #(and (% x) (% y) (% z)) ps))
         ([x y z & args] (boolean (and (epn x y z)
                                       (every? #(every? % args) ps))))))))
```


---

```clj
{:ns "cljs.core",
 :name "every-pred",
 :signature ["[p]" "[p1 p2]" "[p1 p2 p3]" "[p1 p2 p3 & ps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_every-pred",
 :source {:code "(defn every-pred\n  ([p]\n     (fn ep1\n       ([] true)\n       ([x] (boolean (p x)))\n       ([x y] (boolean (and (p x) (p y))))\n       ([x y z] (boolean (and (p x) (p y) (p z))))\n       ([x y z & args] (boolean (and (ep1 x y z)\n                                     (every? p args))))))\n  ([p1 p2]\n     (fn ep2\n       ([] true)\n       ([x] (boolean (and (p1 x) (p2 x))))\n       ([x y] (boolean (and (p1 x) (p1 y) (p2 x) (p2 y))))\n       ([x y z] (boolean (and (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z))))\n       ([x y z & args] (boolean (and (ep2 x y z)\n                                     (every? #(and (p1 %) (p2 %)) args))))))\n  ([p1 p2 p3]\n     (fn ep3\n       ([] true)\n       ([x] (boolean (and (p1 x) (p2 x) (p3 x))))\n       ([x y] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y))))\n       ([x y z] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z))))\n       ([x y z & args] (boolean (and (ep3 x y z)\n                                     (every? #(and (p1 %) (p2 %) (p3 %)) args))))))\n  ([p1 p2 p3 & ps]\n     (let [ps (list* p1 p2 p3 ps)]\n       (fn epn\n         ([] true)\n         ([x] (every? #(% x) ps))\n         ([x y] (every? #(and (% x) (% y)) ps))\n         ([x y z] (every? #(and (% x) (% y) (% z)) ps))\n         ([x y z & args] (boolean (and (epn x y z)\n                                       (every? #(every? % args) ps))))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2367 2404],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2367-L2404"},
 :full-name "cljs.core/every-pred",
 :clj-symbol "clojure.core/every-pred",
 :docstring "Takes a set of predicates and returns a function f that returns true if all of its\ncomposing predicates return a logical true value against all of its arguments, else it returns\nfalse. Note that f is short-circuiting in that it will stop execution on the first\nargument that triggers a logical false result against the original predicates."}

```
