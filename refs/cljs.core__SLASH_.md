## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core//

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core//</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core//)
</td>
</tr>
</table>

 <samp>
(__/__ x)<br>
(__/__ x y)<br>
(__/__ x y & more)<br>
</samp>

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1247-1252](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1247-L1252)</ins>
</pre>

```clj
(defn /
  ([x] (/ 1 x))
  ([x y] (js* "(~{x} / ~{y})")) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce / (/ x y) more)))
```


---

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:238-241](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L238-L241)</ins>
</pre>

```clj
(defmacro /
  ([x] `(/ 1 ~x))
  ([x y] (list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "/",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro /\n  ([x] `(/ 1 ~x))\n  ([x y] (list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [238 241],
                     :link "https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L238-L241"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core__SLASH_",
 :source {:code "(defn /\n  ([x] (/ 1 x))\n  ([x y] (js* \"(~{x} / ~{y})\")) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce / (/ x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1247 1252],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L1247-L1252"},
 :full-name "cljs.core//",
 :clj-symbol "clojure.core//",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```
