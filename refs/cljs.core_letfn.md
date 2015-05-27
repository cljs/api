## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/letfn

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/letfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/letfn)
</td>
</tr>
</table>

 <samp>
(__letfn__ fnspecs & body)<br>
</samp>

```
fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)

Takes a vector of function specs and a body, and generates a set of
bindings of functions to their names. All of the names are available
in all of the definitions of the functions, as well as the body.
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:5751-5762](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L5751-L5762)</ins>
</pre>

```clj
(defmacro letfn 
  [fnspecs & body] 
  `(letfn* ~(vec (interleave (map first fnspecs) 
                             (map #(cons `fn %) fnspecs)))
           ~@body))
```


---

```clj
{:ns "cljs.core",
 :name "letfn",
 :signature ["[fnspecs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_letfn",
 :source {:code "(defmacro letfn \n  [fnspecs & body] \n  `(letfn* ~(vec (interleave (map first fnspecs) \n                             (map #(cons `fn %) fnspecs)))\n           ~@body))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [5751 5762],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L5751-L5762"},
 :full-name "cljs.core/letfn",
 :clj-symbol "clojure.core/letfn",
 :docstring "fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)\n\nTakes a vector of function specs and a body, and generates a set of\nbindings of functions to their names. All of the names are available\nin all of the definitions of the functions, as well as the body."}

```
