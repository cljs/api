## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/divide

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__divide__ x)<br>
(__divide__ x y)<br>
(__divide__ x y & more)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:339-342](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L339-L342)</ins>
</pre>

```clj
(defmacro divide
  ([x] `(/ 1 ~x))
  ([x y] (list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```


---

```clj
{:full-name "cljs.core/divide",
 :ns "cljs.core",
 :name "divide",
 :type "macro",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source {:code "(defmacro divide\n  ([x] `(/ 1 ~x))\n  ([x y] (list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [339 342],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L339-L342"},
 :full-name-encode "cljs.core_divide",
 :history [["+" "0.0-1798"]]}

```
