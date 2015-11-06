## try\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/analyzer.clj#L279-L311):

```clj
(defmethod parse 'try*
  [op env [_ & body :as form] name]
  (let [body (vec body)
        catchenv (update-in env [:context] #(if (= :expr %) :return %))
        tail (peek body)
        fblock (when (and (seq? tail) (= 'finally (first tail)))
                  (rest tail))
        finally (when fblock
                  (analyze (assoc env :context :statement) `(do ~@fblock)))
        body (if finally (pop body) body)
        tail (peek body)
        cblock (when (and (seq? tail)
                          (= 'catch (first tail)))
                 (rest tail))
        name (first cblock)
        locals (:locals catchenv)
        locals (if name
                 (assoc locals name
                   {:name name
                    :line (get-line name env)
                    :column (get-col name env)})
                 locals)
        catch (when cblock
                (analyze (assoc catchenv :locals locals) `(do ~@(rest cblock))))
        body (if name (pop body) body)
        try (analyze (if (or name finally) catchenv env) `(do ~@body))]
    (when name (assert (not (namespace name)) "Can't qualify symbol in catch"))
    {:env env :op :try* :form form
     :try try
     :finally finally
     :name name
     :catch catch
     :children [try catch finally]}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:279-311](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/analyzer.clj#L279-L311)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/trySTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "try*",
 :type "special form",
 :source {:code "(defmethod parse 'try*\n  [op env [_ & body :as form] name]\n  (let [body (vec body)\n        catchenv (update-in env [:context] #(if (= :expr %) :return %))\n        tail (peek body)\n        fblock (when (and (seq? tail) (= 'finally (first tail)))\n                  (rest tail))\n        finally (when fblock\n                  (analyze (assoc env :context :statement) `(do ~@fblock)))\n        body (if finally (pop body) body)\n        tail (peek body)\n        cblock (when (and (seq? tail)\n                          (= 'catch (first tail)))\n                 (rest tail))\n        name (first cblock)\n        locals (:locals catchenv)\n        locals (if name\n                 (assoc locals name\n                   {:name name\n                    :line (get-line name env)\n                    :column (get-col name env)})\n                 locals)\n        catch (when cblock\n                (analyze (assoc catchenv :locals locals) `(do ~@(rest cblock))))\n        body (if name (pop body) body)\n        try (analyze (if (or name finally) catchenv env) `(do ~@body))]\n    (when name (assert (not (namespace name)) \"Can't qualify symbol in catch\"))\n    {:env env :op :try* :form form\n     :try try\n     :finally finally\n     :name name\n     :catch catch\n     :children [try catch finally]}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [279 311]},
 :full-name "special/try*",
 :full-name-encode "special/trySTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/try*"]))
```

-->
