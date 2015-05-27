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
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:71-75](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L71-L75)</ins>
</pre>

```clj
(defn array
  [var-args]            ;; [& items]
  (js* "Array.prototype.slice.call(arguments)"))
```


---

```clj
{:full-name "cljs.core/array",
 :ns "cljs.core",
 :name "array",
 :docstring "Creates a new javascript array.\n@param {...*} var_args",
 :type "function",
 :signature ["[var-args]"],
 :source {:code "(defn array\n  [var-args]            ;; [& items]\n  (js* \"Array.prototype.slice.call(arguments)\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [71 75],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L71-L75"},
 :full-name-encode "cljs.core_array",
 :history [["+" "0.0-927"]]}

```
