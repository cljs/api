## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/if-not

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-not)
</td>
</tr>
</table>

 <samp>
(__if-not__ test then)<br>
(__if-not__ test then else)<br>
</samp>

```
Evaluates test. If logical false, evaluates and returns then expr, 
otherwise else expr, if supplied, else nil.
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:719-725](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L719-L725)</ins>
</pre>

```clj
(defmacro if-not
  ([test then] `(if-not ~test ~then nil))
  ([test then else]
   `(if (not ~test) ~then ~else)))
```


---

```clj
{:ns "cljs.core",
 :name "if-not",
 :signature ["[test then]" "[test then else]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_if-not",
 :source {:code "(defmacro if-not\n  ([test then] `(if-not ~test ~then nil))\n  ([test then else]\n   `(if (not ~test) ~then ~else)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [719 725],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L719-L725"},
 :full-name "cljs.core/if-not",
 :clj-symbol "clojure.core/if-not",
 :docstring "Evaluates test. If logical false, evaluates and returns then expr, \notherwise else expr, if supplied, else nil."}

```
