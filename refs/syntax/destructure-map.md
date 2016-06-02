## destructure {}



 <table border="1">
<tr>
<td>binding</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/special_forms#toc18)
</td>
</tr>
</table>

<samp>{:keys \[\] :strs \[\] :syms \[\] :or {} :as name}</samp><br>

---


A helpful shorthand for binding names to values inside a map.

The destructure map can be a map from a symbol to a lookup value:

```clj
(let [ {a :foo}   ;; <-- destructure map
       {:foo 1} ]
  a)
;;=> 1
```

The destructure map can bind multiple names:

```clj
(let [ {a :foo, b :bar}   ;; <-- destructure map
       {:foo 1, :bar 2} ]
  (println a b))
;; 1 2
```

Use this convenient alternative if names match the keys:

```clj
(let [ {:keys [foo bar]}   ;; <-- destructure map
       {:foo 1, :bar 2} ]
  (println foo bar))
;; 1 2
```

Different key types are supported using `:keys`, `:strs`, or `:syms`, which
map to the manual destructuring forms below:

- `{:keys [foo]}` -> `{foo :foo }`
- `{:strs [foo]}` -> `{foo "foo"}`
- `{:syms [foo]}` -> `{foo 'foo }`

Use `:as foo` to name the original value:

```clj
(let [ {:keys [foo bar] :as whole}
       {:foo 1, :bar 2} ]
  whole)
;;=> {:foo 1, :bar 2}
```

Use `:or {}` to provide default values if missing:

```clj
(let [ {:keys [foo bar] :or {bar 0} }
       {:foo 1} ]
  (println foo bar))
;; 1 0
```

Use the special destructuring map in place of any local name binding in the
following forms:

- `(let [...])`
- `(fn [...])`
- `(loop [...])`

Destructure maps can be nested, even in place of names in [destructure
vectors][doc:syntax/destructure-vector].

[doc:syntax/destructure-vector]:../syntax/destructure-vector.md

---

###### Examples:

Use in place of function arguments:

```clj
(defn print-point
  [{:keys [x y z]}]
  (println x y z))

(print-point {:x 1, :y 2, :z 3})
;; 1 2 3
```



---
###### Examples:

A non-vector sequence can be destructured as a map:

```clj
(let [{:keys [a b]} '(:a 1 :b 2)]
  (println a b))
;; 1 2
```



---

###### See Also:

[`destructure []`](../syntax/destructure-vector.md)<br>

---




Parser code @ [github]():

