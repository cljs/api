## clojure.core.reducers/filter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__filter__ pred)<br>
</samp>
 <samp>
(__filter__ pred coll)<br>
</samp>

---





Source docstring:

```
Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L106-L117):

```clj
(defcurried filter
  "Retains values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (if (pred k v)
               (f1 ret k v)
               ret))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:106-117](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L106-L117)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/filter` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/filter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/filter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "filter",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/filter",
 :source {:code "(defcurried filter\n  \"Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (if (pred k v)\n               (f1 ret k v)\n               ret))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [106 117]},
 :full-name "clojure.core.reducers/filter",
 :docstring "Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/filter"]))
```

-->
