## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-seq)
</td>
</tr>
</table>

 <samp>
(__re-seq__ re s)<br>
</samp>

```
Returns a lazy sequence of successive matches of re in s.
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6193-6200](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6193-L6200)</ins>
</pre>

```clj
(defn re-seq
  [re s]
  (let [match-data (re-find re s)
        match-idx (.search s re)
        match-str (if (coll? match-data) (first match-data) match-data)
        post-match (subs s (+ match-idx (count match-str)))]
    (when match-data (lazy-seq (cons match-data (re-seq re post-match))))))
```


---

```clj
{:ns "cljs.core",
 :name "re-seq",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-seq",
 :source {:code "(defn re-seq\n  [re s]\n  (let [match-data (re-find re s)\n        match-idx (.search s re)\n        match-str (if (coll? match-data) (first match-data) match-data)\n        post-match (subs s (+ match-idx (count match-str)))]\n    (when match-data (lazy-seq (cons match-data (re-seq re post-match))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6193 6200],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L6193-L6200"},
 :full-name "cljs.core/re-seq",
 :clj-symbol "clojure.core/re-seq",
 :docstring "Returns a lazy sequence of successive matches of re in s."}

```
