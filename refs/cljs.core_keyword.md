## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keyword

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword)
</td>
</tr>
</table>

 <samp>
(__keyword__ name)<br>
(__keyword__ ns name)<br>
</samp>

```
Returns a Keyword with the given namespace and name.  Do not use :
in the keyword strings, it will be added automatically.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1460-1466](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1460-L1466)</ins>
</pre>

```clj
(defn keyword
  ([name] (cond (keyword? name) name
                (symbol? name) (str* "\uFDD0" "'" (subs name 2))
                :else (str* "\uFDD0" "'" name)))
  ([ns name] (keyword (str* ns "/" name))))
```


---

```clj
{:ns "cljs.core",
 :name "keyword",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keyword",
 :source {:code "(defn keyword\n  ([name] (cond (keyword? name) name\n                (symbol? name) (str* \"\\uFDD0\" \"'\" (subs name 2))\n                :else (str* \"\\uFDD0\" \"'\" name)))\n  ([ns name] (keyword (str* ns \"/\" name))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1460 1466],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1460-L1466"},
 :full-name "cljs.core/keyword",
 :clj-symbol "clojure.core/keyword",
 :docstring "Returns a Keyword with the given namespace and name.  Do not use :\nin the keyword strings, it will be added automatically."}

```
