## cljs.core/bit-or



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-or</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-or)
</td>
</tr>
</table>


 <samp>
(__bit-or__ x y)<br>
</samp>
 <samp>
(__bit-or__ x y & more)<br>
</samp>

---

Bitwise "or". Same as `x | y` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-or 2r1100 2r1010)
;;=> 14
;; 14 = 2r1110
```

Same numbers in decimal:

```clj
(bit-or 12 10)
;;=> 14
```



---

###### See Also:

[`cljs.core/bit-and`](../cljs.core/bit-and.md)<br>
[`cljs.core/bit-xor`](../cljs.core/bit-xor.md)<br>

---


Source docstring:

```
Bitwise or
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L2502-L2506):

```clj
(defn bit-or
  ([x y] (cljs.core/bit-or x y))
  ([x y & more]
     (reduce bit-or (cljs.core/bit-or x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2502-2506](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L2502-L2506)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/core.cljc#L1102-L1104):

```clj
(core/defmacro ^::ana/numeric bit-or
  ([x y] (core/list 'js* "(~{} | ~{})" x y))
  ([x y & more] `(bit-or (bit-or ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:1102-1104](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/core.cljc#L1102-L1104)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-or` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-or)<br>
[`clojure.core/bit-or` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-or/)<br>
[`clojure.core/bit-or` @ crossclj](http://crossclj.info/fun/clojure.core/bit-or.html)<br>
[`cljs.core/bit-or` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-or.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-or.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise \"or\". Same as `x | y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-or",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-and" "cljs.core/bit-xor"],
 :full-name-encode "cljs.core/bit-or",
 :source {:code "(defn bit-or\n  ([x y] (cljs.core/bit-or x y))\n  ([x y & more]\n     (reduce bit-or (cljs.core/bit-or x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2502 2506]},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric bit-or\n  ([x y] (core/list 'js* \"(~{} | ~{})\" x y))\n  ([x y & more] `(bit-or (bit-or ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.7.122",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [1102 1104]}],
 :examples [{:id "ecea10",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-or 2r1100 2r1010)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-or 12 10)\n;;=> 14\n```"}],
 :full-name "cljs.core/bit-or",
 :clj-symbol "clojure.core/bit-or",
 :docstring "Bitwise or"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-or"]))
```

-->
