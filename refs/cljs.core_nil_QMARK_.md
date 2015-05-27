## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/nil?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nil?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nil?)
</td>
</tr>
</table>

 <samp>
(__nil?__ x)<br>
</samp>

```
Returns true if x is nil, false otherwise.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:214-217](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L214-L217)</ins>
</pre>

```clj
(defn nil?
  [x]
  (identical? x nil))
```


---

 <pre>
clojurescript @ r1011
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:45-46](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/core.clj#L45-L46)</ins>
</pre>

```clj
(defmacro nil? [x]
  `(identical? ~x nil))
```

---

```clj
{:ns "cljs.core",
 :name "nil?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro nil? [x]\n  `(identical? ~x nil))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [45 46],
                     :link "https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/core.clj#L45-L46"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_nil_QMARK_",
 :source {:code "(defn nil?\n  [x]\n  (identical? x nil))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [214 217],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L214-L217"},
 :full-name "cljs.core/nil?",
 :clj-symbol "clojure.core/nil?",
 :docstring "Returns true if x is nil, false otherwise."}

```