```clj
(core/defn destructure [bindings]
  (core/let [bents (partition 2 bindings)
             pb (core/fn pb [bvec b v]
                  (core/let [pvec
                             (core/fn [bvec b val]
                               (core/let [gvec (gensym "vec__")]
                                 (core/loop [ret (core/-> bvec (conj gvec) (conj val))
                                             n 0
                                             bs b
                                             seen-rest? false]
                                   (if (seq bs)
                                     (core/let [firstb (first bs)]
                                       (core/cond
                                         (= firstb '&) (recur (pb ret (second bs) (core/list `nthnext gvec n))
                                                         n
                                                         (nnext bs)
                                                         true)
                                         (= firstb :as) (pb ret (second bs) gvec)
                                         :else (if seen-rest?
                                                 (throw
                                                   #?(:clj (new Exception "Unsupported binding form, only :as can follow & parameter")
                                                      :cljs (new js/Error "Unsupported binding form, only :as can follow & parameter")))
                                                 (recur (pb ret firstb (core/list `nth gvec n nil))
                                                   (core/inc n)
                                                   (next bs)
                                                   seen-rest?))))
                                     ret))))
                             pmap
                             (core/fn [bvec b v]
                               (core/let [gmap (gensym "map__")
                                          defaults (:or b)]
                                 (core/loop [ret (core/-> bvec (conj gmap) (conj v)
                                                   (conj gmap) (conj `(if (implements? ISeq ~gmap) (apply cljs.core/hash-map ~gmap) ~gmap))
                                                   ((core/fn [ret]
                                                      (if (:as b)
                                                        (conj ret (:as b) gmap)
                                                        ret))))
                                             bes (reduce
                                                   (core/fn [bes entry]
                                                     (reduce #(assoc %1 %2 ((val entry) %2))
                                                       (dissoc bes (key entry))
                                                       ((key entry) bes)))
                                                   (dissoc b :as :or)
                                                   {:keys #(if (core/keyword? %) % (keyword (core/str %))),
                                                    :strs core/str, :syms #(core/list `quote %)})]
                                   (if (seq bes)
                                     (core/let [bb (key (first bes))
                                                bk (val (first bes))
                                                has-default (contains? defaults bb)]
                                       (recur (pb ret bb (if has-default
                                                           (core/list 'cljs.core/get gmap bk (defaults bb))
                                                           (core/list 'cljs.core/get gmap bk)))
                                         (next bes)))
                                     ret))))]
                    (core/cond
                      (core/symbol? b) (core/-> bvec (conj (if (namespace b) (symbol (name b)) b)) (conj v))
                      (core/keyword? b) (core/-> bvec (conj (symbol (name b))) (conj v))
                      (vector? b) (pvec bvec b v)
                      (map? b) (pmap bvec b v)
                      :else (throw
                              #?(:clj (new Exception (core/str "Unsupported binding form: " b))
                                 :cljs (new js/Error (core/str "Unsupported binding form: " b)))))))
             process-entry (core/fn [bvec b] (pb bvec (first b) (second b)))]
    (if (every? core/symbol? (map first bents))
      bindings
      (core/if-let [kwbs (seq (filter #(core/keyword? (first %)) bents))]
        (throw
          #?(:clj (new Exception (core/str "Unsupported binding key: " (ffirst kwbs)))
             :cljs (new js/Error (core/str "Unsupported binding key: " (ffirst kwbs)))))
        (reduce process-entry [] bents)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/destructure-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A helpful shorthand for binding names to values inside a map.\n\nThe destructure map can be a map from a symbol to a lookup value:\n\n```clj\n(let [ {a :foo}   ;; <-- destructure map\n       {:foo 1} ]\n  a)\n;;=> 1\n```\n\nThe destructure map can bind multiple names:\n\n```clj\n(let [ {a :foo, b :bar}   ;; <-- destructure map\n       {:foo 1, :bar 2} ]\n  (println a b))\n;; 1 2\n```\n\nUse this convenient alternative if names match the keys:\n\n```clj\n(let [ {:keys [foo bar]}   ;; <-- destructure map\n       {:foo 1, :bar 2} ]\n  (println foo bar))\n;; 1 2\n```\n\nDifferent key types are supported using `:keys`, `:strs`, or `:syms`, which\nmap to the manual destructuring forms below:\n\n- `{:keys [foo]}` -> `{foo :foo }`\n- `{:strs [foo]}` -> `{foo \"foo\"}`\n- `{:syms [foo]}` -> `{foo 'foo }`\n\nUse `:as foo` to name the original value:\n\n```clj\n(let [ {:keys [foo bar] :as whole}\n       {:foo 1, :bar 2} ]\n  whole)\n;;=> {:foo 1, :bar 2}\n```\n\nUse `:or {}` to provide default values if missing:\n\n```clj\n(let [ {:keys [foo bar] :or {bar 0} }\n       {:foo 1} ]\n  (println foo bar))\n;; 1 0\n```\n\nUse the special destructuring map in place of any local name binding in the\nfollowing forms:\n\n- `(let [...])`\n- `(fn [...])`\n- `(loop [...])`\n\nDestructure maps can be nested, even in place of names in [destructure\nvectors][doc:syntax/destructure-vector].",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/special_forms#toc18"},
 :ns "syntax",
 :name "destructure-map",
 :name-encode "destructure-map",
 :history [["+" "0.0-927"]],
 :type "binding",
 :related ["syntax/destructure-vector"],
 :full-name-encode "syntax/destructure-map",
 :source {:code "(core/defn destructure [bindings]\n  (core/let [bents (partition 2 bindings)\n             pb (core/fn pb [bvec b v]\n                  (core/let [pvec\n                             (core/fn [bvec b val]\n                               (core/let [gvec (gensym \"vec__\")]\n                                 (core/loop [ret (core/-> bvec (conj gvec) (conj val))\n                                             n 0\n                                             bs b\n                                             seen-rest? false]\n                                   (if (seq bs)\n                                     (core/let [firstb (first bs)]\n                                       (core/cond\n                                         (= firstb '&) (recur (pb ret (second bs) (core/list `nthnext gvec n))\n                                                         n\n                                                         (nnext bs)\n                                                         true)\n                                         (= firstb :as) (pb ret (second bs) gvec)\n                                         :else (if seen-rest?\n                                                 (throw\n                                                   #?(:clj (new Exception \"Unsupported binding form, only :as can follow & parameter\")\n                                                      :cljs (new js/Error \"Unsupported binding form, only :as can follow & parameter\")))\n                                                 (recur (pb ret firstb (core/list `nth gvec n nil))\n                                                   (core/inc n)\n                                                   (next bs)\n                                                   seen-rest?))))\n                                     ret))))\n                             pmap\n                             (core/fn [bvec b v]\n                               (core/let [gmap (gensym \"map__\")\n                                          defaults (:or b)]\n                                 (core/loop [ret (core/-> bvec (conj gmap) (conj v)\n                                                   (conj gmap) (conj `(if (implements? ISeq ~gmap) (apply cljs.core/hash-map ~gmap) ~gmap))\n                                                   ((core/fn [ret]\n                                                      (if (:as b)\n                                                        (conj ret (:as b) gmap)\n                                                        ret))))\n                                             bes (reduce\n                                                   (core/fn [bes entry]\n                                                     (reduce #(assoc %1 %2 ((val entry) %2))\n                                                       (dissoc bes (key entry))\n                                                       ((key entry) bes)))\n                                                   (dissoc b :as :or)\n                                                   {:keys #(if (core/keyword? %) % (keyword (core/str %))),\n                                                    :strs core/str, :syms #(core/list `quote %)})]\n                                   (if (seq bes)\n                                     (core/let [bb (key (first bes))\n                                                bk (val (first bes))\n                                                has-default (contains? defaults bb)]\n                                       (recur (pb ret bb (if has-default\n                                                           (core/list 'cljs.core/get gmap bk (defaults bb))\n                                                           (core/list 'cljs.core/get gmap bk)))\n                                         (next bes)))\n                                     ret))))]\n                    (core/cond\n                      (core/symbol? b) (core/-> bvec (conj (if (namespace b) (symbol (name b)) b)) (conj v))\n                      (core/keyword? b) (core/-> bvec (conj (symbol (name b))) (conj v))\n                      (vector? b) (pvec bvec b v)\n                      (map? b) (pmap bvec b v)\n                      :else (throw\n                              #?(:clj (new Exception (core/str \"Unsupported binding form: \" b))\n                                 :cljs (new js/Error (core/str \"Unsupported binding form: \" b)))))))\n             process-entry (core/fn [bvec b] (pb bvec (first b) (second b)))]\n    (if (every? core/symbol? (map first bents))\n      bindings\n      (core/if-let [kwbs (seq (filter #(core/keyword? (first %)) bents))]\n        (throw\n          #?(:clj (new Exception (core/str \"Unsupported binding key: \" (ffirst kwbs)))\n             :cljs (new js/Error (core/str \"Unsupported binding key: \" (ffirst kwbs)))))\n        (reduce process-entry [] bents)))))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/core.cljc",
          :lines [610 679],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/core.cljc#L610-L679"},
 :usage ["{:keys [] :strs [] :syms [] :or {} :as name}"],
 :examples [{:id "0d56ee",
             :content "Use in place of function arguments:\n\n```clj\n(defn print-point\n  [{:keys [x y z]}]\n  (println x y z))\n\n(print-point {:x 1, :y 2, :z 3})\n;; 1 2 3\n```"}
            {:id "7a51df",
             :content "A non-vector sequence can be destructured as a map:\n\n```clj\n(let [{:keys [a b]} '(:a 1 :b 2)]\n  (println a b))\n;; 1 2\n```"}],
 :full-name "syntax/destructure-map",
 :display "destructure {}",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/destructure-map.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/destructure-map"]))
```

-->
