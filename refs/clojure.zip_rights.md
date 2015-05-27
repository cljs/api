## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/rights

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rights</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rights)
</td>
</tr>
</table>

 <samp>
(__rights__ loc)<br>
</samp>

```
Returns a seq of the right siblings of this loc
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:92-95](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L92-L95)</ins>
</pre>

```clj
(defn rights
  [loc]
    (:r (loc 1)))
```


---

```clj
{:ns "clojure.zip",
 :name "rights",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_rights",
 :source {:code "(defn rights\n  [loc]\n    (:r (loc 1)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [92 95],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L92-L95"},
 :full-name "clojure.zip/rights",
 :clj-symbol "clojure.zip/rights",
 :docstring "Returns a seq of the right siblings of this loc"}

```
