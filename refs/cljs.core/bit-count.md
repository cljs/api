## cljs.core/bit-count



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__bit-count__ x)<br>
</samp>

---

Counts the number of bits set in `x`.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-count 2r1011)
;;=> 3
```

Same number in decimal:

```clj
(bit-count 11)
;;=> 3
```



---



Source docstring:

```
Counts the number of bits set in n
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L2424-L2429):

```clj
(defn bit-count
  [v]
  (let [v (- v (bit-and (bit-shift-right v 1) 0x55555555))
        v (+ (bit-and v 0x33333333) (bit-and (bit-shift-right v 2) 0x33333333))]
    (bit-shift-right (* (bit-and (+ v (bit-shift-right v 4)) 0xF0F0F0F) 0x1010101) 24)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2424-2429](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L2424-L2429)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/bit-count` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-count.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-count.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Counts the number of bits set in `x`.",
 :ns "cljs.core",
 :name "bit-count",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/bit-count",
 :source {:code "(defn bit-count\n  [v]\n  (let [v (- v (bit-and (bit-shift-right v 1) 0x55555555))\n        v (+ (bit-and v 0x33333333) (bit-and (bit-shift-right v 2) 0x33333333))]\n    (bit-shift-right (* (bit-and (+ v (bit-shift-right v 4)) 0xF0F0F0F) 0x1010101) 24)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2424 2429]},
 :examples [{:id "35c78c",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-count 2r1011)\n;;=> 3\n```\n\nSame number in decimal:\n\n```clj\n(bit-count 11)\n;;=> 3\n```"}],
 :full-name "cljs.core/bit-count",
 :docstring "Counts the number of bits set in n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-count"]))
```

-->
