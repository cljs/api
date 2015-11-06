## cljs.core/remove



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove)
</td>
</tr>
</table>


 <samp>
(__remove__ pred)<br>
</samp>
 <samp>
(__remove__ pred coll)<br>
</samp>

---

Returns a lazy sequence of the items in `coll` for which `(pred item)` returns
false.

`pred` must be free of side-effects.

Returns a transducer when no collection is provided.



---


###### See Also:

[`cljs.core/filter`](../cljs.core/filter.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the items in coll for which
(pred item) returns false. pred must be free of side-effects.
Returns a transducer when no collection is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L3905-L3911):

```clj
(defn remove
  ([pred] (filter (complement pred)))
  ([pred coll]
     (filter (complement pred) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3905-3911](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L3905-L3911)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/remove` @ clojuredocs](http://clojuredocs.org/clojure.core/remove)<br>
[`clojure.core/remove` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/remove/)<br>
[`clojure.core/remove` @ crossclj](http://crossclj.info/fun/clojure.core/remove.html)<br>
[`cljs.core/remove` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/remove.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/remove.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the items in `coll` for which `(pred item)` returns\nfalse.\n\n`pred` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
 :ns "cljs.core",
 :name "remove",
 :signature ["[pred]" "[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/filter"],
 :full-name-encode "cljs.core/remove",
 :source {:code "(defn remove\n  ([pred] (filter (complement pred)))\n  ([pred coll]\n     (filter (complement pred) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3905 3911]},
 :full-name "cljs.core/remove",
 :clj-symbol "clojure.core/remove",
 :docstring "Returns a lazy sequence of the items in coll for which\n(pred item) returns false. pred must be free of side-effects.\nReturns a transducer when no collection is provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove"]))
```

-->
