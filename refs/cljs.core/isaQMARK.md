## cljs.core/isa?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/isa?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/isa?)
</td>
</tr>
</table>


 <samp>
(__isa?__ child parent)<br>
</samp>
 <samp>
(__isa?__ h child parent)<br>
</samp>

---



###### See Also:

[`cljs.core/ancestors`](../cljs.core/ancestors.md)<br>
[`cljs.core/descendants`](../cljs.core/descendants.md)<br>
[`cljs.core/make-hierarchy`](../cljs.core/make-hierarchy.md)<br>
[`cljs.core/derive`](../cljs.core/derive.md)<br>

---


Source docstring:

```
Returns true if (= child parent), or child is directly or indirectly derived from
parent, either via a JavaScript type inheritance relationship or a
relationship established via derive. h must be a hierarchy obtained
from make-hierarchy, if not supplied defaults to the global
hierarchy
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L7183-L7201):

```clj
(defn ^boolean isa?
  ([child parent] (isa? @(get-global-hierarchy) child parent))
  ([h child parent]
     (or (= child parent)
         ;; (and (class? parent) (class? child)
         ;;    (. ^Class parent isAssignableFrom child))
         (contains? ((:ancestors h) child) parent)
         ;;(and (class? child) (some #(contains? ((:ancestors h) %) parent) (supers child)))
         (and (vector? parent) (vector? child)
              (== (count parent) (count child))
              (loop [ret true i 0]
                (if (or (not ret) (== i (count parent)))
                  ret
                  (recur (isa? h (child i) (parent i)) (inc i))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1896
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7183-7201](https://github.com/clojure/clojurescript/blob/r1896/src/cljs/cljs/core.cljs#L7183-L7201)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/isa?` @ clojuredocs](http://clojuredocs.org/clojure.core/isa_q)<br>
[`clojure.core/isa?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/isa%3F/)<br>
[`clojure.core/isa?` @ crossclj](http://crossclj.info/fun/clojure.core/isa%3F.html)<br>
[`cljs.core/isa?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/isa%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/isaQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "isa?",
 :signature ["[child parent]" "[h child parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ancestors"
           "cljs.core/descendants"
           "cljs.core/make-hierarchy"
           "cljs.core/derive"],
 :full-name-encode "cljs.core/isaQMARK",
 :source {:code "(defn ^boolean isa?\n  ([child parent] (isa? @(get-global-hierarchy) child parent))\n  ([h child parent]\n     (or (= child parent)\n         ;; (and (class? parent) (class? child)\n         ;;    (. ^Class parent isAssignableFrom child))\n         (contains? ((:ancestors h) child) parent)\n         ;;(and (class? child) (some #(contains? ((:ancestors h) %) parent) (supers child)))\n         (and (vector? parent) (vector? child)\n              (== (count parent) (count child))\n              (loop [ret true i 0]\n                (if (or (not ret) (== i (count parent)))\n                  ret\n                  (recur (isa? h (child i) (parent i)) (inc i))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1896",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7183 7201]},
 :full-name "cljs.core/isa?",
 :clj-symbol "clojure.core/isa?",
 :docstring "Returns true if (= child parent), or child is directly or indirectly derived from\nparent, either via a JavaScript type inheritance relationship or a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/isa?"]))
```

-->
