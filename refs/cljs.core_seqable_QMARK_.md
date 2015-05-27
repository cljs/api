## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seqable?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__seqable?__ s)<br>
</samp>

```
Return true if s satisfies ISeqable
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1025-1028](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L1025-L1028)</ins>
</pre>

```clj
(defn ^boolean seqable?
  [s]
  (satisfies? ISeqable s))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "seqable?",
 :signature ["[s]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_seqable_QMARK_",
 :source {:code "(defn ^boolean seqable?\n  [s]\n  (satisfies? ISeqable s))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1025 1028],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L1025-L1028"},
 :full-name "cljs.core/seqable?",
 :docstring "Return true if s satisfies ISeqable"}

```
