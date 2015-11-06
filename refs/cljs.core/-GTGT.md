## cljs.core/->>

_known as "thread last"_


 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/->></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3E%3E)
</td>
</tr>
</table>


 <samp>
(__->>__ x & forms)<br>
</samp>

---

The thread-last macro "threads" an expression through several forms as the last
item in a list.

Inserts `x` as the last item in the first form, making a list of it if it is not
a list already. If there are more forms, inserts the first form as the last item
in second form, etc.

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Code</th>
      <th>Expands To</th></tr></thead>
  <tbody>
    <tr>
      <td><pre>
(->> x
  (a b c)
  d
  (x y z))</pre></td>
      <td><pre>
(x y z (d (a b c x)))</pre></td></tr></tbody></table>



---

###### Examples:

Sequence transformation functions often take a sequence as the last argument,
thus the thread-last macro is commonly used with them.  Here we compute the sum
of the first 10 even squares:

```clj
(->> (range)
     (map #(* % %))
     (filter even?)
     (take 10)
     (reduce +))
;;=> 1140
```

This expands to:

```clj
(reduce +
  (take 10
    (filter even?
      (map #(* % %)
        (range)))))
;;=> 1140
```



---

###### See Also:

[`cljs.core/->`](../cljs.core/-GT.md)<br>

---


Source docstring:

```
Threads the expr through the forms. Inserts x as the
last item in the first form, making a list of it if it is not a
list already. If there are more forms, inserts the first form as the
last item in second form, etc.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L1578-L1592):

```clj
(defmacro ->>
  [x & forms]
  (loop [x x, forms forms]
    (if forms
      (let [form (first forms)
            threaded (if (seq? form)
              (with-meta `(~(first form) ~@(next form)  ~x) (meta form))
              (list form x))]
        (recur threaded (next forms)))
      x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1578-1592](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L1578-L1592)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/->>` @ clojuredocs](http://clojuredocs.org/clojure.core/->>)<br>
[`clojure.core/->>` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/-%3E%3E/)<br>
[`clojure.core/->>` @ crossclj](http://crossclj.info/fun/clojure.core/-%3E%3E.html)<br>
[`cljs.core/->>` @ crossclj](http://crossclj.info/fun/cljs.core/-%3E%3E.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/-GTGT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "The thread-last macro \"threads\" an expression through several forms as the last\nitem in a list.\n\nInserts `x` as the last item in the first form, making a list of it if it is not\na list already. If there are more forms, inserts the first form as the last item\nin second form, etc.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(->> x\n  (a b c)\n  d\n  (x y z))</pre></td>\n      <td><pre>\n(x y z (d (a b c x)))</pre></td></tr></tbody></table>",
 :ns "cljs.core",
 :name "->>",
 :signature ["[x & forms]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/->"],
 :full-name-encode "cljs.core/-GTGT",
 :source {:code "(defmacro ->>\n  [x & forms]\n  (loop [x x, forms forms]\n    (if forms\n      (let [form (first forms)\n            threaded (if (seq? form)\n              (with-meta `(~(first form) ~@(next form)  ~x) (meta form))\n              (list form x))]\n        (recur threaded (next forms)))\n      x)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [1578 1592]},
 :examples [{:id "1dc72c",
             :content "Sequence transformation functions often take a sequence as the last argument,\nthus the thread-last macro is commonly used with them.  Here we compute the sum\nof the first 10 even squares:\n\n```clj\n(->> (range)\n     (map #(* % %))\n     (filter even?)\n     (take 10)\n     (reduce +))\n;;=> 1140\n```\n\nThis expands to:\n\n```clj\n(reduce +\n  (take 10\n    (filter even?\n      (map #(* % %)\n        (range)))))\n;;=> 1140\n```"}],
 :known-as "thread last",
 :full-name "cljs.core/->>",
 :clj-symbol "clojure.core/->>",
 :docstring "Threads the expr through the forms. Inserts x as the\nlast item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nlast item in second form, etc."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/->>"]))
```

-->
