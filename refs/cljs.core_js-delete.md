## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-delete

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-delete__ obj key)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:637-638](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L637-L638)</ins>
</pre>

```clj
(defn js-delete [obj key]
  (js* "delete ~{obj}[~{key}]"))
```


---

```clj
{:full-name "cljs.core/js-delete",
 :ns "cljs.core",
 :name "js-delete",
 :type "function",
 :signature ["[obj key]"],
 :source {:code "(defn js-delete [obj key]\n  (js* \"delete ~{obj}[~{key}]\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [637 638],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L637-L638"},
 :full-name-encode "cljs.core_js-delete",
 :history [["+" "0.0-927"]]}

```
