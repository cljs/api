## cljs.core/reduceable?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__reduceable?__ x)<br>
</samp>

---





Source docstring:

```
Returns true if coll satisfies IReduce
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L1109-L1111):

```clj
(defn ^boolean reduceable?
  [x] (satisfies? IReduce x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1109-1111](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L1109-L1111)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/reduceable?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reduceable%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reduceableQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduceable?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/reduceableQMARK",
 :source {:code "(defn ^boolean reduceable?\n  [x] (satisfies? IReduce x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1109 1111]},
 :full-name "cljs.core/reduceable?",
 :docstring "Returns true if coll satisfies IReduce"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduceable?"]))
```

-->
