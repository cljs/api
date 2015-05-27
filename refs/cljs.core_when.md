## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when)
</td>
</tr>
</table>

 <samp>
(__when__ test & body)<br>
</samp>

```
Evaluates test. If logical true, evaluates body in an implicit do.
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:454-458](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L454-L458)</ins>
</pre>

```clj
(defmacro when
  [test & body]
  (list 'if test (cons 'do body)))
```


---

```clj
{:ns "cljs.core",
 :name "when",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_when",
 :source {:code "(defmacro when\n  [test & body]\n  (list 'if test (cons 'do body)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [454 458],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L454-L458"},
 :full-name "cljs.core/when",
 :clj-symbol "clojure.core/when",
 :docstring "Evaluates test. If logical true, evaluates body in an implicit do."}

```
