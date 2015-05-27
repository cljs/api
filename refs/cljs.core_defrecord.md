## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defrecord

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defrecord</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defrecord)
</td>
</tr>
</table>

 <samp>
(__defrecord__ rsym fields & impls)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:386-393](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L386-L393)</ins>
</pre>

```clj
(defmacro defrecord [rsym fields & impls]
  (let [r (:name (cljs.compiler/resolve-var (dissoc &env :locals) rsym))]
    `(let []
       ~(emit-defrecord rsym r fields impls)
       (set! (.-cljs$core$IPrintable$_pr_seq ~r) (fn [this#] (list ~(str r))))
       ~(build-positional-factory rsym r fields)
       ~(build-map-factory rsym r fields)
       ~r)))
```


---

```clj
{:full-name "cljs.core/defrecord",
 :ns "cljs.core",
 :name "defrecord",
 :type "macro",
 :signature ["[rsym fields & impls]"],
 :source {:code "(defmacro defrecord [rsym fields & impls]\n  (let [r (:name (cljs.compiler/resolve-var (dissoc &env :locals) rsym))]\n    `(let []\n       ~(emit-defrecord rsym r fields impls)\n       (set! (.-cljs$core$IPrintable$_pr_seq ~r) (fn [this#] (list ~(str r))))\n       ~(build-positional-factory rsym r fields)\n       ~(build-map-factory rsym r fields)\n       ~r)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [386 393],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L386-L393"},
 :full-name-encode "cljs.core_defrecord",
 :clj-symbol "clojure.core/defrecord",
 :history [["+" "0.0-927"]]}

```
