## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array__ var-args)<br>
</samp>

```
Creates a new javascript array.
@param {...*} var_args
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:71-75](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L71-L75)</ins>
</pre>

```clj
(defn array
  [var-args]            ;; [& items]
  (js* "Array.prototype.slice.call(arguments)"))
```


---

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:642-649](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L642-L649)</ins>
</pre>

```clj
(defmacro array [& rest]
  (let [xs-str (->> (repeat "~{}")
                    (take (count rest))
                    (interpose ",")
                    (apply str))]
   (concat
    (list 'js* (str "[" xs-str "]"))
    rest)))
```

---

```clj
{:ns "cljs.core",
 :name "array",
 :signature ["[var-args]"],
 :shadowed-sources ({:code "(defmacro array [& rest]\n  (let [xs-str (->> (repeat \"~{}\")\n                    (take (count rest))\n                    (interpose \",\")\n                    (apply str))]\n   (concat\n    (list 'js* (str \"[\" xs-str \"]\"))\n    rest)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [642 649],
                     :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/core.clj#L642-L649"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_array",
 :source {:code "(defn array\n  [var-args]            ;; [& items]\n  (js* \"Array.prototype.slice.call(arguments)\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [71 75],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L71-L75"},
 :full-name "cljs.core/array",
 :docstring "Creates a new javascript array.\n@param {...*} var_args"}

```
