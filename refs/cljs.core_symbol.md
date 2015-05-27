## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol)
</td>
</tr>
</table>

 <samp>
(__symbol__ name)<br>
(__symbol__ ns name)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:374-383](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L374-L383)</ins>
</pre>

```clj
(defn symbol
  ([name]
     (if (symbol? name)
       name
       (symbol nil name)))
  ([ns name]
     (let [sym-str (if-not (nil? ns)
                     (str ns "/" name)
                     name)]
       (Symbol. ns name sym-str -1 nil))))
```


---

```clj
{:full-name "cljs.core/symbol",
 :ns "cljs.core",
 :name "symbol",
 :type "function",
 :signature ["[name]" "[ns name]"],
 :source {:code "(defn symbol\n  ([name]\n     (if (symbol? name)\n       name\n       (symbol nil name)))\n  ([ns name]\n     (let [sym-str (if-not (nil? ns)\n                     (str ns \"/\" name)\n                     name)]\n       (Symbol. ns name sym-str -1 nil))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [374 383],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L374-L383"},
 :full-name-encode "cljs.core_symbol",
 :clj-symbol "clojure.core/symbol",
 :history [["+" "0.0-927"]]}

```
