## cljs.core/max-key



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/max-key</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/max-key)
</td>
</tr>
</table>


 <samp>
(__max-key__ k x)<br>
</samp>
 <samp>
(__max-key__ k x y)<br>
</samp>
 <samp>
(__max-key__ k x y & more)<br>
</samp>

---

Returns the `x` for which `(k x)` is greatest.

`(k x)` should return a number.



---


###### See Also:

[`cljs.core/max`](../cljs.core/max.md)<br>
[`cljs.core/min-key`](../cljs.core/min-key.md)<br>

---


Source docstring:

```
Returns the x for which (k x), a number, is greatest.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L6332-L6337):

```clj
(defn max-key
  ([k x] x)
  ([k x y] (if (> (k x) (k y)) x y))
  ([k x y & more]
   (reduce #(max-key k %1 %2) (max-key k x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6332-6337](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/core.cljs#L6332-L6337)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/max-key` @ clojuredocs](http://clojuredocs.org/clojure.core/max-key)<br>
[`clojure.core/max-key` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/max-key/)<br>
[`clojure.core/max-key` @ crossclj](http://crossclj.info/fun/clojure.core/max-key.html)<br>
[`cljs.core/max-key` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/max-key.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/max-key.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the `x` for which `(k x)` is greatest.\n\n`(k x)` should return a number.",
 :ns "cljs.core",
 :name "max-key",
 :signature ["[k x]" "[k x y]" "[k x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/max" "cljs.core/min-key"],
 :full-name-encode "cljs.core/max-key",
 :source {:code "(defn max-key\n  ([k x] x)\n  ([k x y] (if (> (k x) (k y)) x y))\n  ([k x y & more]\n   (reduce #(max-key k %1 %2) (max-key k x y) more)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6332 6337]},
 :full-name "cljs.core/max-key",
 :clj-symbol "clojure.core/max-key",
 :docstring "Returns the x for which (k x), a number, is greatest."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/max-key"]))
```

-->
