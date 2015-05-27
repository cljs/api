## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/compare

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare)
</td>
</tr>
</table>

 <samp>
(__compare__ x y)<br>
</samp>

```
Comparator. Returns a negative number, zero, or a positive number
when x is logically 'less than', 'equal to', or 'greater than'
y. Uses google.array.defaultCompare.
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:727-731](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L727-L731)</ins>
</pre>

```clj
(defn compare
  [x y] (garray/defaultCompare x y))
```


---

```clj
{:ns "cljs.core",
 :name "compare",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_compare",
 :source {:code "(defn compare\n  [x y] (garray/defaultCompare x y))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [727 731],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L727-L731"},
 :full-name "cljs.core/compare",
 :clj-symbol "clojure.core/compare",
 :docstring "Comparator. Returns a negative number, zero, or a positive number\nwhen x is logically 'less than', 'equal to', or 'greater than'\ny. Uses google.array.defaultCompare."}

```
