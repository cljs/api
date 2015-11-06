## cljs.core/identical?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/identical?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/identical?)
</td>
</tr>
</table>


 <samp>
(__identical?__ x y)<br>
</samp>

---

Returns true if `x` and `y` are the same object, false otherwise.



---


###### See Also:

[`cljs.core/=`](../cljs.core/EQ.md)<br>
[`cljs.core/==`](../cljs.core/EQEQ.md)<br>

---


Source docstring:

```
Tests if 2 arguments are the same object
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L88-L91):

```clj
(defn ^boolean identical?
  [x y]
  (cljs.core/identical? x y))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:88-91](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L88-L91)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L326-L327):

```clj
(defmacro identical? [a b]
  (bool-expr (core/list 'js* "(~{} === ~{})" a b)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:326-327](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/core.clj#L326-L327)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/identical?` @ clojuredocs](http://clojuredocs.org/clojure.core/identical_q)<br>
[`clojure.core/identical?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/identical%3F/)<br>
[`clojure.core/identical?` @ crossclj](http://crossclj.info/fun/clojure.core/identical%3F.html)<br>
[`cljs.core/identical?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/identical%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/identicalQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` and `y` are the same object, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "identical?",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/=" "cljs.core/=="],
 :full-name-encode "cljs.core/identicalQMARK",
 :source {:code "(defn ^boolean identical?\n  [x y]\n  (cljs.core/identical? x y))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [88 91]},
 :extra-sources [{:code "(defmacro identical? [a b]\n  (bool-expr (core/list 'js* \"(~{} === ~{})\" a b)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3053",
                  :filename "src/clj/cljs/core.clj",
                  :lines [326 327]}],
 :full-name "cljs.core/identical?",
 :clj-symbol "clojure.core/identical?",
 :docstring "Tests if 2 arguments are the same object"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/identical?"]))
```

-->
