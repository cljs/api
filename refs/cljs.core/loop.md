## cljs.core/loop



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/loop</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loop)
</td>
</tr>
</table>

<samp>(loop \[& bindings\] & body-exprs)</samp><br>

---

 <samp>
(__loop__ \[& bindings\] & body-exprs)<br>
</samp>

---

Evaluates the `body-exprs` in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs, just like a `let` form.
Acts as a `recur` target, which will allow tail-call optimization.



---

###### Examples:

```clj
(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (+ x 2))))
;; Prints:
;; 0
;; 2
;; 4
;; 6
;; 8
;;
;;=> nil
```



---

###### See Also:

[`recur`](../special/recur.md)<br>

---


Source docstring:

```
Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein. Acts as a recur target.
```


Source code @ [github]():

```clj
(core/defmacro loop
  [bindings & body]
  (assert-args loop
    (vector? bindings) "a vector for its binding"
    (even? (count bindings)) "an even number of forms in binding vector")
  (core/let [db (destructure bindings)]
    (if (= db bindings)
      `(loop* ~bindings ~@body)
      (core/let [vs (take-nth 2 (drop 1 bindings))
                 bs (take-nth 2 bindings)
                 gs (map (core/fn [b] (if (core/symbol? b) b (gensym))) bs)
                 bfs (reduce (core/fn [ret [b v g]]
                               (if (core/symbol? b)
                                 (conj ret g v)
                                 (conj ret g v b g)))
                       [] (map core/vector bs vs gs))]
        `(let ~bfs
           (loop* ~(vec (interleave gs gs))
             (let ~(vec (interleave bs gs))
               ~@body)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/loop` @ clojuredocs](http://clojuredocs.org/clojure.core/loop)<br>
[`clojure.core/loop` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/loop/)<br>
[`clojure.core/loop` @ crossclj](http://crossclj.info/fun/clojure.core/loop.html)<br>
[`cljs.core/loop` @ crossclj](http://crossclj.info/fun/cljs.core/loop.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/loop.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Evaluates the `body-exprs` in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs, just like a `let` form.\nActs as a `recur` target, which will allow tail-call optimization.",
 :ns "cljs.core",
 :name "loop",
 :signature ["[[& bindings] & body-exprs]"],
 :name-encode "loop",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/loop",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/loop"},
 :related ["special/recur"],
 :full-name-encode "cljs.core/loop",
 :source {:code "(core/defmacro loop\n  [bindings & body]\n  (assert-args loop\n    (vector? bindings) \"a vector for its binding\"\n    (even? (count bindings)) \"an even number of forms in binding vector\")\n  (core/let [db (destructure bindings)]\n    (if (= db bindings)\n      `(loop* ~bindings ~@body)\n      (core/let [vs (take-nth 2 (drop 1 bindings))\n                 bs (take-nth 2 bindings)\n                 gs (map (core/fn [b] (if (core/symbol? b) b (gensym))) bs)\n                 bfs (reduce (core/fn [ret [b v g]]\n                               (if (core/symbol? b)\n                                 (conj ret g v)\n                                 (conj ret g v b g)))\n                       [] (map core/vector bs vs gs))]\n        `(let ~bfs\n           (loop* ~(vec (interleave gs gs))\n             (let ~(vec (interleave bs gs))\n               ~@body)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [723 745],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L723-L745"},
 :usage ["(loop [& bindings] & body-exprs)"],
 :examples [{:id "60291e",
             :content "```clj\n(loop [x 0]\n  (when (< x 10)\n    (println x)\n    (recur (+ x 2))))\n;; Prints:\n;; 0\n;; 2\n;; 4\n;; 6\n;; 8\n;;\n;;=> nil\n```"}],
 :full-name "cljs.core/loop",
 :docstring "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein. Acts as a recur target.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/loop.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/loop"]))
```

-->
