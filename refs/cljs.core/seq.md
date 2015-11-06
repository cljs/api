## cljs.core/seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq)
</td>
</tr>
</table>


 <samp>
(__seq__ coll)<br>
</samp>

---

Returns a sequence on the collection. If the collection is empty, returns nil.

`(seq nil)` returns nil.

`seq` also works on strings.



---


###### See Also:

[`cljs.core/seq?`](../cljs.core/seqQMARK.md)<br>
[`cljs.core/empty?`](../cljs.core/emptyQMARK.md)<br>

---


Source docstring:

```
Returns a seq on the collection. If the collection is
empty, returns nil.  (seq nil) returns nil. seq also works on
Strings.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L930-L951):

```clj
(defn ^seq seq
  [coll]
  (when-not (nil? coll)
    (cond
      (implements? ISeqable coll)
      (-seq ^not-native coll)

      (array? coll)
      (when-not (zero? (alength coll))
        (IndexedSeq. coll 0))

      (string? coll)
      (when-not (zero? (alength coll))
        (IndexedSeq. coll 0))

      (native-satisfies? ISeqable coll)
      (-seq coll)

      :else (throw (js/Error. (str coll " is not ISeqable"))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:930-951](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L930-L951)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/seq` @ clojuredocs](http://clojuredocs.org/clojure.core/seq)<br>
[`clojure.core/seq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/seq/)<br>
[`clojure.core/seq` @ crossclj](http://crossclj.info/fun/clojure.core/seq.html)<br>
[`cljs.core/seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a sequence on the collection. If the collection is empty, returns nil.\n\n`(seq nil)` returns nil.\n\n`seq` also works on strings.",
 :return-type seq,
 :ns "cljs.core",
 :name "seq",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/empty?"],
 :full-name-encode "cljs.core/seq",
 :source {:code "(defn ^seq seq\n  [coll]\n  (when-not (nil? coll)\n    (cond\n      (implements? ISeqable coll)\n      (-seq ^not-native coll)\n\n      (array? coll)\n      (when-not (zero? (alength coll))\n        (IndexedSeq. coll 0))\n\n      (string? coll)\n      (when-not (zero? (alength coll))\n        (IndexedSeq. coll 0))\n\n      (native-satisfies? ISeqable coll)\n      (-seq coll)\n\n      :else (throw (js/Error. (str coll \" is not ISeqable\"))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [930 951]},
 :full-name "cljs.core/seq",
 :clj-symbol "clojure.core/seq",
 :docstring "Returns a seq on the collection. If the collection is\nempty, returns nil.  (seq nil) returns nil. seq also works on\nStrings."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq"]))
```

-->
