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
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:422-432](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L422-L432)</ins>
</pre>

```clj
(defmacro satisfies?
  [psym x]
  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))
        prefix (protocol-prefix p)]
    `(let [x# ~x]
       (if (and x#
                (. x# ~(symbol (str "-" prefix)))        ;; Need prop lookup here
                (not (. x# (~'hasOwnProperty ~prefix))))
	 true
	 (cljs.core/type_satisfies_ ~psym x#)))))
```


---

```clj
{:ns "cljs.core",
 :name "satisfies?",
 :signature ["[psym x]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_satisfies_QMARK_",
 :source {:code "(defmacro satisfies?\n  [psym x]\n  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))\n        prefix (protocol-prefix p)]\n    `(let [x# ~x]\n       (if (and x#\n                (. x# ~(symbol (str \"-\" prefix)))        ;; Need prop lookup here\n                (not (. x# (~'hasOwnProperty ~prefix))))\n\t true\n\t (cljs.core/type_satisfies_ ~psym x#)))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [422 432],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L422-L432"},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```
