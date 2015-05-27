## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/blank?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/blank?</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/blank?)
</td>
</tr>
</table>

 <samp>
(__blank?__ s)<br>
</samp>

```
True is s is nil, empty, or contains only whitespace.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:133-136](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/string.cljs#L133-L136)</ins>
</pre>

```clj
(defn blank?
  [s]
  (gstring/isEmptySafe s))
```


---

```clj
{:ns "clojure.string",
 :name "blank?",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_blank_QMARK_",
 :source {:code "(defn blank?\n  [s]\n  (gstring/isEmptySafe s))",
          :filename "clojurescript/src/cljs/clojure/string.cljs",
          :lines [133 136],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/string.cljs#L133-L136"},
 :full-name "clojure.string/blank?",
 :clj-symbol "clojure.string/blank?",
 :docstring "True is s is nil, empty, or contains only whitespace."}

```
