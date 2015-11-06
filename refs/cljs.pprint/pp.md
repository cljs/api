## cljs.pprint/pp



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pp</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pp)
</td>
</tr>
</table>


 <samp>
(__pp__)<br>
</samp>

---





Source docstring:

```
A convenience macro that pretty prints the last thing output. This is
exactly equivalent to (pprint *1).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.clj#L153-L157):

```clj
(defmacro pp
  [] `(cljs.pprint/pprint *1))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:153-157](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.clj#L153-L157)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/pp` @ clojuredocs](http://clojuredocs.org/clojure.pprint/pp)<br>
[`clojure.pprint/pp` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/pp/)<br>
[`clojure.pprint/pp` @ crossclj](http://crossclj.info/fun/clojure.pprint/pp.html)<br>
[`cljs.pprint/pp` @ crossclj](http://crossclj.info/fun/cljs.pprint/pp.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/pp.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "pp",
 :signature ["[]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint/pp",
 :source {:code "(defmacro pp\n  [] `(cljs.pprint/pprint *1))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [153 157]},
 :full-name "cljs.pprint/pp",
 :clj-symbol "clojure.pprint/pp",
 :docstring "A convenience macro that pretty prints the last thing output. This is\nexactly equivalent to (pprint *1)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pp"]))
```

-->
