## cljs.core/doall



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doall</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doall)
</td>
</tr>
</table>


 <samp>
(__doall__ coll)<br>
</samp>
 <samp>
(__doall__ n coll)<br>
</samp>

---

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`doall` walks through the successive `next`s of the sequence, returning the head
and causing the entire sequence to reside in memory at one time.



---


###### See Also:

[`cljs.core/dorun`](../cljs.core/dorun.md)<br>
[`cljs.core/doseq`](../cljs.core/doseq.md)<br>

---


Source docstring:

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. doall can
be used to force any effects. Walks through the successive nexts of
the seq, retains the head and returns it, thus causing the entire
seq to reside in memory at one time.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L6719-L6731):

```clj
(defn doall
  ([coll]
   (dorun coll)
   coll)
  ([n coll]
   (dorun n coll)
   coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6719-6731](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L6719-L6731)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/doall` @ clojuredocs](http://clojuredocs.org/clojure.core/doall)<br>
[`clojure.core/doall` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/doall/)<br>
[`clojure.core/doall` @ crossclj](http://crossclj.info/fun/clojure.core/doall.html)<br>
[`cljs.core/doall` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/doall.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/doall.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`doall` walks through the successive `next`s of the sequence, returning the head\nand causing the entire sequence to reside in memory at one time.",
 :ns "cljs.core",
 :name "doall",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/dorun" "cljs.core/doseq"],
 :full-name-encode "cljs.core/doall",
 :source {:code "(defn doall\n  ([coll]\n   (dorun coll)\n   coll)\n  ([n coll]\n   (dorun n coll)\n   coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6719 6731]},
 :full-name "cljs.core/doall",
 :clj-symbol "clojure.core/doall",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. doall can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, retains the head and returns it, thus causing the entire\nseq to reside in memory at one time."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doall"]))
```

-->
