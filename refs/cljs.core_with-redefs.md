## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-redefs

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1806"><img valign="middle" alt="[+] 0.0-1806" src="https://img.shields.io/badge/+-0.0--1806-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-redefs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-redefs)
</td>
</tr>
</table>

 <samp>
(__with-redefs__ bindings & body)<br>
</samp>

```
binding => var-symbol temp-value-expr

Temporarily redefines vars while executing the body.  The
temp-value-exprs will be evaluated and each resulting value will
replace in parallel the root value of its var.  After the body is
executed, the root values of all the vars will be set back to their
old values. Useful for mocking out functions during testing.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:872-892](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L872-L892)</ins>
</pre>

```clj
(defmacro with-redefs
  [bindings & body]
  (let [names (take-nth 2 bindings)
        vals (take-nth 2 (drop 1 bindings))
        tempnames (map (comp gensym name) names)
        binds (map vector names vals)
        resets (reverse (map vector names tempnames))
        bind-value (fn [[k v]] (list 'set! k v))]
    `(let [~@(interleave tempnames names)]
       (try
        ~@(map bind-value binds)
        ~@body
        (finally
         ~@(map bind-value resets))))))
```


---

```clj
{:ns "cljs.core",
 :name "with-redefs",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-1806"]],
 :type "macro",
 :full-name-encode "cljs.core_with-redefs",
 :source {:code "(defmacro with-redefs\n  [bindings & body]\n  (let [names (take-nth 2 bindings)\n        vals (take-nth 2 (drop 1 bindings))\n        tempnames (map (comp gensym name) names)\n        binds (map vector names vals)\n        resets (reverse (map vector names tempnames))\n        bind-value (fn [[k v]] (list 'set! k v))]\n    `(let [~@(interleave tempnames names)]\n       (try\n        ~@(map bind-value binds)\n        ~@body\n        (finally\n         ~@(map bind-value resets))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [872 892],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L872-L892"},
 :full-name "cljs.core/with-redefs",
 :clj-symbol "clojure.core/with-redefs",
 :docstring "binding => var-symbol temp-value-expr\n\nTemporarily redefines vars while executing the body.  The\ntemp-value-exprs will be evaluated and each resulting value will\nreplace in parallel the root value of its var.  After the body is\nexecuted, the root values of all the vars will be set back to their\nold values. Useful for mocking out functions during testing."}

```
