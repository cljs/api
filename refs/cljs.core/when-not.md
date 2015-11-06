## cljs.core/when-not



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-not)
</td>
</tr>
</table>


 <samp>
(__when-not__ test & body)<br>
</samp>

---

Evaluates `test`. If logical false, evaluates `body` in an implicit `do`.



---


###### See Also:

[`cljs.core/when`](../cljs.core/when.md)<br>
[`cljs.core/when-let`](../cljs.core/when-let.md)<br>
[`if`](../special/if.md)<br>

---


Source docstring:

```
Evaluates test. If logical false, evaluates body in an implicit do.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L461-L465):

```clj
(defmacro when-not
  [test & body]
    (list 'if test nil (cons 'do body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:461-465](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L461-L465)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/when-not` @ clojuredocs](http://clojuredocs.org/clojure.core/when-not)<br>
[`clojure.core/when-not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/when-not/)<br>
[`clojure.core/when-not` @ crossclj](http://crossclj.info/fun/clojure.core/when-not.html)<br>
[`cljs.core/when-not` @ crossclj](http://crossclj.info/fun/cljs.core/when-not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/when-not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Evaluates `test`. If logical false, evaluates `body` in an implicit `do`.",
 :ns "cljs.core",
 :name "when-not",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/when" "cljs.core/when-let" "special/if"],
 :full-name-encode "cljs.core/when-not",
 :source {:code "(defmacro when-not\n  [test & body]\n    (list 'if test nil (cons 'do body)))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/clj/clojure/core.clj",
          :lines [461 465]},
 :full-name "cljs.core/when-not",
 :clj-symbol "clojure.core/when-not",
 :docstring "Evaluates test. If logical false, evaluates body in an implicit do."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-not"]))
```

-->
