## cljs.core/dissoc



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dissoc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dissoc)
</td>
</tr>
</table>


 <samp>
(__dissoc__ coll)<br>
</samp>
 <samp>
(__dissoc__ coll k)<br>
</samp>
 <samp>
(__dissoc__ coll k & ks)<br>
</samp>

---

dissoc(iate)

Returns a new map that does not contain a mapping for key(s).

Has no effect on the map type (hashed/sorted).



---

###### Examples:

```clj
(dissoc {:key "value" :key2 "value2"} :key)
;;=> {:key2 "value2"}
```



---

###### See Also:

[`cljs.core/assoc`](../cljs.core/assoc.md)<br>
[`cljs.core/disj`](../cljs.core/disj.md)<br>
[`cljs.core/select-keys`](../cljs.core/select-keys.md)<br>

---


Source docstring:

```
dissoc[iate]. Returns a new map of the same (hashed/sorted) type,
that does not contain a mapping for key(s).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L982-L992):

```clj
(defn dissoc
  ([coll] coll)
  ([coll k]
     (-dissoc coll k))
  ([coll k & ks]
     (let [ret (dissoc coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:982-992](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L982-L992)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/dissoc` @ clojuredocs](http://clojuredocs.org/clojure.core/dissoc)<br>
[`clojure.core/dissoc` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/dissoc/)<br>
[`clojure.core/dissoc` @ crossclj](http://crossclj.info/fun/clojure.core/dissoc.html)<br>
[`cljs.core/dissoc` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/dissoc.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/dissoc.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "dissoc(iate)\n\nReturns a new map that does not contain a mapping for key(s).\n\nHas no effect on the map type (hashed/sorted).",
 :ns "cljs.core",
 :name "dissoc",
 :signature ["[coll]" "[coll k]" "[coll k & ks]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc" "cljs.core/disj" "cljs.core/select-keys"],
 :full-name-encode "cljs.core/dissoc",
 :source {:code "(defn dissoc\n  ([coll] coll)\n  ([coll k]\n     (-dissoc coll k))\n  ([coll k & ks]\n     (let [ret (dissoc coll k)]\n       (if ks\n         (recur ret (first ks) (next ks))\n         ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [982 992]},
 :examples [{:id "fd6ae9",
             :content "```clj\n(dissoc {:key \"value\" :key2 \"value2\"} :key)\n;;=> {:key2 \"value2\"}\n```"}],
 :full-name "cljs.core/dissoc",
 :clj-symbol "clojure.core/dissoc",
 :docstring "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,\nthat does not contain a mapping for key(s)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dissoc"]))
```

-->
