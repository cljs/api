## cljs.core/counted?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/counted?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/counted?)
</td>
</tr>
</table>


 <samp>
(__counted?__ x)<br>
</samp>

---

Returns true if `x` executes `count` in constant time, false otherwise.

Lists, maps, sets, strings, and vectors can be counted in constant time.



---




Source docstring:

```
Returns true if coll implements count in constant time
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L1231-L1233):

```clj
(defn ^boolean counted?
  [x] (satisfies? ICounted x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1231-1233](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L1231-L1233)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/counted?` @ clojuredocs](http://clojuredocs.org/clojure.core/counted_q)<br>
[`clojure.core/counted?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/counted%3F/)<br>
[`clojure.core/counted?` @ crossclj](http://crossclj.info/fun/clojure.core/counted%3F.html)<br>
[`cljs.core/counted?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/counted%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/countedQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` executes `count` in constant time, false otherwise.\n\nLists, maps, sets, strings, and vectors can be counted in constant time.",
 :return-type boolean,
 :ns "cljs.core",
 :name "counted?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/countedQMARK",
 :source {:code "(defn ^boolean counted?\n  [x] (satisfies? ICounted x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1231 1233]},
 :full-name "cljs.core/counted?",
 :clj-symbol "clojure.core/counted?",
 :docstring "Returns true if coll implements count in constant time"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/counted?"]))
```

-->
