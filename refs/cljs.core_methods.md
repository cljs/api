## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/methods

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/methods</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/methods)
</td>
</tr>
</table>

 <samp>
(__methods__ multifn)<br>
</samp>

```
Given a multimethod, returns a map of dispatch values -> dispatch fns
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6917-6919](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6917-L6919)</ins>
</pre>

```clj
(defn methods
  [multifn] (-methods multifn))
```


---

```clj
{:ns "cljs.core",
 :name "methods",
 :signature ["[multifn]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_methods",
 :source {:code "(defn methods\n  [multifn] (-methods multifn))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6917 6919],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6917-L6919"},
 :full-name "cljs.core/methods",
 :clj-symbol "clojure.core/methods",
 :docstring "Given a multimethod, returns a map of dispatch values -> dispatch fns"}

```
