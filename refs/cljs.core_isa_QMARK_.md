## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/isa?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/isa?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/isa?)
</td>
</tr>
</table>

 <samp>
(__isa?__ child parent)<br>
(__isa?__ h child parent)<br>
</samp>

```
Returns true if (= child parent), or child is directly or indirectly derived from
parent, either via a Java type inheritance relationship or a
relationship established via derive. h must be a hierarchy obtained
from make-hierarchy, if not supplied defaults to the global
hierarchy
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3514-3532](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3514-L3532)</ins>
</pre>

```clj
(defn isa?
  ([child parent] (isa? @global-hierarchy child parent))
  ([h child parent]
     (or (= child parent)
         ;; (and (class? parent) (class? child)
         ;;    (. ^Class parent isAssignableFrom child))
         (contains? ((:ancestors h) child) parent)
         ;;(and (class? child) (some #(contains? ((:ancestors h) %) parent) (supers child)))
         (and (vector? parent) (vector? child)
              (= (count parent) (count child))
              (loop [ret true i 0]
                (if (or (not ret) (= i (count parent)))
                  ret
                  (recur (isa? h (child i) (parent i)) (inc i))))))))
```


---

```clj
{:ns "cljs.core",
 :name "isa?",
 :signature ["[child parent]" "[h child parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_isa_QMARK_",
 :source {:code "(defn isa?\n  ([child parent] (isa? @global-hierarchy child parent))\n  ([h child parent]\n     (or (= child parent)\n         ;; (and (class? parent) (class? child)\n         ;;    (. ^Class parent isAssignableFrom child))\n         (contains? ((:ancestors h) child) parent)\n         ;;(and (class? child) (some #(contains? ((:ancestors h) %) parent) (supers child)))\n         (and (vector? parent) (vector? child)\n              (= (count parent) (count child))\n              (loop [ret true i 0]\n                (if (or (not ret) (= i (count parent)))\n                  ret\n                  (recur (isa? h (child i) (parent i)) (inc i))))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3514 3532],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3514-L3532"},
 :full-name "cljs.core/isa?",
 :clj-symbol "clojure.core/isa?",
 :docstring "Returns true if (= child parent), or child is directly or indirectly derived from\nparent, either via a Java type inheritance relationship or a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy"}

```
