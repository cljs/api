## cljs.core/\*e



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*e</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*e)
</td>
</tr>
</table>



Only usable from a REPL.

Holds the result of the last exception.



---

###### Examples:

```clj
(defn cause-error []
  (throw "Error: something went wrong"))

(cause-error)
;; Error: something went wrong

*e
;;=> "Error: something went wrong"
```



---

###### See Also:

[`cljs.core/*1`](../cljs.core/STAR1.md)<br>
[`cljs.core/*2`](../cljs.core/STAR2.md)<br>
[`cljs.core/*3`](../cljs.core/STAR3.md)<br>

---


Source docstring:

```
bound in a repl thread to the most recent exception caught by the repl
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L130-L132):

```clj
(def
  ^{:doc "bound in a repl thread to the most recent exception caught by the repl"}
  *e)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:130-132](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L130-L132)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*e` @ clojuredocs](http://clojuredocs.org/clojure.core/*e)<br>
[`clojure.core/*e` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*e/)<br>
[`clojure.core/*e` @ crossclj](http://crossclj.info/fun/clojure.core/*e.html)<br>
[`cljs.core/*e` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*e.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARe.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nHolds the result of the last exception.",
 :ns "cljs.core",
 :name "*e",
 :history [["+" "0.0-2814"]],
 :type "var",
 :related ["cljs.core/*1" "cljs.core/*2" "cljs.core/*3"],
 :full-name-encode "cljs.core/STARe",
 :source {:code "(def\n  ^{:doc \"bound in a repl thread to the most recent exception caught by the repl\"}\n  *e)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [130 132]},
 :examples [{:id "bea858",
             :content "```clj\n(defn cause-error []\n  (throw \"Error: something went wrong\"))\n\n(cause-error)\n;; Error: something went wrong\n\n*e\n;;=> \"Error: something went wrong\"\n```"}],
 :full-name "cljs.core/*e",
 :clj-symbol "clojure.core/*e",
 :docstring "bound in a repl thread to the most recent exception caught by the repl"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*e"]))
```

-->
