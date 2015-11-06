## cljs.core/update



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" title="Added in 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/update</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/update)
</td>
</tr>
</table>


 <samp>
(__update__ m k f)<br>
</samp>
 <samp>
(__update__ m k f x)<br>
</samp>
 <samp>
(__update__ m k f x y)<br>
</samp>
 <samp>
(__update__ m k f x y z)<br>
</samp>
 <samp>
(__update__ m k f x y z & more)<br>
</samp>

---





Source docstring:

```
'Updates' a value in an associative structure, where k is a
key and f is a function that will take the old value
and any supplied args and return the new value, and returns a new
structure.  If the key does not exist, nil is passed as the old value.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L4574-L4588):

```clj
(defn update
  ([m k f]
   (assoc m k (f (get m k))))
  ([m k f x]
   (assoc m k (f (get m k) x)))
  ([m k f x y]
   (assoc m k (f (get m k) x y)))
  ([m k f x y z]
   (assoc m k (f (get m k) x y z)))
  ([m k f x y z & more]
   (assoc m k (apply f (get m k) x y z more))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4574-4588](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L4574-L4588)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/update` @ clojuredocs](http://clojuredocs.org/clojure.core/update)<br>
[`clojure.core/update` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/update/)<br>
[`clojure.core/update` @ crossclj](http://crossclj.info/fun/clojure.core/update.html)<br>
[`cljs.core/update` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/update.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/update.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "update",
 :signature ["[m k f]"
             "[m k f x]"
             "[m k f x y]"
             "[m k f x y z]"
             "[m k f x y z & more]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core/update",
 :source {:code "(defn update\n  ([m k f]\n   (assoc m k (f (get m k))))\n  ([m k f x]\n   (assoc m k (f (get m k) x)))\n  ([m k f x y]\n   (assoc m k (f (get m k) x y)))\n  ([m k f x y z]\n   (assoc m k (f (get m k) x y z)))\n  ([m k f x y z & more]\n   (assoc m k (apply f (get m k) x y z more))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4574 4588]},
 :full-name "cljs.core/update",
 :clj-symbol "clojure.core/update",
 :docstring "'Updates' a value in an associative structure, where k is a\nkey and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nstructure.  If the key does not exist, nil is passed as the old value."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/update"]))
```

-->
