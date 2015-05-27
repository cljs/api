## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand)
</td>
</tr>
</table>

 <samp>
(__rand__)<br>
(__rand__ n)<br>
</samp>

```
Returns a random floating point number between 0 (inclusive) and
n (default 1) (exclusive).
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6101-6105](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L6101-L6105)</ins>
</pre>

```clj
(defn rand
  ([] (rand 1))
  ([n] (js* "Math.random() * ~{n}")))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1139-1142](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1139-L1142)</ins>
</pre>

```clj
(defn rand
  ([]  (Math/random))
  ([n] (* n (rand))))
```

---

```clj
{:ns "cljs.core",
 :name "rand",
 :signature ["[]" "[n]"],
 :shadowed-sources ({:code "(defn rand\n  ([]  (Math/random))\n  ([n] (* n (rand))))",
                     :filename "clojurescript/src/cljs/cljs/core.cljs",
                     :lines [1139 1142],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1139-L1142"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rand",
 :source {:code "(defn rand\n  ([] (rand 1))\n  ([n] (js* \"Math.random() * ~{n}\")))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6101 6105],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L6101-L6105"},
 :full-name "cljs.core/rand",
 :clj-symbol "clojure.core/rand",
 :docstring "Returns a random floating point number between 0 (inclusive) and\nn (default 1) (exclusive)."}

```
