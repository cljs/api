## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/print-doc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__print-doc__ {:keys [name method-params doc]})<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:38-42](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/reflect.cljs#L38-L42)</ins>
</pre>

```clj
(defn print-doc [{:keys [name method-params doc]}]
  (when-not (empty? name)
    (println name)
    (println method-params)
    (println doc)))
```


---

```clj
{:full-name "clojure.reflect/print-doc",
 :ns "clojure.reflect",
 :name "print-doc",
 :type "function",
 :signature ["[{:keys [name method-params doc]}]"],
 :source {:code "(defn print-doc [{:keys [name method-params doc]}]\n  (when-not (empty? name)\n    (println name)\n    (println method-params)\n    (println doc)))",
          :filename "clojurescript/src/cljs/clojure/reflect.cljs",
          :lines [38 42],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/reflect.cljs#L38-L42"},
 :full-name-encode "clojure.reflect_print-doc",
 :history [["+" "0.0-1503"]]}

```
