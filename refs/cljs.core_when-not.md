## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when-not

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-not)
</td>
</tr>
</table>

 <samp>
(__when-not__ test & body)<br>
</samp>

```
Evaluates test. If logical false, evaluates body in an implicit do.
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:460-464](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L460-L464)</ins>
</pre>

```clj
(defmacro when-not
  [test & body]
    (list 'if test nil (cons 'do body)))
```


---

```clj
{:ns "cljs.core",
 :name "when-not",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_when-not",
 :source {:code "(defmacro when-not\n  [test & body]\n    (list 'if test nil (cons 'do body)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [460 464],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L460-L464"},
 :full-name "cljs.core/when-not",
 :clj-symbol "clojure.core/when-not",
 :docstring "Evaluates test. If logical false, evaluates body in an implicit do."}

```
