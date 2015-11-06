## cljs.core/lazy-seq



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/lazy-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/lazy-seq)
</td>
</tr>
</table>


 <samp>
(__lazy-seq__ & body)<br>
</samp>

---

Returns a new lazy sequence.



---


###### See Also:

[`cljs.core/lazy-cat`](../cljs.core/lazy-cat.md)<br>
[`cljs.core/realized?`](../cljs.core/realizedQMARK.md)<br>
[`cljs.core/doall`](../cljs.core/doall.md)<br>
[`cljs.core/iterate`](../cljs.core/iterate.md)<br>

---




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L872-L873):

```clj
(defmacro lazy-seq [& body]
  `(new cljs.core/LazySeq nil false (fn [] ~@body) nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:872-873](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L872-L873)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/lazy-seq` @ clojuredocs](http://clojuredocs.org/clojure.core/lazy-seq)<br>
[`clojure.core/lazy-seq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/lazy-seq/)<br>
[`clojure.core/lazy-seq` @ crossclj](http://crossclj.info/fun/clojure.core/lazy-seq.html)<br>
[`cljs.core/lazy-seq` @ crossclj](http://crossclj.info/fun/cljs.core/lazy-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/lazy-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new lazy sequence.",
 :ns "cljs.core",
 :name "lazy-seq",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/lazy-cat"
           "cljs.core/realized?"
           "cljs.core/doall"
           "cljs.core/iterate"],
 :full-name-encode "cljs.core/lazy-seq",
 :source {:code "(defmacro lazy-seq [& body]\n  `(new cljs.core/LazySeq nil false (fn [] ~@body) nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/clj/cljs/core.clj",
          :lines [872 873]},
 :full-name "cljs.core/lazy-seq",
 :clj-symbol "clojure.core/lazy-seq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/lazy-seq"]))
```

-->
