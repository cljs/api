## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/last

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/last</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/last)
</td>
</tr>
</table>

 <samp>
(__last__ s)<br>
</samp>

```
Return the last item in coll, in linear time
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:752-758](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L752-L758)</ins>
</pre>

```clj
(defn last
  [s]
  (let [sn (next s)]
    (if-not (nil? sn)
      (recur sn)
      (first s))))
```


---

```clj
{:ns "cljs.core",
 :name "last",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_last",
 :source {:code "(defn last\n  [s]\n  (let [sn (next s)]\n    (if-not (nil? sn)\n      (recur sn)\n      (first s))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [752 758],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L752-L758"},
 :full-name "cljs.core/last",
 :clj-symbol "clojure.core/last",
 :docstring "Return the last item in coll, in linear time"}

```
