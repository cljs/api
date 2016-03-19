## cljs.core/unchecked-dec-int



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec-int)
</td>
</tr>
</table>


 <samp>
(__unchecked-dec-int__ x)<br>
</samp>

---





Source docstring:

```
Returns a number one less than x, an int.
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L2466-L2469):

```clj
(defn unchecked-dec-int
  [x]
  (cljs.core/unchecked-dec-int x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2466-2469](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/core.cljs#L2466-L2469)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/core.cljc#L971-L972):

```clj
(core/defmacro ^::ana/numeric unchecked-dec-int
  ([x] `(dec ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:971-972](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/clojure/cljs/core.cljc#L971-L972)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/unchecked-dec-int` @ clojuredocs](http://clojuredocs.org/clojure.core/unchecked-dec-int)<br>
[`clojure.core/unchecked-dec-int` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/unchecked-dec-int/)<br>
[`clojure.core/unchecked-dec-int` @ crossclj](http://crossclj.info/fun/clojure.core/unchecked-dec-int.html)<br>
[`cljs.core/unchecked-dec-int` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/unchecked-dec-int.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/unchecked-dec-int.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "unchecked-dec-int",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function/macro",
 :full-name-encode "cljs.core/unchecked-dec-int",
 :source {:code "(defn unchecked-dec-int\n  [x]\n  (cljs.core/unchecked-dec-int x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2466 2469]},
 :extra-sources [{:code "(core/defmacro ^::ana/numeric unchecked-dec-int\n  ([x] `(dec ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.8.34",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [971 972]}],
 :full-name "cljs.core/unchecked-dec-int",
 :clj-symbol "clojure.core/unchecked-dec-int",
 :docstring "Returns a number one less than x, an int."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-dec-int"]))
```

-->
