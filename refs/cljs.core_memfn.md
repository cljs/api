## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/memfn

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memfn)
</td>
</tr>
</table>

 <samp>
(__memfn__ name & args)<br>
</samp>

```
Expands into code that creates a fn that expects to be passed an
object and any args and calls the named instance method on the
object passing the args. Use when you want to treat a Java method as
a first-class fn.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3414-3422](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L3414-L3422)</ins>
</pre>

```clj
(defmacro memfn
  [name & args]
  `(fn [target# ~@args]
     (. target# (~name ~@args))))
```


---

```clj
{:ns "cljs.core",
 :name "memfn",
 :signature ["[name & args]"],
 :history [["+" "0.0-1443"]],
 :type "macro",
 :full-name-encode "cljs.core_memfn",
 :source {:code "(defmacro memfn\n  [name & args]\n  `(fn [target# ~@args]\n     (. target# (~name ~@args))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [3414 3422],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L3414-L3422"},
 :full-name "cljs.core/memfn",
 :clj-symbol "clojure.core/memfn",
 :docstring "Expands into code that creates a fn that expects to be passed an\nobject and any args and calls the named instance method on the\nobject passing the args. Use when you want to treat a Java method as\na first-class fn."}

```
