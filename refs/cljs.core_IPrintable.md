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
Do not use this.  It is kept for backwards compatibility with existing
   user code that depends on it, but it has been superceded by IPrintWithWriter
   User code that depends on this should be changed to use -pr-writer instead.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:250-254](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L250-L254)</ins>
</pre>

```clj
(defprotocol ^:deprecated IPrintable
  "Do not use this.  It is kept for backwards compatibility with existing
   user code that depends on it, but it has been superceded by IPrintWithWriter
   User code that depends on this should be changed to use -pr-writer instead."
  (-pr-seq [o opts]))
```


---

```clj
{:ns "cljs.core",
 :name "IPrintable",
 :type "protocol",
 :full-name-encode "cljs.core_IPrintable",
 :source {:code "(defprotocol ^:deprecated IPrintable\n  \"Do not use this.  It is kept for backwards compatibility with existing\n   user code that depends on it, but it has been superceded by IPrintWithWriter\n   User code that depends on this should be changed to use -pr-writer instead.\"\n  (-pr-seq [o opts]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [250 254],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L250-L254"},
 :methods [{:name "-pr-seq", :signature ["[o opts]"], :docstring nil}],
 :full-name "cljs.core/IPrintable",
 :docstring "Do not use this.  It is kept for backwards compatibility with existing\n   user code that depends on it, but it has been superceded by IPrintWithWriter\n   User code that depends on this should be changed to use -pr-writer instead.",
 :history [["+" "0.0-927"]]}

```
