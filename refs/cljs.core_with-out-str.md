## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-out-str

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1535"><img valign="middle" alt="[+] 0.0-1535" src="https://img.shields.io/badge/+-0.0--1535-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-out-str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-out-str)
</td>
</tr>
</table>

 <samp>
(__with-out-str__ & body)<br>
</samp>

```
Evaluates exprs in a context in which *print-fn* is bound to .append
on a fresh StringBuffer.  Returns the string created by any nested
printing calls.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1345-1353](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1345-L1353)</ins>
</pre>

```clj
(defmacro with-out-str
  [& body]
  `(let [sb# (goog.string/StringBuffer.)]
     (binding [cljs.core/*print-fn* (fn [x#] (.append sb# x#))]
       ~@body)
     (cljs.core/str sb#)))
```


---

```clj
{:ns "cljs.core",
 :name "with-out-str",
 :signature ["[& body]"],
 :history [["+" "0.0-1535"]],
 :type "macro",
 :full-name-encode "cljs.core_with-out-str",
 :source {:code "(defmacro with-out-str\n  [& body]\n  `(let [sb# (goog.string/StringBuffer.)]\n     (binding [cljs.core/*print-fn* (fn [x#] (.append sb# x#))]\n       ~@body)\n     (cljs.core/str sb#)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1345 1353],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L1345-L1353"},
 :full-name "cljs.core/with-out-str",
 :clj-symbol "clojure.core/with-out-str",
 :docstring "Evaluates exprs in a context in which *print-fn* is bound to .append\non a fresh StringBuffer.  Returns the string created by any nested\nprinting calls."}

```
