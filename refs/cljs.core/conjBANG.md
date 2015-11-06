## cljs.core/conj!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/conj!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/conj!)
</td>
</tr>
</table>


 <samp>
(__conj!__)<br>
</samp>
 <samp>
(__conj!__ coll)<br>
</samp>
 <samp>
(__conj!__ tcoll val)<br>
</samp>
 <samp>
(__conj!__ tcoll val & vals)<br>
</samp>

---





Source docstring:

```
Adds x to the transient collection, and return coll. The 'addition'
may happen at different 'places' depending on the concrete type.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L3212-L3223):

```clj
(defn conj!
  ([] (transient []))
  ([coll] coll)
  ([tcoll val]
    (-conj! tcoll val))
  ([tcoll val & vals]
    (let [ntcoll (-conj! tcoll val)]
      (if vals
        (recur ntcoll (first vals) (next vals))
        ntcoll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3212-3223](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L3212-L3223)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/conj!` @ clojuredocs](http://clojuredocs.org/clojure.core/conj!)<br>
[`clojure.core/conj!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/conj%21/)<br>
[`clojure.core/conj!` @ crossclj](http://crossclj.info/fun/clojure.core/conj%21.html)<br>
[`cljs.core/conj!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/conj%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/conjBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "conj!",
 :signature ["[]" "[coll]" "[tcoll val]" "[tcoll val & vals]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/conjBANG",
 :source {:code "(defn conj!\n  ([] (transient []))\n  ([coll] coll)\n  ([tcoll val]\n    (-conj! tcoll val))\n  ([tcoll val & vals]\n    (let [ntcoll (-conj! tcoll val)]\n      (if vals\n        (recur ntcoll (first vals) (next vals))\n        ntcoll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3212 3223]},
 :full-name "cljs.core/conj!",
 :clj-symbol "clojure.core/conj!",
 :docstring "Adds x to the transient collection, and return coll. The 'addition'\nmay happen at different 'places' depending on the concrete type."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/conj!"]))
```

-->
