## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/conj!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj!)
</td>
</tr>
</table>

 <samp>
(__conj!__ tcoll val)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2059-2060](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2059-L2060)</ins>
</pre>

```clj
(defn conj! [tcoll val]
  (-conj! tcoll val))
```


---

```clj
{:full-name "cljs.core/conj!",
 :ns "cljs.core",
 :name "conj!",
 :type "function",
 :signature ["[tcoll val]"],
 :source {:code "(defn conj! [tcoll val]\n  (-conj! tcoll val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2059 2060],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2059-L2060"},
 :full-name-encode "cljs.core_conj_BANG_",
 :clj-symbol "clojure.core/conj!",
 :history [["+" "0.0-1211"]]}

```
