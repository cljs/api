## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/prewalk

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/prewalk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk)
</td>
</tr>
</table>

 <samp>
(__prewalk__ f form)<br>
</samp>

```
Like postwalk, but does pre-order traversal.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:58-62](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/walk.cljs#L58-L62)</ins>
</pre>

```clj
(defn prewalk
  [f form]
  (walk (partial prewalk f) identity (f form)))
```


---

```clj
{:ns "clojure.walk",
 :name "prewalk",
 :signature ["[f form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_prewalk",
 :source {:code "(defn prewalk\n  [f form]\n  (walk (partial prewalk f) identity (f form)))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [58 62],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/walk.cljs#L58-L62"},
 :full-name "clojure.walk/prewalk",
 :clj-symbol "clojure.walk/prewalk",
 :docstring "Like postwalk, but does pre-order traversal."}

```
