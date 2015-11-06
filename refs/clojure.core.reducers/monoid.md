## clojure.core.reducers/monoid



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/monoid</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/monoid)
</td>
</tr>
</table>


 <samp>
(__monoid__ op ctor)<br>
</samp>

---





Source docstring:

```
Builds a combining fn out of the supplied operator and identity
constructor. op must be associative and ctor called with no args
must return an identity value for it.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/core/reducers.cljs#L242-L249):

```clj
(defn monoid
  [op ctor]
  (fn m
    ([] (ctor))
    ([a b] (op a b))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:242-249](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/core/reducers.cljs#L242-L249)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/monoid` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/monoid)<br>
[`clojure.core.reducers/monoid` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/monoid/)<br>
[`clojure.core.reducers/monoid` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/monoid.html)<br>
[`clojure.core.reducers/monoid` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/monoid.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/monoid.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "monoid",
 :signature ["[op ctor]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/monoid",
 :source {:code "(defn monoid\n  [op ctor]\n  (fn m\n    ([] (ctor))\n    ([a b] (op a b))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [242 249]},
 :full-name "clojure.core.reducers/monoid",
 :clj-symbol "clojure.core.reducers/monoid",
 :docstring "Builds a combining fn out of the supplied operator and identity\nconstructor. op must be associative and ctor called with no args\nmust return an identity value for it."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/monoid"]))
```

-->
