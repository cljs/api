## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/update-in

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/update-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/update-in)
</td>
</tr>
</table>

 <samp>
(__update-in__ m [k & ks] f & args)<br>
</samp>

```
'Updates' a value in a nested associative structure, where ks is a
sequence of keys and f is a function that will take the old value
and any supplied args and return the new value, and returns a new
nested structure.  If any levels do not exist, hash-maps will be
created.
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1920-1929](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1920-L1929)</ins>
</pre>

```clj
(defn update-in
  ([m [k & ks] f & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f args))
     (assoc m k (apply f (get m k) args)))))
```


---

```clj
{:ns "cljs.core",
 :name "update-in",
 :signature ["[m [k & ks] f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_update-in",
 :source {:code "(defn update-in\n  ([m [k & ks] f & args]\n   (if ks\n     (assoc m k (apply update-in (get m k) ks f args))\n     (assoc m k (apply f (get m k) args)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1920 1929],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L1920-L1929"},
 :full-name "cljs.core/update-in",
 :clj-symbol "clojure.core/update-in",
 :docstring "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated."}

```
