## cljs.core/replace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/replace)
</td>
</tr>
</table>


 <samp>
(__replace__ smap)<br>
</samp>
 <samp>
(__replace__ smap coll)<br>
</samp>

---

Given a map of replacement pairs `smap` and a vector/collection `coll`, returns
a vector/seq with any elements `=` to a key in `smap` replaced with the
corresponding val in `smap`.

Returns a transducer when `coll` is not provided.



---


###### See Also:

[`cljs.core/map`](../cljs.core/map.md)<br>
[`clojure.walk/prewalk-replace`](../clojure.walk/prewalk-replace.md)<br>
[`clojure.walk/postwalk-replace`](../clojure.walk/postwalk-replace.md)<br>

---


Source docstring:

```
Given a map of replacement pairs and a vector/collection, returns a
vector/seq with any elements = a key in smap replaced with the
corresponding val in smap.  Returns a transducer when no collection
is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L7932-L7947):

```clj
(defn replace
  ([smap]
     (map #(if-let [e (find smap %)] (val e) %)))
  ([smap coll]
     (if (vector? coll)
       (let [n (count coll)]
         (reduce (fn [v i]
                   (if-let [e (find smap (nth v i))]
                     (assoc v i (second e))
                     v))
           coll (take n (iterate inc 0))))
       (map #(if-let [e (find smap %)] (second e) %) coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7932-7947](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L7932-L7947)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/replace` @ clojuredocs](http://clojuredocs.org/clojure.core/replace)<br>
[`clojure.core/replace` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/replace/)<br>
[`clojure.core/replace` @ crossclj](http://crossclj.info/fun/clojure.core/replace.html)<br>
[`cljs.core/replace` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/replace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/replace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Given a map of replacement pairs `smap` and a vector/collection `coll`, returns\na vector/seq with any elements `=` to a key in `smap` replaced with the\ncorresponding val in `smap`.\n\nReturns a transducer when `coll` is not provided.",
 :ns "cljs.core",
 :name "replace",
 :signature ["[smap]" "[smap coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/map"
           "clojure.walk/prewalk-replace"
           "clojure.walk/postwalk-replace"],
 :full-name-encode "cljs.core/replace",
 :source {:code "(defn replace\n  ([smap]\n     (map #(if-let [e (find smap %)] (val e) %)))\n  ([smap coll]\n     (if (vector? coll)\n       (let [n (count coll)]\n         (reduce (fn [v i]\n                   (if-let [e (find smap (nth v i))]\n                     (assoc v i (second e))\n                     v))\n           coll (take n (iterate inc 0))))\n       (map #(if-let [e (find smap %)] (second e) %) coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7932 7947]},
 :full-name "cljs.core/replace",
 :clj-symbol "clojure.core/replace",
 :docstring "Given a map of replacement pairs and a vector/collection, returns a\nvector/seq with any elements = a key in smap replaced with the\ncorresponding val in smap.  Returns a transducer when no collection\nis provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/replace"]))
```

-->
