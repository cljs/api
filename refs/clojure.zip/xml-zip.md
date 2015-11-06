## clojure.zip/xml-zip



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/xml-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/xml-zip)
</td>
</tr>
</table>


 <samp>
(__xml-zip__ root)<br>
</samp>

---





Source docstring:

```
Returns a zipper for xml elements (as from xml/parse),
given a root element
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/clojure/zip.cljs#L50-L58):

```clj
(defn xml-zip
  [root]
    (zipper (complement string?) 
            (comp seq :content)
            (fn [node children]
              (assoc node :content (and children (apply vector children))))
            root))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[zip.cljs:50-58](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/clojure/zip.cljs#L50-L58)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.zip/xml-zip` @ clojuredocs](http://clojuredocs.org/clojure.zip/xml-zip)<br>
[`clojure.zip/xml-zip` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.zip/xml-zip/)<br>
[`clojure.zip/xml-zip` @ crossclj](http://crossclj.info/fun/clojure.zip/xml-zip.html)<br>
[`clojure.zip/xml-zip` @ crossclj](http://crossclj.info/fun/clojure.zip.cljs/xml-zip.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.zip/xml-zip.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.zip",
 :name "xml-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip/xml-zip",
 :source {:code "(defn xml-zip\n  [root]\n    (zipper (complement string?) \n            (comp seq :content)\n            (fn [node children]\n              (assoc node :content (and children (apply vector children))))\n            root))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/clojure/zip.cljs",
          :lines [50 58]},
 :full-name "clojure.zip/xml-zip",
 :clj-symbol "clojure.zip/xml-zip",
 :docstring "Returns a zipper for xml elements (as from xml/parse),\ngiven a root element"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.zip/xml-zip"]))
```

-->
