## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partial

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partial</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partial)
</td>
</tr>
</table>

 <samp>
(__partial__ f arg1)<br>
(__partial__ f arg1 arg2)<br>
(__partial__ f arg1 arg2 arg3)<br>
(__partial__ f arg1 arg2 arg3 & more)<br>
</samp>

```
Takes a function f and fewer than the normal arguments to f, and
returns a fn that takes a variable number of additional args. When
called, the returned function calls f with args + additional args.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1896-1907](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1896-L1907)</ins>
</pre>

```clj
(defn partial
  ([f arg1]
   (fn [& args] (apply f arg1 args)))
  ([f arg1 arg2]
   (fn [& args] (apply f arg1 arg2 args)))
  ([f arg1 arg2 arg3]
   (fn [& args] (apply f arg1 arg2 arg3 args)))
  ([f arg1 arg2 arg3 & more]
   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))
```


---

```clj
{:ns "cljs.core",
 :name "partial",
 :signature ["[f arg1]"
             "[f arg1 arg2]"
             "[f arg1 arg2 arg3]"
             "[f arg1 arg2 arg3 & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_partial",
 :source {:code "(defn partial\n  ([f arg1]\n   (fn [& args] (apply f arg1 args)))\n  ([f arg1 arg2]\n   (fn [& args] (apply f arg1 arg2 args)))\n  ([f arg1 arg2 arg3]\n   (fn [& args] (apply f arg1 arg2 arg3 args)))\n  ([f arg1 arg2 arg3 & more]\n   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1896 1907],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1896-L1907"},
 :full-name "cljs.core/partial",
 :clj-symbol "clojure.core/partial",
 :docstring "Takes a function f and fewer than the normal arguments to f, and\nreturns a fn that takes a variable number of additional args. When\ncalled, the returned function calls f with args + additional args."}

```
