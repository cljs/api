## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/is_proto_

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__is_proto___ x)<br>
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
            └── <ins>[core.cljs:95-97](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L95-L97)</ins>
</pre>

```clj
(defn is_proto_
  [x]
  (identical? (.-prototype (.-constructor x)) x))
```


---

```clj
{:full-name "cljs.core/is_proto_",
 :ns "cljs.core",
 :name "is_proto_",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn is_proto_\n  [x]\n  (identical? (.-prototype (.-constructor x)) x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [95 97],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L95-L97"},
 :full-name-encode "cljs.core_is_proto_",
 :history [["+" "0.0-927"]]}

```
