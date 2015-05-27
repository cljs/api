## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/quote

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quote</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quote)
</td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:1094-1096](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L1094-L1096)</ins>
</pre>

```clj
(defmethod parse 'quote
  [_ env [_ x] _]
  {:op :constant :env env :form x})
```


---

```clj
{:full-name "special/quote",
 :ns "special",
 :name "quote",
 :type "special form",
 :source {:code "(defmethod parse 'quote\n  [_ env [_ x] _]\n  {:op :constant :env env :form x})",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [1094 1096],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L1094-L1096"},
 :full-name-encode "special_quote",
 :clj-symbol "clojure.core/quote",
 :history [["+" "0.0-927"]]}

```
