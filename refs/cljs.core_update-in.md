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
(__update-in__ m [k & ks] f)<br>
(__update-in__ m [k & ks] f a)<br>
(__update-in__ m [k & ks] f a b)<br>
(__update-in__ m [k & ks] f a b c)<br>
(__update-in__ m [k & ks] f a b c & args)<br>
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
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3003-3028](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L3003-L3028)</ins>
</pre>

```clj
(defn update-in
  ([m [k & ks] f]
   (if ks
     (assoc m k (update-in (get m k) ks f))
     (assoc m k (f (get m k)))))
  ([m [k & ks] f a]
   (if ks
     (assoc m k (update-in (get m k) ks f a))
     (assoc m k (f (get m k) a))))
  ([m [k & ks] f a b]
   (if ks
     (assoc m k (update-in (get m k) ks f a b))
     (assoc m k (f (get m k) a b))))
  ([m [k & ks] f a b c]
   (if ks
     (assoc m k (update-in (get m k) ks f a b c))
     (assoc m k (f (get m k) a b c))))
  ([m [k & ks] f a b c & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f a b c args))
     (assoc m k (apply f (get m k) a b c args)))))
```


---

```clj
{:ns "cljs.core",
 :name "update-in",
 :signature ["[m [k & ks] f]"
             "[m [k & ks] f a]"
             "[m [k & ks] f a b]"
             "[m [k & ks] f a b c]"
             "[m [k & ks] f a b c & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_update-in",
 :source {:code "(defn update-in\n  ([m [k & ks] f]\n   (if ks\n     (assoc m k (update-in (get m k) ks f))\n     (assoc m k (f (get m k)))))\n  ([m [k & ks] f a]\n   (if ks\n     (assoc m k (update-in (get m k) ks f a))\n     (assoc m k (f (get m k) a))))\n  ([m [k & ks] f a b]\n   (if ks\n     (assoc m k (update-in (get m k) ks f a b))\n     (assoc m k (f (get m k) a b))))\n  ([m [k & ks] f a b c]\n   (if ks\n     (assoc m k (update-in (get m k) ks f a b c))\n     (assoc m k (f (get m k) a b c))))\n  ([m [k & ks] f a b c & args]\n   (if ks\n     (assoc m k (apply update-in (get m k) ks f a b c args))\n     (assoc m k (apply f (get m k) a b c args)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3003 3028],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L3003-L3028"},
 :full-name "cljs.core/update-in",
 :clj-symbol "clojure.core/update-in",
 :docstring "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated."}

```
