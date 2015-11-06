## clojure.browser.dom/element



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__element__ tag-or-text)<br>
</samp>
 <samp>
(__element__ tag & children)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/clojure/browser/dom.cljs#L81-L90):

```clj
(defn element
  ([tag-or-text]
     (log "(element " tag-or-text ")")
     (-element tag-or-text))
  ([tag & children]
     (log "(element " tag " " children ")")
     (let [attrs (first children)]
       (if (map? attrs)
         (-element tag attrs (rest children))
         (-element tag nil children)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:81-90](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/clojure/browser/dom.cljs#L81-L90)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.dom/element` @ crossclj](http://crossclj.info/fun/clojure.browser.dom.cljs/element.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom/element.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.dom",
 :name "element",
 :type "function",
 :signature ["[tag-or-text]" "[tag & children]"],
 :source {:code "(defn element\n  ([tag-or-text]\n     (log \"(element \" tag-or-text \")\")\n     (-element tag-or-text))\n  ([tag & children]\n     (log \"(element \" tag \" \" children \")\")\n     (let [attrs (first children)]\n       (if (map? attrs)\n         (-element tag attrs (rest children))\n         (-element tag nil children)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [81 90]},
 :full-name "clojure.browser.dom/element",
 :full-name-encode "clojure.browser.dom/element",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/element"]))
```

-->
