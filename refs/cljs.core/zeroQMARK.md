## cljs.core/zero?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zero?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zero?)
</td>
</tr>
</table>


 <samp>
(__zero?__ n)<br>
</samp>

---

Returns true if `n` is 0, false otherwise.



---


###### See Also:

[`cljs.core/pos?`](../cljs.core/posQMARK.md)<br>
[`cljs.core/neg?`](../cljs.core/negQMARK.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1713-L1714):

```clj
(defn ^boolean zero? [n]
  (cljs.core/zero? n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1713-1714](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L1713-L1714)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L387-L388):

```clj
(defmacro zero? [x]
  `(== ~x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:387-388](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L387-L388)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/zero?` @ clojuredocs](http://clojuredocs.org/clojure.core/zero_q)<br>
[`clojure.core/zero?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/zero%3F/)<br>
[`clojure.core/zero?` @ crossclj](http://crossclj.info/fun/clojure.core/zero%3F.html)<br>
[`cljs.core/zero?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/zero%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/zeroQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is 0, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "zero?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/pos?" "cljs.core/neg?"],
 :full-name-encode "cljs.core/zeroQMARK",
 :source {:code "(defn ^boolean zero? [n]\n  (cljs.core/zero? n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1713 1714]},
 :extra-sources [{:code "(defmacro zero? [x]\n  `(== ~x 0))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [387 388]}],
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/zero?"]))
```

-->
