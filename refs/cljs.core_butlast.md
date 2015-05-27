## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/butlast

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/butlast</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/butlast)
</td>
</tr>
</table>

 <samp>
(__butlast__ s)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5818-5822](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5818-L5822)</ins>
</pre>

```clj
(defn butlast [s]
  (loop [ret [] s s]
    (if (next s)
      (recur (conj ret (first s)) (next s))
      (seq ret))))
```


---

```clj
{:full-name "cljs.core/butlast",
 :ns "cljs.core",
 :name "butlast",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn butlast [s]\n  (loop [ret [] s s]\n    (if (next s)\n      (recur (conj ret (first s)) (next s))\n      (seq ret))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5818 5822],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5818-L5822"},
 :full-name-encode "cljs.core_butlast",
 :clj-symbol "clojure.core/butlast",
 :history [["+" "0.0-927"]]}

```
