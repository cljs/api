## cljs.core/rand



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand)
</td>
</tr>
</table>


 <samp>
(__rand__)<br>
</samp>
 <samp>
(__rand__ n)<br>
</samp>

---

Returns a random floating point number between 0 inclusive and `n` exclusive.

`n` defaults to 1.



---


###### See Also:

[`cljs.core/rand-int`](../cljs.core/rand-int.md)<br>
[`cljs.core/rand-nth`](../cljs.core/rand-nth.md)<br>

---


Source docstring:

```
Returns a random floating point number between 0 (inclusive) and
n (default 1) (exclusive).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L8737-L8741):

```clj
(defn rand
  ([] (rand 1))
  ([n] (* (Math/random) n)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8737-8741](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L8737-L8741)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rand` @ clojuredocs](http://clojuredocs.org/clojure.core/rand)<br>
[`clojure.core/rand` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rand/)<br>
[`clojure.core/rand` @ crossclj](http://crossclj.info/fun/clojure.core/rand.html)<br>
[`cljs.core/rand` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rand.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rand.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a random floating point number between 0 inclusive and `n` exclusive.\n\n`n` defaults to 1.",
 :ns "cljs.core",
 :name "rand",
 :signature ["[]" "[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand-int" "cljs.core/rand-nth"],
 :full-name-encode "cljs.core/rand",
 :source {:code "(defn rand\n  ([] (rand 1))\n  ([n] (* (Math/random) n)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8737 8741]},
 :full-name "cljs.core/rand",
 :clj-symbol "clojure.core/rand",
 :docstring "Returns a random floating point number between 0 (inclusive) and\nn (default 1) (exclusive)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand"]))
```

-->
