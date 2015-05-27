## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list\*

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list*)
</td>
</tr>
</table>

 <samp>
(__list\*__ args)<br>
(__list\*__ a args)<br>
(__list\*__ a b args)<br>
(__list\*__ a b c args)<br>
(__list\*__ a b c d & more)<br>
</samp>

```
Creates a new list containing the items prepended to the rest, the
last of which will be treated as a sequence.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1369-1377](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1369-L1377)</ins>
</pre>

```clj
(defn list*
  ([args] (seq args))
  ([a args] (cons a args))
  ([a b args] (cons a (cons b args)))
  ([a b c args] (cons a (cons b (cons c args))))
  ([a b c d & more]
     (cons a (cons b (cons c (cons d (spread more)))))))
```


---

```clj
{:ns "cljs.core",
 :name "list*",
 :signature ["[args]"
             "[a args]"
             "[a b args]"
             "[a b c args]"
             "[a b c d & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_list_STAR_",
 :source {:code "(defn list*\n  ([args] (seq args))\n  ([a args] (cons a args))\n  ([a b args] (cons a (cons b args)))\n  ([a b c args] (cons a (cons b (cons c args))))\n  ([a b c d & more]\n     (cons a (cons b (cons c (cons d (spread more)))))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1369 1377],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1369-L1377"},
 :full-name "cljs.core/list*",
 :clj-symbol "clojure.core/list*",
 :docstring "Creates a new list containing the items prepended to the rest, the\nlast of which will be treated as a sequence."}

```
