## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list?)
</td>
</tr>
</table>

 <samp>
(__list?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1939-1940](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1939-L1940)</ins>
</pre>

```clj
(defn ^boolean list? [x]
  (satisfies? IList x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "list?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_list_QMARK_",
 :source {:code "(defn ^boolean list? [x]\n  (satisfies? IList x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1939 1940],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1939-L1940"},
 :full-name "cljs.core/list?",
 :clj-symbol "clojure.core/list?"}

```
