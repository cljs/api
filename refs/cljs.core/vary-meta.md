## cljs.core/vary-meta



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vary-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vary-meta)
</td>
</tr>
</table>


 <samp>
(__vary-meta__ obj f & args)<br>
</samp>

---

Returns an object of the same type and value as `obj`, with
`(apply f (meta obj) args)` as its metadata.



---

###### Examples:

```clj
(def a ^:foo [1 2 3])
(def b (vary-meta a assoc :bar true))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:foo true, :bar true}
```



---

###### See Also:

[`cljs.core/alter-meta!`](../cljs.core/alter-metaBANG.md)<br>
[`cljs.core/with-meta`](../cljs.core/with-meta.md)<br>

---


Source docstring:

```
Returns an object of the same type and value as obj, with
(apply f (meta obj) args) as its metadata.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L3481-L3495):

```clj
(defn vary-meta
  ([obj f]
   (with-meta obj (f (meta obj))))
  ([obj f a]
   (with-meta obj (f (meta obj) a)))
  ([obj f a b]
   (with-meta obj (f (meta obj) a b)))
  ([obj f a b c]
   (with-meta obj (f (meta obj) a b c)))
  ([obj f a b c d]
   (with-meta obj (f (meta obj) a b c d)))
  ([obj f a b c d & args]
   (with-meta obj (apply f (meta obj) a b c d args))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3481-3495](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L3481-L3495)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/vary-meta` @ clojuredocs](http://clojuredocs.org/clojure.core/vary-meta)<br>
[`clojure.core/vary-meta` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vary-meta/)<br>
[`clojure.core/vary-meta` @ crossclj](http://crossclj.info/fun/clojure.core/vary-meta.html)<br>
[`cljs.core/vary-meta` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vary-meta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vary-meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns an object of the same type and value as `obj`, with\n`(apply f (meta obj) args)` as its metadata.",
 :ns "cljs.core",
 :name "vary-meta",
 :signature ["[obj f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/alter-meta!" "cljs.core/with-meta"],
 :full-name-encode "cljs.core/vary-meta",
 :source {:code "(defn vary-meta\n  ([obj f]\n   (with-meta obj (f (meta obj))))\n  ([obj f a]\n   (with-meta obj (f (meta obj) a)))\n  ([obj f a b]\n   (with-meta obj (f (meta obj) a b)))\n  ([obj f a b c]\n   (with-meta obj (f (meta obj) a b c)))\n  ([obj f a b c d]\n   (with-meta obj (f (meta obj) a b c d)))\n  ([obj f a b c d & args]\n   (with-meta obj (apply f (meta obj) a b c d args))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3481 3495]},
 :examples [{:id "8cca62",
             :content "```clj\n(def a ^:foo [1 2 3])\n(def b (vary-meta a assoc :bar true))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:foo true, :bar true}\n```"}],
 :full-name "cljs.core/vary-meta",
 :clj-symbol "clojure.core/vary-meta",
 :docstring "Returns an object of the same type and value as obj, with\n(apply f (meta obj) args) as its metadata."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vary-meta"]))
```

-->
