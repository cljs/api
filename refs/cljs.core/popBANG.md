## cljs.core/pop!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pop!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop!)
</td>
</tr>
</table>


 <samp>
(__pop!__ tcoll)<br>
</samp>

---





Source docstring:

```
Removes the last item from a transient vector. If
the collection is empty, throws an exception. Returns coll
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L2776-L2780):

```clj
(defn pop!
  [tcoll]
  (-pop! tcoll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2776-2780](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L2776-L2780)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/pop!` @ clojuredocs](http://clojuredocs.org/clojure.core/pop!)<br>
[`clojure.core/pop!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/pop%21/)<br>
[`clojure.core/pop!` @ crossclj](http://crossclj.info/fun/clojure.core/pop%21.html)<br>
[`cljs.core/pop!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pop%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/popBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "pop!",
 :signature ["[tcoll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core/popBANG",
 :source {:code "(defn pop!\n  [tcoll]\n  (-pop! tcoll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2776 2780]},
 :full-name "cljs.core/pop!",
 :clj-symbol "clojure.core/pop!",
 :docstring "Removes the last item from a transient vector. If\nthe collection is empty, throws an exception. Returns coll"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pop!"]))
```

-->
