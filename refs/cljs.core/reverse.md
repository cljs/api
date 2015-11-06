## cljs.core/reverse



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reverse</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reverse)
</td>
</tr>
</table>


 <samp>
(__reverse__ coll)<br>
</samp>

---

Returns a sequence of the items in `coll` in reverse order. Not lazy.



---


###### See Also:

[`cljs.core/rseq`](../cljs.core/rseq.md)<br>

---


Source docstring:

```
Returns a seq of the items in coll in reverse order. Not lazy.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L2393-L2398):

```clj
(defn reverse
  [coll]
  (if (reversible? coll)
    (rseq coll)
    (reduce conj () coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2393-2398](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L2393-L2398)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reverse` @ clojuredocs](http://clojuredocs.org/clojure.core/reverse)<br>
[`clojure.core/reverse` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reverse/)<br>
[`clojure.core/reverse` @ crossclj](http://crossclj.info/fun/clojure.core/reverse.html)<br>
[`cljs.core/reverse` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reverse.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reverse.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence of the items in `coll` in reverse order. Not lazy.",
 :ns "cljs.core",
 :name "reverse",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rseq"],
 :full-name-encode "cljs.core/reverse",
 :source {:code "(defn reverse\n  [coll]\n  (if (reversible? coll)\n    (rseq coll)\n    (reduce conj () coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2393 2398]},
 :full-name "cljs.core/reverse",
 :clj-symbol "clojure.core/reverse",
 :docstring "Returns a seq of the items in coll in reverse order. Not lazy."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reverse"]))
```

-->
