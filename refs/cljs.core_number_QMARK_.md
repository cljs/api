## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/number?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/number?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/number?)
</td>
</tr>
</table>

 <samp>
(__number?__ n)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:678-679](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L678-L679)</ins>
</pre>

```clj
(defn number? [n]
  (goog/isNumber n))
```


---

```clj
{:full-name "cljs.core/number?",
 :ns "cljs.core",
 :name "number?",
 :type "function",
 :signature ["[n]"],
 :source {:code "(defn number? [n]\n  (goog/isNumber n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [678 679],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L678-L679"},
 :full-name-encode "cljs.core_number_QMARK_",
 :clj-symbol "clojure.core/number?",
 :history [["+" "0.0-927"]]}

```
