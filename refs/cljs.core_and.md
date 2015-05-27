## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/and

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/and)
</td>
</tr>
</table>

 <samp>
(__and__)<br>
(__and__ x)<br>
(__and__ x & next)<br>
</samp>

```
Evaluates exprs one at a time, from left to right. If a form
returns logical false (nil or false), and returns that value and
doesn't evaluate any of the other expressions, otherwise it returns
the value of the last expr. (and) returns true.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:778-788](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L778-L788)</ins>
</pre>

```clj
(defmacro and
  ([] true)
  ([x] x)
  ([x & next]
   `(let [and# ~x]
      (if and# (and ~@next) and#))))
```


---

```clj
{:ns "cljs.core",
 :name "and",
 :signature ["[]" "[x]" "[x & next]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_and",
 :source {:code "(defmacro and\n  ([] true)\n  ([x] x)\n  ([x & next]\n   `(let [and# ~x]\n      (if and# (and ~@next) and#))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [778 788],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L778-L788"},
 :full-name "cljs.core/and",
 :clj-symbol "clojure.core/and",
 :docstring "Evaluates exprs one at a time, from left to right. If a form\nreturns logical false (nil or false), and returns that value and\ndoesn't evaluate any of the other expressions, otherwise it returns\nthe value of the last expr. (and) returns true."}

```
