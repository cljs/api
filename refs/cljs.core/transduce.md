## cljs.core/transduce



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__transduce__ xform f coll)<br>
</samp>
 <samp>
(__transduce__ xform f init coll)<br>
</samp>

---





Source docstring:

```
reduce with a transformation of f (xf). If init is not
supplied, (f) will be called to produce it. f should be a reducing
step function that accepts both 1 and 2 arguments, if it accepts
only 2 you can add the arity-1 with 'completing'. Returns the result
of applying (the transformed) xf to init and the first item in coll,
then applying xf to that result and the 2nd item, etc. If coll
contains no items, returns init and f is not called. Note that
certain transforms may inject or skip items.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L2082-L2095):

```clj
(defn transduce
  ([xform f coll] (transduce xform f (f) coll))
  ([xform f init coll]
     (let [f (xform f)
           ret (reduce f init coll)]
       (f ret))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2082-2095](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L2082-L2095)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/transduce` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/transduce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/transduce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "transduce",
 :signature ["[xform f coll]" "[xform f init coll]"],
 :history [["+" "0.0-2301"]],
 :type "function",
 :full-name-encode "cljs.core/transduce",
 :source {:code "(defn transduce\n  ([xform f coll] (transduce xform f (f) coll))\n  ([xform f init coll]\n     (let [f (xform f)\n           ret (reduce f init coll)]\n       (f ret))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2082 2095]},
 :full-name "cljs.core/transduce",
 :docstring "reduce with a transformation of f (xf). If init is not\nsupplied, (f) will be called to produce it. f should be a reducing\nstep function that accepts both 1 and 2 arguments, if it accepts\nonly 2 you can add the arity-1 with 'completing'. Returns the result\nof applying (the transformed) xf to init and the first item in coll,\nthen applying xf to that result and the 2nd item, etc. If coll\ncontains no items, returns init and f is not called. Note that\ncertain transforms may inject or skip items."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/transduce"]))
```

-->
