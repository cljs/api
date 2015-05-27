## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/undefined?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__undefined?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:652-653](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L652-L653)</ins>
</pre>

```clj
(defn undefined? [x]
  (cljs.core/undefined? x))
```


---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:51-52](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L51-L52)</ins>
</pre>

```clj
(defmacro undefined? [x]
  (list 'js* "(void 0 === ~{})" x))
```

---

```clj
{:full-name "cljs.core/undefined?",
 :ns "cljs.core",
 :name "undefined?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn undefined? [x]\n  (cljs.core/undefined? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [652 653],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L652-L653"},
 :full-name-encode "cljs.core_undefined_QMARK_",
 :shadowed-sources ({:code "(defmacro undefined? [x]\n  (list 'js* \"(void 0 === ~{})\" x))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [51 52],
                     :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L51-L52"}),
 :history [["+" "0.0-927"]]}

```
