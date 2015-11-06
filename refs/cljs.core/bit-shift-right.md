## cljs.core/bit-shift-right



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-shift-right</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-shift-right)
</td>
</tr>
</table>


 <samp>
(__bit-shift-right__ x n)<br>
</samp>

---

Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-shift-right 2r1010 1)
;;=> 5
;; 5 = 2r0101
```

Same numbers in decimal:

```clj
(bit-shift-right 10 1)
;;=> 5
```



---

###### See Also:

[`cljs.core/bit-shift-left`](../cljs.core/bit-shift-left.md)<br>
[`cljs.core/unsigned-bit-shift-right`](../cljs.core/unsigned-bit-shift-right.md)<br>

---


Source docstring:

```
Bitwise shift right
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L1940-L1942):

```clj
(defn bit-shift-right
  [x n] (cljs.core/bit-shift-right x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1940-1942](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L1940-L1942)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/clj/cljs/core.clj#L543-L544):

```clj
(defmacro ^::ana/numeric bit-shift-right [x n]
  (core/list 'js* "(~{} >> ~{})" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:543-544](https://github.com/clojure/clojurescript/blob/r2277/src/clj/cljs/core.clj#L543-L544)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-shift-right` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-shift-right)<br>
[`clojure.core/bit-shift-right` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-shift-right/)<br>
[`clojure.core/bit-shift-right` @ crossclj](http://crossclj.info/fun/clojure.core/bit-shift-right.html)<br>
[`cljs.core/bit-shift-right` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-shift-right.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-shift-right.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.",
 :ns "cljs.core",
 :name "bit-shift-right",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-shift-left"
           "cljs.core/unsigned-bit-shift-right"],
 :full-name-encode "cljs.core/bit-shift-right",
 :source {:code "(defn bit-shift-right\n  [x n] (cljs.core/bit-shift-right x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1940 1942]},
 :extra-sources [{:code "(defmacro ^::ana/numeric bit-shift-right [x n]\n  (core/list 'js* \"(~{} >> ~{})\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2277",
                  :filename "src/clj/cljs/core.clj",
                  :lines [543 544]}],
 :examples [{:id "5b75af",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-shift-right 2r1010 1)\n;;=> 5\n;; 5 = 2r0101\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-shift-right 10 1)\n;;=> 5\n```"}],
 :full-name "cljs.core/bit-shift-right",
 :clj-symbol "clojure.core/bit-shift-right",
 :docstring "Bitwise shift right"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-shift-right"]))
```

-->
