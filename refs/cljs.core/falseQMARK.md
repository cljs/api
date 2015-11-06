## cljs.core/false?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/false?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/false?)
</td>
</tr>
</table>


 <samp>
(__false?__ x)<br>
</samp>

---

Returns true if `x` is the value false, false otherwise.



---


###### See Also:

[`cljs.core/true?`](../cljs.core/trueQMARK.md)<br>
[`cljs.core/not`](../cljs.core/not.md)<br>

---


Source docstring:

```
Returns true if x is the value false, false otherwise.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L986-L988):

```clj
(defn ^boolean false?
  [x] (cljs.core/false? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:986-988](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L986-L988)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L202-L203):

```clj
(defmacro false? [x]
  (bool-expr (list 'js* "~{} === false" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:202-203](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L202-L203)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/false?` @ clojuredocs](http://clojuredocs.org/clojure.core/false_q)<br>
[`clojure.core/false?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/false%3F/)<br>
[`clojure.core/false?` @ crossclj](http://crossclj.info/fun/clojure.core/false%3F.html)<br>
[`cljs.core/false?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/false%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/falseQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is the value false, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/true?" "cljs.core/not"],
 :full-name-encode "cljs.core/falseQMARK",
 :source {:code "(defn ^boolean false?\n  [x] (cljs.core/false? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [986 988]},
 :extra-sources [{:code "(defmacro false? [x]\n  (bool-expr (list 'js* \"~{} === false\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1513",
                  :filename "src/clj/cljs/core.clj",
                  :lines [202 203]}],
 :full-name "cljs.core/false?",
 :clj-symbol "clojure.core/false?",
 :docstring "Returns true if x is the value false, false otherwise."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/false?"]))
```

-->
