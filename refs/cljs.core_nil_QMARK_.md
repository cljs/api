## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nil?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nil?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nil?)
</td>
</tr>
</table>

 <samp>
(__nil?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:183-185](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L183-L185)</ins>
</pre>

```clj
(defn nil? [x]
  "Returns true if x is nil, false otherwise."
  (identical? x nil))
```


---

```clj
{:full-name "cljs.core/nil?",
 :ns "cljs.core",
 :name "nil?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn nil? [x]\n  \"Returns true if x is nil, false otherwise.\"\n  (identical? x nil))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [183 185],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L183-L185"},
 :full-name-encode "cljs.core_nil_QMARK_",
 :clj-symbol "clojure.core/nil?",
 :history [["+" "0.0-927"]]}

```
