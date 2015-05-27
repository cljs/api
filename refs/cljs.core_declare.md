## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/declare

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/declare</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/declare)
</td>
</tr>
</table>

 <samp>
(__declare__ & names)<br>
</samp>

```
defs the supplied var names with no bindings, useful for making forward declarations.
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:2720-2723](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L2720-L2723)</ins>
</pre>

```clj
(defmacro declare
  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))
```


---

```clj
{:ns "cljs.core",
 :name "declare",
 :signature ["[& names]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_declare",
 :source {:code "(defmacro declare\n  [& names] `(do ~@(map #(list 'def (vary-meta % assoc :declared true)) names)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [2720 2723],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L2720-L2723"},
 :full-name "cljs.core/declare",
 :clj-symbol "clojure.core/declare",
 :docstring "defs the supplied var names with no bindings, useful for making forward declarations."}

```
