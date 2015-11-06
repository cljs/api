## destructure \[\]



 <table border="1">
<tr>
<td>binding</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/special_forms#toc18)
</td>
</tr>
</table>

<samp>\[arg1 arg2 & args :as name\]</samp><br>

---


A helpful shorthand for destructuring a sequence into multiple names.

```clj
(let [ [a b c]   ;; <-- destructure vector
       [1 2 3] ]
  (println a b c))
;; 1 2 3
```

Use `& foo` to name the rest of the items in the sequence:

```clj
(let [ [a b c & d]
       [1 2 3 4 5] ]
  (println a b c d))
;; 1 2 3 (4 5)
```

Use `:as foo` to name the original value:

```clj
(let [ [a b c & d :as whole]
       [1 2 3 4 5] ]
  whole)
;;=> [1 2 3 4 5]
```

Use the special destructure vector in place of any local name binding in the
following forms:

- `(let [...])`
- `(fn [...])`
- `(loop [...])`

Destructure vectors can be nested, even in place of names in [destructure
maps][doc:syntax/destructure-map].

[doc:syntax/destructure-map]:../syntax/destructure-map.md

---

###### Examples:

Use destructure vectors in function parameters:

```clj
(defn foo [[a b] c]
  (+ a b c))

(foo [1 2] 3)
;;=> 6
```



---
###### Examples:

Destructure vectors can be nested:

```clj
(let [ [[a b] c]
       [[1 2] 3] ]
  (println a b c))
;; 1 2 3
```



---

###### See Also:

