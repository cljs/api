## cljs.core/every?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/every?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/every?)
</td>
</tr>
</table>


 <samp>
(__every?__ pred coll)<br>
</samp>

---

Returns true if `(pred x)` is logical true for every `x` in `coll`, else false.



---


###### See Also:

[`cljs.core/some`](../cljs.core/some.md)<br>
[`cljs.core/not-any?`](../cljs.core/not-anyQMARK.md)<br>

---


Source docstring:

```
Returns true if (pred x) is logical true for every x in coll, else
false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L3291-L3298):

```clj
(defn ^boolean every?
  [pred coll]
  (cond
   (nil? (seq coll)) true
   (pred (first coll)) (recur pred (next coll))
   :else false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3291-3298](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L3291-L3298)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/every?` @ clojuredocs](http://clojuredocs.org/clojure.core/every_q)<br>
[`clojure.core/every?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/every%3F/)<br>
[`clojure.core/every?` @ crossclj](http://crossclj.info/fun/clojure.core/every%3F.html)<br>
[`cljs.core/every?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/every%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/everyQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `(pred x)` is logical true for every `x` in `coll`, else false.",
 :return-type boolean,
 :ns "cljs.core",
 :name "every?",
 :signature ["[pred coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/some" "cljs.core/not-any?"],
 :full-name-encode "cljs.core/everyQMARK",
 :source {:code "(defn ^boolean every?\n  [pred coll]\n  (cond\n   (nil? (seq coll)) true\n   (pred (first coll)) (recur pred (next coll))\n   :else false))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3291 3298]},
 :full-name "cljs.core/every?",
 :clj-symbol "clojure.core/every?",
 :docstring "Returns true if (pred x) is logical true for every x in coll, else\nfalse."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/every?"]))
```

-->
