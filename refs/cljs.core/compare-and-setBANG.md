## cljs.core/compare-and-set!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/compare-and-set!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/compare-and-set!)
</td>
</tr>
</table>


 <samp>
(__compare-and-set!__ a oldval newval)<br>
</samp>

---

Atomically sets the value of atom `a` to `newval` if and only if the current
value of the atom is identical to `oldval`.

Returns true if set happened, false otherwise.



---

###### Examples:

```clj
(def a (atom "abc"))

(compare-and-set! a "abc" "def")
;;=> true

@a
;;=> "def"

(compare-and-set! a "abc" "def")
;;=> false

@a
;;=> "def"
```



---

###### See Also:

[`cljs.core/atom`](../cljs.core/atom.md)<br>
[`cljs.core/reset!`](../cljs.core/resetBANG.md)<br>
[`cljs.core/swap!`](../cljs.core/swapBANG.md)<br>

---


Source docstring:

```
Atomically sets the value of atom to newval if and only if the
current value of the atom is equal to oldval. Returns true if
set happened, else false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L3491-L3498):

```clj
(defn compare-and-set!
  [^not-native a oldval newval]
  (if (= (-deref a) oldval)
    (do (reset! a newval) true)
    false))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2657
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3491-3498](https://github.com/clojure/clojurescript/blob/r2657/src/cljs/cljs/core.cljs#L3491-L3498)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/compare-and-set!` @ clojuredocs](http://clojuredocs.org/clojure.core/compare-and-set!)<br>
[`clojure.core/compare-and-set!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/compare-and-set%21/)<br>
[`clojure.core/compare-and-set!` @ crossclj](http://crossclj.info/fun/clojure.core/compare-and-set%21.html)<br>
[`cljs.core/compare-and-set!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/compare-and-set%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/compare-and-setBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Atomically sets the value of atom `a` to `newval` if and only if the current\nvalue of the atom is identical to `oldval`.\n\nReturns true if set happened, false otherwise.",
 :ns "cljs.core",
 :name "compare-and-set!",
 :signature ["[a oldval newval]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom" "cljs.core/reset!" "cljs.core/swap!"],
 :full-name-encode "cljs.core/compare-and-setBANG",
 :source {:code "(defn compare-and-set!\n  [^not-native a oldval newval]\n  (if (= (-deref a) oldval)\n    (do (reset! a newval) true)\n    false))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2657",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3491 3498]},
 :examples [{:id "1fa306",
             :content "```clj\n(def a (atom \"abc\"))\n\n(compare-and-set! a \"abc\" \"def\")\n;;=> true\n\n@a\n;;=> \"def\"\n\n(compare-and-set! a \"abc\" \"def\")\n;;=> false\n\n@a\n;;=> \"def\"\n```"}],
 :full-name "cljs.core/compare-and-set!",
 :clj-symbol "clojure.core/compare-and-set!",
 :docstring "Atomically sets the value of atom to newval if and only if the\ncurrent value of the atom is equal to oldval. Returns true if\nset happened, else false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/compare-and-set!"]))
```

-->
