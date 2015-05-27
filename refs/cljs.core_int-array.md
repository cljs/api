## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/int-array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/int-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/int-array)
</td>
</tr>
</table>

 <samp>
(__int-array__ size-or-seq)<br>
(__int-array__ size init-val-or-seq)<br>
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
            └── <ins>[core.cljs:2234-2252](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2234-L2252)</ins>
</pre>

```clj
(defn int-array
  ([size-or-seq]
     (if (number? size-or-seq)
       (int-array size-or-seq nil)
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
{:full-name "cljs.core/int-array",
 :ns "cljs.core",
 :name "int-array",
 :type "function",
 :signature ["[size-or-seq]" "[size init-val-or-seq]"],
 :source {:code "(defn int-array\n  ([size-or-seq]\n     (if (number? size-or-seq)\n       (int-array size-or-seq nil)\n       (into-array size-or-seq)))\n  ([size init-val-or-seq]\n     (let [a (make-array size)]\n       (if (seq? init-val-or-seq)\n         (let [s (seq init-val-or-seq)]\n           (loop [i 0 s s]\n             (if (and s (< i size))\n               (do\n                 (aset a i (first s))\n                 (recur (inc i) (next s)))\n               a)))\n         (do\n           (dotimes [i size]\n             (aset a i init-val-or-seq))\n           a)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2234 2252],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L2234-L2252"},
 :full-name-encode "cljs.core_int-array",
 :clj-symbol "clojure.core/int-array",
 :history [["+" "0.0-1798"]]}

```
