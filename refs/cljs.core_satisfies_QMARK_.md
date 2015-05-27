## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/satisfies?

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/satisfies?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/satisfies?)
</td>
</tr>
</table>

 <samp>
(__satisfies?__ psym x)<br>
</samp>

```
Returns true if x satisfies the protocol
```

---

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:730-746](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L730-L746)</ins>
</pre>

```clj
(defmacro satisfies?
  [psym x]
  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))
        prefix (protocol-prefix p)
        xsym (bool-expr (gensym))
        [part bit] (fast-path-protocols p)
        msym (symbol (core/str "-cljs$lang$protocol_mask$partition" part "$"))]
    `(let [~xsym ~x]
       (if ~xsym
         (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))
                 ~(bool-expr `(. ~xsym ~(symbol (core/str "-" prefix)))))
           true
           (if (coercive-not (. ~xsym ~msym))
             (cljs.core/type_satisfies_ ~psym ~xsym)
             false))
         (cljs.core/type_satisfies_ ~psym ~xsym)))))
```


---

```clj
{:ns "cljs.core",
 :name "satisfies?",
 :signature ["[psym x]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_satisfies_QMARK_",
 :source {:code "(defmacro satisfies?\n  [psym x]\n  (let [p (:name (cljs.analyzer/resolve-var (dissoc &env :locals) psym))\n        prefix (protocol-prefix p)\n        xsym (bool-expr (gensym))\n        [part bit] (fast-path-protocols p)\n        msym (symbol (core/str \"-cljs$lang$protocol_mask$partition\" part \"$\"))]\n    `(let [~xsym ~x]\n       (if ~xsym\n         (if (or ~(if bit `(unsafe-bit-and (. ~xsym ~msym) ~bit))\n                 ~(bool-expr `(. ~xsym ~(symbol (core/str \"-\" prefix)))))\n           true\n           (if (coercive-not (. ~xsym ~msym))\n             (cljs.core/type_satisfies_ ~psym ~xsym)\n             false))\n         (cljs.core/type_satisfies_ ~psym ~xsym)))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [730 746],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L730-L746"},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```
