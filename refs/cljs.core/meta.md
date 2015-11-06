## cljs.core/meta



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/meta)
</td>
</tr>
</table>


 <samp>
(__meta__ o)<br>
</samp>

---





Source docstring:

```
Returns the metadata of obj, returns nil if there is no metadata.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L1297-L1302):

```clj
(defn meta
  [o]
  (when (and (not (nil? o))
             (satisfies? IMeta o))
    (-meta o)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2307
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1297-1302](https://github.com/clojure/clojurescript/blob/r2307/src/cljs/cljs/core.cljs#L1297-L1302)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/meta` @ clojuredocs](http://clojuredocs.org/clojure.core/meta)<br>
[`clojure.core/meta` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/meta/)<br>
[`clojure.core/meta` @ crossclj](http://crossclj.info/fun/clojure.core/meta.html)<br>
[`cljs.core/meta` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/meta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "meta",
 :signature ["[o]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/meta",
 :source {:code "(defn meta\n  [o]\n  (when (and (not (nil? o))\n             (satisfies? IMeta o))\n    (-meta o)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2307",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1297 1302]},
 :full-name "cljs.core/meta",
 :clj-symbol "clojure.core/meta",
 :docstring "Returns the metadata of obj, returns nil if there is no metadata."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/meta"]))
```

-->
