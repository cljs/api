## cljs.core/rand-int



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rand-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rand-int)
</td>
</tr>
</table>


 <samp>
(__rand-int__ n)<br>
</samp>

---

Returns a random integer between 0 inclusive and `n` exclusive.



---


###### See Also:

[`cljs.core/rand`](../cljs.core/rand.md)<br>

---


Source docstring:

```
Returns a random integer between 0 (inclusive) and n (exclusive).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L7235-L7237):

```clj
(defn rand-int
  [n] (Math/floor (* (Math/random) n)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7235-7237](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L7235-L7237)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/rand-int` @ clojuredocs](http://clojuredocs.org/clojure.core/rand-int)<br>
[`clojure.core/rand-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/rand-int/)<br>
[`clojure.core/rand-int` @ crossclj](http://crossclj.info/fun/clojure.core/rand-int.html)<br>
[`cljs.core/rand-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/rand-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/rand-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a random integer between 0 inclusive and `n` exclusive.",
 :ns "cljs.core",
 :name "rand-int",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rand"],
 :full-name-encode "cljs.core/rand-int",
 :source {:code "(defn rand-int\n  [n] (Math/floor (* (Math/random) n)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7235 7237]},
 :full-name "cljs.core/rand-int",
 :clj-symbol "clojure.core/rand-int",
 :docstring "Returns a random integer between 0 (inclusive) and n (exclusive)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rand-int"]))
```

-->
