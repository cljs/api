## cljs.core/unchecked-dec



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec)
</td>
</tr>
</table>


 <samp>
(__unchecked-dec__ x)<br>
</samp>

---







Function code @ [github](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1530-L1531):

```clj
(defn unchecked-dec [x]
  (cljs.core/unchecked-dec x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1530-1531](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1530-L1531)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L351-L352):

```clj
(defmacro unchecked-dec
  ([x] `(dec ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:351-352](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L351-L352)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-dec` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-dec)<br>
[`clojure.core/unchecked-dec` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-dec/)<br>
[`clojure.core/unchecked-dec` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-dec.html)<br>
[`cljs.core/unchecked-dec` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-dec.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-dec.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-dec",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-dec",
 :source {:code "(defn unchecked-dec [x]\n  (cljs.core/unchecked-dec x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1530 1531]},
 :extra-sources [{:code "(defmacro unchecked-dec\n  ([x] `(dec ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [351 352]}],
 :full-name "cljs.core/unchecked-dec",
 :clj-symbol "clojure.core/unchecked-dec"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-dec"]))
```

-->
