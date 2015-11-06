## cljs.core/find



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/find)
</td>
</tr>
</table>


 <samp>
(__find__ coll k)<br>
</samp>

---

Returns the map entry for key `k`, or nil if `k` is not found.



---


###### See Also:

[`cljs.core/get`](../cljs.core/get.md)<br>
[`cljs.core/get-in`](../cljs.core/get-in.md)<br>

---


Source docstring:

```
Returns the map entry for key, or nil if key not present.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L1629-L1635):

```clj
(defn find
  [coll k]
  (when (and (not (nil? coll))
             (associative? coll)
             (contains? coll k))
    [k (get coll k)]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1629-1635](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L1629-L1635)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/find` @ clojuredocs](http://clojuredocs.org/clojure.core/find)<br>
[`clojure.core/find` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/find/)<br>
[`clojure.core/find` @ crossclj](http://crossclj.info/fun/clojure.core/find.html)<br>
[`cljs.core/find` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/find.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/find.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the map entry for key `k`, or nil if `k` is not found.",
 :ns "cljs.core",
 :name "find",
 :signature ["[coll k]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/get" "cljs.core/get-in"],
 :full-name-encode "cljs.core/find",
 :source {:code "(defn find\n  [coll k]\n  (when (and (not (nil? coll))\n             (associative? coll)\n             (contains? coll k))\n    [k (get coll k)]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1629 1635]},
 :full-name "cljs.core/find",
 :clj-symbol "clojure.core/find",
 :docstring "Returns the map entry for key, or nil if key not present."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/find"]))
```

-->
