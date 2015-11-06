## finally



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/finally</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/finally)
</td>
</tr>
</table>


 <samp>
(__finally__ expr\*)<br>
</samp>

---

`finally` should be the last form inside of a `try` expression. It is optional.

`finally` clauses are always evaluated for their side effects whether there was
an error or not, but they are never the return value of a `try` expression.



---


###### See Also:

[``](../special/try.md)<br>
[`catch`](../special/catch.md)<br>
[`throw`](../special/throw.md)<br>

---


Source docstring:

```
(try expr* catch-clause* finally-clause?)

 Special Form

 catch-clause => (catch protoname name expr*)
 finally-clause => (finally expr*)

Catches and handles JavaScript exceptions.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/core.clj#L989-L1017):

```clj
(defmacro try
  [& forms]
  (let [catch? #(and (seq? %) (= (first %) 'catch))
        [body catches] (split-with (complement catch?) forms)
        [catches fin] (split-with catch? catches)
        e (gensym "e")]
    (assert (every? #(clojure.core/> (count %) 2) catches) "catch block must specify a prototype and a name")
    (if (seq catches)
      `(~'try*
        ~@body
        (catch ~e
            (cond
             ~@(mapcat
                (fn [[_ type name & cb]]
                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])
                catches)
             :else (throw ~e)))
        ~@fin)
      `(~'try*
        ~@body
        ~@fin))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:989-1017](https://github.com/clojure/clojurescript/blob/r1844/src/clj/cljs/core.clj#L989-L1017)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/finally` @ clojuredocs](http://clojuredocs.org/clojure.core/finally)<br>
[`clojure.core/finally` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/finally/)<br>
[`clojure.core/finally` @ crossclj](http://crossclj.info/fun/clojure.core/finally.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/finally.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`finally` should be the last form inside of a `try` expression. It is optional.\n\n`finally` clauses are always evaluated for their side effects whether there was\nan error or not, but they are never the return value of a `try` expression.",
 :ns "special",
 :name "finally",
 :signature ["[expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/catch" "special/throw"],
 :full-name-encode "special/finally",
 :source {:code "(defmacro try\n  [& forms]\n  (let [catch? #(and (seq? %) (= (first %) 'catch))\n        [body catches] (split-with (complement catch?) forms)\n        [catches fin] (split-with catch? catches)\n        e (gensym \"e\")]\n    (assert (every? #(clojure.core/> (count %) 2) catches) \"catch block must specify a prototype and a name\")\n    (if (seq catches)\n      `(~'try*\n        ~@body\n        (catch ~e\n            (cond\n             ~@(mapcat\n                (fn [[_ type name & cb]]\n                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])\n                catches)\n             :else (throw ~e)))\n        ~@fin)\n      `(~'try*\n        ~@body\n        ~@fin))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/clj/cljs/core.clj",
          :lines [989 1017]},
 :full-name "special/finally",
 :clj-symbol "clojure.core/finally",
 :docstring "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/finally"]))
```

-->
