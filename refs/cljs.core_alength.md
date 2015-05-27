## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/alength

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alength</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alength)
</td>
</tr>
</table>

 <samp>
(__alength__ array)<br>
</samp>

```
Returns the length of the Java array. Works on arrays of all types.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:87-90](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L87-L90)</ins>
</pre>

```clj
(defn alength
  [array]
  (js* "~{array}.length"))
```


---

```clj
{:ns "cljs.core",
 :name "alength",
 :signature ["[array]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_alength",
 :source {:code "(defn alength\n  [array]\n  (js* \"~{array}.length\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [87 90],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L87-L90"},
 :full-name "cljs.core/alength",
 :clj-symbol "clojure.core/alength",
 :docstring "Returns the length of the Java array. Works on arrays of all types."}

```
