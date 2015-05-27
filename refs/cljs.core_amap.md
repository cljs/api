## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/amap

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/amap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/amap)
</td>
</tr>
</table>

 <samp>
(__amap__ a idx ret expr)<br>
</samp>

```
Maps an expression across an array a, using an index named idx, and
return value named ret, initialized to a clone of a, then setting 
each element of ret to the evaluation of expr, returning the new 
array ret.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:654-667](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L654-L667)</ins>
</pre>

```clj
(defmacro amap
  [a idx ret expr]
  `(let [a# ~a
         ~ret (aclone a#)]
     (loop  [~idx 0]
       (if (< ~idx  (alength a#))
         (do
           (aset ~ret ~idx ~expr)
           (recur (inc ~idx)))
         ~ret))))
```


---

```clj
{:ns "cljs.core",
 :name "amap",
 :signature ["[a idx ret expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_amap",
 :source {:code "(defmacro amap\n  [a idx ret expr]\n  `(let [a# ~a\n         ~ret (aclone a#)]\n     (loop  [~idx 0]\n       (if (< ~idx  (alength a#))\n         (do\n           (aset ~ret ~idx ~expr)\n           (recur (inc ~idx)))\n         ~ret))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [654 667],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L654-L667"},
 :full-name "cljs.core/amap",
 :clj-symbol "clojure.core/amap",
 :docstring "Maps an expression across an array a, using an index named idx, and\nreturn value named ret, initialized to a clone of a, then setting \neach element of ret to the evaluation of expr, returning the new \narray ret."}

```
