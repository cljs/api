## clojure.walk/prewalk



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/prewalk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk)
</td>
</tr>
</table>


 <samp>
(__prewalk__ f form)<br>
</samp>

---





Source docstring:

```
Like postwalk, but does pre-order traversal.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/clojure/walk.cljs#L58-L62):

```clj
(defn prewalk
  [f form]
  (walk (partial prewalk f) identity (f form)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:58-62](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/clojure/walk.cljs#L58-L62)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.walk/prewalk` @ clojuredocs](http://clojuredocs.org/clojure.walk/prewalk)<br>
[`clojure.walk/prewalk` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.walk/prewalk/)<br>
[`clojure.walk/prewalk` @ crossclj](http://crossclj.info/fun/clojure.walk/prewalk.html)<br>
[`clojure.walk/prewalk` @ crossclj](http://crossclj.info/fun/clojure.walk.cljs/prewalk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/prewalk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.walk",
 :name "prewalk",
 :signature ["[f form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk/prewalk",
 :source {:code "(defn prewalk\n  [f form]\n  (walk (partial prewalk f) identity (f form)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [58 62]},
 :full-name "clojure.walk/prewalk",
 :clj-symbol "clojure.walk/prewalk",
 :docstring "Like postwalk, but does pre-order traversal."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/prewalk"]))
```

-->
