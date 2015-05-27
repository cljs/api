## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Keyword

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Keyword.__ k)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1713-1720](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1713-L1720)</ins>
</pre>

```clj
(deftype Keyword [k]
  IFn
  (invoke [_ coll]
    (when-not (nil? coll)
      (let [strobj (.-strobj coll)]
        (if (nil? strobj)
          (-lookup coll k nil)
          (aget strobj k))))))
```


---

```clj
{:full-name "cljs.core/Keyword",
 :ns "cljs.core",
 :name "Keyword",
 :type "type",
 :signature ["[k]"],
 :source {:code "(deftype Keyword [k]\n  IFn\n  (invoke [_ coll]\n    (when-not (nil? coll)\n      (let [strobj (.-strobj coll)]\n        (if (nil? strobj)\n          (-lookup coll k nil)\n          (aget strobj k))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1713 1720],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L1713-L1720"},
 :full-name-encode "cljs.core_Keyword",
 :history [["+" "0.0-1424"]]}

```
