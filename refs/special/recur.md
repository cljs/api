## recur



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/recur</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/recur)
</td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/analyzer.clj#L512-L523):

```clj
(defmethod parse 'recur
  [op env [_ & exprs :as form] _]
  (let [context (:context env)
        frame (first *recur-frames*)
        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]
    (assert frame "Can't recur here")
    (assert (= (count exprs) (count (:params frame))) "recur argument count mismatch")
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur :form form}
      :frame frame
      :exprs exprs
      :children exprs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:512-523](https://github.com/clojure/clojurescript/blob/r1552/src/clj/cljs/analyzer.clj#L512-L523)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/recur` @ clojuredocs](http://clojuredocs.org/clojure.core/recur)<br>
[`clojure.core/recur` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/recur/)<br>
[`clojure.core/recur` @ crossclj](http://crossclj.info/fun/clojure.core/recur.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/recur.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "recur",
 :type "special form",
 :source {:code "(defmethod parse 'recur\n  [op env [_ & exprs :as form] _]\n  (let [context (:context env)\n        frame (first *recur-frames*)\n        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]\n    (assert frame \"Can't recur here\")\n    (assert (= (count exprs) (count (:params frame))) \"recur argument count mismatch\")\n    (reset! (:flag frame) true)\n    (assoc {:env env :op :recur :form form}\n      :frame frame\n      :exprs exprs\n      :children exprs)))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [512 523]},
 :full-name "special/recur",
 :full-name-encode "special/recur",
 :clj-symbol "clojure.core/recur",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/recur"]))
```

-->
