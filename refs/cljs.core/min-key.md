## cljs.core/min-key



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min-key)
</td>
</tr>
</table>


 <samp>
(__min-key__ k x)<br>
</samp>
 <samp>
(__min-key__ k x y)<br>
</samp>
 <samp>
(__min-key__ k x y & more)<br>
</samp>

---

Returns the `x` for which `(k x)` is least.

`(k x)` should return a number.



---


###### See Also:

[`cljs.core/min`](../cljs.core/min.md)<br>
[`cljs.core/max-key`](../cljs.core/max-key.md)<br>

---


Source docstring:

```
Returns the x for which (k x), a number, is least.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L7529-L7534):

```clj
(defn min-key
  ([k x] x)
  ([k x y] (if (< (k x) (k y)) x y))
  ([k x y & more]
     (reduce #(min-key k %1 %2) (min-key k x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7529-7534](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/cljs/core.cljs#L7529-L7534)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/min-key` @ clojuredocs](http://clojuredocs.org/clojure.core/min-key)<br>
[`clojure.core/min-key` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/min-key/)<br>
[`clojure.core/min-key` @ crossclj](http://crossclj.info/fun/clojure.core/min-key.html)<br>
[`cljs.core/min-key` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/min-key.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/min-key.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the `x` for which `(k x)` is least.\n\n`(k x)` should return a number.",
 :ns "cljs.core",
 :name "min-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/min" "cljs.core/max-key"],
 :full-name-encode "cljs.core/min-key",
 :source {:code "(defn min-key\n  ([k x] x)\n  ([k x y] (if (< (k x) (k y)) x y))\n  ([k x y & more]\n     (reduce #(min-key k %1 %2) (min-key k x y) more)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7529 7534]},
 :full-name "cljs.core/min-key",
 :clj-symbol "clojure.core/min-key",
 :docstring "Returns the x for which (k x), a number, is least."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/min-key"]))
```

-->
