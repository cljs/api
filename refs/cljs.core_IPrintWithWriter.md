## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IPrintWithWriter

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:260-266](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L260-L266)</ins>
</pre>

```clj
(defprotocol IPrintWithWriter
  "The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append."
  (-pr-writer [o writer opts]))
```


---

```clj
{:ns "cljs.core",
 :name "IPrintWithWriter",
 :type "protocol",
 :full-name-encode "cljs.core_IPrintWithWriter",
 :source {:code "(defprotocol IPrintWithWriter\n  \"The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.\"\n  (-pr-writer [o writer opts]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [260 266],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L260-L266"},
 :methods [{:name "-pr-writer",
            :signature ["[o writer opts]"],
            :docstring nil}],
 :full-name "cljs.core/IPrintWithWriter",
 :docstring "The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.",
 :history [["+" "0.0-1503"]]}

```
