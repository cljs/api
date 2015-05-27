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
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7095-7097](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7095-L7097)</ins>
</pre>

```clj
(defn rand-int
  [n] (Math/floor (* (Math/random) n)))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1619-1621](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1619-L1621)</ins>
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
                     :lines [1619 1621],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1619-L1621"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_rand-int",
 :source {:code "(defn rand-int\n  [n] (Math/floor (* (Math/random) n)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7095 7097],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7095-L7097"},
 :full-name "cljs.core/rand-int",
 :clj-symbol "clojure.core/rand-int",
 :docstring "Returns a random integer between 0 (inclusive) and n (exclusive)."}

```
