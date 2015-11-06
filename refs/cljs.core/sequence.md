## cljs.core/sequence



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/sequence</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/sequence)
</td>
</tr>
</table>


 <samp>
(__sequence__ coll)<br>
</samp>
 <samp>
(__sequence__ xform coll)<br>
</samp>
 <samp>
(__sequence__ xform coll & colls)<br>
</samp>

---





Source docstring:

```
Coerces coll to a (possibly empty) sequence, if it is not already
one. Will not force a lazy seq. (sequence nil) yields (), When a
transducer is supplied, returns a lazy sequence of applications of
the transform to the items in coll(s), i.e. to the set of first
items of each coll, followed by the set of second
items in each coll, until any one of the colls is exhausted.  Any
remaining items in other colls are ignored. The transform should accept
number-of-colls arguments
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L3561-L3577):

```clj
(defn sequence
  ([coll]
     (if (seq? coll)
       coll
       (or (seq coll) ())))
  ([xform coll]
     (.create LazyTransformer xform coll))
  ([xform coll & colls]
     (.createMulti LazyTransformer xform (to-array (cons coll colls)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3561-3577](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L3561-L3577)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/sequence` @ clojuredocs](http://clojuredocs.org/clojure.core/sequence)<br>
[`clojure.core/sequence` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/sequence/)<br>
[`clojure.core/sequence` @ crossclj](http://crossclj.info/fun/clojure.core/sequence.html)<br>
[`cljs.core/sequence` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/sequence.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/sequence.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "sequence",
 :signature ["[coll]" "[xform coll]" "[xform coll & colls]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :full-name-encode "cljs.core/sequence",
 :source {:code "(defn sequence\n  ([coll]\n     (if (seq? coll)\n       coll\n       (or (seq coll) ())))\n  ([xform coll]\n     (.create LazyTransformer xform coll))\n  ([xform coll & colls]\n     (.createMulti LazyTransformer xform (to-array (cons coll colls)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3561 3577]},
 :full-name "cljs.core/sequence",
 :clj-symbol "clojure.core/sequence",
 :docstring "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields (), When a\ntransducer is supplied, returns a lazy sequence of applications of\nthe transform to the items in coll(s), i.e. to the set of first\nitems of each coll, followed by the set of second\nitems in each coll, until any one of the colls is exhausted.  Any\nremaining items in other colls are ignored. The transform should accept\nnumber-of-colls arguments"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/sequence"]))
```

-->
