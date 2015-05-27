## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IEncodeClojure

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1552"><img valign="middle" alt="[+] 0.0-1552" src="https://img.shields.io/badge/+-0.0--1552-lightgrey.svg"></a> </td>
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
            └── <ins>[core.cljs:7024-7025](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7024-L7025)</ins>
</pre>

```clj
(defprotocol IEncodeClojure
  (-js->clj [x options] "Transforms JavaScript values to Clojure"))
```


---

```clj
{:ns "cljs.core",
 :name "IEncodeClojure",
 :type "protocol",
 :full-name-encode "cljs.core_IEncodeClojure",
 :source {:code "(defprotocol IEncodeClojure\n  (-js->clj [x options] \"Transforms JavaScript values to Clojure\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7024 7025],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L7024-L7025"},
 :methods [{:name "-js->clj",
            :signature ["[x options]"],
            :docstring "Transforms JavaScript values to Clojure"}],
 :full-name "cljs.core/IEncodeClojure",
 :history [["+" "0.0-1552"]]}

```
