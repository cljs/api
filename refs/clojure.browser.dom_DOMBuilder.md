## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/DOMBuilder

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:16-17](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L16-L17)</ins>
</pre>

```clj
(defprotocol DOMBuilder
  (-element [this] [this attrs-or-children] [this attrs children]))
```


---

```clj
{:ns "clojure.browser.dom",
 :name "DOMBuilder",
 :type "protocol",
 :full-name-encode "clojure.browser.dom_DOMBuilder",
 :source {:code "(defprotocol DOMBuilder\n  (-element [this] [this attrs-or-children] [this attrs children]))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [16 17],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/browser/dom.cljs#L16-L17"},
 :methods [{:name "-element",
            :signature ["[this]"
                        "[this attrs-or-children]"
                        "[this attrs children]"],
            :docstring nil}],
 :full-name "clojure.browser.dom/DOMBuilder",
 :history [["+" "0.0-927"]]}

```
