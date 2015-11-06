## clojure.core.reducers/reduce



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/reduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/reduce)
</td>
</tr>
</table>


 <samp>
(__reduce__ f coll)<br>
</samp>
 <samp>
(__reduce__ f init coll)<br>
</samp>

---





Source docstring:

```
Like core/reduce except:
  When init is not provided, (f) is used.
  Maps are reduced with reduce-kv
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/clojure/core/reducers.cljs#L33-L44):

```clj
(defn reduce
  ([f coll] (reduce f (f) coll))
  ([f init coll]
     (if (map? coll)
       (-kv-reduce coll f init)
       (cond
         (nil? coll) init
         (array? coll) (array-reduce coll f init)
         :else (-reduce coll f init)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:33-44](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/clojure/core/reducers.cljs#L33-L44)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/reduce` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/reduce)<br>
[`clojure.core.reducers/reduce` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/reduce/)<br>
[`clojure.core.reducers/reduce` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/reduce.html)<br>
[`clojure.core.reducers/reduce` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/reduce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/reduce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "reduce",
 :signature ["[f coll]" "[f init coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/reduce",
 :source {:code "(defn reduce\n  ([f coll] (reduce f (f) coll))\n  ([f init coll]\n     (if (map? coll)\n       (-kv-reduce coll f init)\n       (cond\n         (nil? coll) init\n         (array? coll) (array-reduce coll f init)\n         :else (-reduce coll f init)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [33 44]},
 :full-name "clojure.core.reducers/reduce",
 :clj-symbol "clojure.core.reducers/reduce",
 :docstring "Like core/reduce except:\n  When init is not provided, (f) is used.\n  Maps are reduced with reduce-kv"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/reduce"]))
```

-->
