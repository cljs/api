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
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1049-1060](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1049-L1060)</ins>
</pre>

```clj
(defn str
  ([] "")
  ([x] (cond
        (symbol? x) (. x (substring 2 (.-length x)))
        (keyword? x) (str* ":" (. x (substring 2 (.-length x))))
        (nil? x) ""
        :else (. x (toString))))
  ([x & ys]
     (apply str* x ys)))
```


---

```clj
{:ns "cljs.core",
 :name "str",
 :signature ["[]" "[x]" "[x & ys]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_str",
 :source {:code "(defn str\n  ([] \"\")\n  ([x] (cond\n        (symbol? x) (. x (substring 2 (.-length x)))\n        (keyword? x) (str* \":\" (. x (substring 2 (.-length x))))\n        (nil? x) \"\"\n        :else (. x (toString))))\n  ([x & ys]\n     (apply str* x ys)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1049 1060],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L1049-L1060"},
 :full-name "cljs.core/str",
 :clj-symbol "clojure.core/str",
 :docstring "With no args, returns the empty string. With one arg x, returns\nx.toString().  (str nil) returns the empty string. With more than\none arg, returns the concatenation of the str values of the args."}

```
