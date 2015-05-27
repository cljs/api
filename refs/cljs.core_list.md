## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list)
</td>
</tr>
</table>

 <samp>
(__list__ & items)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1193-1194](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1193-L1194)</ins>
</pre>

```clj
(defn list [& items]
  (reduce conj () (reverse items)))
```


---

```clj
{:full-name "cljs.core/list",
 :ns "cljs.core",
 :name "list",
 :type "function",
 :signature ["[& items]"],
 :source {:code "(defn list [& items]\n  (reduce conj () (reverse items)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1193 1194],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1193-L1194"},
 :full-name-encode "cljs.core_list",
 :clj-symbol "clojure.core/list",
 :history [["+" "0.0-927"]]}

```
