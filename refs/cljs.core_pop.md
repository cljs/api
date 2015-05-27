## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pop

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop)
</td>
</tr>
</table>

 <samp>
(__pop__ coll)<br>
</samp>

```
For a list or queue, returns a new list/queue without the first
item, for a vector, returns a new vector without the last item.
Note - not the same as next/butlast.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:860-865](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L860-L865)</ins>
</pre>

```clj
(defn pop
  [coll]
  (-pop coll))
```


---

```clj
{:ns "cljs.core",
 :name "pop",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pop",
 :source {:code "(defn pop\n  [coll]\n  (-pop coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [860 865],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L860-L865"},
 :full-name "cljs.core/pop",
 :clj-symbol "clojure.core/pop",
 :docstring "For a list or queue, returns a new list/queue without the first\nitem, for a vector, returns a new vector without the last item.\nNote - not the same as next/butlast."}

```
