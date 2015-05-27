## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/end?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/end?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/end?)
</td>
</tr>
</table>

 <samp>
(__end?__ loc)<br>
</samp>

```
Returns true if loc represents the end of a depth-first walk
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:232-235](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/zip.cljs#L232-L235)</ins>
</pre>

```clj
(defn end?
  [loc]
    (= :end (loc 1)))
```


---

```clj
{:ns "clojure.zip",
 :name "end?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_end_QMARK_",
 :source {:code "(defn end?\n  [loc]\n    (= :end (loc 1)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [232 235],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/zip.cljs#L232-L235"},
 :full-name "clojure.zip/end?",
 :clj-symbol "clojure.zip/end?",
 :docstring "Returns true if loc represents the end of a depth-first walk"}

```
