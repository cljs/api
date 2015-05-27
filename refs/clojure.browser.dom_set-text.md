## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-text

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-text__ e s)<br>
</samp>

```
Set the text content for the passed element returning the
element. If a keyword is passed in the place of e, the element with
that id will be used and returned.
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:124-129](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/browser/dom.cljs#L124-L129)</ins>
</pre>

```clj
(defn set-text
  [e s]
  (gdom/setTextContent (ensure-element e) s))
```


---

```clj
{:full-name "clojure.browser.dom/set-text",
 :ns "clojure.browser.dom",
 :name "set-text",
 :docstring "Set the text content for the passed element returning the\nelement. If a keyword is passed in the place of e, the element with\nthat id will be used and returned.",
 :type "function",
 :signature ["[e s]"],
 :source {:code "(defn set-text\n  [e s]\n  (gdom/setTextContent (ensure-element e) s))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [124 129],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/browser/dom.cljs#L124-L129"},
 :full-name-encode "clojure.browser.dom_set-text",
 :history [["+" "0.0-927"]]}

```
