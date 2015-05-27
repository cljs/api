## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-set

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-set)
</td>
</tr>
</table>

 <samp>
(__bit-set__ x n)<br>
</samp>

```
Set bit at index n
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:928-931](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L928-L931)</ins>
</pre>

```clj
(defn bit-set
  [x n]
  (js* "(~{x} | (1 << ~{n}))"))
```


---

```clj
{:ns "cljs.core",
 :name "bit-set",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-set",
 :source {:code "(defn bit-set\n  [x n]\n  (js* \"(~{x} | (1 << ~{n}))\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [928 931],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L928-L931"},
 :full-name "cljs.core/bit-set",
 :clj-symbol "clojure.core/bit-set",
 :docstring "Set bit at index n"}

```
