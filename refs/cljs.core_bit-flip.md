## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-flip

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-flip</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-flip)
</td>
</tr>
</table>

 <samp>
(__bit-flip__ x n)<br>
</samp>

```
Flip bit at index n
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1644-1647](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1644-L1647)</ins>
</pre>

```clj
(defn bit-flip
  [x n]
  (cljs.core/bit-flip x n))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:432-433](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L432-L433)</ins>
</pre>

```clj
(defmacro bit-flip [x n]
  (list 'js* "(~{} ^ (1 << ~{}))" x n))
```

---

```clj
{:ns "cljs.core",
 :name "bit-flip",
 :signature ["[x n]"],
 :shadowed-sources ({:code "(defmacro bit-flip [x n]\n  (list 'js* \"(~{} ^ (1 << ~{}))\" x n))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [432 433],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L432-L433"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_bit-flip",
 :source {:code "(defn bit-flip\n  [x n]\n  (cljs.core/bit-flip x n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1644 1647],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1644-L1647"},
 :full-name "cljs.core/bit-flip",
 :clj-symbol "clojure.core/bit-flip",
 :docstring "Flip bit at index n"}

```
