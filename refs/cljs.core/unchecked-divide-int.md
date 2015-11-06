## cljs.core/unchecked-divide-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-divide-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-divide-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-divide-int__ x)<br>
</samp>
 <samp>
(__unchecked-divide-int__ x y)<br>
</samp>
 <samp>
(__unchecked-divide-int__ x y & more)<br>
</samp>

---





Source docstring:

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L2241-L2246):

```clj
(defn ^number unchecked-divide-int
  ([x] (unchecked-divide-int 1 x))
  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2241-2246](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L2241-L2246)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/core.clj#L402-L403):

```clj
(defmacro ^::ana/numeric unchecked-divide-int
  ([& xs] `(/ ~@xs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:402-403](https://github.com/clojure/clojurescript/blob/r3115/src/clj/cljs/core.clj#L402-L403)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-divide-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-divide-int)<br>
[`clojure.core/unchecked-divide-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-divide-int/)<br>
[`clojure.core/unchecked-divide-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-divide-int.html)<br>
[`cljs.core/unchecked-divide-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-divide-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-divide-int.cljsdoc
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
 :name "unchecked-divide-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-divide-int",
 :source {:code "(defn ^number unchecked-divide-int\n  ([x] (unchecked-divide-int 1 x))\n  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2241 2246]},
 :extra-sources [{:code "(defmacro ^::ana/numeric unchecked-divide-int\n  ([& xs] `(/ ~@xs)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3115",
                  :filename "src/clj/cljs/core.clj",
                  :lines [402 403]}],
 :full-name "cljs.core/unchecked-divide-int",
 :clj-symbol "clojure.core/unchecked-divide-int",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-divide-int"]))
```

-->
