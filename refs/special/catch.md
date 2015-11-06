## catch



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/catch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/catch)
</td>
</tr>
</table>


 <samp>
(__catch__ exception-type name expr\*)<br>
</samp>

---

`catch` should be used inside of a `try` expression.

`exception-type` should be the type of exception thrown (usually `js/Error` or
`js/Object`). When there is a match, the thrown exception will be bound to
`name` inside of `expr*` and `expr*` will be evaluated and returned as the value
of the `try` expression.

Since JavaScript allows you to throw anything, `exception-type` can be set to
`:default` to catch all types of exceptions.



---


###### See Also:

[``](../special/try.md)<br>
[`finally`](../special/finally.md)<br>
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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L470-L498):

```clj
(defmacro try
  [& forms]
  (let [catch? #(and (list? %) (= (first %) 'catch))
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
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:470-498](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L470-L498)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/catch` @ clojuredocs](http://clojuredocs.org/clojure.core/catch)<br>
[`clojure.core/catch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/catch/)<br>
[`clojure.core/catch` @ crossclj](http://crossclj.info/fun/clojure.core/catch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/catch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`catch` should be used inside of a `try` expression.\n\n`exception-type` should be the type of exception thrown (usually `js/Error` or\n`js/Object`). When there is a match, the thrown exception will be bound to\n`name` inside of `expr*` and `expr*` will be evaluated and returned as the value\nof the `try` expression.\n\nSince JavaScript allows you to throw anything, `exception-type` can be set to\n`:default` to catch all types of exceptions.",
 :ns "special",
 :name "catch",
 :signature ["[exception-type name expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/finally" "special/throw"],
 :full-name-encode "special/catch",
 :source {:code "(defmacro try\n  [& forms]\n  (let [catch? #(and (list? %) (= (first %) 'catch))\n        [body catches] (split-with (complement catch?) forms)\n        [catches fin] (split-with catch? catches)\n        e (gensym \"e\")]\n    (assert (every? #(clojure.core/> (count %) 2) catches) \"catch block must specify a prototype and a name\")\n    (if (seq catches)\n      `(~'try*\n        ~@body\n        (catch ~e\n            (cond\n             ~@(mapcat\n                (fn [[_ type name & cb]]\n                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])\n                catches)\n             :else (throw ~e)))\n        ~@fin)\n      `(~'try*\n        ~@body\n        ~@fin))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/clj/cljs/core.clj",
          :lines [470 498]},
 :full-name "special/catch",
 :clj-symbol "clojure.core/catch",
 :docstring "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/catch"]))
```

-->
