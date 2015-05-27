## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subseq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subseq)
</td>
</tr>
</table>

 <samp>
(__subseq__ sc test key)<br>
(__subseq__ sc start-test start-key end-test end-key)<br>
</samp>

```
sc must be a sorted collection, test(s) one of <, <=, > or
>=. Returns a seq of those entries with keys ek for
which (test (.. sc comparator (compare ek key)) 0) is true
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5370-5383](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5370-L5383)</ins>
</pre>

```clj
(defn subseq
  ([sc test key]
     (let [include (mk-bound-fn sc test key)]
       (if (#{> >=} test)
         (when-let [[e :as s] (-sorted-seq-from sc key true)]
           (if (include e) s (next s)))
         (take-while include (-sorted-seq sc true)))))
  ([sc start-test start-key end-test end-key]
     (when-let [[e :as s] (-sorted-seq-from sc start-key true)]
       (take-while (mk-bound-fn sc end-test end-key)
                   (if ((mk-bound-fn sc start-test start-key) e) s (next s))))))
```


---

```clj
{:ns "cljs.core",
 :name "subseq",
 :signature ["[sc test key]"
             "[sc start-test start-key end-test end-key]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_subseq",
 :source {:code "(defn subseq\n  ([sc test key]\n     (let [include (mk-bound-fn sc test key)]\n       (if (#{> >=} test)\n         (when-let [[e :as s] (-sorted-seq-from sc key true)]\n           (if (include e) s (next s)))\n         (take-while include (-sorted-seq sc true)))))\n  ([sc start-test start-key end-test end-key]\n     (when-let [[e :as s] (-sorted-seq-from sc start-key true)]\n       (take-while (mk-bound-fn sc end-test end-key)\n                   (if ((mk-bound-fn sc start-test start-key) e) s (next s))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5370 5383],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L5370-L5383"},
 :full-name "cljs.core/subseq",
 :clj-symbol "clojure.core/subseq",
 :docstring "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"}

```
