## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ITransientCollection

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
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:313-315](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L313-L315)</ins>
</pre>

```clj
(defprotocol ITransientCollection
  (-conj! [tcoll val])
  (-persistent! [tcoll]))
```


---

```clj
{:ns "cljs.core",
 :name "ITransientCollection",
 :type "protocol",
 :full-name-encode "cljs.core_ITransientCollection",
 :source {:code "(defprotocol ITransientCollection\n  (-conj! [tcoll val])\n  (-persistent! [tcoll]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [313 315],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L313-L315"},
 :methods [{:name "-conj!",
            :signature ["[tcoll val]"],
            :docstring nil}
           {:name "-persistent!",
            :signature ["[tcoll]"],
            :docstring nil}],
 :full-name "cljs.core/ITransientCollection",
 :history [["+" "0.0-1211"]]}

```
