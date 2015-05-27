## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rand-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-int)
</td>
</tr>
</table>

 <samp>
(__rand-int__ n)<br>
</samp>

```
Returns a random integer between 0 (inclusive) and n (exclusive).
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6926-6928](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6926-L6928)</ins>
</pre>

```clj
(defn rand-int
  [n] (Math/floor (* (Math/random) n)))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1609-1611](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1609-L1611)</ins>
</pre>

```clj
(defn rand-int
  [n] (fix (rand n)))
```

---

```clj
{:ns "cljs.core",
 :name "rand-int",
 :signature ["[n]"],
 :shadowed-sources ({:code "(defn rand-int\n  [n] (fix (rand n)))",
                     :filename "clojurescript/src/cljs/cljs/core.cljs",
                     :lines [1609 1611],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1609-L1611"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rand-int",
 :source {:code "(defn rand-int\n  [n] (Math/floor (* (Math/random) n)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6926 6928],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6926-L6928"},
 :full-name "cljs.core/rand-int",
 :clj-symbol "clojure.core/rand-int",
 :docstring "Returns a random integer between 0 (inclusive) and n (exclusive)."}

```
