## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/write-all

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__write-all__ writer & ss)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6174-6176](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L6174-L6176)</ins>
</pre>

```clj
(defn write-all [writer & ss]
  (doseq [s ss]
    (-write writer s)))
```


---

```clj
{:full-name "cljs.core/write-all",
 :ns "cljs.core",
 :name "write-all",
 :type "function",
 :signature ["[writer & ss]"],
 :source {:code "(defn write-all [writer & ss]\n  (doseq [s ss]\n    (-write writer s)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6174 6176],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L6174-L6176"},
 :full-name-encode "cljs.core_write-all",
 :history [["+" "0.0-1503"]]}

```
