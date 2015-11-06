## clojure.core.reducers/remove



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__remove__ pred)<br>
</samp>
 <samp>
(__remove__ pred coll)<br>
</samp>

---





Source docstring:

```
Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/core/reducers.cljs#L134-L139):

```clj
(defcurried remove
  "Removes values in the reduction of coll for which (pred val)
  returns logical true. Foldable."
  {}
  [pred coll]
  (filter (complement pred) coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:134-139](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/core/reducers.cljs#L134-L139)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/remove` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/remove.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/remove.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "remove",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/remove",
 :source {:code "(defcurried remove\n  \"Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.\"\n  {}\n  [pred coll]\n  (filter (complement pred) coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [134 139]},
 :full-name "clojure.core.reducers/remove",
 :docstring "Removes values in the reduction of coll for which (pred val)\n  returns logical true. Foldable."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/remove"]))
```

-->
