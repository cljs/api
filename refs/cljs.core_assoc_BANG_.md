## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assoc!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc!)
</td>
</tr>
</table>

 <samp>
(__assoc!__ tcoll key val)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2100-2101](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2100-L2101)</ins>
</pre>

```clj
(defn assoc! [tcoll key val]
  (-assoc! tcoll key val))
```


---

```clj
{:full-name "cljs.core/assoc!",
 :ns "cljs.core",
 :name "assoc!",
 :type "function",
 :signature ["[tcoll key val]"],
 :source {:code "(defn assoc! [tcoll key val]\n  (-assoc! tcoll key val))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2100 2101],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2100-L2101"},
 :full-name-encode "cljs.core_assoc_BANG_",
 :clj-symbol "clojure.core/assoc!",
 :history [["+" "0.0-1211"]]}

```
