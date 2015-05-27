## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/integer?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/integer?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/integer?)
</td>
</tr>
</table>

 <samp>
(__integer?__ n)<br>
</samp>

```
Returns true if n is an integer.  Warning: returns true on underflow condition.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:687-691](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L687-L691)</ins>
</pre>

```clj
(defn integer?
  [n]
  (and (number? n)
       (js* "(~{n} == ~{n}.toFixed())")))
```


---

```clj
{:ns "cljs.core",
 :name "integer?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_integer_QMARK_",
 :source {:code "(defn integer?\n  [n]\n  (and (number? n)\n       (js* \"(~{n} == ~{n}.toFixed())\")))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [687 691],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L687-L691"},
 :full-name "cljs.core/integer?",
 :clj-symbol "clojure.core/integer?",
 :docstring "Returns true if n is an integer.  Warning: returns true on underflow condition."}

```
