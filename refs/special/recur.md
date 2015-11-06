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


 <samp>
(__recur__ exprs\*)<br>
</samp>

---





Source docstring:

```
Evaluates the exprs in order, then, in parallel, rebinds
the bindings of the recursion point to the values of the exprs.
Execution then jumps back to the recursion point, a loop or fn method.
```


Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/analyzer.cljc#L1517-L1530):

```clj
(defmethod parse 'recur
  [op env [_ & exprs :as form] _ _]
  (let [context (:context env)
        frame (first *recur-frames*)
        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]
    (when-not frame
      (throw (error env "Can't recur here")))
    (when-not (= (count exprs) (count (:params frame)))
      (throw (error env "recur argument count mismatch")))
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur :form form}
      :frame frame
      :exprs exprs
      :children exprs)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:1517-1530](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/clojure/cljs/analyzer.cljc#L1517-L1530)</ins>
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
 :signature ["[exprs*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special/recur",
 :source {:code "(defmethod parse 'recur\n  [op env [_ & exprs :as form] _ _]\n  (let [context (:context env)\n        frame (first *recur-frames*)\n        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]\n    (when-not frame\n      (throw (error env \"Can't recur here\")))\n    (when-not (= (count exprs) (count (:params frame)))\n      (throw (error env \"recur argument count mismatch\")))\n    (reset! (:flag frame) true)\n    (assoc {:env env :op :recur :form form}\n      :frame frame\n      :exprs exprs\n      :children exprs)))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [1517 1530]},
 :full-name "special/recur",
 :clj-symbol "clojure.core/recur",
 :docstring "Evaluates the exprs in order, then, in parallel, rebinds\nthe bindings of the recursion point to the values of the exprs.\nExecution then jumps back to the recursion point, a loop or fn method."}

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
