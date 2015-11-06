## cljs.core/add-watch



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/add-watch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/add-watch)
</td>
</tr>
</table>


 <samp>
(__add-watch__ a key f)<br>
</samp>

---

Adds a watch function `f` to atom `a` that will execute when the value of `a`
changes.

The watch function takes 4 arguments: a key, the atom, its old state, and its
new state.

`key` should be a keyword and can be used with `remove-watch` to remove the
watch function.



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
```



---

###### See Also:

[`cljs.core/remove-watch`](../cljs.core/remove-watch.md)<br>

---


Source docstring:

```
Alpha - subject to change.

Adds a watch function to an atom reference. The watch fn must be a
fn of 4 args: a key, the reference, its old-state, its
new-state. Whenever the reference's state might have been changed,
any registered watches will have their functions called. The watch
fn will be called synchronously. Note that an atom's state
may have changed again prior to the fn call, so use old/new-state
rather than derefing the reference. Keys must be unique per
reference, and can be used to remove the watch with remove-watch,
but are otherwise considered opaque by the watch mechanism.  Bear in
mind that regardless of the result or action of the watch fns the
atom's value will change.  Example:

    (def a (atom 0))
    (add-watch a :inc (fn [k r o n] (assert (== 0 n))))
    (swap! a inc)
    ;; Assertion Error
    (deref a)
    ;=> 1
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L8966-L8989):

```clj
(defn add-watch
  [iref key f]
  (-add-watch iref key f)
  iref)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8966-8989](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/core.cljs#L8966-L8989)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/add-watch` @ clojuredocs](http://clojuredocs.org/clojure.core/add-watch)<br>
[`clojure.core/add-watch` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/add-watch/)<br>
[`clojure.core/add-watch` @ crossclj](http://crossclj.info/fun/clojure.core/add-watch.html)<br>
[`cljs.core/add-watch` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/add-watch.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/add-watch.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Adds a watch function `f` to atom `a` that will execute when the value of `a`\nchanges.\n\nThe watch function takes 4 arguments: a key, the atom, its old state, and its\nnew state.\n\n`key` should be a keyword and can be used with `remove-watch` to remove the\nwatch function.",
 :ns "cljs.core",
 :name "add-watch",
 :signature ["[a key f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/remove-watch"],
 :full-name-encode "cljs.core/add-watch",
 :source {:code "(defn add-watch\n  [iref key f]\n  (-add-watch iref key f)\n  iref)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8966 8989]},
 :examples [{:id "2f2fe0",
             :content "```clj\n(def a (atom {}))\n\n(add-watch a :logger\n  (fn [_key _atom old-state new-state]\n    (println \"old:\" old-state)\n    (println \"new:\" new-state)))\n\n(swap! a assoc :foo \"bar\")\n;;=> will print the following:\n;; old: {}\n;; new: {:foo \"bar\"}\n```"}],
 :full-name "cljs.core/add-watch",
 :clj-symbol "clojure.core/add-watch",
 :docstring "Alpha - subject to change.\n\nAdds a watch function to an atom reference. The watch fn must be a\nfn of 4 args: a key, the reference, its old-state, its\nnew-state. Whenever the reference's state might have been changed,\nany registered watches will have their functions called. The watch\nfn will be called synchronously. Note that an atom's state\nmay have changed again prior to the fn call, so use old/new-state\nrather than derefing the reference. Keys must be unique per\nreference, and can be used to remove the watch with remove-watch,\nbut are otherwise considered opaque by the watch mechanism.  Bear in\nmind that regardless of the result or action of the watch fns the\natom's value will change.  Example:\n\n    (def a (atom 0))\n    (add-watch a :inc (fn [k r o n] (assert (== 0 n))))\n    (swap! a inc)\n    ;; Assertion Error\n    (deref a)\n    ;=> 1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/add-watch"]))
```

-->
