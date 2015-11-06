## clojure.zip/seq-zip



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/seq-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/seq-zip)
</td>
</tr>
</table>


 <samp>
(__seq-zip__ root)<br>
</samp>

---





Source docstring:

```
Returns a zipper for nested sequences, given a root sequence
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L34-L40):

```clj
(defn seq-zip
  [root]
    (zipper seq?
            identity
            (fn [node children] (with-meta children (meta node)))
            root))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:34-40](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L34-L40)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/seq-zip` @ clojuredocs](http://clojuredocs.org/clojure.zip/seq-zip)<br>
[`clojure.zip/seq-zip` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/seq-zip/)<br>
[`clojure.zip/seq-zip` @ crossclj](http://crossclj.info/fun/clojure.zip/seq-zip.html)<br>
[`clojure.zip/seq-zip` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/seq-zip.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/seq-zip.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "seq-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/seq-zip",
 :source {:code "(defn seq-zip\n  [root]\n    (zipper seq?\n            identity\n            (fn [node children] (with-meta children (meta node)))\n            root))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/clojure/zip.cljs",
          :lines [34 40]},
 :full-name "clojure.zip/seq-zip",
 :clj-symbol "clojure.zip/seq-zip",
 :docstring "Returns a zipper for nested sequences, given a root sequence"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/seq-zip"]))
```

-->
