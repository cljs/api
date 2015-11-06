## cljs.core/some-fn



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/some-fn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/some-fn)
</td>
</tr>
</table>


 <samp>
(__some-fn__ p)<br>
</samp>
 <samp>
(__some-fn__ p1 p2)<br>
</samp>
 <samp>
(__some-fn__ p1 p2 p3)<br>
</samp>
 <samp>
(__some-fn__ p1 p2 p3 & ps)<br>
</samp>

---

Takes a set of predicate functions and returns a function `f` that returns the
first logical true value returned by one of its composing predicates against any
of its arguments, else it returns logical false.

Note that `f` is short-circuiting in that it will stop execution on the first
argument that triggers a logical true result against the original predicates.



---


###### See Also:

[`cljs.core/every-pred`](../cljs.core/every-pred.md)<br>
[`cljs.core/some`](../cljs.core/some.md)<br>
[`cljs.core/or`](../cljs.core/or.md)<br>

---


Source docstring:

```
Takes a set of predicates and returns a function f that returns the first logical true value
returned by one of its composing predicates against any of its arguments, else it returns
logical false. Note that f is short-circuiting in that it will stop execution on the first
argument that triggers a logical true result against the original predicates.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L3697-L3734):

```clj
(defn some-fn
  ([p]
     (fn sp1
       ([] nil)
       ([x] (p x))
       ([x y] (or (p x) (p y)))
       ([x y z] (or (p x) (p y) (p z)))
       ([x y z & args] (or (sp1 x y z)
                           (some p args)))))
  ([p1 p2]
     (fn sp2
       ([] nil)
       ([x] (or (p1 x) (p2 x)))
       ([x y] (or (p1 x) (p1 y) (p2 x) (p2 y)))
       ([x y z] (or (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z)))
       ([x y z & args] (or (sp2 x y z)
                           (some #(or (p1 %) (p2 %)) args)))))
  ([p1 p2 p3]
     (fn sp3
       ([] nil)
       ([x] (or (p1 x) (p2 x) (p3 x)))
       ([x y] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y)))
       ([x y z] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z)))
       ([x y z & args] (or (sp3 x y z)
                           (some #(or (p1 %) (p2 %) (p3 %)) args)))))
  ([p1 p2 p3 & ps]
     (let [ps (list* p1 p2 p3 ps)]
       (fn spn
         ([] nil)
         ([x] (some #(% x) ps))
         ([x y] (some #(or (% x) (% y)) ps))
         ([x y z] (some #(or (% x) (% y) (% z)) ps))
         ([x y z & args] (or (spn x y z)
                             (some #(some % args) ps)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3697-3734](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L3697-L3734)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/some-fn` @ clojuredocs](http://clojuredocs.org/clojure.core/some-fn)<br>
[`clojure.core/some-fn` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/some-fn/)<br>
[`clojure.core/some-fn` @ crossclj](http://crossclj.info/fun/clojure.core/some-fn.html)<br>
[`cljs.core/some-fn` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/some-fn.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/some-fn.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes a set of predicate functions and returns a function `f` that returns the\nfirst logical true value returned by one of its composing predicates against any\nof its arguments, else it returns logical false.\n\nNote that `f` is short-circuiting in that it will stop execution on the first\nargument that triggers a logical true result against the original predicates.",
 :ns "cljs.core",
 :name "some-fn",
 :signature ["[p]" "[p1 p2]" "[p1 p2 p3]" "[p1 p2 p3 & ps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/every-pred" "cljs.core/some" "cljs.core/or"],
 :full-name-encode "cljs.core/some-fn",
 :source {:code "(defn some-fn\n  ([p]\n     (fn sp1\n       ([] nil)\n       ([x] (p x))\n       ([x y] (or (p x) (p y)))\n       ([x y z] (or (p x) (p y) (p z)))\n       ([x y z & args] (or (sp1 x y z)\n                           (some p args)))))\n  ([p1 p2]\n     (fn sp2\n       ([] nil)\n       ([x] (or (p1 x) (p2 x)))\n       ([x y] (or (p1 x) (p1 y) (p2 x) (p2 y)))\n       ([x y z] (or (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z)))\n       ([x y z & args] (or (sp2 x y z)\n                           (some #(or (p1 %) (p2 %)) args)))))\n  ([p1 p2 p3]\n     (fn sp3\n       ([] nil)\n       ([x] (or (p1 x) (p2 x) (p3 x)))\n       ([x y] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y)))\n       ([x y z] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z)))\n       ([x y z & args] (or (sp3 x y z)\n                           (some #(or (p1 %) (p2 %) (p3 %)) args)))))\n  ([p1 p2 p3 & ps]\n     (let [ps (list* p1 p2 p3 ps)]\n       (fn spn\n         ([] nil)\n         ([x] (some #(% x) ps))\n         ([x y] (some #(or (% x) (% y)) ps))\n         ([x y z] (some #(or (% x) (% y) (% z)) ps))\n         ([x y z & args] (or (spn x y z)\n                             (some #(some % args) ps)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3697 3734]},
 :full-name "cljs.core/some-fn",
 :clj-symbol "clojure.core/some-fn",
 :docstring "Takes a set of predicates and returns a function f that returns the first logical true value\nreturned by one of its composing predicates against any of its arguments, else it returns\nlogical false. Note that f is short-circuiting in that it will stop execution on the first\nargument that triggers a logical true result against the original predicates."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/some-fn"]))
```

-->
