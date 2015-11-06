## js\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/analyzer.clj#L1505-L1558):

```clj
(defmethod parse 'js*
  [op env [_ jsform & args :as form] _ _]
  (when-not (string? jsform)
    (throw (error env "Invalid js* form")))
  (if args
    (disallowing-recur
     (let [seg (fn seg [^String s]
                 (let [idx (.indexOf s "~{")]
                   (if (= -1 idx)
                     (list s)
                     (let [end (.indexOf s "}" idx)]
                       (lazy-seq
                         (cons (subs s 0 idx)
                           (seg (subs s (inc end)))))))))
           enve (assoc env :context :expr)
           argexprs (vec (map #(analyze enve %) args))]
       (when (-> form meta :numeric)
         (let [types (map #(infer-tag env %) argexprs)]
           (when-not (every?
                       (fn [t]
                         (or (nil? t)
                             (and (symbol? t) ('#{any number} t))
                             ;; TODO: type inference is not strong enough to detect that
                             ;; when functions like first won't return nil, so variadic
                             ;; numeric functions like cljs.core/< would produce a spurious
                             ;; warning without this - David
                             (and (set? t) (or (contains? t 'number) (contains? t 'any)))))
                       types)
             (warning :invalid-arithmetic env
               {:js-op (-> form meta :js-op)
                :types (into [] types)}))))
       {:env env :op :js :segs (seg jsform) :args argexprs
        :tag (or (-> form meta :tag)
                 (and (-> form meta :numeric) 'number)
                 nil)
        :form form :children argexprs
        :js-op (-> form meta :js-op)
        :numeric (-> form meta :numeric)}))
    (let [interp (fn interp [^String s]
                   (let [idx (.indexOf s "~{")]
                     (if (= -1 idx)
                       (list s)
                       (let [end (.indexOf s "}" idx)
                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]
                         (lazy-seq
                           (cons (subs s 0 idx)
                             (cons inner
                               (interp (subs s (inc end))))))))))]
      {:env env :op :js :form form :code (apply str (interp jsform))
       :tag (or (-> form meta :tag)
                (and (-> form meta :numeric) 'number)
                nil)
       :js-op (-> form meta :js-op)
       :numeric (-> form meta :numeric)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1505-1558](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/analyzer.clj#L1505-L1558)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/jsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "js*",
 :type "special form",
 :source {:code "(defmethod parse 'js*\n  [op env [_ jsform & args :as form] _ _]\n  (when-not (string? jsform)\n    (throw (error env \"Invalid js* form\")))\n  (if args\n    (disallowing-recur\n     (let [seg (fn seg [^String s]\n                 (let [idx (.indexOf s \"~{\")]\n                   (if (= -1 idx)\n                     (list s)\n                     (let [end (.indexOf s \"}\" idx)]\n                       (lazy-seq\n                         (cons (subs s 0 idx)\n                           (seg (subs s (inc end)))))))))\n           enve (assoc env :context :expr)\n           argexprs (vec (map #(analyze enve %) args))]\n       (when (-> form meta :numeric)\n         (let [types (map #(infer-tag env %) argexprs)]\n           (when-not (every?\n                       (fn [t]\n                         (or (nil? t)\n                             (and (symbol? t) ('#{any number} t))\n                             ;; TODO: type inference is not strong enough to detect that\n                             ;; when functions like first won't return nil, so variadic\n                             ;; numeric functions like cljs.core/< would produce a spurious\n                             ;; warning without this - David\n                             (and (set? t) (or (contains? t 'number) (contains? t 'any)))))\n                       types)\n             (warning :invalid-arithmetic env\n               {:js-op (-> form meta :js-op)\n                :types (into [] types)}))))\n       {:env env :op :js :segs (seg jsform) :args argexprs\n        :tag (or (-> form meta :tag)\n                 (and (-> form meta :numeric) 'number)\n                 nil)\n        :form form :children argexprs\n        :js-op (-> form meta :js-op)\n        :numeric (-> form meta :numeric)}))\n    (let [interp (fn interp [^String s]\n                   (let [idx (.indexOf s \"~{\")]\n                     (if (= -1 idx)\n                       (list s)\n                       (let [end (.indexOf s \"}\" idx)\n                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]\n                         (lazy-seq\n                           (cons (subs s 0 idx)\n                             (cons inner\n                               (interp (subs s (inc end))))))))))]\n      {:env env :op :js :form form :code (apply str (interp jsform))\n       :tag (or (-> form meta :tag)\n                (and (-> form meta :numeric) 'number)\n                nil)\n       :js-op (-> form meta :js-op)\n       :numeric (-> form meta :numeric)})))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1505 1558]},
 :full-name "special/js*",
 :full-name-encode "special/jsSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/js*"]))
```

-->
