## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vary-meta

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vary-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vary-meta)
</td>
</tr>
</table>

 <samp>
(__vary-meta__ obj f & args)<br>
</samp>

```
Returns an object of the same type and value as obj, with
(apply f (meta obj) args) as its metadata.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1386-1390](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1386-L1390)</ins>
</pre>

```clj
(defn vary-meta
 [obj f & args]
 (with-meta obj (apply f (meta obj) args)))
```


---

```clj
{:ns "cljs.core",
 :name "vary-meta",
 :signature ["[obj f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_vary-meta",
 :source {:code "(defn vary-meta\n [obj f & args]\n (with-meta obj (apply f (meta obj) args)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1386 1390],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1386-L1390"},
 :full-name "cljs.core/vary-meta",
 :clj-symbol "clojure.core/vary-meta",
 :docstring "Returns an object of the same type and value as obj, with\n(apply f (meta obj) args) as its metadata."}

```
