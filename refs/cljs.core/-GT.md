## cljs.core/->

_known as "thread first"_


 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3E)
</td>
</tr>
</table>


 <samp>
(__->__ x & forms)<br>
</samp>

---

The thread-first macro "threads" an expression through several forms as the
second item in a list.

Inserts `x` as the second item in the first form, making a list of it if it is
not a list already. If there are more forms, inserts the first form as the
second item in second form, etc.

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Code</th>
      <th>Expands To</th></tr></thead>
  <tbody>
    <tr>
      <td><pre>
(-> x
  (a b c)
  d
  (x y z))</pre></td>
      <td><pre>
(x (d (a x b c)) y z)</pre></td></tr></tbody></table>



---

###### Examples:

The first is arguably a bit more cumbersome to read than the second:

```clj
(first (.split (.replace (.toUpperCase "a b c d") "A" "X") " "))
;;=> "X"

(-> "a b c d"
    .toUpperCase
    (.replace "A" "X")
    (.split " ")
    first)
;;=> "X"
```



---
###### Examples:

It can also be useful for pulling values out of deeply-nested
data structures:

```clj
(def person
  {:name "Mark Volkmann"
   :address {:street "644 Glen Summit"
             :city "St. Charles"
             :state "Missouri"
             :zip 63304}
   :employer {:name "Object Computing, Inc."
              :address {:street "12140 Woodcrest Dr."
                        :city "Creve Coeur"
                        :state "Missouri"
                        :zip 63141}}})

(-> person :employer :address :city)
;;=> "Creve Coeur"
```

Same as above, but with more nesting:

```clj
(:city (:address (:employer person)))
;;=> "Creve Coeur"
```



---
###### Examples:

It can also help with arithmetic:

```clj
(def c 5)
(-> c (+ 3) (/ 2) (- 1))
;;=> 3
```

Same as above, but with more nesting:

```clj
(- (/ (+ c 3) 2) 1)
;;=> 3
```



---

###### See Also:

[`cljs.core/->>`](../cljs.core/-GTGT.md)<br>

---


Source docstring:

```
Threads the expr through the forms. Inserts x as the
second item in the first form, making a list of it if it is not a
list already. If there are more forms, inserts the first form as the
second item in second form, etc.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L1545-L1555):

```clj
(defmacro ->
  ([x] x)
  ([x form] (if (seq? form)
              (with-meta `(~(first form) ~x ~@(next form)) (meta form))
              (list form x)))
  ([x form & more] `(-> (-> ~x ~form) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1545-1555](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L1545-L1555)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/->` @ clojuredocs](http://clojuredocs.org/clojure.core/->)<br>
[`clojure.core/->` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/-%3E/)<br>
[`clojure.core/->` @ crossclj](http://crossclj.info/fun/clojure.core/-%3E.html)<br>
[`cljs.core/->` @ crossclj](http://crossclj.info/fun/cljs.core/-%3E.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/-GT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "The thread-first macro \"threads\" an expression through several forms as the\nsecond item in a list.\n\nInserts `x` as the second item in the first form, making a list of it if it is\nnot a list already. If there are more forms, inserts the first form as the\nsecond item in second form, etc.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(-> x\n  (a b c)\n  d\n  (x y z))</pre></td>\n      <td><pre>\n(x (d (a x b c)) y z)</pre></td></tr></tbody></table>",
 :ns "cljs.core",
 :name "->",
 :signature ["[x & forms]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/->>"],
 :full-name-encode "cljs.core/-GT",
 :source {:code "(defmacro ->\n  ([x] x)\n  ([x form] (if (seq? form)\n              (with-meta `(~(first form) ~x ~@(next form)) (meta form))\n              (list form x)))\n  ([x form & more] `(-> (-> ~x ~form) ~@more)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/clj/clojure/core.clj",
          :lines [1545 1555]},
 :examples [{:id "19b460",
             :content "The first is arguably a bit more cumbersome to read than the second:\n\n```clj\n(first (.split (.replace (.toUpperCase \"a b c d\") \"A\" \"X\") \" \"))\n;;=> \"X\"\n\n(-> \"a b c d\"\n    .toUpperCase\n    (.replace \"A\" \"X\")\n    (.split \" \")\n    first)\n;;=> \"X\"\n```"}
            {:id "78ad8f",
             :content "It can also be useful for pulling values out of deeply-nested\ndata structures:\n\n```clj\n(def person\n  {:name \"Mark Volkmann\"\n   :address {:street \"644 Glen Summit\"\n             :city \"St. Charles\"\n             :state \"Missouri\"\n             :zip 63304}\n   :employer {:name \"Object Computing, Inc.\"\n              :address {:street \"12140 Woodcrest Dr.\"\n                        :city \"Creve Coeur\"\n                        :state \"Missouri\"\n                        :zip 63141}}})\n\n(-> person :employer :address :city)\n;;=> \"Creve Coeur\"\n```\n\nSame as above, but with more nesting:\n\n```clj\n(:city (:address (:employer person)))\n;;=> \"Creve Coeur\"\n```"}
            {:id "5fe621",
             :content "It can also help with arithmetic:\n\n```clj\n(def c 5)\n(-> c (+ 3) (/ 2) (- 1))\n;;=> 3\n```\n\nSame as above, but with more nesting:\n\n```clj\n(- (/ (+ c 3) 2) 1)\n;;=> 3\n```"}],
 :known-as "thread first",
 :full-name "cljs.core/->",
 :clj-symbol "clojure.core/->",
 :docstring "Threads the expr through the forms. Inserts x as the\nsecond item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nsecond item in second form, etc."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/->"]))
```

-->
