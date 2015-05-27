## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-fn\*

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
Each runtime environment provides a diffenent way to print output.
Whatever function *print-fn* is bound to will be passed any
Strings which should be printed.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:18-24](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L18-L24)</ins>
</pre>

```clj
(def
  ^{:doc "Each runtime environment provides a diffenent way to print output.
  Whatever function *print-fn* is bound to will be passed any
  Strings which should be printed."}
  *print-fn*
  (fn [_]
    (throw (js/Error. "No *print-fn* fn set for evaluation environment"))))
```


---

```clj
{:full-name "cljs.core/*print-fn*",
 :ns "cljs.core",
 :name "*print-fn*",
 :docstring "Each runtime environment provides a diffenent way to print output.\nWhatever function *print-fn* is bound to will be passed any\nStrings which should be printed.",
 :type "function",
 :source {:code "(def\n  ^{:doc \"Each runtime environment provides a diffenent way to print output.\n  Whatever function *print-fn* is bound to will be passed any\n  Strings which should be printed.\"}\n  *print-fn*\n  (fn [_]\n    (throw (js/Error. \"No *print-fn* fn set for evaluation environment\"))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [18 24],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L18-L24"},
 :full-name-encode "cljs.core__STAR_print-fn_STAR_",
 :history [["+" "0.0-927"]]}

```
