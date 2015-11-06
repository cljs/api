## cljs.core/if-not



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-not)
</td>
</tr>
</table>


 <samp>
(__if-not__ test then)<br>
</samp>
 <samp>
(__if-not__ test then else)<br>
</samp>

---

If `test` is false or nil, evaluates and returns `then`. Otherwise, evaluates
and returns `else`. `else` defaults to nil if not provided.



---


###### See Also:

[`if`](../special/if.md)<br>
[`cljs.core/when-not`](../cljs.core/when-not.md)<br>

---


Source docstring:

```
Evaluates test. If logical false, evaluates and returns then expr, 
otherwise else expr, if supplied, else nil.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L730-L736):

```clj
(defmacro if-not
  ([test then] `(if-not ~test ~then nil))
  ([test then else]
   `(if (not ~test) ~then ~else)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-beta2
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:730-736](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L730-L736)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/if-not` @ clojuredocs](http://clojuredocs.org/clojure.core/if-not)<br>
[`clojure.core/if-not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/if-not/)<br>
[`clojure.core/if-not` @ crossclj](http://crossclj.info/fun/clojure.core/if-not.html)<br>
[`cljs.core/if-not` @ crossclj](http://crossclj.info/fun/cljs.core/if-not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/if-not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "If `test` is false or nil, evaluates and returns `then`. Otherwise, evaluates\nand returns `else`. `else` defaults to nil if not provided.",
 :ns "cljs.core",
 :name "if-not",
 :signature ["[test then]" "[test then else]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/if" "cljs.core/when-not"],
 :full-name-encode "cljs.core/if-not",
 :source {:code "(defmacro if-not\n  ([test then] `(if-not ~test ~then nil))\n  ([test then else]\n   `(if (not ~test) ~then ~else)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-beta2",
          :filename "src/clj/clojure/core.clj",
          :lines [730 736]},
 :full-name "cljs.core/if-not",
 :clj-symbol "clojure.core/if-not",
 :docstring "Evaluates test. If logical false, evaluates and returns then expr, \notherwise else expr, if supplied, else nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-not"]))
```

-->
