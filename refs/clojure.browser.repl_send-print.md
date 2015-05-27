## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/send-print

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-print__ url data)<br>
(__send-print__ url data n)<br>
</samp>

```
Send data to be printed in the REPL. If there is an error, try again
up to 10 times.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:41-53](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/browser/repl.cljs#L41-L53)</ins>
</pre>

```clj
(defn send-print
  ([url data]
     (send-print url data 0))
  ([url data n]
     (let [conn (net/xhr-connection)]
       (event/listen conn :error
                     (fn [_]
                       (if (< n 10)
                         (send-print url data (inc n))
                         (.log js/console (str "Could not send " data " after " n " attempts.")))))
       (net/transmit conn url "POST" data nil 0))))
```


---

```clj
{:full-name "clojure.browser.repl/send-print",
 :ns "clojure.browser.repl",
 :name "send-print",
 :docstring "Send data to be printed in the REPL. If there is an error, try again\nup to 10 times.",
 :type "function",
 :signature ["[url data]" "[url data n]"],
 :source {:code "(defn send-print\n  ([url data]\n     (send-print url data 0))\n  ([url data n]\n     (let [conn (net/xhr-connection)]\n       (event/listen conn :error\n                     (fn [_]\n                       (if (< n 10)\n                         (send-print url data (inc n))\n                         (.log js/console (str \"Could not send \" data \" after \" n \" attempts.\")))))\n       (net/transmit conn url \"POST\" data nil 0))))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [41 53],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/browser/repl.cljs#L41-L53"},
 :full-name-encode "clojure.browser.repl_send-print",
 :history [["+" "0.0-927"]]}

```
