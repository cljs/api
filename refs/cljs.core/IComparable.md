## cljs.core/IComparable



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Protocol for values that can be compared.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L584-L588):

```clj
(defprotocol IComparable
  "Protocol for values that can be compared."
  (^number -compare [x y]
    "Returns a negative number, zero, or a positive number when x is logically
     'less than', 'equal to', or 'greater than' y."))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:584-588](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L584-L588)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IComparable` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IComparable.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IComparable.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IComparable",
 :history [["+" "0.0-1424"]],
 :type "protocol",
 :full-name-encode "cljs.core/IComparable",
 :source {:code "(defprotocol IComparable\n  \"Protocol for values that can be compared.\"\n  (^number -compare [x y]\n    \"Returns a negative number, zero, or a positive number when x is logically\n     'less than', 'equal to', or 'greater than' y.\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [584 588]},
 :methods [{:name "-compare",
            :signature ["[x y]"],
            :docstring "Returns a negative number, zero, or a positive number when x is logically\n     'less than', 'equal to', or 'greater than' y."}],
 :full-name "cljs.core/IComparable",
 :docstring "Protocol for values that can be compared."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IComparable"]))
```

-->
