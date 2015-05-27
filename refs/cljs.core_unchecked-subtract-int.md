## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-subtract-int

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-subtract-int__ & xs)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:325-326](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L325-L326)</ins>
</pre>

```clj
(defmacro unchecked-subtract-int
  ([& xs] `(- ~@xs)))
```


---

```clj
{:full-name "cljs.core/unchecked-subtract-int",
 :ns "cljs.core",
 :name "unchecked-subtract-int",
 :type "macro",
 :signature ["[& xs]"],
 :source {:code "(defmacro unchecked-subtract-int\n  ([& xs] `(- ~@xs)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [325 326],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L325-L326"},
 :full-name-encode "cljs.core_unchecked-subtract-int",
 :clj-symbol "clojure.core/unchecked-subtract-int",
 :history [["+" "0.0-1798"]]}

```
