## cljs.core/integer?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/integer?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/integer?)
</td>
</tr>
</table>


 <samp>
(__integer?__ n)<br>
</samp>

---

Returns true if `n` is an integer, false otherwise.



---


###### See Also:

[`cljs.core/int`](../cljs.core/int.md)<br>

---


Source docstring:

```
Returns true if n is an integer.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L2002-L2008):

```clj
(defn ^boolean integer?
  [n]
  (and (number? n)
       (not ^boolean (js/isNaN n))
       (not (identical? n js/Infinity))
       (== (js/parseFloat n) (js/parseInt n 10))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2002-2008](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L2002-L2008)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/integer?` @ clojuredocs](http://clojuredocs.org/clojure.core/integer_q)<br>
[`clojure.core/integer?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/integer%3F/)<br>
[`clojure.core/integer?` @ crossclj](http://crossclj.info/fun/clojure.core/integer%3F.html)<br>
[`cljs.core/integer?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/integer%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/integerQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is an integer, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "integer?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/int"],
 :full-name-encode "cljs.core/integerQMARK",
 :source {:code "(defn ^boolean integer?\n  [n]\n  (and (number? n)\n       (not ^boolean (js/isNaN n))\n       (not (identical? n js/Infinity))\n       (== (js/parseFloat n) (js/parseInt n 10))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2002 2008]},
 :full-name "cljs.core/integer?",
 :clj-symbol "clojure.core/integer?",
 :docstring "Returns true if n is an integer."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/integer?"]))
```

-->
