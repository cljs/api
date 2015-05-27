## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/false?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>

 <samp>
(__false?__ x)<br>
</samp>

```
Returns true if x is the value false, false otherwise.
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:819-821](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L819-L821)</ins>
</pre>

```clj
(defn ^boolean false?
  [x] (cljs.core/false? x))
```


---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:97-98](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L97-L98)</ins>
</pre>

```clj
(defmacro false? [x]
  (bool-expr (list 'js* "~{} === false" x)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro false? [x]\n  (bool-expr (list 'js* \"~{} === false\" x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [97 98],
                     :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L97-L98"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_false_QMARK_",
 :source {:code "(defn ^boolean false?\n  [x] (cljs.core/false? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [819 821],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L819-L821"},
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```
