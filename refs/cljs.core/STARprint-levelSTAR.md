## cljs.core/\*print-level\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" title="Added in 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-level\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-level*)
</td>
</tr>
</table>







Source docstring:

```
*print-level* controls how many levels deep the printer will
print nested objects. If it is bound to logical false, there is no
limit. Otherwise, it must be bound to an integer indicating the maximum
level to print. Each argument to print is at level 0; if an argument is a
collection, its items are at level 1; and so on. If an object is a
collection and is at a level greater than or equal to the value bound to
*print-level*, the printer prints '#' to represent it. The root binding
is nil indicating no limit.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L112-L122):

```clj
(def
  ^{:dynamic true
    :doc "*print-level* controls how many levels deep the printer will
  print nested objects. If it is bound to logical false, there is no
  limit. Otherwise, it must be bound to an integer indicating the maximum
  level to print. Each argument to print is at level 0; if an argument is a
  collection, its items are at level 1; and so on. If an object is a
  collection and is at a level greater than or equal to the value bound to
  *print-level*, the printer prints '#' to represent it. The root binding
  is nil indicating no limit."}
  *print-level* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:112-122](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L112-L122)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-level*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-level*)<br>
[`clojure.core/*print-level*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-level*/)<br>
[`clojure.core/*print-level*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-level*.html)<br>
[`cljs.core/*print-level*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-level*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-levelSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-level*",
 :history [["+" "0.0-2120"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-levelSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"*print-level* controls how many levels deep the printer will\n  print nested objects. If it is bound to logical false, there is no\n  limit. Otherwise, it must be bound to an integer indicating the maximum\n  level to print. Each argument to print is at level 0; if an argument is a\n  collection, its items are at level 1; and so on. If an object is a\n  collection and is at a level greater than or equal to the value bound to\n  *print-level*, the printer prints '#' to represent it. The root binding\n  is nil indicating no limit.\"}\n  *print-level* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [112 122]},
 :full-name "cljs.core/*print-level*",
 :clj-symbol "clojure.core/*print-level*",
 :docstring "*print-level* controls how many levels deep the printer will\nprint nested objects. If it is bound to logical false, there is no\nlimit. Otherwise, it must be bound to an integer indicating the maximum\nlevel to print. Each argument to print is at level 0; if an argument is a\ncollection, its items are at level 1; and so on. If an object is a\ncollection and is at a level greater than or equal to the value bound to\n*print-level*, the printer prints '#' to represent it. The root binding\nis nil indicating no limit."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-level*"]))
```

-->
