## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/gensym

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/gensym</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/gensym)
</td>
</tr>
</table>

 <samp>
(__gensym__)<br>
(__gensym__ prefix-string)<br>
</samp>

```
Returns a new symbol with a unique name. If a prefix string is
supplied, the name is prefix# where # is some unique number. If
prefix is not supplied, the prefix is 'G__'.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6854-6862](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6854-L6862)</ins>
</pre>

```clj
(defn gensym
  ([] (gensym "G__"))
  ([prefix-string]
     (when (nil? gensym_counter)
       (set! gensym_counter (atom 0)))
     (symbol (str prefix-string (swap! gensym_counter inc)))))
```


---

```clj
{:ns "cljs.core",
 :name "gensym",
 :signature ["[]" "[prefix-string]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_gensym",
 :source {:code "(defn gensym\n  ([] (gensym \"G__\"))\n  ([prefix-string]\n     (when (nil? gensym_counter)\n       (set! gensym_counter (atom 0)))\n     (symbol (str prefix-string (swap! gensym_counter inc)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6854 6862],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6854-L6862"},
 :full-name "cljs.core/gensym",
 :clj-symbol "clojure.core/gensym",
 :docstring "Returns a new symbol with a unique name. If a prefix string is\nsupplied, the name is prefix# where # is some unique number. If\nprefix is not supplied, the prefix is 'G__'."}

```
