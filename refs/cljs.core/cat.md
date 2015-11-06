## cljs.core/cat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" title="Added in 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cat)
</td>
</tr>
</table>


 <samp>
(__cat__ rf)<br>
</samp>

---





Source docstring:

```
A transducer which concatenates the contents of each input, which must be a
collection, into the reduction.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L9207-L9217):

```clj
(defn cat
  [rf]
  (let [rf1 (preserving-reduced rf)]  
    (fn
      ([] (rf))
      ([result] (rf result))
      ([result input]
         (reduce rf1 result input)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9207-9217](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/core.cljs#L9207-L9217)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/cat` @ clojuredocs](http://clojuredocs.org/clojure.core/cat)<br>
[`clojure.core/cat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/cat/)<br>
[`clojure.core/cat` @ crossclj](http://crossclj.info/fun/clojure.core/cat.html)<br>
[`cljs.core/cat` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/cat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/cat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "cat",
 :signature ["[rf]"],
 :history [["+" "0.0-2341"]],
 :type "function",
 :full-name-encode "cljs.core/cat",
 :source {:code "(defn cat\n  [rf]\n  (let [rf1 (preserving-reduced rf)]  \n    (fn\n      ([] (rf))\n      ([result] (rf result))\n      ([result input]\n         (reduce rf1 result input)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9207 9217]},
 :full-name "cljs.core/cat",
 :clj-symbol "clojure.core/cat",
 :docstring "A transducer which concatenates the contents of each input, which must be a\ncollection, into the reduction."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/cat"]))
```

-->
