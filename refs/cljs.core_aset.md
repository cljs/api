## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aset

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aset</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset)
</td>
</tr>
</table>

 <samp>
(__aset__ array i val)<br>
</samp>

```
Sets the value at the index.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:82-85](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L82-L85)</ins>
</pre>

```clj
(defn aset
  [array i val]
  (js* "(~{array}[~{i}] = ~{val})"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:51-52](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L51-L52)</ins>
</pre>

```clj
(defmacro aset [a i v]
  (list 'js* "(~{}[~{}] = ~{})" a i v))
```

---

```clj
{:ns "cljs.core",
 :name "aset",
 :signature ["[array i val]"],
 :shadowed-sources ({:code "(defmacro aset [a i v]\n  (list 'js* \"(~{}[~{}] = ~{})\" a i v))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [51 52],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L51-L52"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_aset",
 :source {:code "(defn aset\n  [array i val]\n  (js* \"(~{array}[~{i}] = ~{val})\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [82 85],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L82-L85"},
 :full-name "cljs.core/aset",
 :clj-symbol "clojure.core/aset",
 :docstring "Sets the value at the index."}

```
