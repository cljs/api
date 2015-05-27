## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/true?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/true?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/true?)
</td>
</tr>
</table>

 <samp>
(__true?__ x)<br>
</samp>

```
Returns true if x is the value true, false otherwise.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:608-610](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L608-L610)</ins>
</pre>

```clj
(defn true?
  [x] (js* "~{x} === true"))
```


---

```clj
{:ns "cljs.core",
 :name "true?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_true_QMARK_",
 :source {:code "(defn true?\n  [x] (js* \"~{x} === true\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [608 610],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L608-L610"},
 :full-name "cljs.core/true?",
 :clj-symbol "clojure.core/true?",
 :docstring "Returns true if x is the value true, false otherwise."}

```
