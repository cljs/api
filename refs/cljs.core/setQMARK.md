## cljs.core/set?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set?)
</td>
</tr>
</table>


 <samp>
(__set?__ x)<br>
</samp>

---

Returns true if `x` is a set, false otherwise.



---


###### See Also:

[`cljs.core/set`](../cljs.core/set.md)<br>

---


Source docstring:

```
Returns true if x satisfies ISet
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L1872-L1877):

```clj
(defn ^boolean set?
  [x]
  (if (nil? x)
    false
    (satisfies? ISet x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1872-1877](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L1872-L1877)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/set?` @ clojuredocs](http://clojuredocs.org/clojure.core/set_q)<br>
[`clojure.core/set?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/set%3F/)<br>
[`clojure.core/set?` @ crossclj](http://crossclj.info/fun/clojure.core/set%3F.html)<br>
[`cljs.core/set?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/set%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/setQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is a set, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "set?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set"],
 :full-name-encode "cljs.core/setQMARK",
 :source {:code "(defn ^boolean set?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ISet x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1872 1877]},
 :full-name "cljs.core/set?",
 :clj-symbol "clojure.core/set?",
 :docstring "Returns true if x satisfies ISet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/set?"]))
```

-->
