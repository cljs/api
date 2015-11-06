## cljs.core/bit-not



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-not)
</td>
</tr>
</table>


 <samp>
(__bit-not__ x)<br>
</samp>

---

Bitwise complement.  Same as `~x` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-not 2r1100)
;;=> -13
```

Same numbers in decimal:

```clj
(bit-not 12)
;;=> -13
```



---



Source docstring:

```
Bitwise complement
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L1708-L1710):

```clj
(defn bit-not
  [x] (cljs.core/bit-not x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1708-1710](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L1708-L1710)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L465-L466):

```clj
(defmacro ^::ana/numeric bit-not [x]
  (core/list 'js* "(~ ~{})" x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:465-466](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L465-L466)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-not` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-not)<br>
[`clojure.core/bit-not` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-not/)<br>
[`clojure.core/bit-not` @ crossclj](http://crossclj.info/fun/clojure.core/bit-not.html)<br>
[`cljs.core/bit-not` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-not.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-not.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Bitwise complement.  Same as `~x` in JavaScript.",
 :ns "cljs.core",
 :name "bit-not",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/bit-not",
 :source {:code "(defn bit-not\n  [x] (cljs.core/bit-not x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1708 1710]},
 :extra-sources [{:code "(defmacro ^::ana/numeric bit-not [x]\n  (core/list 'js* \"(~ ~{})\" x))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2067",
                  :filename "src/clj/cljs/core.clj",
                  :lines [465 466]}],
 :examples [{:id "d4c5e3",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-not 2r1100)\n;;=> -13\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-not 12)\n;;=> -13\n```"}],
 :full-name "cljs.core/bit-not",
 :clj-symbol "clojure.core/bit-not",
 :docstring "Bitwise complement"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-not"]))
```

-->
