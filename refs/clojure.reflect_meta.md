## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.reflect/meta

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__meta__ sym cb)<br>
</samp>

```
Queries the reflection api with a fully qualified symbol, then calls
callback fn cb with the evaluated cljs map containing that symbol's
meta information.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── <ins>[reflect.cljs:24-30](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/reflect.cljs#L24-L30)</ins>
</pre>

```clj
(defn meta
  [sym cb]
  (query-reflection (str "var=" (js/encodeURIComponent (str sym)))
                    #(cb (evaluate-javascript %))))
```


---

```clj
{:full-name "clojure.reflect/meta",
 :ns "clojure.reflect",
 :name "meta",
 :docstring "Queries the reflection api with a fully qualified symbol, then calls\ncallback fn cb with the evaluated cljs map containing that symbol's\nmeta information.",
 :type "function",
 :signature ["[sym cb]"],
 :source {:code "(defn meta\n  [sym cb]\n  (query-reflection (str \"var=\" (js/encodeURIComponent (str sym)))\n                    #(cb (evaluate-javascript %))))",
          :filename "clojurescript/src/cljs/clojure/reflect.cljs",
          :lines [24 30],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/reflect.cljs#L24-L30"},
 :full-name-encode "clojure.reflect_meta",
 :history [["+" "0.0-1503"]]}

```
