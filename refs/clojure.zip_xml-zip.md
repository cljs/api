## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/xml-zip

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/xml-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/xml-zip)
</td>
</tr>
</table>

 <samp>
(__xml-zip__ root)<br>
</samp>

```
Returns a zipper for xml elements (as from xml/parse),
given a root element
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:50-58](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L50-L58)</ins>
</pre>

```clj
(defn xml-zip
  [root]
    (zipper (complement string?) 
            (comp seq :content)
            (fn [node children]
              (assoc node :content (and children (apply vector children))))
            root))
```


---

```clj
{:ns "clojure.zip",
 :name "xml-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_xml-zip",
 :source {:code "(defn xml-zip\n  [root]\n    (zipper (complement string?) \n            (comp seq :content)\n            (fn [node children]\n              (assoc node :content (and children (apply vector children))))\n            root))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [50 58],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L50-L58"},
 :full-name "clojure.zip/xml-zip",
 :clj-symbol "clojure.zip/xml-zip",
 :docstring "Returns a zipper for xml elements (as from xml/parse),\ngiven a root element"}

```
