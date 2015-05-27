## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/realized?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/realized?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/realized?)
</td>
</tr>
</table>

 <samp>
(__realized?__ d)<br>
</samp>

```
Returns true if a value has been produced for a promise, delay, future or lazy sequence.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6059-6062](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6059-L6062)</ins>
</pre>

```clj
(defn ^boolean realized?
  [d]
  (-realized? d))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "realized?",
 :signature ["[d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_realized_QMARK_",
 :source {:code "(defn ^boolean realized?\n  [d]\n  (-realized? d))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6059 6062],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L6059-L6062"},
 :full-name "cljs.core/realized?",
 :clj-symbol "clojure.core/realized?",
 :docstring "Returns true if a value has been produced for a promise, delay, future or lazy sequence."}

```
