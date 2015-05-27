## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string-print

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__string-print__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6180-6182](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6180-L6182)</ins>
</pre>

```clj
(defn string-print [x]
  (*print-fn* x)
  nil)
```


---

```clj
{:full-name "cljs.core/string-print",
 :ns "cljs.core",
 :name "string-print",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string-print [x]\n  (*print-fn* x)\n  nil)",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6180 6182],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L6180-L6182"},
 :full-name-encode "cljs.core_string-print",
 :history [["+" "0.0-927"]]}

```
