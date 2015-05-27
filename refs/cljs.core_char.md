## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/char

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/char</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char)
</td>
</tr>
</table>

 <samp>
(__char__ x)<br>
</samp>

```
Coerce to char
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1468-1474](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1468-L1474)</ins>
</pre>

```clj
(defn char
  [x]
  (cond
    (number? x) (.fromCharCode js/String x)
    (and (string? x) (== (.-length x) 1)) x
    :else (throw (js/Error. "Argument to char must be a character or number"))))
```


---

```clj
{:ns "cljs.core",
 :name "char",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_char",
 :source {:code "(defn char\n  [x]\n  (cond\n    (number? x) (.fromCharCode js/String x)\n    (and (string? x) (== (.-length x) 1)) x\n    :else (throw (js/Error. \"Argument to char must be a character or number\"))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1468 1474],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1468-L1474"},
 :full-name "cljs.core/char",
 :clj-symbol "clojure.core/char",
 :docstring "Coerce to char"}

```
