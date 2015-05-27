## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/log

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__log__ & args)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:19-20](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/browser/dom.cljs#L19-L20)</ins>
</pre>

```clj
(defn log [& args]
  (.log js/console (apply pr-str args)))
```


---

```clj
{:full-name "clojure.browser.dom/log",
 :ns "clojure.browser.dom",
 :name "log",
 :type "function",
 :signature ["[& args]"],
 :source {:code "(defn log [& args]\n  (.log js/console (apply pr-str args)))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [19 20],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/browser/dom.cljs#L19-L20"},
 :full-name-encode "clojure.browser.dom_log",
 :history [["+" "0.0-927"]]}

```
