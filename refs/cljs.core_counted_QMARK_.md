## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/counted?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/counted?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/counted?)
</td>
</tr>
</table>

 <samp>
(__counted?__ x)<br>
</samp>

```
Returns true if coll implements count in constant time
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:613-615](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L613-L615)</ins>
</pre>

```clj
(defn ^boolean counted?
  [x] (satisfies? ICounted x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "counted?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_counted_QMARK_",
 :source {:code "(defn ^boolean counted?\n  [x] (satisfies? ICounted x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [613 615],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L613-L615"},
 :full-name "cljs.core/counted?",
 :clj-symbol "clojure.core/counted?",
 :docstring "Returns true if coll implements count in constant time"}

```
