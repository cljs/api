## , comma



 <table border="1">
<tr>
<td>special character</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/cheatsheet)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#general-considerations)
</td>
</tr>
</table>



A comma is treated as whitespace when appearing outside a string.

This is mainly used to help delineate elements in a collection when necessary.

Commas are used when printing maps in the REPL:

```clj
{:foo 1, :bar 2, :bar 3}
```



---

###### Examples:

```clj
[1, 2, 3, 4]
;;=> [1 2 3 4]

{:foo :bar :baz :quux}
;;=> {:foo :bar, :baz :quux}
```



---









 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/comma.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A comma is treated as whitespace when appearing outside a string.\n\nThis is mainly used to help delineate elements in a collection when necessary.\n\nCommas are used when printing maps in the REPL:\n\n```clj\n{:foo 1, :bar 2, :bar 3}\n```",
 :ns "syntax",
 :name "comma",
 :history [["+" "0.0-927"]],
 :type "special character",
 :full-name-encode "syntax/comma",
 :examples [{:id "68e4a0",
             :content "```clj\n[1, 2, 3, 4]\n;;=> [1 2 3 4]\n\n{:foo :bar :baz :quux}\n;;=> {:foo :bar, :baz :quux}\n```"}],
 :edn-doc "https://github.com/edn-format/edn#general-considerations",
 :full-name "syntax/comma",
 :display ", comma",
 :clj-doc "http://clojure.org/cheatsheet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/comma"]))
```

-->
