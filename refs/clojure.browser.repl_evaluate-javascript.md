## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/evaluate-javascript

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__evaluate-javascript__ conn block)<br>
</samp>

```
Process a single block of JavaScript received from the server
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:27-36](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/browser/repl.cljs#L27-L36)</ins>
</pre>

```clj
(defn evaluate-javascript
  [conn block]
  (let [result (try {:status :success :value (str (js* "eval(~{block})"))}
                    (catch js/Error e
                      {:status :exception :value (pr-str e)
                       :stacktrace (if (.hasOwnProperty e "stack")
                                     (.-stack e)
                                     "No stacktrace available.")}))]
    (pr-str result)))
```


---

```clj
{:full-name "clojure.browser.repl/evaluate-javascript",
 :ns "clojure.browser.repl",
 :name "evaluate-javascript",
 :docstring "Process a single block of JavaScript received from the server",
 :type "function",
 :signature ["[conn block]"],
 :source {:code "(defn evaluate-javascript\n  [conn block]\n  (let [result (try {:status :success :value (str (js* \"eval(~{block})\"))}\n                    (catch js/Error e\n                      {:status :exception :value (pr-str e)\n                       :stacktrace (if (.hasOwnProperty e \"stack\")\n                                     (.-stack e)\n                                     \"No stacktrace available.\")}))]\n    (pr-str result)))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [27 36],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/browser/repl.cljs#L27-L36"},
 :full-name-encode "clojure.browser.repl_evaluate-javascript",
 :history [["+" "0.0-927"]]}

```
