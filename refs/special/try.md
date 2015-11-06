## try



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1933"><img valign="middle" alt="[+] 0.0-1933" title="Added in 0.0-1933" src="https://img.shields.io/badge/+-0.0--1933-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/try</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/try)
</td>
</tr>
</table>


 <samp>
(__try__ expr\* catch-clause\* finally-clause?)<br>
</samp>

---

The expressions (`expr*`) are evaluated and, if no exceptions occur, the value
of the last is returned.

If an exception occurs and catch clauses (`catch-clause*`) are provided, each is
examined in turn and the first for which the thrown exception is an instance of
the named class is considered a matching catch clause. If there is a matching
catch clause, its expressions are evaluated in a context in which name is bound
to the thrown exception, and the value of the last is the return value of the
function.

If there is no matching catch clause, the exception propagates out of the
function. Before returning, normally or abnormally, any `finally-clause?`
expressions will be evaluated for their side effects.

`try` is one of ClojureScript's [special forms](http://clojure.org/special_forms).



---


###### See Also:

[`catch`](../special/catch.md)<br>
[`finally`](../special/finally.md)<br>
[`throw`](../special/throw.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/analyzer.clj#L598-L657):

```clj
(defmethod parse 'try
  [op env [_ & body :as form] name _]
  (let [catchenv (update-in env [:context] #(if (= :expr %) :return %))
        catch? (every-pred seq? #(= (first %) 'catch))
        default? (every-pred catch? #(= (second %) :default))
        finally? (every-pred seq? #(= (first %) 'finally))

        {:keys [body cblocks dblock fblock]}
        (loop [parser {:state :start :forms body
                       :body [] :cblocks [] :dblock nil :fblock nil}]
          (if (seq? (:forms parser))
            (let [[form & forms*] (:forms parser)
                  parser* (assoc parser :forms forms*)]
              (case (:state parser)
                :start (cond
                         (catch? form) (recur (assoc parser :state :catches))
                         (finally? form) (recur (assoc parser :state :finally))
                         :else (recur (update-in parser* [:body] conj form)))
                :catches (cond
                           (default? form) (recur (assoc parser* :dblock form :state :finally))
                           (catch? form) (recur (update-in parser* [:cblocks] conj form))
                           (finally? form) (recur (assoc parser :state :finally))
                           :else (throw (error env "Invalid try form")))
                :finally (recur (assoc parser* :fblock form :state :done))
                :done (throw (error env "Unexpected form after finally"))))
            parser))

        finally (when (seq fblock)
                  (analyze (assoc env :context :statement) `(do ~@(rest fblock))))
        e (when (or (seq cblocks) dblock) (gensym "e"))
        default (if-let [[_ _ name & cb] dblock]
                  `(cljs.core/let [~name ~e] ~@cb)
                  `(throw ~e))
        cblock (if (seq cblocks)
                 `(cljs.core/cond
                   ~@(mapcat
                      (fn [[_ type name & cb]]
                        (when name (assert (not (namespace name)) "Can't qualify symbol in catch"))
                        `[(cljs.core/instance? ~type ~e)
                          (cljs.core/let [~name ~e] ~@cb)])
                      cblocks)
                   :else ~default)
                 default)
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
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:598-657](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/analyzer.clj#L598-L657)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/try` @ clojuredocs](http://clojuredocs.org/clojure.core/try)<br>
[`clojure.core/try` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/try/)<br>
[`clojure.core/try` @ crossclj](http://crossclj.info/fun/clojure.core/try.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/try.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "The expressions (`expr*`) are evaluated and, if no exceptions occur, the value\nof the last is returned.\n\nIf an exception occurs and catch clauses (`catch-clause*`) are provided, each is\nexamined in turn and the first for which the thrown exception is an instance of\nthe named class is considered a matching catch clause. If there is a matching\ncatch clause, its expressions are evaluated in a context in which name is bound\nto the thrown exception, and the value of the last is the return value of the\nfunction.\n\nIf there is no matching catch clause, the exception propagates out of the\nfunction. Before returning, normally or abnormally, any `finally-clause?`\nexpressions will be evaluated for their side effects.\n\n`try` is one of ClojureScript's [special forms](http://clojure.org/special_forms).",
 :ns "special",
 :name "try",
 :signature ["[expr* catch-clause* finally-clause?]"],
 :history [["+" "0.0-1933"]],
 :type "special form",
 :related ["special/catch" "special/finally" "special/throw"],
 :full-name-encode "special/try",
 :source {:code "(defmethod parse 'try\n  [op env [_ & body :as form] name _]\n  (let [catchenv (update-in env [:context] #(if (= :expr %) :return %))\n        catch? (every-pred seq? #(= (first %) 'catch))\n        default? (every-pred catch? #(= (second %) :default))\n        finally? (every-pred seq? #(= (first %) 'finally))\n\n        {:keys [body cblocks dblock fblock]}\n        (loop [parser {:state :start :forms body\n                       :body [] :cblocks [] :dblock nil :fblock nil}]\n          (if (seq? (:forms parser))\n            (let [[form & forms*] (:forms parser)\n                  parser* (assoc parser :forms forms*)]\n              (case (:state parser)\n                :start (cond\n                         (catch? form) (recur (assoc parser :state :catches))\n                         (finally? form) (recur (assoc parser :state :finally))\n                         :else (recur (update-in parser* [:body] conj form)))\n                :catches (cond\n                           (default? form) (recur (assoc parser* :dblock form :state :finally))\n                           (catch? form) (recur (update-in parser* [:cblocks] conj form))\n                           (finally? form) (recur (assoc parser :state :finally))\n                           :else (throw (error env \"Invalid try form\")))\n                :finally (recur (assoc parser* :fblock form :state :done))\n                :done (throw (error env \"Unexpected form after finally\"))))\n            parser))\n\n        finally (when (seq fblock)\n                  (analyze (assoc env :context :statement) `(do ~@(rest fblock))))\n        e (when (or (seq cblocks) dblock) (gensym \"e\"))\n        default (if-let [[_ _ name & cb] dblock]\n                  `(cljs.core/let [~name ~e] ~@cb)\n                  `(throw ~e))\n        cblock (if (seq cblocks)\n                 `(cljs.core/cond\n                   ~@(mapcat\n                      (fn [[_ type name & cb]]\n                        (when name (assert (not (namespace name)) \"Can't qualify symbol in catch\"))\n                        `[(cljs.core/instance? ~type ~e)\n                          (cljs.core/let [~name ~e] ~@cb)])\n                      cblocks)\n                   :else ~default)\n                 default)\n        locals (:locals catchenv)\n        locals (if e\n                 (assoc locals e\n                        {:name e\n                         :line (get-line e env)\n                         :column (get-col e env)})\n                 locals)\n        catch (when cblock\n                (analyze (assoc catchenv :locals locals) cblock))\n        try (analyze (if (or e finally) catchenv env) `(do ~@body))]\n\n    {:env env :op :try :form form\n     :try try\n     :finally finally\n     :name e\n     :catch catch\n     :children [try catch finally]}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [598 657]},
 :full-name "special/try",
 :clj-symbol "clojure.core/try"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/try"]))
```

-->
