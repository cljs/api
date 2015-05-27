## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/repl-print

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-print__ data)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:23-25](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/browser/repl.cljs#L23-L25)</ins>
</pre>

```clj
(defn repl-print [data]
  (if-let [conn @xpc-connection]
    (net/transmit conn :print (pr-str data))))
```


---

```clj
{:full-name "clojure.browser.repl/repl-print",
 :ns "clojure.browser.repl",
 :name "repl-print",
 :type "function",
 :signature ["[data]"],
 :source {:code "(defn repl-print [data]\n  (if-let [conn @xpc-connection]\n    (net/transmit conn :print (pr-str data))))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [23 25],
          :link "https://github.com/clojure/clojurescript/blob/r1552/src/cljs/clojure/browser/repl.cljs#L23-L25"},
 :full-name-encode "clojure.browser.repl_repl-print",
 :history [["+" "0.0-927"]]}

```
