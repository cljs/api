## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IIndexed

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
            └── <ins>[core.cljs:194-195](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L194-L195)</ins>
</pre>

```clj
(defprotocol IIndexed
  (-nth [coll n] [coll n not-found]))
```


---

```clj
{:ns "cljs.core",
 :name "IIndexed",
 :type "protocol",
 :full-name-encode "cljs.core_IIndexed",
 :source {:code "(defprotocol IIndexed\n  (-nth [coll n] [coll n not-found]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [194 195],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L194-L195"},
 :methods [{:name "-nth",
            :signature ["[coll n]" "[coll n not-found]"],
            :docstring nil}],
 :full-name "cljs.core/IIndexed",
 :history [["+" "0.0-927"]]}

```
