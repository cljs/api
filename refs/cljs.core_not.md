## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not)
</td>
</tr>
</table>

 <samp>
(__not__ x)<br>
</samp>

```
Returns true if x is logical false, false otherwise.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:478-480](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L478-L480)</ins>
</pre>

```clj
(defn not
  [x] (if x false true))
```


---

```clj
{:ns "cljs.core",
 :name "not",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_not",
 :source {:code "(defn not\n  [x] (if x false true))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [478 480],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L478-L480"},
 :full-name "cljs.core/not",
 :clj-symbol "clojure.core/not",
 :docstring "Returns true if x is logical false, false otherwise."}

```
