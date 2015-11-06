## finally



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/finally</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/finally)
</td>
</tr>
</table>


 <samp>
(__finally__ expr\*)<br>
</samp>

---

`finally` should be the last form inside of a `try` expression. It is optional.

`finally` clauses are always evaluated for their side effects whether there was
an error or not, but they are never the return value of a `try` expression.



---


###### See Also:

[`try`](../special/try.md)<br>
[`catch`](../special/catch.md)<br>
[`throw`](../special/throw.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1978/src/clj/cljs/analyzer.clj#L300-L335):

```clj
(defmethod parse 'try
  [op env [_ & body :as form] name]
  (let [catchenv (update-in env [:context] #(if (= :expr %) :return %))
        catch? (every-pred seq? #(= (first %) 'catch))
        finally? (every-pred seq? #(= (first %) 'finally))
        [body tail] (split-with (complement (some-fn catch? finally?)) body)
        [cblocks [fblock]] (split-with catch? tail)
        finally (when (seq fblock)
                  (analyze (assoc env :context :statement) `(do ~@(rest fblock))))
        e (when (seq cblocks) (gensym "e"))
        cblock (when e
                 `(cljs.core/cond
                   ~@(mapcat
                      (fn [[_ type name & cb]]
                        (when name (assert (not (namespace name)) "Can't qualify symbol in catch"))
                        `[(cljs.core/instance? ~type ~e)
                          (cljs.core/let [~name ~e] ~@cb)])
                      cblocks)
                   :else (throw ~e)))
        locals (:locals catchenv)
        locals (if e
                 (assoc locals e
                        {:name e
                         :line (get-line e env)
                         :column (get-col e env)})
                 locals)
        catch (when cblock
                (analyze (assoc catchenv :locals locals) cblock))
        try (analyze (if (or e finally) catchenv env) `(do ~@body))]

    {:env env :op :try :form form
     :try try
     :finally finally
     :name e
     :catch catch
     :children [try catch finally]}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1978
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:300-335](https://github.com/clojure/clojurescript/blob/r1978/src/clj/cljs/analyzer.clj#L300-L335)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/finally` @ clojuredocs](http://clojuredocs.org/clojure.core/finally)<br>
[`clojure.core/finally` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/finally/)<br>
[`clojure.core/finally` @ crossclj](http://crossclj.info/fun/clojure.core/finally.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/finally.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`finally` should be the last form inside of a `try` expression. It is optional.\n\n`finally` clauses are always evaluated for their side effects whether there was\nan error or not, but they are never the return value of a `try` expression.",
 :ns "special",
 :name "finally",
 :signature ["[expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/catch" "special/throw"],
 :full-name-encode "special/finally",
 :source {:code "(defmethod parse 'try\n  [op env [_ & body :as form] name]\n  (let [catchenv (update-in env [:context] #(if (= :expr %) :return %))\n        catch? (every-pred seq? #(= (first %) 'catch))\n        finally? (every-pred seq? #(= (first %) 'finally))\n        [body tail] (split-with (complement (some-fn catch? finally?)) body)\n        [cblocks [fblock]] (split-with catch? tail)\n        finally (when (seq fblock)\n                  (analyze (assoc env :context :statement) `(do ~@(rest fblock))))\n        e (when (seq cblocks) (gensym \"e\"))\n        cblock (when e\n                 `(cljs.core/cond\n                   ~@(mapcat\n                      (fn [[_ type name & cb]]\n                        (when name (assert (not (namespace name)) \"Can't qualify symbol in catch\"))\n                        `[(cljs.core/instance? ~type ~e)\n                          (cljs.core/let [~name ~e] ~@cb)])\n                      cblocks)\n                   :else (throw ~e)))\n        locals (:locals catchenv)\n        locals (if e\n                 (assoc locals e\n                        {:name e\n                         :line (get-line e env)\n                         :column (get-col e env)})\n                 locals)\n        catch (when cblock\n                (analyze (assoc catchenv :locals locals) cblock))\n        try (analyze (if (or e finally) catchenv env) `(do ~@body))]\n\n    {:env env :op :try :form form\n     :try try\n     :finally finally\n     :name e\n     :catch catch\n     :children [try catch finally]}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [300 335]},
 :full-name "special/finally",
 :clj-symbol "clojure.core/finally"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/finally"]))
```

-->
