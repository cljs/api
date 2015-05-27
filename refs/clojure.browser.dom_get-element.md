## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/get-element

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-element__ id)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:98-99](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/dom.cljs#L98-L99)</ins>
</pre>

```clj
(defn get-element [id]
  (gdom/getElement (name id)))
```


---

```clj
{:full-name "clojure.browser.dom/get-element",
 :ns "clojure.browser.dom",
 :name "get-element",
 :type "function",
 :signature ["[id]"],
 :source {:code "(defn get-element [id]\n  (gdom/getElement (name id)))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [98 99],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/dom.cljs#L98-L99"},
 :full-name-encode "clojure.browser.dom_get-element",
 :history [["+" "0.0-927"]]}

```
