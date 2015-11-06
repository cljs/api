## cljs.core/false?



 <table border="1">
<tr>
<td>function</td>
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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L604-L606):

```clj
(defn false?
  [x] (js* "~{x} === false"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:604-606](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L604-L606)</ins>
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
 :ns "cljs.core",
 :name "false?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/true?" "cljs.core/not"],
 :full-name-encode "cljs.core/falseQMARK",
 :source {:code "(defn false?\n  [x] (js* \"~{x} === false\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [604 606]},
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
