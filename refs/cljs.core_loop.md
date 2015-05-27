## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/loop

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/loop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loop)
</td>
</tr>
</table>

 <samp>
(__loop__ bindings & body)<br>
</samp>

```
Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein. Acts as a recur target.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:139-161](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L139-L161)</ins>
</pre>

```clj
(defmacro loop
  [bindings & body]
    (assert-args
      (vector? bindings) "a vector for its binding"
      (even? (count bindings)) "an even number of forms in binding vector")
    (let [db (destructure bindings)]
      (if (= db bindings)
        `(loop* ~bindings ~@body)
        (let [vs (take-nth 2 (drop 1 bindings))
              bs (take-nth 2 bindings)
              gs (map (fn [b] (if (core/symbol? b) b (gensym))) bs)
              bfs (reduce (fn [ret [b v g]]
                            (if (core/symbol? b)
                              (conj ret g v)
                              (conj ret g v b g)))
                          [] (map vector bs vs gs))]
          `(let ~bfs
             (loop* ~(vec (interleave gs gs))
               (let ~(vec (interleave bs gs))
                 ~@body)))))))
```


---

```clj
{:ns "cljs.core",
 :name "loop",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_loop",
 :source {:code "(defmacro loop\n  [bindings & body]\n    (assert-args\n      (vector? bindings) \"a vector for its binding\"\n      (even? (count bindings)) \"an even number of forms in binding vector\")\n    (let [db (destructure bindings)]\n      (if (= db bindings)\n        `(loop* ~bindings ~@body)\n        (let [vs (take-nth 2 (drop 1 bindings))\n              bs (take-nth 2 bindings)\n              gs (map (fn [b] (if (core/symbol? b) b (gensym))) bs)\n              bfs (reduce (fn [ret [b v g]]\n                            (if (core/symbol? b)\n                              (conj ret g v)\n                              (conj ret g v b g)))\n                          [] (map vector bs vs gs))]\n          `(let ~bfs\n             (loop* ~(vec (interleave gs gs))\n               (let ~(vec (interleave bs gs))\n                 ~@body)))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [139 161],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L139-L161"},
 :full-name "cljs.core/loop",
 :clj-symbol "clojure.core/loop",
 :docstring "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein. Acts as a recur target."}

```
