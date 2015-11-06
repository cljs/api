## cljs.core/pop



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pop)
</td>
</tr>
</table>


 <samp>
(__pop__ coll)<br>
</samp>

---

For a list, returns a new list without the first item.

For a vector, returns a new vector without the last item.



---

###### Examples:

With vectors:

```clj
(pop [1 2 3])
;;=> [1 2]

(pop [1 2])
;;=> [1]

(pop [1])
;;=> []

(pop [])
;; Error: Can't pop empty vector
```



---
###### Examples:

With lists:

```clj
(pop '(1 2 3))
;;=> (2 3)

(pop '(1 2))
;;=> (2)

(pop '(1))
;;=> ()

(pop '())
;; Error: Can't pop empty list
```



---

###### See Also:

[`cljs.core/peek`](../cljs.core/peek.md)<br>
[`cljs.core/rest`](../cljs.core/rest.md)<br>
[`cljs.core/conj`](../cljs.core/conj.md)<br>

---


Source docstring:

```
For a list or queue, returns a new list/queue without the first
item, for a vector, returns a new vector without the last item.
Note - not the same as next/butlast.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L1721-L1727):

```clj
(defn pop
  [coll]
  (when-not (nil? coll)
    (-pop coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:1721-1727](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L1721-L1727)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/pop` @ clojuredocs](http://clojuredocs.org/clojure.core/pop)<br>
[`clojure.core/pop` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/pop/)<br>
[`clojure.core/pop` @ crossclj](http://crossclj.info/fun/clojure.core/pop.html)<br>
[`cljs.core/pop` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/pop.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/pop.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "For a list, returns a new list without the first item.\n\nFor a vector, returns a new vector without the last item.",
 :ns "cljs.core",
 :name "pop",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/peek" "cljs.core/rest" "cljs.core/conj"],
 :full-name-encode "cljs.core/pop",
 :source {:code "(defn pop\n  [coll]\n  (when-not (nil? coll)\n    (-pop coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [1721 1727]},
 :examples [{:id "6bd9f7",
             :content "With vectors:\n\n```clj\n(pop [1 2 3])\n;;=> [1 2]\n\n(pop [1 2])\n;;=> [1]\n\n(pop [1])\n;;=> []\n\n(pop [])\n;; Error: Can't pop empty vector\n```"}
            {:id "81221f",
             :content "With lists:\n\n```clj\n(pop '(1 2 3))\n;;=> (2 3)\n\n(pop '(1 2))\n;;=> (2)\n\n(pop '(1))\n;;=> ()\n\n(pop '())\n;; Error: Can't pop empty list\n```"}],
 :full-name "cljs.core/pop",
 :clj-symbol "clojure.core/pop",
 :docstring "For a list or queue, returns a new list/queue without the first\nitem, for a vector, returns a new vector without the last item.\nNote - not the same as next/butlast."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pop"]))
```

-->
