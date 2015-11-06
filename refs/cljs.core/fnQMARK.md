## cljs.core/fn?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fn?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fn?)
</td>
</tr>
</table>


 <samp>
(__fn?__ f)<br>
</samp>

---

Returns true if `f` is a function, false otherwise.



---


###### See Also:

[`cljs.core/ifn?`](../cljs.core/ifnQMARK.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L1007-L1008):

```clj
(defn ^boolean fn? [f]
  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1007-1008](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L1007-L1008)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/fn?` @ clojuredocs](http://clojuredocs.org/clojure.core/fn_q)<br>
[`clojure.core/fn?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/fn%3F/)<br>
[`clojure.core/fn?` @ crossclj](http://crossclj.info/fun/clojure.core/fn%3F.html)<br>
[`cljs.core/fn?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/fn%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/fnQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `f` is a function, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "fn?",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ifn?"],
 :full-name-encode "cljs.core/fnQMARK",
 :source {:code "(defn ^boolean fn? [f]\n  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1007 1008]},
 :full-name "cljs.core/fn?",
 :clj-symbol "clojure.core/fn?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fn?"]))
```

-->
