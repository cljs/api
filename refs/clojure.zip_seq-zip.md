## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/seq-zip

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/seq-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/seq-zip)
</td>
</tr>
</table>

 <samp>
(__seq-zip__ root)<br>
</samp>

```
Returns a zipper for nested sequences, given a root sequence
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:34-40](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L34-L40)</ins>
</pre>

```clj
(defn seq-zip
  [root]
    (zipper seq?
            identity
            (fn [node children] (with-meta children (meta node)))
            root))
```


---

```clj
{:ns "clojure.zip",
 :name "seq-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_seq-zip",
 :source {:code "(defn seq-zip\n  [root]\n    (zipper seq?\n            identity\n            (fn [node children] (with-meta children (meta node)))\n            root))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [34 40],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L34-L40"},
 :full-name "clojure.zip/seq-zip",
 :clj-symbol "clojure.zip/seq-zip",
 :docstring "Returns a zipper for nested sequences, given a root sequence"}

```
