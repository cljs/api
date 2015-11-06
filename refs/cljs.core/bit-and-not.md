## cljs.core/bit-and-not



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-and-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-and-not)
</td>
</tr>
</table>


 <samp>
(__bit-and-not__ x y)<br>
</samp>
 <samp>
(__bit-and-not__ x y & more)<br>
</samp>

---

Bitwise "and" `x` with bitwise "not" `y`.  Same as `x & ~y` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-and-not 2r1100 2r1010)
;;=> 4
;; 4 = 2r0100
```

Same numbers in decimal:

```clj
(bit-and-not 12 10)
;;=> 4
```

Same result using `bit-and` and `bit-not`:

```clj
(bit-and 12 (bit-not 10))
;;=> 4
```



---

###### See Also:

[`cljs.core/bit-and`](../cljs.core/bit-and.md)<br>
[`cljs.core/bit-not`](../cljs.core/bit-not.md)<br>

---


Source docstring:

```
Bitwise and
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L1329-L1331):

```clj
(defn bit-and-not
  [x y] (cljs.core/bit-and-not x y))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1329-1331](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L1329-L1331)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1443/src/clj/cljs/core.clj#L316-L318):

```clj
(defmacro bit-and-not
  ([x y] (list 'js* "(~{} & ~~{})" x y))
  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1443
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:316-318](https://github.com/clojure/clojurescript/blob/r1443/src/clj/cljs/core.clj#L316-L318)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-and-not` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-and-not)<br>
[`clojure.core/bit-and-not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-and-not/)<br>
[`clojure.core/bit-and-not` @ crossclj](http://crossclj.info/fun/clojure.core/bit-and-not.html)<br>
[`cljs.core/bit-and-not` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-and-not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-and-not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise \"and\" `x` with bitwise \"not\" `y`.  Same as `x & ~y` in JavaScript.",
 :ns "cljs.core",
 :name "bit-and-not",
 :signature ["[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/bit-and" "cljs.core/bit-not"],
 :full-name-encode "cljs.core/bit-and-not",
 :source {:code "(defn bit-and-not\n  [x y] (cljs.core/bit-and-not x y))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1329 1331]},
 :extra-sources [{:code "(defmacro bit-and-not\n  ([x y] (list 'js* \"(~{} & ~~{})\" x y))\n  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1443",
                  :filename "src/clj/cljs/core.clj",
                  :lines [316 318]}],
 :examples [{:id "16f35d",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-and-not 2r1100 2r1010)\n;;=> 4\n;; 4 = 2r0100\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and-not 12 10)\n;;=> 4\n```\n\nSame result using `bit-and` and `bit-not`:\n\n```clj\n(bit-and 12 (bit-not 10))\n;;=> 4\n```"}],
 :full-name "cljs.core/bit-and-not",
 :clj-symbol "clojure.core/bit-and-not",
 :docstring "Bitwise and"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-and-not"]))
```

-->
