## cljs.core/..



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/..</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/..)
</td>
</tr>
</table>


 <samp>
(__..__ o form)<br>
</samp>
 <samp>
(__..__ o form & more)<br>
</samp>

---

For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.

It essentially combines the thread-first `->` macro with the `.` operator.



---

###### Examples:

```js
// JavaScript
"a b c d".toUpperCase().replace("A", "X")
//=> "X B C D"
```

```clj
;; ClojureScript
(.. "a b c d"
    toUpperCase
    (replace "A" "X"))
;;=> "X B C D"
```

This is expanded to:

```clj
(. (. "a b c d" toUpperCase) (replace "A" "X"))
```


which is equivalent to:

```clj
(.replace (.toUpperCase "a b c d") "A" "X")
;;=> "X B C D"
```

Compare to the equivalent form using the thread-first `->` macro:

```clj
(-> "a b c d"
    .toUpperCase
    (.replace "A" "X"))
;;=> "X B C D"
```



---

###### See Also:

[`.`](../special/DOT.md)<br>
[`cljs.core/->`](../cljs.core/-GT.md)<br>
[`cljs.core/doto`](../cljs.core/doto.md)<br>

---


Source docstring:

```
form => fieldName-symbol or (instanceMethodName-symbol args*)

Expands into a member access (.) of the first member on the first
argument, followed by the next member on the result, etc. For
instance:

(.. System (getProperties) (get "os.name"))

expands to:

(. (. System (getProperties)) (get "os.name"))

but is easier to write, read, and understand.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1510-L1526):

```clj
(defmacro ..
  ([x form] `(. ~x ~form))
  ([x form & more] `(.. (. ~x ~form) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1510-1526](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1510-L1526)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/..` @ clojuredocs](http://clojuredocs.org/clojure.core/_..)<br>
[`clojure.core/..` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/../)<br>
[`clojure.core/..` @ crossclj](http://crossclj.info/fun/clojure.core/...html)<br>
[`cljs.core/..` @ crossclj](http://crossclj.info/fun/cljs.core/...html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/DOTDOT.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.\n\nIt essentially combines the thread-first `->` macro with the `.` operator.",
 :ns "cljs.core",
 :name "..",
 :signature ["[o form]" "[o form & more]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/." "cljs.core/->" "cljs.core/doto"],
 :full-name-encode "cljs.core/DOTDOT",
 :source {:code "(defmacro ..\n  ([x form] `(. ~x ~form))\n  ([x form & more] `(.. (. ~x ~form) ~@more)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1510 1526]},
 :examples [{:id "500658",
             :content "```js\n// JavaScript\n\"a b c d\".toUpperCase().replace(\"A\", \"X\")\n//=> \"X B C D\"\n```\n\n```clj\n;; ClojureScript\n(.. \"a b c d\"\n    toUpperCase\n    (replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```\n\nThis is expanded to:\n\n```clj\n(. (. \"a b c d\" toUpperCase) (replace \"A\" \"X\"))\n```\n\n\nwhich is equivalent to:\n\n```clj\n(.replace (.toUpperCase \"a b c d\") \"A\" \"X\")\n;;=> \"X B C D\"\n```\n\nCompare to the equivalent form using the thread-first `->` macro:\n\n```clj\n(-> \"a b c d\"\n    .toUpperCase\n    (.replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```"}],
 :full-name "cljs.core/..",
 :clj-symbol "clojure.core/..",
 :docstring "form => fieldName-symbol or (instanceMethodName-symbol args*)\n\nExpands into a member access (.) of the first member on the first\nargument, followed by the next member on the result, etc. For\ninstance:\n\n(.. System (getProperties) (get \"os.name\"))\n\nexpands to:\n\n(. (. System (getProperties)) (get \"os.name\"))\n\nbut is easier to write, read, and understand."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/.."]))
```

-->
