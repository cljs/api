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
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:17-18](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/browser/dom.cljs#L17-L18)</ins>
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
          :lines [17 18],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/browser/dom.cljs#L17-L18"},
 :methods [{:name "-element",
            :signature ["[this]"
                        "[this attrs-or-children]"
                        "[this attrs children]"],
            :docstring nil}],
 :full-name "clojure.browser.dom/DOMBuilder",
 :history [["+" "0.0-927"]]}

```
