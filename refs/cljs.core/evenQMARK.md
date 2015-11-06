## cljs.core/even?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/even?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/even?)
</td>
</tr>
</table>


 <samp>
(__even?__ n)<br>
</samp>

---

Returns true if `n` is an even number.

Throws an exception if `n` is not an integer.



---


###### See Also:

[`cljs.core/odd?`](../cljs.core/oddQMARK.md)<br>

---


Source docstring:

```
Returns true if n is even, throws an exception if n is not an integer
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L2521-L2525):

```clj
(defn ^boolean even?
   [n] (if (integer? n)
        (zero? (bit-and n 1))
        (throw (js/Error. (str "Argument must be an integer: " n)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2521-2525](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L2521-L2525)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/even?` @ clojuredocs](http://clojuredocs.org/clojure.core/even_q)<br>
[`clojure.core/even?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/even%3F/)<br>
[`clojure.core/even?` @ crossclj](http://crossclj.info/fun/clojure.core/even%3F.html)<br>
[`cljs.core/even?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/even%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/evenQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is an even number.\n\nThrows an exception if `n` is not an integer.",
 :return-type boolean,
 :ns "cljs.core",
 :name "even?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/odd?"],
 :full-name-encode "cljs.core/evenQMARK",
 :source {:code "(defn ^boolean even?\n   [n] (if (integer? n)\n        (zero? (bit-and n 1))\n        (throw (js/Error. (str \"Argument must be an integer: \" n)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2521 2525]},
 :full-name "cljs.core/even?",
 :clj-symbol "clojure.core/even?",
 :docstring "Returns true if n is even, throws an exception if n is not an integer"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/even?"]))
```

-->
