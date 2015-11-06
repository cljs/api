## cljs.core/bit-and



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and)
</td>
</tr>
</table>


 <samp>
(__bit-and__ x y)<br>
</samp>
 <samp>
(__bit-and__ x y & more)<br>
</samp>

---

Bitwise "and".  Same as `x & y` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-and 2r1100 2r1010)
;;=> 8
;; 8 = 2r1000
```

Same numbers in decimal:

```clj
(bit-and 12 10)
;;=> 8
```



---

###### See Also:

[`cljs.core/bit-or`](../cljs.core/bit-or.md)<br>

---


Source docstring:

```
Bitwise and
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L1702-L1704):

```clj
(defn bit-and
  [x y] (cljs.core/bit-and x y))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1702-1704](https://github.com/clojure/clojurescript/blob/r2138/src/cljs/cljs/core.cljs#L1702-L1704)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2138/src/clj/cljs/core.clj#L468-L470):

```clj
(defmacro ^::ana/numeric bit-and
  ([x y] (core/list 'js* "(~{} & ~{})" x y))
  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2138
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:468-470](https://github.com/clojure/clojurescript/blob/r2138/src/clj/cljs/core.clj#L468-L470)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-and` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-and)<br>
[`clojure.core/bit-and` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-and/)<br>
[`clojure.core/bit-and` @ crossclj](http://crossclj.info/fun/clojure.core/bit-and.html)<br>
[`cljs.core/bit-and` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-and.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-and.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise \"and\".  Same as `x & y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-and",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-or"],
 :full-name-encode "cljs.core/bit-and",
 :source {:code "(defn bit-and\n  [x y] (cljs.core/bit-and x y))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2138",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1702 1704]},
 :extra-sources [{:code "(defmacro ^::ana/numeric bit-and\n  ([x y] (core/list 'js* \"(~{} & ~{})\" x y))\n  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2138",
                  :filename "src/clj/cljs/core.clj",
                  :lines [468 470]}],
 :examples [{:id "3c0470",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-and 2r1100 2r1010)\n;;=> 8\n;; 8 = 2r1000\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and 12 10)\n;;=> 8\n```"}],
 :full-name "cljs.core/bit-and",
 :clj-symbol "clojure.core/bit-and",
 :docstring "Bitwise and"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-and"]))
```

-->
