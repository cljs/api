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
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:649-650](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L649-L650)</ins>
</pre>

```clj
(defn undefined? [x]
  (cljs.core/undefined? x))
```


---

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:54-55](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/core.clj#L54-L55)</ins>
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
          :lines [649 650],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L649-L650"},
 :full-name-encode "cljs.core_undefined_QMARK_",
 :shadowed-sources ({:code "(defmacro undefined? [x]\n  (list 'js* \"(void 0 === ~{})\" x))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [54 55],
                     :link "https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/core.clj#L54-L55"}),
 :history [["+" "0.0-927"]]}

```
