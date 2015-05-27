## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/lefts

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/lefts</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/lefts)
</td>
</tr>
</table>

 <samp>
(__lefts__ loc)<br>
</samp>

```
Returns a seq of the left siblings of this loc
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:87-90](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L87-L90)</ins>
</pre>

```clj
(defn lefts
  [loc]
    (seq (:l (loc 1))))
```


---

```clj
{:ns "clojure.zip",
 :name "lefts",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_lefts",
 :source {:code "(defn lefts\n  [loc]\n    (seq (:l (loc 1))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [87 90],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L87-L90"},
 :full-name "clojure.zip/lefts",
 :clj-symbol "clojure.zip/lefts",
 :docstring "Returns a seq of the left siblings of this loc"}

```
