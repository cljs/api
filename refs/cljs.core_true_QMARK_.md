## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/true?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/true?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/true?)
</td>
</tr>
</table>

 <samp>
(__true?__ x)<br>
</samp>

```
Returns true if x is the value true, false otherwise.
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:811-813](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L811-L813)</ins>
</pre>

```clj
(defn ^boolean true?
  [x] (cljs.core/true? x))
```


---

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:93-94](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L93-L94)</ins>
</pre>

```clj
(defmacro true? [x]
  (bool-expr (list 'js* "~{} === true" x)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "true?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro true? [x]\n  (bool-expr (list 'js* \"~{} === true\" x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [93 94],
                     :link "https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L93-L94"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_true_QMARK_",
 :source {:code "(defn ^boolean true?\n  [x] (cljs.core/true? x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [811 813],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L811-L813"},
 :full-name "cljs.core/true?",
 :clj-symbol "clojure.core/true?",
 :docstring "Returns true if x is the value true, false otherwise."}

```
