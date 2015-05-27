## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-matches

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-matches</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-matches)
</td>
</tr>
</table>

 <samp>
(__re-matches__ re s)<br>
</samp>

```
Returns the result of (re-find re s) if re fully matches s.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6172-6179](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6172-L6179)</ins>
</pre>

```clj
(defn re-matches
  [re s]
  (let [matches (.exec re s)]
    (when (= (first matches) s)
      (if (== (count matches) 1)
        (first matches)
        (vec matches)))))
```


---

```clj
{:ns "cljs.core",
 :name "re-matches",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-matches",
 :source {:code "(defn re-matches\n  [re s]\n  (let [matches (.exec re s)]\n    (when (= (first matches) s)\n      (if (== (count matches) 1)\n        (first matches)\n        (vec matches)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6172 6179],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6172-L6179"},
 :full-name "cljs.core/re-matches",
 :clj-symbol "clojure.core/re-matches",
 :docstring "Returns the result of (re-find re s) if re fully matches s."}

```
