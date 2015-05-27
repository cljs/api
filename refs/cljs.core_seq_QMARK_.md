## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/seq?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq?)
</td>
</tr>
</table>

 <samp>
(__seq?__ s)<br>
</samp>

```
Return true if s satisfies ISeq
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:997-1002](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L997-L1002)</ins>
</pre>

```clj
(defn ^boolean seq?
  [s]
  (if (nil? s)
    false
    (satisfies? ISeq s)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "seq?",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_seq_QMARK_",
 :source {:code "(defn ^boolean seq?\n  [s]\n  (if (nil? s)\n    false\n    (satisfies? ISeq s)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [997 1002],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L997-L1002"},
 :full-name "cljs.core/seq?",
 :clj-symbol "clojure.core/seq?",
 :docstring "Return true if s satisfies ISeq"}

```
