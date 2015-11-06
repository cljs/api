## cljs.core/unchecked-multiply-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-multiply-int__)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x y)<br>
</samp>
 <samp>
(__unchecked-multiply-int__ x y & more)<br>
</samp>

---





Source docstring:

```
Returns the product of nums. (*) returns 1.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L2261-L2266):

```clj
(defn ^number unchecked-multiply-int
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply-int x y))
  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2261-2266](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L2261-L2266)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/core.clj#L463-L464):

```clj
(defmacro ^::ana/numeric unchecked-multiply-int
  ([& xs] `(* ~@xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:463-464](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/core.clj#L463-L464)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-multiply-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-multiply-int)<br>
[`clojure.core/unchecked-multiply-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-multiply-int/)<br>
[`clojure.core/unchecked-multiply-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-multiply-int.html)<br>
[`cljs.core/unchecked-multiply-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-multiply-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-multiply-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type number,
 :ns "cljs.core",
 :name "unchecked-multiply-int",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-multiply-int",
 :source {:code "(defn ^number unchecked-multiply-int\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply-int x y))\n  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2261 2266]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-multiply-int\n  ([& xs] `(* ~@xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3178",
                  :filename "src/clj/cljs/core.clj",
                  :lines [463 464]}],
 :full-name "cljs.core/unchecked-multiply-int",
 :clj-symbol "clojure.core/unchecked-multiply-int",
 :docstring "Returns the product of nums. (*) returns 1."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-multiply-int"]))
```

-->
