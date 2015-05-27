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
(__aset__ array idx idx2 & idxv)<br>
</samp>

```
Sets the value at the index.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:146-151](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L146-L151)</ins>
</pre>

```clj
(defn aset
  ([array i val]
    (cljs.core/aset array i val))
  ([array idx idx2 & idxv]
    (apply aset (aget array idx) idx2 idxv)))
```


---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:261-267](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L261-L267)</ins>
</pre>

```clj
(defmacro aset
  ([a i v]
    (list 'js* "(~{}[~{}] = ~{})" a i v))
  ([a idx idx2 & idxv]
    (let [n    (core/dec (count idxv))
          astr (apply core/str (repeat n "[~{}]"))]
      `(~'js* ~(core/str "(~{}[~{}][~{}]" astr " = ~{})") ~a ~idx ~idx2 ~@idxv))))
```

---

```clj
{:ns "cljs.core",
 :name "aset",
 :signature ["[array i val]" "[array idx idx2 & idxv]"],
 :shadowed-sources ({:code "(defmacro aset\n  ([a i v]\n    (list 'js* \"(~{}[~{}] = ~{})\" a i v))\n  ([a idx idx2 & idxv]\n    (let [n    (core/dec (count idxv))\n          astr (apply core/str (repeat n \"[~{}]\"))]\n      `(~'js* ~(core/str \"(~{}[~{}][~{}]\" astr \" = ~{})\") ~a ~idx ~idx2 ~@idxv))))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [261 267],
                     :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L261-L267"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_aset",
 :source {:code "(defn aset\n  ([array i val]\n    (cljs.core/aset array i val))\n  ([array idx idx2 & idxv]\n    (apply aset (aget array idx) idx2 idxv)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [146 151],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L146-L151"},
 :full-name "cljs.core/aset",
 :clj-symbol "clojure.core/aset",
 :docstring "Sets the value at the index."}

```
