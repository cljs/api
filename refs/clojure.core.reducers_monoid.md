## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/monoid

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__monoid__ op ctor)<br>
</samp>

```
Builds a combining fn out of the supplied operator and identity
constructor. op must be associative and ctor called with no args
must return an identity value for it.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:233-240](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/core/reducers.cljs#L233-L240)</ins>
</pre>

```clj
(defn monoid
  [op ctor]
  (fn m
    ([] (ctor))
    ([a b] (op a b))))
```


---

```clj
{:full-name "clojure.core.reducers/monoid",
 :ns "clojure.core.reducers",
 :name "monoid",
 :docstring "Builds a combining fn out of the supplied operator and identity\nconstructor. op must be associative and ctor called with no args\nmust return an identity value for it.",
 :type "function",
 :signature ["[op ctor]"],
 :source {:code "(defn monoid\n  [op ctor]\n  (fn m\n    ([] (ctor))\n    ([a b] (op a b))))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [233 240],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/core/reducers.cljs#L233-L240"},
 :full-name-encode "clojure.core.reducers_monoid",
 :history [["+" "0.0-1236"]]}

```
