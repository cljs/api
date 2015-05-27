## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/wrap-message

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__wrap-message__ t data)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:57-58](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/browser/repl.cljs#L57-L58)</ins>
</pre>

```clj
(defn wrap-message [t data]
  (pr-str {:type t :content data :order (swap! order inc)}))
```


---

```clj
{:full-name "clojure.browser.repl/wrap-message",
 :ns "clojure.browser.repl",
 :name "wrap-message",
 :type "function",
 :signature ["[t data]"],
 :source {:code "(defn wrap-message [t data]\n  (pr-str {:type t :content data :order (swap! order inc)}))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [57 58],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/browser/repl.cljs#L57-L58"},
 :full-name-encode "clojure.browser.repl_wrap-message",
 :history [["+" "0.0-927"]]}

```
