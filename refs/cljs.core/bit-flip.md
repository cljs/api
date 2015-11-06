## cljs.core/bit-flip



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-flip</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-flip)
</td>
</tr>
</table>


 <samp>
(__bit-flip__ x n)<br>
</samp>

---

Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-flip 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-flip 15 2)
;;=> 11
```



---

###### See Also:

[`cljs.core/bit-set`](../cljs.core/bit-set.md)<br>
[`cljs.core/bit-clear`](../cljs.core/bit-clear.md)<br>

---


Source docstring:

```
Flip bit at index n
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1361-L1364):

```clj
(defn bit-flip
  [x n]
  (cljs.core/bit-flip x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1361-1364](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1361-L1364)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L323-L324):

```clj
(defmacro bit-flip [x n]
  (list 'js* "(~{} ^ (1 << ~{}))" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:323-324](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L323-L324)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-flip` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-flip)<br>
[`clojure.core/bit-flip` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-flip/)<br>
[`clojure.core/bit-flip` @ crossclj](http://crossclj.info/fun/clojure.core/bit-flip.html)<br>
[`cljs.core/bit-flip` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-flip.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-flip.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-flip",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-set" "cljs.core/bit-clear"],
 :full-name-encode "cljs.core/bit-flip",
 :source {:code "(defn bit-flip\n  [x n]\n  (cljs.core/bit-flip x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1361 1364]},
 :extra-sources [{:code "(defmacro bit-flip [x n]\n  (list 'js* \"(~{} ^ (1 << ~{}))\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1513",
                  :filename "src/clj/cljs/core.clj",
                  :lines [323 324]}],
 :examples [{:id "5d7ee0",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-flip 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-flip 15 2)\n;;=> 11\n```"}],
 :full-name "cljs.core/bit-flip",
 :clj-symbol "clojure.core/bit-flip",
 :docstring "Flip bit at index n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-flip"]))
```

-->
