## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list)
</td>
</tr>
</table>

 <samp>
(__list__ & xs)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1874-1887](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1874-L1887)</ins>
</pre>

```clj
(defn list [& xs]
  (let [arr (if (instance? IndexedSeq xs)
              (.-arr xs)
              (let [arr (array)]
                (loop [^not-native xs xs]
                  (if-not (nil? xs)
                    (do
                      (.push arr (-first xs))
                      (recur (-next xs)))
                    arr))))]
    (loop [i (alength arr) ^not-native r ()]
      (if (> i 0)
        (recur (dec i) (-conj r (aget arr (dec i))))
        r))))
```


---

```clj
{:full-name "cljs.core/list",
 :ns "cljs.core",
 :name "list",
 :type "function",
 :signature ["[& xs]"],
 :source {:code "(defn list [& xs]\n  (let [arr (if (instance? IndexedSeq xs)\n              (.-arr xs)\n              (let [arr (array)]\n                (loop [^not-native xs xs]\n                  (if-not (nil? xs)\n                    (do\n                      (.push arr (-first xs))\n                      (recur (-next xs)))\n                    arr))))]\n    (loop [i (alength arr) ^not-native r ()]\n      (if (> i 0)\n        (recur (dec i) (-conj r (aget arr (dec i))))\n        r))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1874 1887],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1874-L1887"},
 :full-name-encode "cljs.core_list",
 :clj-symbol "clojure.core/list",
 :history [["+" "0.0-927"]]}

```
