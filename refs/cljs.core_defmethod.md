## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defmethod

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmethod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmethod)
</td>
</tr>
</table>

 <samp>
(__defmethod__ multifn dispatch-val & fn-tail)<br>
</samp>

```
Creates and installs a new method of multimethod associated with dispatch-value. 
```

---

 <pre>
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1102-1105](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L1102-L1105)</ins>
</pre>

```clj
(defmacro defmethod
  [multifn dispatch-val & fn-tail]
  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))
```


---

```clj
{:ns "cljs.core",
 :name "defmethod",
 :signature ["[multifn dispatch-val & fn-tail]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defmethod",
 :source {:code "(defmacro defmethod\n  [multifn dispatch-val & fn-tail]\n  `(-add-method ~(with-meta multifn {:tag 'cljs.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1102 1105],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L1102-L1105"},
 :full-name "cljs.core/defmethod",
 :clj-symbol "clojure.core/defmethod",
 :docstring "Creates and installs a new method of multimethod associated with dispatch-value. "}

```
