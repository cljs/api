## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/binding

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/binding</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/binding)
</td>
</tr>
</table>

 <samp>
(__binding__ bindings & body)<br>
</samp>

```
binding => var-symbol init-expr

Creates new bindings for the (already-existing) vars, with the
supplied initial values, executes the exprs in an implicit do, then
re-establishes the bindings that existed before.  The new bindings
are made in parallel (unlike let); all init-exprs are evaluated
before the vars are bound to their new values.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:758-782](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L758-L782)</ins>
</pre>

```clj
(defmacro binding
  [bindings & body]
  (let [names (take-nth 2 bindings)
        vals (take-nth 2 (drop 1 bindings))
        tempnames (map (comp gensym name) names)
        binds (map vector names vals)
        resets (reverse (map vector names tempnames))]
    (cljs.analyzer/confirm-bindings &env names)
    `(let [~@(interleave tempnames names)]
       (try
        ~@(map
           (fn [[k v]] (list 'set! k v))
           binds)
        ~@body
        (finally
         ~@(map
            (fn [[k v]] (list 'set! k v))
            resets))))))
```


---

```clj
{:ns "cljs.core",
 :name "binding",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_binding",
 :source {:code "(defmacro binding\n  [bindings & body]\n  (let [names (take-nth 2 bindings)\n        vals (take-nth 2 (drop 1 bindings))\n        tempnames (map (comp gensym name) names)\n        binds (map vector names vals)\n        resets (reverse (map vector names tempnames))]\n    (cljs.analyzer/confirm-bindings &env names)\n    `(let [~@(interleave tempnames names)]\n       (try\n        ~@(map\n           (fn [[k v]] (list 'set! k v))\n           binds)\n        ~@body\n        (finally\n         ~@(map\n            (fn [[k v]] (list 'set! k v))\n            resets))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [758 782],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L758-L782"},
 :full-name "cljs.core/binding",
 :clj-symbol "clojure.core/binding",
 :docstring "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit do, then\nre-establishes the bindings that existed before.  The new bindings\nare made in parallel (unlike let); all init-exprs are evaluated\nbefore the vars are bound to their new values."}

```
