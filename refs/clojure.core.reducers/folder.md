## clojure.core.reducers/folder



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/folder</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/folder)
</td>
</tr>
</table>


 <samp>
(__folder__ coll xf)<br>
</samp>

---





Source docstring:

```
Given a foldable collection, and a transformation function xf,
returns a foldable collection, where any supplied reducing
fn will be transformed by xf. xf is a function of reducing fn to
reducing fn.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/clojure/core/reducers.cljs#L79-L94):

```clj
(defn folder
  ([coll xf]
     (reify
       cljs.core/IReduce
       (-reduce [_ f1]
         (-reduce coll (xf f1) (f1)))
       (-reduce [_ f1 init]
         (-reduce coll (xf f1) init))

       CollFold
       (coll-fold [_ n combinef reducef]
         (coll-fold coll n combinef (xf reducef))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── clojure
                └── core
                    └── <ins>[reducers.cljs:79-94](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/clojure/core/reducers.cljs#L79-L94)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/folder` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/folder)<br>
[`clojure.core.reducers/folder` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/folder/)<br>
[`clojure.core.reducers/folder` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/folder.html)<br>
[`clojure.core.reducers/folder` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/folder.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/folder.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "folder",
 :signature ["[coll xf]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/folder",
 :source {:code "(defn folder\n  ([coll xf]\n     (reify\n       cljs.core/IReduce\n       (-reduce [_ f1]\n         (-reduce coll (xf f1) (f1)))\n       (-reduce [_ f1 init]\n         (-reduce coll (xf f1) init))\n\n       CollFold\n       (coll-fold [_ n combinef reducef]\n         (coll-fold coll n combinef (xf reducef))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/clojure/core/reducers.cljs",
          :lines [79 94]},
 :full-name "clojure.core.reducers/folder",
 :clj-symbol "clojure.core.reducers/folder",
 :docstring "Given a foldable collection, and a transformation function xf,\nreturns a foldable collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/folder"]))
```

-->
