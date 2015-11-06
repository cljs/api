## cljs.core/reset-meta!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reset-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reset-meta!)
</td>
</tr>
</table>


 <samp>
(__reset-meta!__ iref m)<br>
</samp>

---





Source docstring:

```
Atomically resets the metadata for an atom
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L8460-L8463):

```clj
(defn reset-meta!
  [iref m]
  (set! (.-meta iref) m))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8460-8463](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L8460-L8463)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/reset-meta!` @ clojuredocs](http://clojuredocs.org/clojure.core/reset-meta!)<br>
[`clojure.core/reset-meta!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/reset-meta%21/)<br>
[`clojure.core/reset-meta!` @ crossclj](http://crossclj.info/fun/clojure.core/reset-meta%21.html)<br>
[`cljs.core/reset-meta!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/reset-meta%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/reset-metaBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "reset-meta!",
 :signature ["[iref m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/reset-metaBANG",
 :source {:code "(defn reset-meta!\n  [iref m]\n  (set! (.-meta iref) m))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8460 8463]},
 :full-name "cljs.core/reset-meta!",
 :clj-symbol "clojure.core/reset-meta!",
 :docstring "Atomically resets the metadata for an atom"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reset-meta!"]))
```

-->
