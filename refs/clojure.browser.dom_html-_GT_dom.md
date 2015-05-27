## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/html->dom

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__html->dom__ s)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:101-102](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/browser/dom.cljs#L101-L102)</ins>
</pre>

```clj
(defn html->dom [s]
  (gdom/htmlToDocumentFragment s))
```


---

```clj
{:full-name "clojure.browser.dom/html->dom",
 :ns "clojure.browser.dom",
 :name "html->dom",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn html->dom [s]\n  (gdom/htmlToDocumentFragment s))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [101 102],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/browser/dom.cljs#L101-L102"},
 :full-name-encode "clojure.browser.dom_html-_GT_dom",
 :history [["+" "0.0-927"]]}

```
