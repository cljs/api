## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-properties

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-properties__ e m)<br>
</samp>

```
Set properties on an element
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:134-138](https://github.com/clojure/clojurescript/blob/r993/src/cljs/clojure/browser/dom.cljs#L134-L138)</ins>
</pre>

```clj
(defn set-properties
  [e m]
  (gdom/setProperties (ensure-element e)
                      (.-strobj m)))
```


---

```clj
{:full-name "clojure.browser.dom/set-properties",
 :ns "clojure.browser.dom",
 :name "set-properties",
 :docstring "Set properties on an element",
 :type "function",
 :signature ["[e m]"],
 :source {:code "(defn set-properties\n  [e m]\n  (gdom/setProperties (ensure-element e)\n                      (.-strobj m)))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [134 138],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/clojure/browser/dom.cljs#L134-L138"},
 :full-name-encode "clojure.browser.dom_set-properties",
 :history [["+" "0.0-927"]]}

```
