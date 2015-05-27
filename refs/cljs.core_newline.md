## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/newline

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/newline</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/newline)
</td>
</tr>
</table>

 <samp>
(__newline__ opts)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6477-6480](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6477-L6480)</ins>
</pre>

```clj
(defn newline [opts]
  (string-print "\n")
  (when (get opts :flush-on-newline)
    (flush)))
```


---

```clj
{:full-name "cljs.core/newline",
 :ns "cljs.core",
 :name "newline",
 :type "function",
 :signature ["[opts]"],
 :source {:code "(defn newline [opts]\n  (string-print \"\\n\")\n  (when (get opts :flush-on-newline)\n    (flush)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6477 6480],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L6477-L6480"},
 :full-name-encode "cljs.core_newline",
 :clj-symbol "clojure.core/newline",
 :history [["+" "0.0-927"]]}

```
