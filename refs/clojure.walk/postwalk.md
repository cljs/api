## clojure.walk/postwalk



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/postwalk</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/postwalk)
</td>
</tr>
</table>


 <samp>
(__postwalk__ f form)<br>
</samp>

---





Source docstring:

```
Performs a depth-first, post-order traversal of form.  Calls f on
each sub-form, uses f's return value in place of the original.
Recognizes all Clojure data structures. Consumes seqs as with doall.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/clojure/walk.cljs#L50-L56):

```clj
(defn postwalk
  [f form]
  (walk (partial postwalk f) f form))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:50-56](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/clojure/walk.cljs#L50-L56)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.walk/postwalk` @ clojuredocs](http://clojuredocs.org/clojure.walk/postwalk)<br>
[`clojure.walk/postwalk` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.walk/postwalk/)<br>
[`clojure.walk/postwalk` @ crossclj](http://crossclj.info/fun/clojure.walk/postwalk.html)<br>
[`clojure.walk/postwalk` @ crossclj](http://crossclj.info/fun/clojure.walk.cljs/postwalk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.walk/postwalk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.walk",
 :name "postwalk",
 :signature ["[f form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk/postwalk",
 :source {:code "(defn postwalk\n  [f form]\n  (walk (partial postwalk f) f form))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/clojure/walk.cljs",
          :lines [50 56]},
 :full-name "clojure.walk/postwalk",
 :clj-symbol "clojure.walk/postwalk",
 :docstring "Performs a depth-first, post-order traversal of form.  Calls f on\neach sub-form, uses f's return value in place of the original.\nRecognizes all Clojure data structures. Consumes seqs as with doall."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.walk/postwalk"]))
```

-->
