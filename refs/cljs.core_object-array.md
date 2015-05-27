## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/object-array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/object-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/object-array)
</td>
</tr>
</table>

 <samp>
(__object-array__ size-or-seq)<br>
(__object-array__ size init-val-or-seq)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2294-2312](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2294-L2312)</ins>
</pre>

```clj
(defn object-array
  ([size-or-seq]
     (if (number? size-or-seq)
       (object-array size-or-seq nil)
       (into-array size-or-seq)))
  ([size init-val-or-seq]
     (let [a (make-array size)]
       (if (seq? init-val-or-seq)
         (let [s (seq init-val-or-seq)]
           (loop [i 0 s s]
             (if (and s (< i size))
               (do
                 (aset a i (first s))
                 (recur (inc i) (next s)))
               a)))
         (do
           (dotimes [i size]
             (aset a i init-val-or-seq))
           a)))))
```


---

```clj
{:full-name "cljs.core/object-array",
 :ns "cljs.core",
 :name "object-array",
 :type "function",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :source {:code "(defn object-array\n  ([size-or-seq]\n     (if (number? size-or-seq)\n       (object-array size-or-seq nil)\n       (into-array size-or-seq)))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2294 2312],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2294-L2312"},
 :full-name-encode "cljs.core_object-array",
 :clj-symbol "clojure.core/object-array",
 :history [["+" "0.0-1211"]]}

```
