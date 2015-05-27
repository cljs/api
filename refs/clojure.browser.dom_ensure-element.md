## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/ensure-element

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ensure-element__ e)<br>
</samp>

```
Coerce the argument to a dom element if possible.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:105-110](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L105-L110)</ins>
</pre>

```clj
(defn ensure-element
  [e]
  (cond (keyword? e) (get-element e)
        (string? e) (html->dom e)
        :else e))
```


---

```clj
{:full-name "clojure.browser.dom/ensure-element",
 :ns "clojure.browser.dom",
 :name "ensure-element",
 :docstring "Coerce the argument to a dom element if possible.",
 :type "function",
 :signature ["[e]"],
 :source {:code "(defn ensure-element\n  [e]\n  (cond (keyword? e) (get-element e)\n        (string? e) (html->dom e)\n        :else e))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [105 110],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L105-L110"},
 :full-name-encode "clojure.browser.dom_ensure-element",
 :history [["+" "0.0-927"]]}

```
