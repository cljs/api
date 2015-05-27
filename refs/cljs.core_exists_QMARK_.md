## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/exists?

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__exists?__ x)<br>
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
            └── <ins>[core.clj:236-237](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L236-L237)</ins>
</pre>

```clj
(defmacro exists? [x]
  (bool-expr (list 'js* "typeof ~{} !== 'undefined'" x)))
```


---

```clj
{:full-name "cljs.core/exists?",
 :ns "cljs.core",
 :name "exists?",
 :type "macro",
 :signature ["[x]"],
 :source {:code "(defmacro exists? [x]\n  (bool-expr (list 'js* \"typeof ~{} !== 'undefined'\" x)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [236 237],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L236-L237"},
 :full-name-encode "cljs.core_exists_QMARK_",
 :history [["+" "0.0-1798"]]}

```
