## cljs.core/true?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/true?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/true?)
</td>
</tr>
</table>

<samp>(true? x)</samp><br>

---

 <samp>
(__true?__ x)<br>
</samp>

---

Returns true if `x` is the value true, false otherwise.



---


###### See Also:

[`cljs.core/false?`](../cljs.core/falseQMARK.md)<br>

---


Source docstring:

```
Returns true if x is the value true, false otherwise.
```


Function code @ [github]():

```clj
(defn ^boolean true?
  [x] (cljs.core/true? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---

Macro code @ [github]():

```clj
(core/defmacro true? [x]
  (bool-expr (core/list 'js* "~{} === true" x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---


###### External doc links:

[`clojure.core/true?` @ clojuredocs](http://clojuredocs.org/clojure.core/true_q)<br>
[`clojure.core/true?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/true%3F/)<br>
[`clojure.core/true?` @ crossclj](http://crossclj.info/fun/clojure.core/true%3F.html)<br>
[`cljs.core/true?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/true%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/trueQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `x` is the value true, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "true?",
 :signature ["[x]"],
 :name-encode "trueQMARK",
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :clj-equiv {:full-name "clojure.core/true?",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/true?"},
 :related ["cljs.core/false?"],
 :full-name-encode "cljs.core/trueQMARK",
 :source {:code "(defn ^boolean true?\n  [x] (cljs.core/true? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2057 2059],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/core.cljs#L2057-L2059"},
 :extra-sources [{:code "(core/defmacro true? [x]\n  (bool-expr (core/list 'js* \"~{} === true\" x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.8.40",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [886 887],
                  :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/clojure/cljs/core.cljc#L886-L887"}],
 :usage ["(true? x)"],
 :full-name "cljs.core/true?",
 :docstring "Returns true if x is the value true, false otherwise.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/trueQMARK.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/true?"]))
```

-->
