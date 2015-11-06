## cljs.core/special-symbol?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1803"><img valign="middle" alt="[+] 0.0-1803" title="Added in 0.0-1803" src="https://img.shields.io/badge/+-0.0--1803-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/special-symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/special-symbol?)
</td>
</tr>
</table>


 <samp>
(__special-symbol?__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L9607-L9611):

```clj
(defn ^boolean special-symbol? [x]
  (contains?
    '#{if def fn* do let* loop* letfn* throw try
       recur new set! ns deftype* defrecord* . js* & quote}
    x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9607-9611](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L9607-L9611)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/special-symbol?` @ clojuredocs](http://clojuredocs.org/clojure.core/special-symbol_q)<br>
[`clojure.core/special-symbol?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/special-symbol%3F/)<br>
[`clojure.core/special-symbol?` @ crossclj](http://crossclj.info/fun/clojure.core/special-symbol%3F.html)<br>
[`cljs.core/special-symbol?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/special-symbol%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/special-symbolQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "special-symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-1803"]],
 :type "function",
 :full-name-encode "cljs.core/special-symbolQMARK",
 :source {:code "(defn ^boolean special-symbol? [x]\n  (contains?\n    '#{if def fn* do let* loop* letfn* throw try\n       recur new set! ns deftype* defrecord* . js* & quote}\n    x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9607 9611]},
 :full-name "cljs.core/special-symbol?",
 :clj-symbol "clojure.core/special-symbol?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/special-symbol?"]))
```

-->
