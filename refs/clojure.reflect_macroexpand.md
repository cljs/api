## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/macroexpand

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__macroexpand__ form)<br>
</samp>

```
Queries the reflection api with a quoted macro form, then calls the
callback function with the macroexpanded form, as a string.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:32-36](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/reflect.cljs#L32-L36)</ins>
</pre>

```clj
(defn macroexpand
  [form]
  (query-reflection (str "macroform=" (js/encodeURIComponent (str form))) println))
```


---

```clj
{:full-name "clojure.reflect/macroexpand",
 :ns "clojure.reflect",
 :name "macroexpand",
 :docstring "Queries the reflection api with a quoted macro form, then calls the\ncallback function with the macroexpanded form, as a string.",
 :type "function",
 :signature ["[form]"],
 :source {:code "(defn macroexpand\n  [form]\n  (query-reflection (str \"macroform=\" (js/encodeURIComponent (str form))) println))",
          :filename "clojurescript/src/cljs/clojure/reflect.cljs",
          :lines [32 36],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/reflect.cljs#L32-L36"},
 :full-name-encode "clojure.reflect_macroexpand",
 :history [["+" "0.0-1503"]]}

```
