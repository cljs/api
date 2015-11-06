## cljs.core/alter-meta!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alter-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alter-meta!)
</td>
</tr>
</table>


 <samp>
(__alter-meta!__ data f & args)<br>
</samp>

---

Alter the metadata of `data` to be `(apply f its-current-meta args)`.

Metadata of vars cannot be altered since they are statically determined at compile-time.



---

###### Examples:

Metadata of symbols and collections can be altered:

```clj
(def a ^:foo [1 2 3])
(meta a)
;;=> {:foo true}

(alter-meta! a assoc :bar true)
(meta a)
;;=> {:foo true, :bar true}
```

Metadata of vars cannot be altered:

```clj
(def a [1 2 3])
(meta #'a)
;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}

(alter-meta! #'a assoc :bar true)
(:bar (meta #'a))
;;=> nil
```



---

###### See Also:

[`cljs.core/with-meta`](../cljs.core/with-meta.md)<br>
[`cljs.core/vary-meta`](../cljs.core/vary-meta.md)<br>

---


Source docstring:

```
Atomically sets the metadata for a namespace/var/ref/agent/atom to be:

(apply f its-current-meta args)

f must be free of side-effects
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L7218-L7225):

```clj
(defn alter-meta!
  [iref f & args]
  (set! (.-meta iref) (apply f (.-meta iref) args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7218-7225](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/cljs/core.cljs#L7218-L7225)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/alter-meta!` @ clojuredocs](http://clojuredocs.org/clojure.core/alter-meta!)<br>
[`clojure.core/alter-meta!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/alter-meta%21/)<br>
[`clojure.core/alter-meta!` @ crossclj](http://crossclj.info/fun/clojure.core/alter-meta%21.html)<br>
[`cljs.core/alter-meta!` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/alter-meta%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/alter-metaBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Alter the metadata of `data` to be `(apply f its-current-meta args)`.\n\nMetadata of vars cannot be altered since they are statically determined at compile-time.",
 :ns "cljs.core",
 :name "alter-meta!",
 :signature ["[data f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/with-meta" "cljs.core/vary-meta"],
 :full-name-encode "cljs.core/alter-metaBANG",
 :source {:code "(defn alter-meta!\n  [iref f & args]\n  (set! (.-meta iref) (apply f (.-meta iref) args)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7218 7225]},
 :examples [{:id "8378a0",
             :content "Metadata of symbols and collections can be altered:\n\n```clj\n(def a ^:foo [1 2 3])\n(meta a)\n;;=> {:foo true}\n\n(alter-meta! a assoc :bar true)\n(meta a)\n;;=> {:foo true, :bar true}\n```\n\nMetadata of vars cannot be altered:\n\n```clj\n(def a [1 2 3])\n(meta #'a)\n;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n\n(alter-meta! #'a assoc :bar true)\n(:bar (meta #'a))\n;;=> nil\n```"}],
 :full-name "cljs.core/alter-meta!",
 :clj-symbol "clojure.core/alter-meta!",
 :docstring "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:\n\n(apply f its-current-meta args)\n\nf must be free of side-effects"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/alter-meta!"]))
```

-->
