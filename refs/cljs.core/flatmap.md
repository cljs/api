## cljs.core/flatmap



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__flatmap__ f)<br>
</samp>
 <samp>
(__flatmap__ f coll)<br>
</samp>

---





Source docstring:

```
maps f over coll and concatenates the results.  Thus function f
should return a collection.  Returns a transducer when no collection
is provided.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L8120-L8131):

```clj
(defn flatmap
  ([f]
   (fn [f1]
     (fn
       ([] (f1))
       ([result] (f1 result))
       ([result input]
          (reduce (preserving-reduced f1) result (f input))))))
  ([f coll] (sequence (flatmap f) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8120-8131](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L8120-L8131)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/flatmap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/flatmap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/flatmap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "flatmap",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core/flatmap",
 :source {:code "(defn flatmap\n  ([f]\n   (fn [f1]\n     (fn\n       ([] (f1))\n       ([result] (f1 result))\n       ([result input]\n          (reduce (preserving-reduced f1) result (f input))))))\n  ([f coll] (sequence (flatmap f) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8120 8131]},
 :full-name "cljs.core/flatmap",
 :docstring "maps f over coll and concatenates the results.  Thus function f\nshould return a collection.  Returns a transducer when no collection\nis provided."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/flatmap"]))
```

-->
