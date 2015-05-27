## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/send-result

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-result__ connection url data)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:38-39](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/browser/repl.cljs#L38-L39)</ins>
</pre>

```clj
(defn send-result [connection url data]
  (net/transmit connection url "POST" data nil 0))
```


---

```clj
{:full-name "clojure.browser.repl/send-result",
 :ns "clojure.browser.repl",
 :name "send-result",
 :type "function",
 :signature ["[connection url data]"],
 :source {:code "(defn send-result [connection url data]\n  (net/transmit connection url \"POST\" data nil 0))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [38 39],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/clojure/browser/repl.cljs#L38-L39"},
 :full-name-encode "clojure.browser.repl_send-result",
 :history [["+" "0.0-927"]]}

```
