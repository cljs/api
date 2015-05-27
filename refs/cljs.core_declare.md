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
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:2667-2670](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L2667-L2670)</ins>
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
          :lines [2667 2670],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L2667-L2670"},
 :full-name "cljs.core/declare",
 :clj-symbol "clojure.core/declare",
 :docstring "defs the supplied var names with no bindings, useful for making forward declarations."}

```
