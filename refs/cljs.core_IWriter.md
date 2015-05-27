## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWriter

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:290-292](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L290-L292)</ins>
</pre>

```clj
(defprotocol IWriter
  (-write [writer s])
  (-flush [writer]))
```


---

```clj
{:ns "cljs.core",
 :name "IWriter",
 :type "protocol",
 :full-name-encode "cljs.core_IWriter",
 :source {:code "(defprotocol IWriter\n  (-write [writer s])\n  (-flush [writer]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [290 292],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L290-L292"},
 :methods [{:name "-write", :signature ["[writer s]"], :docstring nil}
           {:name "-flush", :signature ["[writer]"], :docstring nil}],
 :full-name "cljs.core/IWriter",
 :history [["+" "0.0-1503"]]}

```
