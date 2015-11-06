## cljs.core/remove-watch



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/remove-watch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/remove-watch)
</td>
</tr>
</table>


 <samp>
(__remove-watch__ a key)<br>
</samp>

---

Removes a watch function identified by `key` from atom `a`.  The function must
have originally been set by `add-watch`.



---

###### Examples:

```clj
(def a (atom {}))

(add-watch a :logger
  (fn [_key _atom old-state new-state]
    (println "old:" old-state)
    (println "new:" new-state)))

(swap! a assoc :foo "bar")
;;=> will print the following:
;; old: {}
;; new: {:foo "bar"}

(remove-watch a :logger)

(swap! a assoc :foo 3)
;;=> nothing will be printed...
```



---

###### See Also:

[`cljs.core/add-watch`](../cljs.core/add-watch.md)<br>

---


Source docstring:

```
Alpha - subject to change.

Removes a watch (set by add-watch) from a reference
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L7073-L7078):

```clj
(defn remove-watch
  [iref key]
  (-remove-watch iref key))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2060
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7073-7078](https://github.com/clojure/clojurescript/blob/r2060/src/cljs/cljs/core.cljs#L7073-L7078)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/remove-watch` @ clojuredocs](http://clojuredocs.org/clojure.core/remove-watch)<br>
[`clojure.core/remove-watch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/remove-watch/)<br>
[`clojure.core/remove-watch` @ crossclj](http://crossclj.info/fun/clojure.core/remove-watch.html)<br>
[`cljs.core/remove-watch` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/remove-watch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/remove-watch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Removes a watch function identified by `key` from atom `a`.  The function must\nhave originally been set by `add-watch`.",
 :ns "cljs.core",
 :name "remove-watch",
 :signature ["[a key]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/add-watch"],
 :full-name-encode "cljs.core/remove-watch",
 :source {:code "(defn remove-watch\n  [iref key]\n  (-remove-watch iref key))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2060",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7073 7078]},
 :examples [{:id "70044a",
             :content "```clj\n(def a (atom {}))\n\n(add-watch a :logger\n  (fn [_key _atom old-state new-state]\n    (println \"old:\" old-state)\n    (println \"new:\" new-state)))\n\n(swap! a assoc :foo \"bar\")\n;;=> will print the following:\n;; old: {}\n;; new: {:foo \"bar\"}\n\n(remove-watch a :logger)\n\n(swap! a assoc :foo 3)\n;;=> nothing will be printed...\n```"}],
 :full-name "cljs.core/remove-watch",
 :clj-symbol "clojure.core/remove-watch",
 :docstring "Alpha - subject to change.\n\nRemoves a watch (set by add-watch) from a reference"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/remove-watch"]))
```

-->
