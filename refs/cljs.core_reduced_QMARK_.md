## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduced?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reduced?__ r)<br>
</samp>

```
Returns true if x is the result of a call to reduced
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:501-504](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L501-L504)</ins>
</pre>

```clj
(defn ^boolean reduced?
  [r]
  (instance? Reduced r))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduced?",
 :signature ["[r]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduced_QMARK_",
 :source {:code "(defn ^boolean reduced?\n  [r]\n  (instance? Reduced r))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [501 504],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L501-L504"},
 :full-name "cljs.core/reduced?",
 :docstring "Returns true if x is the result of a call to reduced"}

```
