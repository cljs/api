## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/instance?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/instance?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/instance?)
</td>
</tr>
</table>

 <samp>
(__instance?__ t o)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:366-367](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L366-L367)</ins>
</pre>

```clj
(defn ^boolean instance? [t o]
  (cljs.core/instance? t o))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:245-246](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L245-L246)</ins>
</pre>

```clj
(defmacro instance? [t o]
  (bool-expr (list 'js* "(~{} instanceof ~{})" o t)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "instance?",
 :signature ["[t o]"],
 :shadowed-sources ({:code "(defmacro instance? [t o]\n  (bool-expr (list 'js* \"(~{} instanceof ~{})\" o t)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [245 246],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L245-L246"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_instance_QMARK_",
 :source {:code "(defn ^boolean instance? [t o]\n  (cljs.core/instance? t o))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [366 367],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L366-L367"},
 :full-name "cljs.core/instance?",
 :clj-symbol "clojure.core/instance?"}

```
