## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aget

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aget</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aget)
</td>
</tr>
</table>

 <samp>
(__aget__ array i)<br>
</samp>

```
Returns the value at the index.
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:77-80](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L77-L80)</ins>
</pre>

```clj
(defn aget
  [array i]
  (js* "~{array}[~{i}]"))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:48-49](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L48-L49)</ins>
</pre>

```clj
(defmacro aget [a i]
  (list 'js* "(~{}[~{}])" a i))
```

---

```clj
{:ns "cljs.core",
 :name "aget",
 :signature ["[array i]"],
 :shadowed-sources ({:code "(defmacro aget [a i]\n  (list 'js* \"(~{}[~{}])\" a i))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [48 49],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L48-L49"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_aget",
 :source {:code "(defn aget\n  [array i]\n  (js* \"~{array}[~{i}]\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [77 80],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L77-L80"},
 :full-name "cljs.core/aget",
 :clj-symbol "clojure.core/aget",
 :docstring "Returns the value at the index."}

```
