## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-sequential

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-sequential__ print-one begin sep end opts coll)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2846-2850](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2846-L2850)</ins>
</pre>

```clj
(defn pr-sequential [print-one begin sep end opts coll]
  (concat [begin]
          (flatten1
            (interpose [sep] (map #(print-one % opts) coll)))
          [end]))
```


---

```clj
{:full-name "cljs.core/pr-sequential",
 :ns "cljs.core",
 :name "pr-sequential",
 :type "function",
 :signature ["[print-one begin sep end opts coll]"],
 :source {:code "(defn pr-sequential [print-one begin sep end opts coll]\n  (concat [begin]\n          (flatten1\n            (interpose [sep] (map #(print-one % opts) coll)))\n          [end]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2846 2850],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L2846-L2850"},
 :full-name-encode "cljs.core_pr-sequential",
 :history [["+" "0.0-927"]]}

```
