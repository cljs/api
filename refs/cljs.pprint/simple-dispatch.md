## cljs.pprint/simple-dispatch



 <table border="1">
<tr>
<td>multimethod</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/simple-dispatch</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/simple-dispatch)
</td>
</tr>
</table>







Source docstring:

```
The pretty print dispatch function for simple data structure format.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L2911-L2913):

```clj
(defmulti simple-dispatch
  "The pretty print dispatch function for simple data structure format."
  type-dispatcher)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2911-2913](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/pprint.cljs#L2911-L2913)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/simple-dispatch` @ clojuredocs](http://clojuredocs.org/clojure.pprint/simple-dispatch)<br>
[`clojure.pprint/simple-dispatch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/simple-dispatch/)<br>
[`clojure.pprint/simple-dispatch` @ crossclj](http://crossclj.info/fun/clojure.pprint/simple-dispatch.html)<br>
[`cljs.pprint/simple-dispatch` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/simple-dispatch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/simple-dispatch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "simple-dispatch",
 :history [["+" "0.0-3255"]],
 :type "multimethod",
 :full-name-encode "cljs.pprint/simple-dispatch",
 :source {:code "(defmulti simple-dispatch\n  \"The pretty print dispatch function for simple data structure format.\"\n  type-dispatcher)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2911 2913]},
 :full-name "cljs.pprint/simple-dispatch",
 :clj-symbol "clojure.pprint/simple-dispatch",
 :docstring "The pretty print dispatch function for simple data structure format."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/simple-dispatch"]))
```

-->
