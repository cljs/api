## cljs.core/for



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/for</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/for)
</td>
</tr>
</table>


 <samp>
(__for__ seq-exprs body-expr)<br>
</samp>

---

List comprehension.

Takes a vector of one or more binding-form/collection-expr pairs, each followed
by zero or more modifiers, and yields a lazy sequence of evaluations of expr.

Collections are iterated in a nested fashion, rightmost fastest, and nested
coll-exprs can refer to bindings created in prior binding-forms. Supported
modifiers are: `:let [binding-form expr ...]`, `:while test`, `:when test`.



---


###### See Also:

[`cljs.core/doseq`](../cljs.core/doseq.md)<br>
[`cljs.core/doall`](../cljs.core/doall.md)<br>
[`recur`](../special/recur.md)<br>

---


Source docstring:

```
List comprehension. Takes a vector of one or more
 binding-form/collection-expr pairs, each followed by zero or more
 modifiers, and yields a lazy sequence of evaluations of expr.
 Collections are iterated in a nested fashion, rightmost fastest,
 and nested coll-exprs can refer to bindings created in prior
 binding-forms.  Supported modifiers are: :let [binding-form expr ...],
 :while test, :when test.

(take 100 (for [x (range 100000000) y (range 1000000) :while (< y x)]  [x y]))
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1933/src/clj/cljs/core.clj#L1018-L1103):

```clj
(defmacro for
  [seq-exprs body-expr]
  (assert-args for
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [to-groups (fn [seq-exprs]
                    (reduce (fn [groups [k v]]
                              (if (core/keyword? k)
                                (conj (pop groups) (conj (peek groups) [k v]))
                                (conj groups [k v])))
                            [] (partition 2 seq-exprs)))
        err (fn [& msg] (throw (ex-info (apply core/str msg) {})))
        emit-bind (fn emit-bind [[[bind expr & mod-pairs]
                                  & [[_ next-expr] :as next-groups]]]
                    (let [giter (gensym "iter__")
                          gxs (gensym "s__")
                          do-mod (fn do-mod [[[k v :as pair] & etc]]
                                   (cond
                                     (= k :let) `(let ~v ~(do-mod etc))
                                     (= k :while) `(when ~v ~(do-mod etc))
                                     (= k :when) `(if ~v
                                                    ~(do-mod etc)
                                                    (recur (rest ~gxs)))
                                     (core/keyword? k) (err "Invalid 'for' keyword " k)
                                     next-groups
                                      `(let [iterys# ~(emit-bind next-groups)
                                             fs# (seq (iterys# ~next-expr))]
                                         (if fs#
                                           (concat fs# (~giter (rest ~gxs)))
                                           (recur (rest ~gxs))))
                                     :else `(cons ~body-expr
                                                  (~giter (rest ~gxs)))))]
                      (if next-groups
                        #_ "not the inner-most loop"
                        `(fn ~giter [~gxs]
                           (lazy-seq
                            (loop [~gxs ~gxs]
                              (when-first [~bind ~gxs]
                                ~(do-mod mod-pairs)))))
                        #_"inner-most loop"
                        (let [gi (gensym "i__")
                              gb (gensym "b__")
                              do-cmod (fn do-cmod [[[k v :as pair] & etc]]
                                        (cond
                                          (= k :let) `(let ~v ~(do-cmod etc))
                                          (= k :while) `(when ~v ~(do-cmod etc))
                                          (= k :when) `(if ~v
                                                         ~(do-cmod etc)
                                                         (recur
                                                           (unchecked-inc ~gi)))
                                          (core/keyword? k)
                                            (err "Invalid 'for' keyword " k)
                                          :else
                                            `(do (chunk-append ~gb ~body-expr)
                                                 (recur (unchecked-inc ~gi)))))]
                          `(fn ~giter [~gxs]
                             (lazy-seq
                               (loop [~gxs ~gxs]
                                 (when-let [~gxs (seq ~gxs)]
                                   (if (chunked-seq? ~gxs)
                                     (let [c# ^not-native (chunk-first ~gxs)
                                           size# (count c#)
                                           ~gb (chunk-buffer size#)]
                                       (if (coercive-boolean
                                            (loop [~gi 0]
                                              (if (< ~gi size#)
                                                (let [~bind (-nth c# ~gi)]
                                                  ~(do-cmod mod-pairs))
                                                true)))
                                         (chunk-cons
                                           (chunk ~gb)
                                           (~giter (chunk-rest ~gxs)))
                                         (chunk-cons (chunk ~gb) nil)))
                                     (let [~bind (first ~gxs)]
                                       ~(do-mod mod-pairs)))))))))))]
    `(let [iter# ~(emit-bind (to-groups seq-exprs))]
       (iter# ~(second seq-exprs)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1933
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1018-1103](https://github.com/clojure/clojurescript/blob/r1933/src/clj/cljs/core.clj#L1018-L1103)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/for` @ clojuredocs](http://clojuredocs.org/clojure.core/for)<br>
[`clojure.core/for` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/for/)<br>
[`clojure.core/for` @ crossclj](http://crossclj.info/fun/clojure.core/for.html)<br>
[`cljs.core/for` @ crossclj](http://crossclj.info/fun/cljs.core/for.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/for.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "List comprehension.\n\nTakes a vector of one or more binding-form/collection-expr pairs, each followed\nby zero or more modifiers, and yields a lazy sequence of evaluations of expr.\n\nCollections are iterated in a nested fashion, rightmost fastest, and nested\ncoll-exprs can refer to bindings created in prior binding-forms. Supported\nmodifiers are: `:let [binding-form expr ...]`, `:while test`, `:when test`.",
 :ns "cljs.core",
 :name "for",
 :signature ["[seq-exprs body-expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/doseq" "cljs.core/doall" "special/recur"],
 :full-name-encode "cljs.core/for",
 :source {:code "(defmacro for\n  [seq-exprs body-expr]\n  (assert-args for\n     (vector? seq-exprs) \"a vector for its binding\"\n     (even? (count seq-exprs)) \"an even number of forms in binding vector\")\n  (let [to-groups (fn [seq-exprs]\n                    (reduce (fn [groups [k v]]\n                              (if (core/keyword? k)\n                                (conj (pop groups) (conj (peek groups) [k v]))\n                                (conj groups [k v])))\n                            [] (partition 2 seq-exprs)))\n        err (fn [& msg] (throw (ex-info (apply core/str msg) {})))\n        emit-bind (fn emit-bind [[[bind expr & mod-pairs]\n                                  & [[_ next-expr] :as next-groups]]]\n                    (let [giter (gensym \"iter__\")\n                          gxs (gensym \"s__\")\n                          do-mod (fn do-mod [[[k v :as pair] & etc]]\n                                   (cond\n                                     (= k :let) `(let ~v ~(do-mod etc))\n                                     (= k :while) `(when ~v ~(do-mod etc))\n                                     (= k :when) `(if ~v\n                                                    ~(do-mod etc)\n                                                    (recur (rest ~gxs)))\n                                     (core/keyword? k) (err \"Invalid 'for' keyword \" k)\n                                     next-groups\n                                      `(let [iterys# ~(emit-bind next-groups)\n                                             fs# (seq (iterys# ~next-expr))]\n                                         (if fs#\n                                           (concat fs# (~giter (rest ~gxs)))\n                                           (recur (rest ~gxs))))\n                                     :else `(cons ~body-expr\n                                                  (~giter (rest ~gxs)))))]\n                      (if next-groups\n                        #_ \"not the inner-most loop\"\n                        `(fn ~giter [~gxs]\n                           (lazy-seq\n                            (loop [~gxs ~gxs]\n                              (when-first [~bind ~gxs]\n                                ~(do-mod mod-pairs)))))\n                        #_\"inner-most loop\"\n                        (let [gi (gensym \"i__\")\n                              gb (gensym \"b__\")\n                              do-cmod (fn do-cmod [[[k v :as pair] & etc]]\n                                        (cond\n                                          (= k :let) `(let ~v ~(do-cmod etc))\n                                          (= k :while) `(when ~v ~(do-cmod etc))\n                                          (= k :when) `(if ~v\n                                                         ~(do-cmod etc)\n                                                         (recur\n                                                           (unchecked-inc ~gi)))\n                                          (core/keyword? k)\n                                            (err \"Invalid 'for' keyword \" k)\n                                          :else\n                                            `(do (chunk-append ~gb ~body-expr)\n                                                 (recur (unchecked-inc ~gi)))))]\n                          `(fn ~giter [~gxs]\n                             (lazy-seq\n                               (loop [~gxs ~gxs]\n                                 (when-let [~gxs (seq ~gxs)]\n                                   (if (chunked-seq? ~gxs)\n                                     (let [c# ^not-native (chunk-first ~gxs)\n                                           size# (count c#)\n                                           ~gb (chunk-buffer size#)]\n                                       (if (coercive-boolean\n                                            (loop [~gi 0]\n                                              (if (< ~gi size#)\n                                                (let [~bind (-nth c# ~gi)]\n                                                  ~(do-cmod mod-pairs))\n                                                true)))\n                                         (chunk-cons\n                                           (chunk ~gb)\n                                           (~giter (chunk-rest ~gxs)))\n                                         (chunk-cons (chunk ~gb) nil)))\n                                     (let [~bind (first ~gxs)]\n                                       ~(do-mod mod-pairs)))))))))))]\n    `(let [iter# ~(emit-bind (to-groups seq-exprs))]\n       (iter# ~(second seq-exprs)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/clj/cljs/core.clj",
          :lines [1018 1103]},
 :full-name "cljs.core/for",
 :clj-symbol "clojure.core/for",
 :docstring "List comprehension. Takes a vector of one or more\n binding-form/collection-expr pairs, each followed by zero or more\n modifiers, and yields a lazy sequence of evaluations of expr.\n Collections are iterated in a nested fashion, rightmost fastest,\n and nested coll-exprs can refer to bindings created in prior\n binding-forms.  Supported modifiers are: :let [binding-form expr ...],\n :while test, :when test.\n\n(take 100 (for [x (range 100000000) y (range 1000000) :while (< y x)]  [x y]))"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/for"]))
```

-->
