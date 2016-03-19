## cljs.core/\*print-length\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" title="Added in 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-length\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-length*)
</td>
</tr>
</table>







Source docstring:

```
*print-length* controls how many items of each collection the
printer will print. If it is bound to logical false, there is no
limit. Otherwise, it must be bound to an integer indicating the maximum
number of items of each collection to print. If a collection contains
more items, the printer will print items up to the limit followed by
'...' to represent the remaining items. The root binding is nil
indicating no limit.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L105-L115):

```clj
(def
  ^{:dynamic true
    :doc "*print-length* controls how many items of each collection the
  printer will print. If it is bound to logical false, there is no
  limit. Otherwise, it must be bound to an integer indicating the maximum
  number of items of each collection to print. If a collection contains
  more items, the printer will print items up to the limit followed by
  '...' to represent the remaining items. The root binding is nil
  indicating no limit."
    :jsdoc ["@type {null|number}"]}
  *print-length* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:105-115](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L105-L115)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-length*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-length*)<br>
[`clojure.core/*print-length*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-length*/)<br>
[`clojure.core/*print-length*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-length*.html)<br>
[`cljs.core/*print-length*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-length*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-lengthSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-length*",
 :history [["+" "0.0-2060"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-lengthSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"*print-length* controls how many items of each collection the\n  printer will print. If it is bound to logical false, there is no\n  limit. Otherwise, it must be bound to an integer indicating the maximum\n  number of items of each collection to print. If a collection contains\n  more items, the printer will print items up to the limit followed by\n  '...' to represent the remaining items. The root binding is nil\n  indicating no limit.\"\n    :jsdoc [\"@type {null|number}\"]}\n  *print-length* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [105 115]},
 :full-name "cljs.core/*print-length*",
 :clj-symbol "clojure.core/*print-length*",
 :docstring "*print-length* controls how many items of each collection the\nprinter will print. If it is bound to logical false, there is no\nlimit. Otherwise, it must be bound to an integer indicating the maximum\nnumber of items of each collection to print. If a collection contains\nmore items, the printer will print items up to the limit followed by\n'...' to represent the remaining items. The root binding is nil\nindicating no limit."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-length*"]))
```

-->
