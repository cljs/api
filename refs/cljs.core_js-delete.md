## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-delete

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-delete__ obj key)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1114-1115](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1114-L1115)</ins>
</pre>

```clj
(defn js-delete [obj key]
  (cljs.core/js-delete obj key))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:224-225](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L224-L225)</ins>
</pre>

```clj
(defmacro js-delete [obj key]
  (list 'js* "delete ~{}[~{}]" obj key))
```

---

```clj
{:full-name "cljs.core/js-delete",
 :ns "cljs.core",
 :name "js-delete",
 :type "function",
 :signature ["[obj key]"],
 :source {:code "(defn js-delete [obj key]\n  (cljs.core/js-delete obj key))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1114 1115],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1114-L1115"},
 :full-name-encode "cljs.core_js-delete",
 :shadowed-sources ({:code "(defmacro js-delete [obj key]\n  (list 'js* \"delete ~{}[~{}]\" obj key))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [224 225],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L224-L225"}),
 :history [["+" "0.0-927"]]}

```
