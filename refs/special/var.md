## var



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/var</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/var)
</td>
</tr>
</table>


 <samp>
(__var__ symbol)<br>
</samp>

---





Source docstring:

```
The symbol must resolve to a var, and the Var object
itself (not its value) is returned. The reader macro #'x expands to (var x).
```


Parser code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/analyzer.clj#L670-L687):

```clj
(defmethod parse 'var
  [op env [_ sym :as form] _ _]
  (let [var (resolve-var env sym (confirm-var-exists-throw))
        expr-env (assoc env :context :expr)]
    {:env env :op :var-special :form form
     :var (analyze expr-env sym)
     :sym (analyze expr-env `(quote ~(symbol (name (:ns var)) (name (:name var)))))
     :meta (let [ks [:ns :doc :file :line :column]
                 m (merge
                     (assoc (zipmap ks (map #(list 'quote (get var %)) ks))
                       :name `(quote ~(symbol (name (:name var))))
                       :test `(when ~sym (.-cljs$lang$test ~sym))
                       :arglists (map with-meta (:arglists var) (:arglists-meta var)))
                     (let [user-meta (:meta var)
                           uks (keys user-meta)]
                       (zipmap uks
                         (map #(list 'quote (get user-meta %)) uks))))]
             (analyze expr-env m))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:670-687](https://github.com/clojure/clojurescript/blob/r3195/src/clj/cljs/analyzer.clj#L670-L687)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/var` @ clojuredocs](http://clojuredocs.org/clojure.core/var)<br>
[`clojure.core/var` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/var/)<br>
[`clojure.core/var` @ crossclj](http://crossclj.info/fun/clojure.core/var.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/var.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "var",
 :signature ["[symbol]"],
 :history [["+" "0.0-2496"]],
 :type "special form",
 :full-name-encode "special/var",
 :source {:code "(defmethod parse 'var\n  [op env [_ sym :as form] _ _]\n  (let [var (resolve-var env sym (confirm-var-exists-throw))\n        expr-env (assoc env :context :expr)]\n    {:env env :op :var-special :form form\n     :var (analyze expr-env sym)\n     :sym (analyze expr-env `(quote ~(symbol (name (:ns var)) (name (:name var)))))\n     :meta (let [ks [:ns :doc :file :line :column]\n                 m (merge\n                     (assoc (zipmap ks (map #(list 'quote (get var %)) ks))\n                       :name `(quote ~(symbol (name (:name var))))\n                       :test `(when ~sym (.-cljs$lang$test ~sym))\n                       :arglists (map with-meta (:arglists var) (:arglists-meta var)))\n                     (let [user-meta (:meta var)\n                           uks (keys user-meta)]\n                       (zipmap uks\n                         (map #(list 'quote (get user-meta %)) uks))))]\n             (analyze expr-env m))}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [670 687]},
 :full-name "special/var",
 :clj-symbol "clojure.core/var",
 :docstring "The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x expands to (var x)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/var"]))
```

-->
