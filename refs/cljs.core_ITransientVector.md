## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientVector

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
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:289-291](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L289-L291)</ins>
</pre>

```clj
(defprotocol ITransientVector
  (-assoc-n! [tcoll n val])
  (-pop! [tcoll]))
```


---

```clj
{:ns "cljs.core",
 :name "ITransientVector",
 :type "protocol",
 :full-name-encode "cljs.core_ITransientVector",
 :source {:code "(defprotocol ITransientVector\n  (-assoc-n! [tcoll n val])\n  (-pop! [tcoll]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [289 291],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L289-L291"},
 :methods [{:name "-assoc-n!",
            :signature ["[tcoll n val]"],
            :docstring nil}
           {:name "-pop!", :signature ["[tcoll]"], :docstring nil}],
 :full-name "cljs.core/ITransientVector",
 :history [["+" "0.0-1211"]]}

```
