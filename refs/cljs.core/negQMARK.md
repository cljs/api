## cljs.core/neg?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/neg?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/neg?)
</td>
</tr>
</table>


 <samp>
(__neg?__ n)<br>
</samp>

---

Returns true if `n` is less than 0, false otherwise.



---


###### See Also:

[`cljs.core/pos?`](../cljs.core/posQMARK.md)<br>
[`cljs.core/zero?`](../cljs.core/zeroQMARK.md)<br>

---


Source docstring:

```
Returns true if num is less than zero, else false
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L1729-L1731):

```clj
(defn ^boolean neg?
  [x] (cljs.core/neg? x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1729-1731](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/core.cljs#L1729-L1731)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1978/src/clj/cljs/core.clj#L441-L442):

```clj
(defmacro neg? [x]
  `(< ~x 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1978
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:441-442](https://github.com/clojure/clojurescript/blob/r1978/src/clj/cljs/core.clj#L441-L442)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/neg?` @ clojuredocs](http://clojuredocs.org/clojure.core/neg_q)<br>
[`clojure.core/neg?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/neg%3F/)<br>
[`clojure.core/neg?` @ crossclj](http://crossclj.info/fun/clojure.core/neg%3F.html)<br>
[`cljs.core/neg?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/neg%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/negQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `n` is less than 0, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "neg?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/pos?" "cljs.core/zero?"],
 :full-name-encode "cljs.core/negQMARK",
 :source {:code "(defn ^boolean neg?\n  [x] (cljs.core/neg? x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1729 1731]},
 :extra-sources [{:code "(defmacro neg? [x]\n  `(< ~x 0))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1978",
                  :filename "src/clj/cljs/core.clj",
                  :lines [441 442]}],
 :full-name "cljs.core/neg?",
 :clj-symbol "clojure.core/neg?",
 :docstring "Returns true if num is less than zero, else false"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/neg?"]))
```

-->
