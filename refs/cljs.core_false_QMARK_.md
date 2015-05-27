## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/false?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>

 <samp>
(__false?__ x)<br>
</samp>

```
Returns true if x is the value false, false otherwise.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:604-606](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L604-L606)</ins>
</pre>

```clj
(defn false?
  [x] (js* "~{x} === false"))
```


---

```clj
{:ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_false_QMARK_",
 :source {:code "(defn false?\n  [x] (js* \"~{x} === false\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [604 606],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L604-L606"},
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```
