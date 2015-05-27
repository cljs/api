## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/if-let

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-let)
</td>
</tr>
</table>

 <samp>
(__if-let__ bindings then)<br>
(__if-let__ bindings then else & oldform)<br>
</samp>

```
bindings => binding-form test

If test is true, evaluates then with binding-form bound to the value of 
test, if not, yields else
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1684-1702](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L1684-L1702)</ins>
</pre>

```clj
(defmacro if-let
  ([bindings then]
   `(if-let ~bindings ~then nil))
  ([bindings then else & oldform]
   (assert-args
     (vector? bindings) "a vector for its binding"
     (nil? oldform) "1 or 2 forms after binding vector"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
     `(let [temp# ~tst]
        (if temp#
          (let [~form temp#]
            ~then)
          ~else)))))
```


---

```clj
{:ns "cljs.core",
 :name "if-let",
 :signature ["[bindings then]" "[bindings then else & oldform]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_if-let",
 :source {:code "(defmacro if-let\n  ([bindings then]\n   `(if-let ~bindings ~then nil))\n  ([bindings then else & oldform]\n   (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (nil? oldform) \"1 or 2 forms after binding vector\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n     `(let [temp# ~tst]\n        (if temp#\n          (let [~form temp#]\n            ~then)\n          ~else)))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [1684 1702],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L1684-L1702"},
 :full-name "cljs.core/if-let",
 :clj-symbol "clojure.core/if-let",
 :docstring "bindings => binding-form test\n\nIf test is true, evaluates then with binding-form bound to the value of \ntest, if not, yields else"}

```
