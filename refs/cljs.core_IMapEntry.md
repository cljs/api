## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IMapEntry

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:213-215](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L213-L215)</ins>
</pre>

```clj
(defprotocol IMapEntry
  (-key [coll])
  (-val [coll]))
```


---

```clj
{:ns "cljs.core",
 :name "IMapEntry",
 :type "protocol",
 :full-name-encode "cljs.core_IMapEntry",
 :source {:code "(defprotocol IMapEntry\n  (-key [coll])\n  (-val [coll]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [213 215],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L213-L215"},
 :methods [{:name "-key", :signature ["[coll]"], :docstring nil}
           {:name "-val", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/IMapEntry",
 :history [["+" "0.0-1211"]]}

```
