## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduce

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduce)
</td>
</tr>
</table>

 <samp>
(__reduce__ f coll)<br>
(__reduce__ f val coll)<br>
</samp>

```
f should be a function of 2 arguments. If val is not supplied,
returns the result of applying f to the first 2 items in coll, then
applying f to that result and the 3rd item, etc. If coll contains no
items, f must accept no arguments as well, and reduce returns the
result of calling f with no arguments.  If coll has only 1 item, it
is returned and f is not called.  If val is supplied, returns the
result of applying f to val and the first item in coll, then
applying f to that result and the 2nd item, etc. If coll contains no
items, returns val and f is not called.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1194-1211](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1194-L1211)</ins>
</pre>

```clj
(defn reduce
  ([f coll]
     (if (satisfies? IReduce coll)
       (-reduce coll f)
       (seq-reduce f coll)))
  ([f val coll]
     (if (satisfies? IReduce coll)
       (-reduce coll f val)
       (seq-reduce f val coll))))
```


---

```clj
{:ns "cljs.core",
 :name "reduce",
 :signature ["[f coll]" "[f val coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_reduce",
 :source {:code "(defn reduce\n  ([f coll]\n     (if (satisfies? IReduce coll)\n       (-reduce coll f)\n       (seq-reduce f coll)))\n  ([f val coll]\n     (if (satisfies? IReduce coll)\n       (-reduce coll f val)\n       (seq-reduce f val coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1194 1211],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1194-L1211"},
 :full-name "cljs.core/reduce",
 :clj-symbol "clojure.core/reduce",
 :docstring "f should be a function of 2 arguments. If val is not supplied,\nreturns the result of applying f to the first 2 items in coll, then\napplying f to that result and the 3rd item, etc. If coll contains no\nitems, f must accept no arguments as well, and reduce returns the\nresult of calling f with no arguments.  If coll has only 1 item, it\nis returned and f is not called.  If val is supplied, returns the\nresult of applying f to val and the first item in coll, then\napplying f to that result and the 2nd item, etc. If coll contains no\nitems, returns val and f is not called."}

```
