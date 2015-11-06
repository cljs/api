## cljs.core/defonce



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" title="Added in 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defonce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defonce)
</td>
</tr>
</table>


 <samp>
(__defonce__ x init)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/core.clj#L135-L137):

```clj
(defmacro defonce [x init]
  `(when-not (exists? ~x)
     (def ~x ~init)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:135-137](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/core.clj#L135-L137)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/defonce` @ clojuredocs](http://clojuredocs.org/clojure.core/defonce)<br>
[`clojure.core/defonce` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/defonce/)<br>
[`clojure.core/defonce` @ crossclj](http://crossclj.info/fun/clojure.core/defonce.html)<br>
[`cljs.core/defonce` @ crossclj](http://crossclj.info/fun/cljs.core/defonce.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/defonce.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "defonce",
 :signature ["[x init]"],
 :history [["+" "0.0-2156"]],
 :type "macro",
 :full-name-encode "cljs.core/defonce",
 :source {:code "(defmacro defonce [x init]\n  `(when-not (exists? ~x)\n     (def ~x ~init)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/core.clj",
          :lines [135 137]},
 :full-name "cljs.core/defonce",
 :clj-symbol "clojure.core/defonce"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defonce"]))
```

-->
