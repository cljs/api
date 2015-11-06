## cljs.core/nnext



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/nnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/nnext)
</td>
</tr>
</table>


 <samp>
(__nnext__ coll)<br>
</samp>

---

Same as `(next (next coll))`.



---


###### See Also:

[`cljs.core/next`](../cljs.core/next.md)<br>

---


Source docstring:

```
Same as (next (next x))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L799-L802):

```clj
(defn nnext
  [coll]
  (next (next coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:799-802](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L799-L802)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/nnext` @ clojuredocs](http://clojuredocs.org/clojure.core/nnext)<br>
[`clojure.core/nnext` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/nnext/)<br>
[`clojure.core/nnext` @ crossclj](http://crossclj.info/fun/clojure.core/nnext.html)<br>
[`cljs.core/nnext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/nnext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/nnext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Same as `(next (next coll))`.",
 :ns "cljs.core",
 :name "nnext",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/next"],
 :full-name-encode "cljs.core/nnext",
 :source {:code "(defn nnext\n  [coll]\n  (next (next coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [799 802]},
 :full-name "cljs.core/nnext",
 :clj-symbol "clojure.core/nnext",
 :docstring "Same as (next (next x))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nnext"]))
```

-->
