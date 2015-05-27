## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduce-kv

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduce-kv</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduce-kv)
</td>
</tr>
</table>

 <samp>
(__reduce-kv__ f init coll)<br>
</samp>

```
Reduces an associative collection. f should be a function of 3
arguments. Returns the result of applying f to init, the first key
and the first value in coll, then applying f to that result and the
2nd key and value, etc. If coll contains no entries, returns init
and f is not called. Note that reduce-kv is supported on vectors,
where the keys will be the ordinals.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:986-994](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L986-L994)</ins>
</pre>

```clj
(defn reduce-kv
  ([f init coll]
     (-kv-reduce coll f init)))
```


---

```clj
{:ns "cljs.core",
 :name "reduce-kv",
 :signature ["[f init coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduce-kv",
 :source {:code "(defn reduce-kv\n  ([f init coll]\n     (-kv-reduce coll f init)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [986 994],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L986-L994"},
 :full-name "cljs.core/reduce-kv",
 :clj-symbol "clojure.core/reduce-kv",
 :docstring "Reduces an associative collection. f should be a function of 3\narguments. Returns the result of applying f to init, the first key\nand the first value in coll, then applying f to that result and the\n2nd key and value, etc. If coll contains no entries, returns init\nand f is not called. Note that reduce-kv is supported on vectors,\nwhere the keys will be the ordinals."}

```
