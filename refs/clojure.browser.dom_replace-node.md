## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/replace-node

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__replace-node__ old-node new-node)<br>
</samp>

```
Replace old-node with new-node. old-node can be an element or a
keyword which is the id of the node to replace.  new-node can be an
element or an html string.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:112-120](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L112-L120)</ins>
</pre>

```clj
(defn replace-node
  [old-node new-node]
  (let [old-node (ensure-element old-node)
        new-node (ensure-element new-node)]
    (gdom/replaceNode new-node old-node)
    new-node))
```


---

```clj
{:full-name "clojure.browser.dom/replace-node",
 :ns "clojure.browser.dom",
 :name "replace-node",
 :docstring "Replace old-node with new-node. old-node can be an element or a\nkeyword which is the id of the node to replace.  new-node can be an\nelement or an html string.",
 :type "function",
 :signature ["[old-node new-node]"],
 :source {:code "(defn replace-node\n  [old-node new-node]\n  (let [old-node (ensure-element old-node)\n        new-node (ensure-element new-node)]\n    (gdom/replaceNode new-node old-node)\n    new-node))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [112 120],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L112-L120"},
 :full-name-encode "clojure.browser.dom_replace-node",
 :history [["+" "0.0-927"]]}

```
