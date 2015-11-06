## cljs.core/bit-set



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-set)
</td>
</tr>
</table>


 <samp>
(__bit-set__ x n)<br>
</samp>

---

Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-set 2r1100 1)
;;=> 14
;; 14 = 2r1110
```

Same number in decimal:

```clj
(bit-set 12 1)
;;=> 14
```



---

###### See Also:

[`cljs.core/bit-clear`](../cljs.core/bit-clear.md)<br>

---


Source docstring:

```
Set bit at index n
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1178-L1181):

```clj
(defn bit-set
  [x n]
  (cljs.core/bit-set x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1178-1181](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1178-L1181)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L232-L233):

```clj
(defmacro bit-set [x n]
  (list 'js* "(~{} | (1 << ~{}))" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:232-233](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L232-L233)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-set` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-set)<br>
[`clojure.core/bit-set` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-set/)<br>
[`clojure.core/bit-set` @ crossclj](http://crossclj.info/fun/clojure.core/bit-set.html)<br>
[`cljs.core/bit-set` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-set",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-clear"],
 :full-name-encode "cljs.core/bit-set",
 :source {:code "(defn bit-set\n  [x n]\n  (cljs.core/bit-set x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1178 1181]},
 :extra-sources [{:code "(defmacro bit-set [x n]\n  (list 'js* \"(~{} | (1 << ~{}))\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1211",
                  :filename "src/clj/cljs/core.clj",
                  :lines [232 233]}],
 :examples [{:id "6a8a49",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-set 2r1100 1)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame number in decimal:\n\n```clj\n(bit-set 12 1)\n;;=> 14\n```"}],
 :full-name "cljs.core/bit-set",
 :clj-symbol "clojure.core/bit-set",
 :docstring "Set bit at index n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-set"]))
```

-->
