## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IPrintable

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:232-233](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L232-L233)</ins>
</pre>

```clj
(defprotocol IPrintable
  (-pr-seq [o opts]))
```


---

```clj
{:ns "cljs.core",
 :name "IPrintable",
 :type "protocol",
 :full-name-encode "cljs.core_IPrintable",
 :source {:code "(defprotocol IPrintable\n  (-pr-seq [o opts]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [232 233],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L232-L233"},
 :methods [{:name "-pr-seq", :signature ["[o opts]"], :docstring nil}],
 :full-name "cljs.core/IPrintable",
 :history [["+" "0.0-927"]]}

```
