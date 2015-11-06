## cljs.core/integer?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/integer?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/integer?)
</td>
</tr>
</table>


 <samp>
(__integer?__ n)<br>
</samp>

---

Returns true if `n` is an integer, false otherwise.



---


###### See Also:

[``](../cljs.core/int.md)<br>

---


Source docstring:

```
Returns true if n is an integer.  Warning: returns true on underflow condition.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L684-L688):

```clj
(defn integer?
  [n]
  (and (number? n)
       (js* "(~{n} == ~{n}.toFixed())")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:684-688](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L684-L688)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/integer?` @ clojuredocs](http://clojuredocs.org/clojure.core/integer_q)<br>
[`clojure.core/integer?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/integer%3F/)<br>
[`clojure.core/integer?` @ crossclj](http://crossclj.info/fun/clojure.core/integer%3F.html)<br>
[`cljs.core/integer?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/integer%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/integerQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is an integer, false otherwise.",
 :ns "cljs.core",
 :name "integer?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/int"],
 :full-name-encode "cljs.core/integerQMARK",
 :source {:code "(defn integer?\n  [n]\n  (and (number? n)\n       (js* \"(~{n} == ~{n}.toFixed())\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [684 688]},
 :full-name "cljs.core/integer?",
 :clj-symbol "clojure.core/integer?",
 :docstring "Returns true if n is an integer.  Warning: returns true on underflow condition."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/integer?"]))
```

-->
