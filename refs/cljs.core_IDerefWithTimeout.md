## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IDerefWithTimeout

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
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:194-195](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L194-L195)</ins>
</pre>

```clj
(defprotocol IDerefWithTimeout
  (-deref-with-timeout [o msec timeout-val]))
```


---

```clj
{:ns "cljs.core",
 :name "IDerefWithTimeout",
 :type "protocol",
 :full-name-encode "cljs.core_IDerefWithTimeout",
 :source {:code "(defprotocol IDerefWithTimeout\n  (-deref-with-timeout [o msec timeout-val]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [194 195],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L194-L195"},
 :methods [{:name "-deref-with-timeout",
            :signature ["[o msec timeout-val]"],
            :docstring nil}],
 :full-name "cljs.core/IDerefWithTimeout",
 :history [["+" "0.0-927"]]}

```
