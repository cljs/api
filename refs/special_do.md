## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/do

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/do</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)
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
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:991-994](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/compiler.clj#L991-L994)</ins>
</pre>

```clj
(defmethod parse 'do
  [op env [_ & exprs :as form] _]
  (let [block (analyze-block env exprs)]
    (merge {:env env :op :do :form form :children (block-children block)} block)))
```


---

```clj
{:full-name "special/do",
 :ns "special",
 :name "do",
 :type "special form",
 :source {:code "(defmethod parse 'do\n  [op env [_ & exprs :as form] _]\n  (let [block (analyze-block env exprs)]\n    (merge {:env env :op :do :form form :children (block-children block)} block)))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [991 994],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/compiler.clj#L991-L994"},
 :full-name-encode "special_do",
 :clj-symbol "clojure.core/do",
 :history [["+" "0.0-927"]]}

```
