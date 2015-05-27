## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/get-value

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-value__ e)<br>
</samp>

```
Get the value of an element.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:129-132](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L129-L132)</ins>
</pre>

```clj
(defn get-value
  [e]
  (.-value (ensure-element e)))
```


---

```clj
{:full-name "clojure.browser.dom/get-value",
 :ns "clojure.browser.dom",
 :name "get-value",
 :docstring "Get the value of an element.",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn get-value\n  [e]\n  (.-value (ensure-element e)))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [129 132],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L129-L132"},
 :full-name-encode "clojure.browser.dom_get-value",
 :history [["+" "0.0-927"]]}

```
