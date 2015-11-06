## cljs.core/pos?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pos?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pos?)
</td>
</tr>
</table>


 <samp>
(__pos?__ n)<br>
</samp>

---

Returns true if `n` is greater than 0, false otherwise.



---


###### See Also:

[`cljs.core/neg?`](../cljs.core/negQMARK.md)<br>
[`cljs.core/zero?`](../cljs.core/zeroQMARK.md)<br>

---


Source docstring:

```
Returns true if num is greater than zero, else false
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L2444-L2446):

```clj
(defn ^boolean pos?
  [n] (cljs.core/pos? n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2444-2446](https://github.com/clojure/clojurescript/blob/r3255/src/main/cljs/cljs/core.cljs#L2444-L2446)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/core.clj#L536-L537):

```clj
(defmacro ^::ana/numeric pos? [x]
  `(> ~x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3255
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:536-537](https://github.com/clojure/clojurescript/blob/r3255/src/main/clojure/cljs/core.clj#L536-L537)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/pos?` @ clojuredocs](http://clojuredocs.org/clojure.core/pos_q)<br>
[`clojure.core/pos?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/pos%3F/)<br>
[`clojure.core/pos?` @ crossclj](http://crossclj.info/fun/clojure.core/pos%3F.html)<br>
[`cljs.core/pos?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pos%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/posQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is greater than 0, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "pos?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/neg?" "cljs.core/zero?"],
 :full-name-encode "cljs.core/posQMARK",
 :source {:code "(defn ^boolean pos?\n  [n] (cljs.core/pos? n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r3255",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2444 2446]},
 :extra-sources [{:code "(defmacro ^::ana/numeric pos? [x]\n  `(> ~x 0))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r3255",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [536 537]}],
 :full-name "cljs.core/pos?",
 :clj-symbol "clojure.core/pos?",
 :docstring "Returns true if num is greater than zero, else false"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pos?"]))
```

-->
