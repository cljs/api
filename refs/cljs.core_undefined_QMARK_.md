## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/undefined?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__undefined?__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:612-613](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L612-L613)</ins>
</pre>

```clj
(defn undefined? [x]
  (js* "(void 0 === ~{x})"))
```


---

```clj
{:full-name "cljs.core/undefined?",
 :ns "cljs.core",
 :name "undefined?",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn undefined? [x]\n  (js* \"(void 0 === ~{x})\"))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [612 613],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L612-L613"},
 :full-name-encode "cljs.core_undefined_QMARK_",
 :history [["+" "0.0-927"]]}

```
