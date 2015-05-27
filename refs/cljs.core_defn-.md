## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defn-

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn-</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn-)
</td>
</tr>
</table>

 <samp>
(__defn-__ name & decls)<br>
</samp>

```
same as defn, yielding non-public def
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4331-4335](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L4331-L4335)</ins>
</pre>

```clj
(defmacro defn-
  [name & decls]
    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))
```


---

```clj
{:ns "cljs.core",
 :name "defn-",
 :signature ["[name & decls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defn-",
 :source {:code "(defmacro defn-\n  [name & decls]\n    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [4331 4335],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L4331-L4335"},
 :full-name "cljs.core/defn-",
 :clj-symbol "clojure.core/defn-",
 :docstring "same as defn, yielding non-public def"}

```
