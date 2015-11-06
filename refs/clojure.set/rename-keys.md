## clojure.set/rename-keys



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/rename-keys</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/rename-keys)
</td>
</tr>
</table>


 <samp>
(__rename-keys__ map kmap)<br>
</samp>

---





Source docstring:

```
Returns the map with the keys in kmap renamed to the vals in kmap
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/clojure/set.cljs#L72-L80):

```clj
(defn rename-keys
  [map kmap]
    (reduce
     (fn [m [old new]]
       (if (contains? map old)
         (assoc m new (get map old))
         m))
     (apply dissoc map (keys kmap)) kmap))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:72-80](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/clojure/set.cljs#L72-L80)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/rename-keys` @ clojuredocs](http://clojuredocs.org/clojure.set/rename-keys)<br>
[`clojure.set/rename-keys` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/rename-keys/)<br>
[`clojure.set/rename-keys` @ crossclj](http://crossclj.info/fun/clojure.set/rename-keys.html)<br>
[`clojure.set/rename-keys` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/rename-keys.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/rename-keys.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.set",
 :name "rename-keys",
 :signature ["[map kmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set/rename-keys",
 :source {:code "(defn rename-keys\n  [map kmap]\n    (reduce\n     (fn [m [old new]]\n       (if (contains? map old)\n         (assoc m new (get map old))\n         m))\n     (apply dissoc map (keys kmap)) kmap))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/clojure/set.cljs",
          :lines [72 80]},
 :full-name "clojure.set/rename-keys",
 :clj-symbol "clojure.set/rename-keys",
 :docstring "Returns the map with the keys in kmap renamed to the vals in kmap"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/rename-keys"]))
```

-->
