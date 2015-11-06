## cljs.core/fnext



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fnext)
</td>
</tr>
</table>


 <samp>
(__fnext__ coll)<br>
</samp>

---

Same as `(first (next coll))`



---

###### Examples:

```clj
(fnext [1 2 3])
;;=> 2

(fnext [1 2])
;;=> 2

(fnext [1])
;;=> nil

(fnext [])
;;=> nil
```



---

###### See Also:

[`cljs.core/ffirst`](../cljs.core/ffirst.md)<br>
[`cljs.core/second`](../cljs.core/second.md)<br>

---


Source docstring:

```
Same as (first (next x))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L1158-L1161):

```clj
(defn fnext
  [coll]
  (first (next coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1158-1161](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L1158-L1161)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/fnext` @ clojuredocs](http://clojuredocs.org/clojure.core/fnext)<br>
[`clojure.core/fnext` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/fnext/)<br>
[`clojure.core/fnext` @ crossclj](http://crossclj.info/fun/clojure.core/fnext.html)<br>
[`cljs.core/fnext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/fnext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/fnext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Same as `(first (next coll))`",
 :ns "cljs.core",
 :name "fnext",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ffirst" "cljs.core/second"],
 :full-name-encode "cljs.core/fnext",
 :source {:code "(defn fnext\n  [coll]\n  (first (next coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1158 1161]},
 :examples [{:id "92383f",
             :content "```clj\n(fnext [1 2 3])\n;;=> 2\n\n(fnext [1 2])\n;;=> 2\n\n(fnext [1])\n;;=> nil\n\n(fnext [])\n;;=> nil\n```"}],
 :full-name "cljs.core/fnext",
 :clj-symbol "clojure.core/fnext",
 :docstring "Same as (first (next x))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fnext"]))
```

-->
