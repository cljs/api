## & rest



 <table border="1">
<tr>
<td>special character</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.github.io/clojure/clojure.core-api.html#clojure.core/&)
</td>
</tr>
</table>

<samp>\[... & foo\]</samp><br>

---


A concept for binding the rest of the values of some sequence to a name.  See
[`destructure-vector`][doc:syntax/destructure-vector] or [`fn`][doc:cljs.core/fn] for exact usage details in their
respective contexts.

[doc:syntax/destructure-vector]:../syntax/destructure-vector.md
[doc:cljs.core/fn]:../cljs.core/fn.md

---

###### Examples:

Binding `c` to the rest of the function arguments:

```clj
(defn foo
  [a b & c]
  c)
(foo 1 2 3 4)
;;=> (3 4)
```

Binding `c` to the rest of the destructured values:

```clj
(let [[a b & c]
      [1 2 3 4]]
  c)
;;=> (3 4)
```



---









 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/rest.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A concept for binding the rest of the values of some sequence to a name.  See\n[doc:syntax/destructure-vector] or [doc:cljs.core/fn] for exact usage details in their\nrespective contexts.",
 :ns "syntax",
 :name "rest",
 :history [["+" "0.0-927"]],
 :type "special character",
 :full-name-encode "syntax/rest",
 :usage ["[... & foo]"],
 :examples [{:id "ebd356",
             :content "Binding `c` to the rest of the function arguments:\n\n```clj\n(defn foo\n  [a b & c]\n  c)\n(foo 1 2 3 4)\n;;=> (3 4)\n```\n\nBinding `c` to the rest of the destructured values:\n\n```clj\n(let [[a b & c]\n      [1 2 3 4]]\n  c)\n;;=> (3 4)\n```"}],
 :full-name "syntax/rest",
 :display "& rest",
 :clj-doc "http://clojure.github.io/clojure/clojure.core-api.html#clojure.core/&"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/rest"]))
```

-->
