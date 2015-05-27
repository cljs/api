## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/INamed

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:341-343](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L341-L343)</ins>
</pre>

```clj
(defprotocol INamed
  (-name [x])
  (-namespace [x]))
```


---

```clj
{:ns "cljs.core",
 :name "INamed",
 :type "protocol",
 :full-name-encode "cljs.core_INamed",
 :source {:code "(defprotocol INamed\n  (-name [x])\n  (-namespace [x]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [341 343],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L341-L343"},
 :methods [{:name "-name", :signature ["[x]"], :docstring nil}
           {:name "-namespace", :signature ["[x]"], :docstring nil}],
 :full-name "cljs.core/INamed",
 :history [["+" "0.0-1798"]]}

```
