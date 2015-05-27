## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWatchable

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
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:195-198](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L195-L198)</ins>
</pre>

```clj
(defprotocol IWatchable
  (-notify-watches [this oldval newval])
  (-add-watch [this key f])
  (-remove-watch [this key]))
```


---

```clj
{:ns "cljs.core",
 :name "IWatchable",
 :type "protocol",
 :full-name-encode "cljs.core_IWatchable",
 :source {:code "(defprotocol IWatchable\n  (-notify-watches [this oldval newval])\n  (-add-watch [this key f])\n  (-remove-watch [this key]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [195 198],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L195-L198"},
 :methods [{:name "-notify-watches",
            :signature ["[this oldval newval]"],
            :docstring nil}
           {:name "-add-watch",
            :signature ["[this key f]"],
            :docstring nil}
           {:name "-remove-watch",
            :signature ["[this key]"],
            :docstring nil}],
 :full-name "cljs.core/IWatchable",
 :history [["+" "0.0-927"]]}

```
