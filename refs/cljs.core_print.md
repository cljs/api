## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/print

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/print</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/print)
</td>
</tr>
</table>

 <samp>
</samp>

```
Prints the object(s) using string-print.
print and println produce output for human consumption.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3129-3134](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3129-L3134)</ins>
</pre>

```clj
(def ^{:doc
  "Prints the object(s) using string-print.
  print and println produce output for human consumption."}
  print
  (fn cljs-core-print [& objs]
    (pr-with-opts objs (assoc (pr-opts) :readably false))))
```


---

```clj
{:full-name "cljs.core/print",
 :ns "cljs.core",
 :name "print",
 :docstring "Prints the object(s) using string-print.\nprint and println produce output for human consumption.",
 :type "function",
 :source {:code "(def ^{:doc\n  \"Prints the object(s) using string-print.\n  print and println produce output for human consumption.\"}\n  print\n  (fn cljs-core-print [& objs]\n    (pr-with-opts objs (assoc (pr-opts) :readably false))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3129 3134],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L3129-L3134"},
 :full-name-encode "cljs.core_print",
 :clj-symbol "clojure.core/print",
 :history [["+" "0.0-927"]]}

```
