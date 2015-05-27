## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/key

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/key)
</td>
</tr>
</table>

 <samp>
(__key__ map-entry)<br>
</samp>

```
Returns the key of the map entry.
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5489-5492](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5489-L5492)</ins>
</pre>

```clj
(defn key
  [map-entry]
  (-key map-entry))
```


---

```clj
{:ns "cljs.core",
 :name "key",
 :signature ["[map-entry]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_key",
 :source {:code "(defn key\n  [map-entry]\n  (-key map-entry))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5489 5492],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L5489-L5492"},
 :full-name "cljs.core/key",
 :clj-symbol "clojure.core/key",
 :docstring "Returns the key of the map entry."}

```
