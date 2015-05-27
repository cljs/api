## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/associative?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/associative?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/associative?)
</td>
</tr>
</table>

 <samp>
(__associative?__ x)<br>
</samp>

```
Returns true if coll implements Associative
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:946-948](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L946-L948)</ins>
</pre>

```clj
(defn ^boolean associative?
  [x] (satisfies? IAssociative x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "associative?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_associative_QMARK_",
 :source {:code "(defn ^boolean associative?\n  [x] (satisfies? IAssociative x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [946 948],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L946-L948"},
 :full-name "cljs.core/associative?",
 :clj-symbol "clojure.core/associative?",
 :docstring "Returns true if coll implements Associative"}

```
