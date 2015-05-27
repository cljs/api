## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/str

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/str</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/str)
</td>
</tr>
</table>

 <samp>
(__str__)<br>
(__str__ x)<br>
(__str__ x & ys)<br>
</samp>

```
With no args, returns the empty string. With one arg x, returns
x.toString().  (str nil) returns the empty string. With more than
one arg, returns the concatenation of the str values of the args.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1721-1735](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1721-L1735)</ins>
</pre>

```clj
(defn str
  ([] "")
  ([x] (cond
        (keyword? x) (str* ":" (. x (substring 2 (alength x))))
        (nil? x) ""
        :else (. x (toString))))
  ([x & ys]
     ((fn [sb more]
        (if more
          (recur (. sb  (append (str (first more)))) (next more))
          (str* sb)))
      (gstring/StringBuffer. (str x)) ys)))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:187-191](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L187-L191)</ins>
</pre>

```clj
(defmacro str [& xs]
  (let [strs (->> (repeat (count xs) "cljs.core.str(~{})")
                  (interpose ",")
                  (apply core/str))]
   (concat (list 'js* (core/str "[" strs "].join('')")) xs)))
```

---

```clj
{:ns "cljs.core",
 :name "str",
 :signature ["[]" "[x]" "[x & ys]"],
 :shadowed-sources ({:code "(defmacro str [& xs]\n  (let [strs (->> (repeat (count xs) \"cljs.core.str(~{})\")\n                  (interpose \",\")\n                  (apply core/str))]\n   (concat (list 'js* (core/str \"[\" strs \"].join('')\")) xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [187 191],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L187-L191"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_str",
 :source {:code "(defn str\n  ([] \"\")\n  ([x] (cond\n        (keyword? x) (str* \":\" (. x (substring 2 (alength x))))\n        (nil? x) \"\"\n        :else (. x (toString))))\n  ([x & ys]\n     ((fn [sb more]\n        (if more\n          (recur (. sb  (append (str (first more)))) (next more))\n          (str* sb)))\n      (gstring/StringBuffer. (str x)) ys)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1721 1735],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1721-L1735"},
 :full-name "cljs.core/str",
 :clj-symbol "clojure.core/str",
 :docstring "With no args, returns the empty string. With one arg x, returns\nx.toString().  (str nil) returns the empty string. With more than\none arg, returns the concatenation of the str values of the args."}

```
