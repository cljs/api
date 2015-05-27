## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-value

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-value__ e v)<br>
</samp>

```
Set the value property for an element.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:142-145](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/browser/dom.cljs#L142-L145)</ins>
</pre>

```clj
(defn set-value
  [e v]
  (set-properties e {"value" v}))
```


---

```clj
{:full-name "clojure.browser.dom/set-value",
 :ns "clojure.browser.dom",
 :name "set-value",
 :docstring "Set the value property for an element.",
 :type "function",
 :signature ["[e v]"],
 :source {:code "(defn set-value\n  [e v]\n  (set-properties e {\"value\" v}))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [142 145],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/browser/dom.cljs#L142-L145"},
 :full-name-encode "clojure.browser.dom_set-value",
 :history [["+" "0.0-927"]]}

```
