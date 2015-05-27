## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prn

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/prn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/prn)
</td>
</tr>
</table>

 <samp>
(__prn__ & objs)<br>
</samp>

```
Same as pr followed by (newline).
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3127-3131](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L3127-L3131)</ins>
</pre>

```clj
(defn prn
  [& objs]
  (pr-with-opts objs (pr-opts))
  (newline (pr-opts)))
```


---

```clj
{:ns "cljs.core",
 :name "prn",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_prn",
 :source {:code "(defn prn\n  [& objs]\n  (pr-with-opts objs (pr-opts))\n  (newline (pr-opts)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3127 3131],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L3127-L3131"},
 :full-name "cljs.core/prn",
 :clj-symbol "clojure.core/prn",
 :docstring "Same as pr followed by (newline)."}

```
