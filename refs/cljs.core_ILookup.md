## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ILookup

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
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:206-207](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L206-L207)</ins>
</pre>

```clj
(defprotocol ILookup
  (-lookup [o k] [o k not-found]))
```


---

```clj
{:ns "cljs.core",
 :name "ILookup",
 :type "protocol",
 :full-name-encode "cljs.core_ILookup",
 :source {:code "(defprotocol ILookup\n  (-lookup [o k] [o k not-found]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [206 207],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L206-L207"},
 :methods [{:name "-lookup",
            :signature ["[o k]" "[o k not-found]"],
            :docstring nil}],
 :full-name "cljs.core/ILookup",
 :history [["+" "0.0-927"]]}

```
