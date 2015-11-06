## cljs.core/associative?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/associative?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/associative?)
</td>
</tr>
</table>


 <samp>
(__associative?__ coll)<br>
</samp>

---

Returns true if `coll` implements the `IAssociative` protocol, false otherwise.

Maps and vectors are associative.



---

###### Examples:

```clj
(associative? [1 2 3])
;;=> true

(associative? {:a 1 :b 2})
;;=> true

(associative? #{1 2 3})
;;=> false

(associative? '(1 2 3))
;;=> false
```



---



Source docstring:

```
Returns true if coll implements Associative
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L1121-L1123):

```clj
(defn ^boolean associative?
  [x] (satisfies? IAssociative x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1121-1123](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/cljs/core.cljs#L1121-L1123)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/associative?` @ clojuredocs](http://clojuredocs.org/clojure.core/associative_q)<br>
[`clojure.core/associative?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/associative%3F/)<br>
[`clojure.core/associative?` @ crossclj](http://crossclj.info/fun/clojure.core/associative%3F.html)<br>
[`cljs.core/associative?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/associative%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/associativeQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `coll` implements the `IAssociative` protocol, false otherwise.\n\nMaps and vectors are associative.",
 :return-type boolean,
 :ns "cljs.core",
 :name "associative?",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/associativeQMARK",
 :source {:code "(defn ^boolean associative?\n  [x] (satisfies? IAssociative x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1121 1123]},
 :examples [{:id "29a37f",
             :content "```clj\n(associative? [1 2 3])\n;;=> true\n\n(associative? {:a 1 :b 2})\n;;=> true\n\n(associative? #{1 2 3})\n;;=> false\n\n(associative? '(1 2 3))\n;;=> false\n```"}],
 :full-name "cljs.core/associative?",
 :clj-symbol "clojure.core/associative?",
 :docstring "Returns true if coll implements Associative"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/associative?"]))
```

-->
