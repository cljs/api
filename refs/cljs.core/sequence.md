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

---





Source docstring:

```
Coerces coll to a (possibly empty) sequence, if it is not already
one. Will not force a lazy seq. (sequence nil) yields ()
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L1278-L1284):

```clj
(defn ^seq sequence
  [coll]
   (if (seq? coll)
     coll
     (or (seq coll) ())))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1278-1284](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L1278-L1284)</ins>
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
{:return-type seq,
 :ns "cljs.core",
 :name "sequence",
 :signature ["[coll]"],
 :history [["+" "0.0-2120"]],
 :type "function",
 :full-name-encode "cljs.core/sequence",
 :source {:code "(defn ^seq sequence\n  [coll]\n   (if (seq? coll)\n     coll\n     (or (seq coll) ())))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1278 1284]},
 :full-name "cljs.core/sequence",
 :clj-symbol "clojure.core/sequence",
 :docstring "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields ()"}

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
