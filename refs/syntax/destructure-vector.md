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




Parser code @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3896-L3951):

```clj
(defn destructure [bindings]
  (let [bents (partition 2 bindings)
        pb (fn pb [bvec b v]
               (let [pvec
                     (fn [bvec b val]
                       (let [gvec (gensym "vec__")]
                         (loop [ret (-> bvec (conj gvec) (conj val))
                                n 0
                                bs b
                                seen-rest? false]
                           (if (seq bs)
                             (let [firstb (first bs)]
                               (cond
                                (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))
                                                     n
                                                     (nnext bs)
                                                     true)
                                (= firstb :as) (pb ret (second bs) gvec)
                                :else (if seen-rest?
                                        (throw (new Exception "Unsupported binding form, only :as can follow & parameter"))
                                        (recur (pb ret firstb  (list `nth gvec n nil))
                                               (inc n)
                                               (next bs)
                                               seen-rest?))))
                             ret))))
                     pmap
                     (fn [bvec b v]
                       (let [gmap (or (:as b) (gensym "map__"))
                             defaults (:or b)]
                         (loop [ret (-> bvec (conj gmap) (conj v)
                                        (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap)))
                                bes (reduce1
                                     (fn [bes entry]
                                       (reduce1 #(assoc %1 %2 ((val entry) %2))
                                               (dissoc bes (key entry))
                                               ((key entry) bes)))
                                     (dissoc b :as :or)
                                     {:keys #(keyword (str %)), :strs str, :syms #(list `quote %)})]
                           (if (seq bes)
                             (let [bb (key (first bes))
                                   bk (val (first bes))
                                   has-default (contains? defaults bb)]
                               (recur (pb ret bb (if has-default
                                                   (list `get gmap bk (defaults bb))
                                                   (list `get gmap bk)))
                                      (next bes)))
                             ret))))]
                 (cond
                  (symbol? b) (-> bvec (conj b) (conj v))
                  (vector? b) (pvec bvec b v)
                  (map? b) (pmap bvec b v)
                  :else (throw (new Exception (str "Unsupported binding form: " b))))))
        process-entry (fn [bvec b] (pb bvec (first b) (second b)))]
    (if (every? symbol? (map first bents))
      bindings
      (reduce1 process-entry [] bents))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3896-3951](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3896-L3951)</ins>
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
 :source {:code "(defn destructure [bindings]\n  (let [bents (partition 2 bindings)\n        pb (fn pb [bvec b v]\n               (let [pvec\n                     (fn [bvec b val]\n                       (let [gvec (gensym \"vec__\")]\n                         (loop [ret (-> bvec (conj gvec) (conj val))\n                                n 0\n                                bs b\n                                seen-rest? false]\n                           (if (seq bs)\n                             (let [firstb (first bs)]\n                               (cond\n                                (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))\n                                                     n\n                                                     (nnext bs)\n                                                     true)\n                                (= firstb :as) (pb ret (second bs) gvec)\n                                :else (if seen-rest?\n                                        (throw (new Exception \"Unsupported binding form, only :as can follow & parameter\"))\n                                        (recur (pb ret firstb  (list `nth gvec n nil))\n                                               (inc n)\n                                               (next bs)\n                                               seen-rest?))))\n                             ret))))\n                     pmap\n                     (fn [bvec b v]\n                       (let [gmap (or (:as b) (gensym \"map__\"))\n                             defaults (:or b)]\n                         (loop [ret (-> bvec (conj gmap) (conj v)\n                                        (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap)))\n                                bes (reduce1\n                                     (fn [bes entry]\n                                       (reduce1 #(assoc %1 %2 ((val entry) %2))\n                                               (dissoc bes (key entry))\n                                               ((key entry) bes)))\n                                     (dissoc b :as :or)\n                                     {:keys #(keyword (str %)), :strs str, :syms #(list `quote %)})]\n                           (if (seq bes)\n                             (let [bb (key (first bes))\n                                   bk (val (first bes))\n                                   has-default (contains? defaults bb)]\n                               (recur (pb ret bb (if has-default\n                                                   (list `get gmap bk (defaults bb))\n                                                   (list `get gmap bk)))\n                                      (next bes)))\n                             ret))))]\n                 (cond\n                  (symbol? b) (-> bvec (conj b) (conj v))\n                  (vector? b) (pvec bvec b v)\n                  (map? b) (pmap bvec b v)\n                  :else (throw (new Exception (str \"Unsupported binding form: \" b))))))\n        process-entry (fn [bvec b] (pb bvec (first b) (second b)))]\n    (if (every? symbol? (map first bents))\n      bindings\n      (reduce1 process-entry [] bents))))",
          :title "Parser code",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [3896 3951]},
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
