## cljs.core/dorun



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dorun</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dorun)
</td>
</tr>
</table>


 <samp>
(__dorun__ coll)<br>
</samp>
 <samp>
(__dorun__ n coll)<br>
</samp>

---

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`dorun` walks through the successive `next`s of the sequence and returns nil.



---


###### See Also:

[`cljs.core/doall`](../cljs.core/doall.md)<br>

---


Source docstring:

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. dorun can
be used to force any effects. Walks through the successive nexts of
the seq, does not retain the head and returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L6731-L6742):

```clj
(defn dorun
  ([coll]
   (when (seq coll)
     (recur (next coll))))
  ([n coll]
   (when (and (seq coll) (pos? n))
     (recur (dec n) (next coll)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6731-6742](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L6731-L6742)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/dorun` @ clojuredocs](http://clojuredocs.org/clojure.core/dorun)<br>
[`clojure.core/dorun` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/dorun/)<br>
[`clojure.core/dorun` @ crossclj](http://crossclj.info/fun/clojure.core/dorun.html)<br>
[`cljs.core/dorun` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/dorun.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/dorun.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`dorun` walks through the successive `next`s of the sequence and returns nil.",
 :ns "cljs.core",
 :name "dorun",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/doall"],
 :full-name-encode "cljs.core/dorun",
 :source {:code "(defn dorun\n  ([coll]\n   (when (seq coll)\n     (recur (next coll))))\n  ([n coll]\n   (when (and (seq coll) (pos? n))\n     (recur (dec n) (next coll)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6731 6742]},
 :full-name "cljs.core/dorun",
 :clj-symbol "clojure.core/dorun",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. dorun can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, does not retain the head and returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dorun"]))
```

-->
