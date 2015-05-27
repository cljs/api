## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:70-71](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L70-L71)</ins>
</pre>

```clj
(defn ^boolean array? [x]
  (cljs.core/array? x))
```


---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:233-234](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L233-L234)</ins>
</pre>

```clj
(defmacro array? [x]
  (bool-expr (list 'js* "~{} instanceof Array" x)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "array?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro array? [x]\n  (bool-expr (list 'js* \"~{} instanceof Array\" x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [233 234],
                     :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L233-L234"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_array_QMARK_",
 :source {:code "(defn ^boolean array? [x]\n  (cljs.core/array? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [70 71],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L70-L71"},
 :full-name "cljs.core/array?"}

```
