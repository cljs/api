## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/first

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/first</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/first)
</td>
</tr>
</table>

 <samp>
(__first__ coll)<br>
</samp>

```
Returns the first item in the collection. Calls seq on its
argument. If coll is nil, returns nil.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:412-417](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L412-L417)</ins>
</pre>

```clj
(defn first
  [coll]
  (when-let [s (seq coll)]
    (-first s)))
```


---

```clj
{:ns "cljs.core",
 :name "first",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_first",
 :source {:code "(defn first\n  [coll]\n  (when-let [s (seq coll)]\n    (-first s)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [412 417],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L412-L417"},
 :full-name "cljs.core/first",
 :clj-symbol "clojure.core/first",
 :docstring "Returns the first item in the collection. Calls seq on its\nargument. If coll is nil, returns nil."}

```
