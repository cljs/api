## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/NeverEquiv

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__NeverEquiv.__)<br>
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
            └── <ins>[core.cljs:3514-3516](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L3514-L3516)</ins>
</pre>

```clj
(deftype NeverEquiv []
  IEquiv
  (-equiv [o other] false))
```


---

```clj
{:full-name "cljs.core/NeverEquiv",
 :ns "cljs.core",
 :name "NeverEquiv",
 :type "type",
 :signature ["[]"],
 :source {:code "(deftype NeverEquiv []\n  IEquiv\n  (-equiv [o other] false))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3514 3516],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L3514-L3516"},
 :full-name-encode "cljs.core_NeverEquiv",
 :history [["+" "0.0-927"]]}

```
