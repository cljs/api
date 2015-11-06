## cljs.core/bit-clear



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-clear</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-clear)
</td>
</tr>
</table>


 <samp>
(__bit-clear__ x n)<br>
</samp>

---

Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-clear 2r1111 2)
;;=> 11
;; 11 = 2r1011
```

Same numbers in decimal:

```clj
(bit-clear 15 2)
;;=> 11
```



---

###### See Also:

[`cljs.core/bit-set`](../cljs.core/bit-set.md)<br>
[`cljs.core/bit-flip`](../cljs.core/bit-flip.md)<br>

---


Source docstring:

```
Clear bit at index n
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1356-L1359):

```clj
(defn bit-clear
  [x n]
  (cljs.core/bit-clear x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1356-1359](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L1356-L1359)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L320-L321):

```clj
(defmacro bit-clear [x n]
  (list 'js* "(~{} & ~(1 << ~{}))" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:320-321](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/core.clj#L320-L321)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-clear` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-clear)<br>
[`clojure.core/bit-clear` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-clear/)<br>
[`clojure.core/bit-clear` @ crossclj](http://crossclj.info/fun/clojure.core/bit-clear.html)<br>
[`cljs.core/bit-clear` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-clear.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-clear.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.",
 :ns "cljs.core",
 :name "bit-clear",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-set" "cljs.core/bit-flip"],
 :full-name-encode "cljs.core/bit-clear",
 :source {:code "(defn bit-clear\n  [x n]\n  (cljs.core/bit-clear x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1356 1359]},
 :extra-sources [{:code "(defmacro bit-clear [x n]\n  (list 'js* \"(~{} & ~(1 << ~{}))\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1513",
                  :filename "src/clj/cljs/core.clj",
                  :lines [320 321]}],
 :examples [{:id "0f6748",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-clear 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-clear 15 2)\n;;=> 11\n```"}],
 :full-name "cljs.core/bit-clear",
 :clj-symbol "clojure.core/bit-clear",
 :docstring "Clear bit at index n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-clear"]))
```

-->
