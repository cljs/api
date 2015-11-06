## cljs.core/bit-xor



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-xor</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-xor)
</td>
</tr>
</table>


 <samp>
(__bit-xor__ x y)<br>
</samp>
 <samp>
(__bit-xor__ x y & more)<br>
</samp>

---

Bitwise "exclusive or". Same as `x ^ y` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-xor 2r1100 2r1010)
;;=> 6
;; 6 = 2r0110
```

Same numbers in decimal:

```clj
(bit-xor 12 10)
;;=> 6
```



---

###### See Also:

[`cljs.core/bit-and`](../cljs.core/bit-and.md)<br>
[`cljs.core/bit-or`](../cljs.core/bit-or.md)<br>

---


Source docstring:

```
Bitwise exclusive or
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L2087-L2091):

```clj
(defn bit-xor
  ([x y] (cljs.core/bit-xor x y))
  ([x y & more]
     (reduce bit-xor (cljs.core/bit-xor x y) more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2087-2091](https://github.com/clojure/clojurescript/blob/r2843/src/cljs/cljs/core.cljs#L2087-L2091)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/core.clj#L509-L511):

```clj
(defmacro ^::ana/numeric bit-xor
  ([x y] (core/list 'js* "(~{} ^ ~{})" x y))
  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:509-511](https://github.com/clojure/clojurescript/blob/r2843/src/clj/cljs/core.clj#L509-L511)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-xor` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-xor)<br>
[`clojure.core/bit-xor` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-xor/)<br>
[`clojure.core/bit-xor` @ crossclj](http://crossclj.info/fun/clojure.core/bit-xor.html)<br>
[`cljs.core/bit-xor` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-xor.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-xor.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise \"exclusive or\". Same as `x ^ y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-xor",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-and" "cljs.core/bit-or"],
 :full-name-encode "cljs.core/bit-xor",
 :source {:code "(defn bit-xor\n  ([x y] (cljs.core/bit-xor x y))\n  ([x y & more]\n     (reduce bit-xor (cljs.core/bit-xor x y) more)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2087 2091]},
 :extra-sources [{:code "(defmacro ^::ana/numeric bit-xor\n  ([x y] (core/list 'js* \"(~{} ^ ~{})\" x y))\n  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [509 511]}],
 :examples [{:id "3ccd99",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-xor 2r1100 2r1010)\n;;=> 6\n;; 6 = 2r0110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-xor 12 10)\n;;=> 6\n```"}],
 :full-name "cljs.core/bit-xor",
 :clj-symbol "clojure.core/bit-xor",
 :docstring "Bitwise exclusive or"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-xor"]))
```

-->
