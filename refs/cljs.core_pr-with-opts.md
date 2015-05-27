## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-with-opts

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-with-opts__ objs opts)<br>
</samp>

```
Prints a sequence of objects using string-print, observing all
the options given in opts
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6171-6180](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6171-L6180)</ins>
</pre>

```clj
(defn pr-with-opts
  [objs opts]
  (doseq [string (pr-seq (first objs) opts)]
    (string-print string))
  (doseq [obj (next objs)]
    (string-print " ")
    (doseq [string (pr-seq obj opts)]
      (string-print string))))
```


---

```clj
{:full-name "cljs.core/pr-with-opts",
 :ns "cljs.core",
 :name "pr-with-opts",
 :docstring "Prints a sequence of objects using string-print, observing all\nthe options given in opts",
 :type "function",
 :signature ["[objs opts]"],
 :source {:code "(defn pr-with-opts\n  [objs opts]\n  (doseq [string (pr-seq (first objs) opts)]\n    (string-print string))\n  (doseq [obj (next objs)]\n    (string-print \" \")\n    (doseq [string (pr-seq obj opts)]\n      (string-print string))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [6171 6180],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L6171-L6180"},
 :full-name-encode "cljs.core_pr-with-opts",
 :history [["+" "0.0-927"]]}

```
