## cljs.core/empty?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/empty?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/empty?)
</td>
</tr>
</table>


 <samp>
(__empty?__ coll)<br>
</samp>

---

Returns true if `coll` has no items - same as `(not (seq coll))`.

Please use the idiom `(seq x)` rather than `(not (empty? x))`.



---


###### See Also:

[`cljs.core/seq`](../cljs.core/seq.md)<br>

---


Source docstring:

```
Returns true if coll has no items - same as (not (seq coll)).
Please use the idiom (seq x) rather than (not (empty? x))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L1086-L1090):

```clj
(defn ^boolean empty?
  [coll] (or (nil? coll)
             (not (seq coll))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1086-1090](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L1086-L1090)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/empty?` @ clojuredocs](http://clojuredocs.org/clojure.core/empty_q)<br>
[`clojure.core/empty?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/empty%3F/)<br>
[`clojure.core/empty?` @ crossclj](http://crossclj.info/fun/clojure.core/empty%3F.html)<br>
[`cljs.core/empty?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/empty%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/emptyQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `coll` has no items - same as `(not (seq coll))`.\n\nPlease use the idiom `(seq x)` rather than `(not (empty? x))`.",
 :return-type boolean,
 :ns "cljs.core",
 :name "empty?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq"],
 :full-name-encode "cljs.core/emptyQMARK",
 :source {:code "(defn ^boolean empty?\n  [coll] (or (nil? coll)\n             (not (seq coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1086 1090]},
 :full-name "cljs.core/empty?",
 :clj-symbol "clojure.core/empty?",
 :docstring "Returns true if coll has no items - same as (not (seq coll)).\nPlease use the idiom (seq x) rather than (not (empty? x))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/empty?"]))
```

-->
