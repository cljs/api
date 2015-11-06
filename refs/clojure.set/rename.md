## clojure.set/rename



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/rename</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/rename)
</td>
</tr>
</table>


 <samp>
(__rename__ xrel kmap)<br>
</samp>

---





Source docstring:

```
Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/clojure/set.cljs#L83-L86):

```clj
(defn rename
  [xrel kmap]
    (set (map #(rename-keys % kmap) xrel)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:83-86](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/clojure/set.cljs#L83-L86)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/rename` @ clojuredocs](http://clojuredocs.org/clojure.set/rename)<br>
[`clojure.set/rename` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/rename/)<br>
[`clojure.set/rename` @ crossclj](http://crossclj.info/fun/clojure.set/rename.html)<br>
[`clojure.set/rename` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/rename.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/rename.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "rename",
 :signature ["[xrel kmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/rename",
 :source {:code "(defn rename\n  [xrel kmap]\n    (set (map #(rename-keys % kmap) xrel)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/clojure/set.cljs",
          :lines [83 86]},
 :full-name "clojure.set/rename",
 :clj-symbol "clojure.set/rename",
 :docstring "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/rename"]))
```

-->
