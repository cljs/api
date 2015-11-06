## cljs.core/unchecked-subtract-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-subtract-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-subtract-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-subtract-int__ x)<br>
</samp>
 <samp>
(__unchecked-subtract-int__ x y)<br>
</samp>
 <samp>
(__unchecked-subtract-int__ x y & more)<br>
</samp>

---





Source docstring:

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2286-L2291):

```clj
(defn ^number unchecked-subtract-int
  ([x] (cljs.core/unchecked-subtract-int x))
  ([x y] (cljs.core/unchecked-subtract-int x y))
  ([x y & more] (reduce unchecked-subtract-int (cljs.core/unchecked-subtract-int x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2286-2291](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2286-L2291)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/core.clj#L478-L479):

```clj
(defmacro ^::ana/numeric unchecked-subtract-int
  ([& xs] `(- ~@xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:478-479](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/core.clj#L478-L479)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-subtract-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-subtract-int)<br>
[`clojure.core/unchecked-subtract-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-subtract-int/)<br>
[`clojure.core/unchecked-subtract-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-subtract-int.html)<br>
[`cljs.core/unchecked-subtract-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-subtract-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-subtract-int.cljsdoc
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
 :name "unchecked-subtract-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-subtract-int",
 :source {:code "(defn ^number unchecked-subtract-int\n  ([x] (cljs.core/unchecked-subtract-int x))\n  ([x y] (cljs.core/unchecked-subtract-int x y))\n  ([x y & more] (reduce unchecked-subtract-int (cljs.core/unchecked-subtract-int x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2286 2291]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-subtract-int\n  ([& xs] `(- ~@xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3191",
                  :filename "src/clj/cljs/core.clj",
                  :lines [478 479]}],
 :full-name "cljs.core/unchecked-subtract-int",
 :clj-symbol "clojure.core/unchecked-subtract-int",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-subtract-int"]))
```

-->
