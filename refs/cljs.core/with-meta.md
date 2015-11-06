## cljs.core/with-meta



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-meta)
</td>
</tr>
</table>


 <samp>
(__with-meta__ obj m)<br>
</samp>

---

Returns an object of the same type and value as `obj`, with map `m` as its
metadata.



---

###### Examples:

```clj
(def a ^:foo [1 2 3])
(def b (with-meta a {:bar true}))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:bar true}
```



---

###### See Also:

[`cljs.core/alter-meta!`](../cljs.core/alter-metaBANG.md)<br>
[`cljs.core/vary-meta`](../cljs.core/vary-meta.md)<br>

---


Source docstring:

```
Returns an object of the same type and value as obj, with
map m as its metadata.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L1270-L1277):

```clj
(defn with-meta
  [o meta]
  (if (and (fn? o) (not (satisfies? IWithMeta o)))
    (MetaFn. o meta)
    (when-not (nil? o)
      (-with-meta o meta))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2280
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1270-1277](https://github.com/clojure/clojurescript/blob/r2280/src/cljs/cljs/core.cljs#L1270-L1277)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/with-meta` @ clojuredocs](http://clojuredocs.org/clojure.core/with-meta)<br>
[`clojure.core/with-meta` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/with-meta/)<br>
[`clojure.core/with-meta` @ crossclj](http://crossclj.info/fun/clojure.core/with-meta.html)<br>
[`cljs.core/with-meta` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/with-meta.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/with-meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns an object of the same type and value as `obj`, with map `m` as its\nmetadata.",
 :ns "cljs.core",
 :name "with-meta",
 :signature ["[obj m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/alter-meta!" "cljs.core/vary-meta"],
 :full-name-encode "cljs.core/with-meta",
 :source {:code "(defn with-meta\n  [o meta]\n  (if (and (fn? o) (not (satisfies? IWithMeta o)))\n    (MetaFn. o meta)\n    (when-not (nil? o)\n      (-with-meta o meta))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2280",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1270 1277]},
 :examples [{:id "f189d4",
             :content "```clj\n(def a ^:foo [1 2 3])\n(def b (with-meta a {:bar true}))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:bar true}\n```"}],
 :full-name "cljs.core/with-meta",
 :clj-symbol "clojure.core/with-meta",
 :docstring "Returns an object of the same type and value as obj, with\nmap m as its metadata."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-meta"]))
```

-->
