## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/hash

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash)
</td>
</tr>
</table>

 <samp>
(__hash__ o)<br>
(__hash__ o check-cache)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:898-903](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L898-L903)</ins>
</pre>

```clj
(defn hash
  ([o] (hash o true))
  ([o ^boolean check-cache]
     (if (and ^boolean (goog/isString o) check-cache)
       (check-string-hash-cache o)
       (-hash o))))
```


---

```clj
{:full-name "cljs.core/hash",
 :ns "cljs.core",
 :name "hash",
 :type "function",
 :signature ["[o]" "[o check-cache]"],
 :source {:code "(defn hash\n  ([o] (hash o true))\n  ([o ^boolean check-cache]\n     (if (and ^boolean (goog/isString o) check-cache)\n       (check-string-hash-cache o)\n       (-hash o))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [898 903],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L898-L903"},
 :full-name-encode "cljs.core_hash",
 :clj-symbol "clojure.core/hash",
 :history [["+" "0.0-927"]]}

```
