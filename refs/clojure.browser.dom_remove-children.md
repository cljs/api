## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/remove-children

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__remove-children__ id)<br>
</samp>

```
Remove all children from the element with the passed id.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:92-96](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/browser/dom.cljs#L92-L96)</ins>
</pre>

```clj
(defn remove-children
  [id]
  (let [parent (gdom/getElement (name id))]
    (do (gdom/removeChildren parent))))
```


---

```clj
{:full-name "clojure.browser.dom/remove-children",
 :ns "clojure.browser.dom",
 :name "remove-children",
 :docstring "Remove all children from the element with the passed id.",
 :type "function",
 :signature ["[id]"],
 :source {:code "(defn remove-children\n  [id]\n  (let [parent (gdom/getElement (name id))]\n    (do (gdom/removeChildren parent))))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [92 96],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/clojure/browser/dom.cljs#L92-L96"},
 :full-name-encode "clojure.browser.dom_remove-children",
 :history [["+" "0.0-927"]]}

```
