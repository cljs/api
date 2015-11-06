## cljs.core/number?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/number?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/number?)
</td>
</tr>
</table>


 <samp>
(__number?__ n)<br>
</samp>

---

Returns true if `n` is a number, false otherwise.



---


###### See Also:

[`cljs.core/integer?`](../cljs.core/integerQMARK.md)<br>

---


Source docstring:

```
Returns true if x is a JavaScript number.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L195-L198):

```clj
(defn ^boolean number?
  [n]
  (cljs.core/number? n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:195-198](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/core.cljs#L195-L198)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/core.cljc#L931-L932):

```clj
(core/defmacro number? [x]
  (bool-expr (core/list 'js* "typeof ~{} === 'number'" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:931-932](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/core.cljc#L931-L932)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/number?` @ clojuredocs](http://clojuredocs.org/clojure.core/number_q)<br>
[`clojure.core/number?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/number%3F/)<br>
[`clojure.core/number?` @ crossclj](http://crossclj.info/fun/clojure.core/number%3F.html)<br>
[`cljs.core/number?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/number%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/numberQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is a number, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "number?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/integer?"],
 :full-name-encode "cljs.core/numberQMARK",
 :source {:code "(defn ^boolean number?\n  [n]\n  (cljs.core/number? n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [195 198]},
 :extra-sources [{:code "(core/defmacro number? [x]\n  (bool-expr (core/list 'js* \"typeof ~{} === 'number'\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.7.170",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [931 932]}],
 :full-name "cljs.core/number?",
 :clj-symbol "clojure.core/number?",
 :docstring "Returns true if x is a JavaScript number."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/number?"]))
```

-->