[`destructure {}`](../syntax/destructure-map.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/core.clj#L68-L127):

```clj
(defn destructure [bindings]
  (core/let [bents (partition 2 bindings)
         pb (fn pb [bvec b v]
              (core/let [pvec
                     (fn [bvec b val]
                       (core/let [gvec (gensym "vec__")]
                         (core/loop [ret (-> bvec (conj gvec) (conj val))
                                     n 0
                                     bs b
                                     seen-rest? false]
                           (if (seq bs)
                             (core/let [firstb (first bs)]
                               (cond
                                 (= firstb '&) (recur (pb ret (second bs) (core/list `nthnext gvec n))
                                                      n
                                                      (nnext bs)
                                                      true)
                                 (= firstb :as) (pb ret (second bs) gvec)
                                 :else (if seen-rest?
                                         (throw (new Exception "Unsupported binding form, only :as can follow & parameter"))
                                         (recur (pb ret firstb (core/list `nth gvec n nil))
                                                (core/inc n)
                                                (next bs)
                                                seen-rest?))))
                             ret))))
                     pmap
                     (fn [bvec b v]
                       (core/let [gmap (gensym "map__")
                                  defaults (:or b)]
                         (core/loop [ret (-> bvec (conj gmap) (conj v)
                                             (conj gmap) (conj `(if (seq? ~gmap) (apply core/hash-map ~gmap) ~gmap))
                                             ((fn [ret]
                                                (if (:as b)
                                                  (conj ret (:as b) gmap)
                                                  ret))))
                                     bes (reduce
                                          (fn [bes entry]
                                            (reduce #(assoc %1 %2 ((val entry) %2))
                                                    (dissoc bes (key entry))
                                                    ((key entry) bes)))
                                          (dissoc b :as :or)
                                          {:keys #(keyword (core/str %)), :strs core/str, :syms #(core/list `quote %)})]
                           (if (seq bes)
                             (core/let [bb (key (first bes))
                                        bk (val (first bes))
                                        has-default (contains? defaults bb)]
                               (recur (pb ret bb (if has-default
                                                   (core/list `get gmap bk (defaults bb))
                                                   (core/list `get gmap bk)))
                                      (next bes)))
                             ret))))]
                    (cond
                      (core/symbol? b) (-> bvec (conj b) (conj v))
                      (vector? b) (pvec bvec b v)
                      (map? b) (pmap bvec b v)
                      :else (throw (new Exception (core/str "Unsupported binding form: " b))))))
         process-entry (fn [bvec b] (pb bvec (first b) (second b)))]
        (if (every? core/symbol? (map first bents))
          bindings
          (reduce process-entry [] bents))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:68-127](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/core.clj#L68-L127)</ins>
</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/destructure-vector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A helpful shorthand for destructuring a sequence into multiple names.\n\n```clj\n(let [ [a b c]   ;; <-- destructure vector\n       [1 2 3] ]\n  (println a b c))\n;; 1 2 3\n```\n\nUse `& foo` to name the rest of the items in the sequence:\n\n```clj\n(let [ [a b c & d]\n       [1 2 3 4 5] ]\n  (println a b c d))\n;; 1 2 3 (4 5)\n```\n\nUse `:as foo` to name the original value:\n\n```clj\n(let [ [a b c & d :as whole]\n       [1 2 3 4 5] ]\n  whole)\n;;=> [1 2 3 4 5]\n```\n\nUse the special destructure vector in place of any local name binding in the\nfollowing forms:\n\n- `(let [...])`\n- `(fn [...])`\n- `(loop [...])`\n\nDestructure vectors can be nested, even in place of names in [destructure\nmaps][doc:syntax/destructure-map].",
 :ns "syntax",
 :name "destructure-vector",
 :history [["+" "0.0-927"]],
 :type "binding",
 :related ["syntax/destructure-map"],
 :full-name-encode "syntax/destructure-vector",
 :source {:code "(defn destructure [bindings]\n  (core/let [bents (partition 2 bindings)\n         pb (fn pb [bvec b v]\n              (core/let [pvec\n                     (fn [bvec b val]\n                       (core/let [gvec (gensym \"vec__\")]\n                         (core/loop [ret (-> bvec (conj gvec) (conj val))\n                                     n 0\n                                     bs b\n                                     seen-rest? false]\n                           (if (seq bs)\n                             (core/let [firstb (first bs)]\n                               (cond\n                                 (= firstb '&) (recur (pb ret (second bs) (core/list `nthnext gvec n))\n                                                      n\n                                                      (nnext bs)\n                                                      true)\n                                 (= firstb :as) (pb ret (second bs) gvec)\n                                 :else (if seen-rest?\n                                         (throw (new Exception \"Unsupported binding form, only :as can follow & parameter\"))\n                                         (recur (pb ret firstb (core/list `nth gvec n nil))\n                                                (core/inc n)\n                                                (next bs)\n                                                seen-rest?))))\n                             ret))))\n                     pmap\n                     (fn [bvec b v]\n                       (core/let [gmap (gensym \"map__\")\n                                  defaults (:or b)]\n                         (core/loop [ret (-> bvec (conj gmap) (conj v)\n                                             (conj gmap) (conj `(if (seq? ~gmap) (apply core/hash-map ~gmap) ~gmap))\n                                             ((fn [ret]\n                                                (if (:as b)\n                                                  (conj ret (:as b) gmap)\n                                                  ret))))\n                                     bes (reduce\n                                          (fn [bes entry]\n                                            (reduce #(assoc %1 %2 ((val entry) %2))\n                                                    (dissoc bes (key entry))\n                                                    ((key entry) bes)))\n                                          (dissoc b :as :or)\n                                          {:keys #(keyword (core/str %)), :strs core/str, :syms #(core/list `quote %)})]\n                           (if (seq bes)\n                             (core/let [bb (key (first bes))\n                                        bk (val (first bes))\n                                        has-default (contains? defaults bb)]\n                               (recur (pb ret bb (if has-default\n                                                   (core/list `get gmap bk (defaults bb))\n                                                   (core/list `get gmap bk)))\n                                      (next bes)))\n                             ret))))]\n                    (cond\n                      (core/symbol? b) (-> bvec (conj b) (conj v))\n                      (vector? b) (pvec bvec b v)\n                      (map? b) (pmap bvec b v)\n                      :else (throw (new Exception (core/str \"Unsupported binding form: \" b))))))\n         process-entry (fn [bvec b] (pb bvec (first b) (second b)))]\n        (if (every? core/symbol? (map first bents))\n          bindings\n          (reduce process-entry [] bents))))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/clj/cljs/core.clj",
          :lines [68 127]},
 :usage ["[arg1 arg2 & args :as name]"],
 :examples [{:id "acab87",
             :content "Use destructure vectors in function parameters:\n\n```clj\n(defn foo [[a b] c]\n  (+ a b c))\n\n(foo [1 2] 3)\n;;=> 6\n```"}
            {:id "fa4e05",
             :content "Destructure vectors can be nested:\n\n```clj\n(let [ [[a b] c]\n       [[1 2] 3] ]\n  (println a b c))\n;; 1 2 3\n```"}],
 :full-name "syntax/destructure-vector",
 :display "destructure []",
 :clj-doc "http://clojure.org/special_forms#toc18"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/destructure-vector"]))
```

-->
