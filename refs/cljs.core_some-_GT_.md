## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/some->

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some-%3E)
</td>
</tr>
</table>

 <samp>
(__some->__ expr & forms)<br>
</samp>

```
When expr is not nil, threads it into the first form (via ->),
and when that result is not nil, through the next etc
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:6813-6822](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6813-L6822)</ins>
</pre>

```clj
(defmacro some->
  [expr & forms]
  (let [g (gensym)
        pstep (fn [step] `(if (nil? ~g) nil (-> ~g ~step)))]
    `(let [~g ~expr
           ~@(interleave (repeat g) (map pstep forms))]
       ~g)))
```


---

```clj
{:ns "cljs.core",
 :name "some->",
 :signature ["[expr & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core_some-_GT_",
 :source {:code "(defmacro some->\n  [expr & forms]\n  (let [g (gensym)\n        pstep (fn [step] `(if (nil? ~g) nil (-> ~g ~step)))]\n    `(let [~g ~expr\n           ~@(interleave (repeat g) (map pstep forms))]\n       ~g)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [6813 6822],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6813-L6822"},
 :full-name "cljs.core/some->",
 :clj-symbol "clojure.core/some->",
 :docstring "When expr is not nil, threads it into the first form (via ->),\nand when that result is not nil, through the next etc"}

```
