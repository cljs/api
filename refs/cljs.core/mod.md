## cljs.core/mod



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mod</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mod)
</td>
</tr>
</table>


 <samp>
(__mod__ n d)<br>
</samp>

---

Returns the modulus of dividing numerator `n` by denominator `d`.

Returns `NaN` when `d` is 0 (divide by 0 error).

Truncates toward negative infinity.



---

###### Examples:

```clj
(mod -5 3)
;;=> 1

(mod 5 3)
;;=> 2

(mod 5 0)
;;=> NaN
```



---

###### See Also:

[`cljs.core/rem`](../cljs.core/rem.md)<br>

---


Source docstring:

```
Modulus of num and div. Truncates toward negative infinity.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L912-L915):

```clj
(defn mod
  [n d]
  (cljs.core/mod n d))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:912-915](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L912-L915)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L137-L138):

```clj
(defmacro mod [num div]
  (list 'js* "(~{} % ~{})" num div))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:137-138](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/core.clj#L137-L138)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/mod` @ clojuredocs](http://clojuredocs.org/clojure.core/mod)<br>
[`clojure.core/mod` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/mod/)<br>
[`clojure.core/mod` @ crossclj](http://crossclj.info/fun/clojure.core/mod.html)<br>
[`cljs.core/mod` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/mod.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/mod.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns the modulus of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).\n\nTruncates toward negative infinity.",
 :ns "cljs.core",
 :name "mod",
 :signature ["[n d]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/rem"],
 :full-name-encode "cljs.core/mod",
 :source {:code "(defn mod\n  [n d]\n  (cljs.core/mod n d))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/core.cljs",
          :lines [912 915]},
 :extra-sources [{:code "(defmacro mod [num div]\n  (list 'js* \"(~{} % ~{})\" num div))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r971",
                  :filename "src/clj/cljs/core.clj",
                  :lines [137 138]}],
 :examples [{:id "8165e8",
             :content "```clj\n(mod -5 3)\n;;=> 1\n\n(mod 5 3)\n;;=> 2\n\n(mod 5 0)\n;;=> NaN\n```"}],
 :full-name "cljs.core/mod",
 :clj-symbol "clojure.core/mod",
 :docstring "Modulus of num and div. Truncates toward negative infinity."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/mod"]))
```

-->
