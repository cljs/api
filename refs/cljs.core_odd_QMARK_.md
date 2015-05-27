## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/odd?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/odd?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/odd?)
</td>
</tr>
</table>

 <samp>
(__odd?__ n)<br>
</samp>

```
Returns true if n is odd, throws an exception if n is not an integer
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2179-2181](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2179-L2181)</ins>
</pre>

```clj
(defn ^boolean odd?
  [n] (not (even? n)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "odd?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_odd_QMARK_",
 :source {:code "(defn ^boolean odd?\n  [n] (not (even? n)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2179 2181],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2179-L2181"},
 :full-name "cljs.core/odd?",
 :clj-symbol "clojure.core/odd?",
 :docstring "Returns true if n is odd, throws an exception if n is not an integer"}

```
