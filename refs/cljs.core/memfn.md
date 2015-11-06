## cljs.core/memfn



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memfn)
</td>
</tr>
</table>


 <samp>
(__memfn__ name & args)<br>
</samp>

---





Source docstring:

```
Expands into code that creates a fn that expects to be passed an
object and any args and calls the named instance method on the
object passing the args. Use when you want to treat a Java method as
a first-class fn. name may be type-hinted with the method receiver's
type in order to avoid reflective calls.
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L3550-L3561):

```clj
(defmacro memfn
  [name & args]
  (let [t (with-meta (gensym "target")
            (meta name))]
    `(fn [~t ~@args]
       (. ~t (~name ~@args)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.6.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3550-3561](https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L3550-L3561)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/memfn` @ clojuredocs](http://clojuredocs.org/clojure.core/memfn)<br>
[`clojure.core/memfn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/memfn/)<br>
[`clojure.core/memfn` @ crossclj](http://crossclj.info/fun/clojure.core/memfn.html)<br>
[`cljs.core/memfn` @ crossclj](http://crossclj.info/fun/cljs.core/memfn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/memfn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "memfn",
 :signature ["[name & args]"],
 :history [["+" "0.0-1443"]],
 :type "macro",
 :full-name-encode "cljs.core/memfn",
 :source {:code "(defmacro memfn\n  [name & args]\n  (let [t (with-meta (gensym \"target\")\n            (meta name))]\n    `(fn [~t ~@args]\n       (. ~t (~name ~@args)))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.6.0",
          :filename "src/clj/clojure/core.clj",
          :lines [3550 3561]},
 :full-name "cljs.core/memfn",
 :clj-symbol "clojure.core/memfn",
 :docstring "Expands into code that creates a fn that expects to be passed an\nobject and any args and calls the named instance method on the\nobject passing the args. Use when you want to treat a Java method as\na first-class fn. name may be type-hinted with the method receiver's\ntype in order to avoid reflective calls."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/memfn"]))
```

-->
