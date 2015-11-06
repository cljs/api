## cljs.core/seq?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/seq?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/seq?)
</td>
</tr>
</table>


 <samp>
(__seq?__ x)<br>
</samp>

---

Returns true if `x` is a sequence, false otherwise.

All collections can be converted into a sequence using `seq`.



---


###### See Also:

[`cljs.core/seq`](../cljs.core/seq.md)<br>
[`cljs.core/sequential?`](../cljs.core/sequentialQMARK.md)<br>
[`cljs.core/vector?`](../cljs.core/vectorQMARK.md)<br>
[`cljs.core/coll?`](../cljs.core/collQMARK.md)<br>
[`cljs.core/list?`](../cljs.core/listQMARK.md)<br>
[`cljs.core/map?`](../cljs.core/mapQMARK.md)<br>
[`cljs.core/set?`](../cljs.core/setQMARK.md)<br>

---


Source docstring:

```
Return true if s satisfies ISeq
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L1845-L1850):

```clj
(defn ^boolean seq?
  [s]
  (if (nil? s)
    false
    (satisfies? ISeq s)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1845-1850](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L1845-L1850)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/seq?` @ clojuredocs](http://clojuredocs.org/clojure.core/seq_q)<br>
[`clojure.core/seq?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/seq%3F/)<br>
[`clojure.core/seq?` @ crossclj](http://crossclj.info/fun/clojure.core/seq%3F.html)<br>
[`cljs.core/seq?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/seq%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/seqQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a sequence, false otherwise.\n\nAll collections can be converted into a sequence using `seq`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "seq?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq"
           "cljs.core/sequential?"
           "cljs.core/vector?"
           "cljs.core/coll?"
           "cljs.core/list?"
           "cljs.core/map?"
           "cljs.core/set?"],
 :full-name-encode "cljs.core/seqQMARK",
 :source {:code "(defn ^boolean seq?\n  [s]\n  (if (nil? s)\n    false\n    (satisfies? ISeq s)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1845 1850]},
 :full-name "cljs.core/seq?",
 :clj-symbol "clojure.core/seq?",
 :docstring "Return true if s satisfies ISeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/seq?"]))
```

-->
