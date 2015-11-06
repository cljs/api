## cljs.core/quot



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/quot</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/quot)
</td>
</tr>
</table>


 <samp>
(__quot__ n d)<br>
</samp>

---

Returns the quotient of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).



---


###### See Also:

[`cljs.core/rem`](../cljs.core/rem.md)<br>
[`cljs.core/mod`](../cljs.core/mod.md)<br>

---


Source docstring:

```
quot[ient] of dividing numerator by denominator.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L1661-L1665):

```clj
(defn quot
  [n d]
  (let [rem (js-mod n d)]
    (fix (/ (- n rem) d))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2069
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1661-1665](https://github.com/clojure/clojurescript/blob/r2069/src/cljs/cljs/core.cljs#L1661-L1665)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/quot` @ clojuredocs](http://clojuredocs.org/clojure.core/quot)<br>
[`clojure.core/quot` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/quot/)<br>
[`clojure.core/quot` @ crossclj](http://crossclj.info/fun/clojure.core/quot.html)<br>
[`cljs.core/quot` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/quot.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/quot.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the quotient of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).",
 :ns "cljs.core",
 :name "quot",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rem" "cljs.core/mod"],
 :full-name-encode "cljs.core/quot",
 :source {:code "(defn quot\n  [n d]\n  (let [rem (js-mod n d)]\n    (fix (/ (- n rem) d))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2069",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1661 1665]},
 :full-name "cljs.core/quot",
 :clj-symbol "clojure.core/quot",
 :docstring "quot[ient] of dividing numerator by denominator."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/quot"]))
```

-->
