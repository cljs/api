## cljs.core/=



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/=)
</td>
</tr>
</table>


 <samp>
(__=__ x)<br>
</samp>
 <samp>
(__=__ x y)<br>
</samp>
 <samp>
(__=__ x y & more)<br>
</samp>

---

Returns true if the value of `x` equals the value of `y`, false otherwise.

`=` is a value comparison, not an identity comparison.

All collections can be tested for value, regardless of "depth".



---

###### Examples:

```clj
(= 1)
;;=> true

(= 1 1)
;;=> true

(= 1 2)
;;=> false

(= 1 1 1)
;;=> true

(= 1 1 2)
;;=> false
```



---
###### Examples:

Sequences are considered equal in value if they have the same elements:

```clj
(= '(1 2) [1 2])
;;=> true
```

But you cannot compare JavaScript arrays until you convert them to sequences:

```clj
(def a #js [1 2])
(def b #js [1 2])
(= a b)
;;=> false

(= (seq a) (seq b))
;;=> true
```



---
###### Examples:

It is natural to compare deeply nested collections since value equality checks
are cheap in ClojureScript:

```clj
(def a {:foo {:bar "baz"}})
(def b {:foo {:bar "baz"}})
(= a b)
;;=> true

(= [a b] [a b])
;=> true
```

JavaScript objects cannot be compared in this way until they are converted to
ClojureScript collections:

```clj
(def a #js {:foo #js {:bar "baz"}})
(def b #js {:foo #js {:bar "baz"}})
(= a b)
;;=> false

(= (js->clj a)
   (js->clj b))
;;=> true
```



---

###### See Also:

[`cljs.core/==`](../cljs.core/EQEQ.md)<br>
[`cljs.core/not=`](../cljs.core/notEQ.md)<br>
[`cljs.core/identical?`](../cljs.core/identicalQMARK.md)<br>

---


Source docstring:

```
Equality. Returns true if x equals y, false if not. Compares
numbers and collections in a type-independent manner.  Clojure's immutable data
structures define -equiv (and thus =) as a value, not an identity,
comparison.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L699-L715):

```clj
(defn ^boolean =
  ([x] true)
  ([x y]
    (if (nil? x)
      (nil? y)
      (or (identical? x y)
        ^boolean (-equiv x y))))
  ([x y & more]
     (if (= x y)
       (if (next more)
         (recur y (first more) (next more))
         (= y (first more)))
       false)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2511
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:699-715](https://github.com/clojure/clojurescript/blob/r2511/src/cljs/cljs/core.cljs#L699-L715)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/=` @ clojuredocs](http://clojuredocs.org/clojure.core/=)<br>
[`clojure.core/=` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/%3D/)<br>
[`clojure.core/=` @ crossclj](http://crossclj.info/fun/clojure.core/%3D.html)<br>
[`cljs.core/=` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/%3D.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/EQ.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if the value of `x` equals the value of `y`, false otherwise.\n\n`=` is a value comparison, not an identity comparison.\n\nAll collections can be tested for value, regardless of \"depth\".",
 :return-type boolean,
 :ns "cljs.core",
 :name "=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/==" "cljs.core/not=" "cljs.core/identical?"],
 :full-name-encode "cljs.core/EQ",
 :source {:code "(defn ^boolean =\n  ([x] true)\n  ([x y]\n    (if (nil? x)\n      (nil? y)\n      (or (identical? x y)\n        ^boolean (-equiv x y))))\n  ([x y & more]\n     (if (= x y)\n       (if (next more)\n         (recur y (first more) (next more))\n         (= y (first more)))\n       false)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2511",
          :filename "src/cljs/cljs/core.cljs",
          :lines [699 715]},
 :examples [{:id "edffb6",
             :content "```clj\n(= 1)\n;;=> true\n\n(= 1 1)\n;;=> true\n\n(= 1 2)\n;;=> false\n\n(= 1 1 1)\n;;=> true\n\n(= 1 1 2)\n;;=> false\n```"}
            {:id "a2d064",
             :content "Sequences are considered equal in value if they have the same elements:\n\n```clj\n(= '(1 2) [1 2])\n;;=> true\n```\n\nBut you cannot compare JavaScript arrays until you convert them to sequences:\n\n```clj\n(def a #js [1 2])\n(def b #js [1 2])\n(= a b)\n;;=> false\n\n(= (seq a) (seq b))\n;;=> true\n```"}
            {:id "6c8424",
             :content "It is natural to compare deeply nested collections since value equality checks\nare cheap in ClojureScript:\n\n```clj\n(def a {:foo {:bar \"baz\"}})\n(def b {:foo {:bar \"baz\"}})\n(= a b)\n;;=> true\n\n(= [a b] [a b])\n;=> true\n```\n\nJavaScript objects cannot be compared in this way until they are converted to\nClojureScript collections:\n\n```clj\n(def a #js {:foo #js {:bar \"baz\"}})\n(def b #js {:foo #js {:bar \"baz\"}})\n(= a b)\n;;=> false\n\n(= (js->clj a)\n   (js->clj b))\n;;=> true\n```"}],
 :full-name "cljs.core/=",
 :clj-symbol "clojure.core/=",
 :docstring "Equality. Returns true if x equals y, false if not. Compares\nnumbers and collections in a type-independent manner.  Clojure's immutable data\nstructures define -equiv (and thus =) as a value, not an identity,\ncomparison."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/="]))
```

-->
