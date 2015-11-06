## cljs.core/doseq



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doseq)
</td>
</tr>
</table>


 <samp>
(__doseq__ seq-exprs & body)<br>
</samp>

---

Repeatedly executes `body` (presumably for side-effects) with bindings and
filtering as provided by `for`. Does not retain the head of the sequence.

Returns nil.



---


###### See Also:

[`cljs.core/doall`](../cljs.core/doall.md)<br>
[`cljs.core/dorun`](../cljs.core/dorun.md)<br>
[`cljs.core/for`](../cljs.core/for.md)<br>
[`cljs.core/dotimes`](../cljs.core/dotimes.md)<br>

---


Source docstring:

```
Repeatedly executes body (presumably for side-effects) with
bindings and filtering as provided by "for".  Does not retain
the head of the sequence. Returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L949-L983):

```clj
(defmacro doseq
  [seq-exprs & body]
  (assert-args doseq
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [step (fn step [recform exprs]
               (if-not exprs
                 [true `(do ~@body)]
                 (let [k (first exprs)
                       v (second exprs)

                       seqsym (when-not (keyword? k) (gensym))
                       recform (if (keyword? k) recform `(recur (next ~seqsym)))
                       steppair (step recform (nnext exprs))
                       needrec (steppair 0)
                       subform (steppair 1)]
                   (cond
                     (= k :let) [needrec `(let ~v ~subform)]
                     (= k :while) [false `(when ~v
                                            ~subform
                                            ~@(when needrec [recform]))]
                     (= k :when) [false `(if ~v
                                           (do
                                             ~subform
                                             ~@(when needrec [recform]))
                                           ~recform)]
                     :else [true `(loop [~seqsym (seq ~v)]
                                    (when ~seqsym
                                      (let [~k (first ~seqsym)]
                                        ~subform
                                        ~@(when needrec [recform]))))]))))]
    (nth (step nil (seq seq-exprs)) 1)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:949-983](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/core.clj#L949-L983)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/doseq` @ clojuredocs](http://clojuredocs.org/clojure.core/doseq)<br>
[`clojure.core/doseq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/doseq/)<br>
[`clojure.core/doseq` @ crossclj](http://crossclj.info/fun/clojure.core/doseq.html)<br>
[`cljs.core/doseq` @ crossclj](http://crossclj.info/fun/cljs.core/doseq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/doseq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Repeatedly executes `body` (presumably for side-effects) with bindings and\nfiltering as provided by `for`. Does not retain the head of the sequence.\n\nReturns nil.",
 :ns "cljs.core",
 :name "doseq",
 :signature ["[seq-exprs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/doall"
           "cljs.core/dorun"
           "cljs.core/for"
           "cljs.core/dotimes"],
 :full-name-encode "cljs.core/doseq",
 :source {:code "(defmacro doseq\n  [seq-exprs & body]\n  (assert-args doseq\n     (vector? seq-exprs) \"a vector for its binding\"\n     (even? (count seq-exprs)) \"an even number of forms in binding vector\")\n  (let [step (fn step [recform exprs]\n               (if-not exprs\n                 [true `(do ~@body)]\n                 (let [k (first exprs)\n                       v (second exprs)\n\n                       seqsym (when-not (keyword? k) (gensym))\n                       recform (if (keyword? k) recform `(recur (next ~seqsym)))\n                       steppair (step recform (nnext exprs))\n                       needrec (steppair 0)\n                       subform (steppair 1)]\n                   (cond\n                     (= k :let) [needrec `(let ~v ~subform)]\n                     (= k :while) [false `(when ~v\n                                            ~subform\n                                            ~@(when needrec [recform]))]\n                     (= k :when) [false `(if ~v\n                                           (do\n                                             ~subform\n                                             ~@(when needrec [recform]))\n                                           ~recform)]\n                     :else [true `(loop [~seqsym (seq ~v)]\n                                    (when ~seqsym\n                                      (let [~k (first ~seqsym)]\n                                        ~subform\n                                        ~@(when needrec [recform]))))]))))]\n    (nth (step nil (seq seq-exprs)) 1)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/core.clj",
          :lines [949 983]},
 :full-name "cljs.core/doseq",
 :clj-symbol "clojure.core/doseq",
 :docstring "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doseq"]))
```

-->
