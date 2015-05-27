## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-clear

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-clear</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-clear)
</td>
</tr>
</table>

 <samp>
(__bit-clear__ x n)<br>
</samp>

```
Clear bit at index n
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:914-917](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L914-L917)</ins>
</pre>

```clj
(defn bit-clear
  [x n]
  (js* "(~{x} & ~(1 << ~{n}))"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:150-151](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L150-L151)</ins>
</pre>

```clj
(defmacro bit-clear [x n]
  (list 'js* "(~{} & ~(1 << ~{}))" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-clear",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-clear [x n]\n  (list 'js* \"(~{} & ~(1 << ~{}))\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [150 151],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L150-L151"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-clear",
 :source {:code "(defn bit-clear\n  [x n]\n  (js* \"(~{x} & ~(1 << ~{n}))\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [914 917],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L914-L917"},
 :full-name "cljs.core/bit-clear",
 :clj-symbol "clojure.core/bit-clear",
 :docstring "Clear bit at index n"}

```
