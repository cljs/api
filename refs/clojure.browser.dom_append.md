## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/append

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__append__ parent & children)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:13-15](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/browser/dom.cljs#L13-L15)</ins>
</pre>

```clj
(defn append [parent & children]
  (apply gdom/append parent children)
  parent)
```


---

```clj
{:full-name "clojure.browser.dom/append",
 :ns "clojure.browser.dom",
 :name "append",
 :type "function",
 :signature ["[parent & children]"],
 :source {:code "(defn append [parent & children]\n  (apply gdom/append parent children)\n  parent)",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [13 15],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/browser/dom.cljs#L13-L15"},
 :full-name-encode "clojure.browser.dom_append",
 :history [["+" "0.0-927"]]}

```
