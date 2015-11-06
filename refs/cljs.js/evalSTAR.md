## cljs.js/eval\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__eval\*__ bound-vars form opts cb)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L464-L495):

```clj
(defn eval* [bound-vars form opts cb]
  (let [the-ns     (or (:ns opts) 'cljs.user)
        bound-vars (cond-> (merge bound-vars {:*cljs-ns* the-ns})
                     (:source-map opts) (assoc :*sm-data* (sm-data)))]
    (binding [env/*compiler*         (:*compiler* bound-vars)
              *eval-fn*              (:*eval-fn* bound-vars)
              ana/*cljs-ns*          (:*cljs-ns* bound-vars)
              *ns*                   (create-ns (:*cljs-ns* bound-vars))
              r/*data-readers*       (:*data-readers* bound-vars)
              comp/*source-map-data* (:*sm-data* bound-vars)]
      (let [aenv (ana/empty-env)
            aenv (cond-> (assoc aenv :ns (ana/get-namespace ana/*cljs-ns*))
                   (:context opts) (assoc :context (:context opts))
                   (:def-emits-var opts) (assoc :def-emits-var true))
            res  (try
                   {:value (ana/analyze aenv form nil opts)}
                   (catch :default cause
                     (wrap-error
                       (ana/error aenv
                         (str "Could not eval " form) cause))))]
        (if (:error res)
          (cb res)
          (let [ast (:value res)]
            (if (= :ns (:op ast))
              (ns-side-effects true bound-vars aenv ast opts
                (fn [res]
                  (if (:error res)
                    (cb res)
                    (let [src (str "goog.provide(\"" (munge (:name ast)) "\")")]
                      (cb (*eval-fn* {:source src}))))))
              (let [src (with-out-str (comp/emit ast))]
                (cb (*eval-fn* {:source src}))))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:464-495](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L464-L495)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/eval*` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/eval*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/evalSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "eval*",
 :type "function",
 :signature ["[bound-vars form opts cb]"],
 :source {:code "(defn eval* [bound-vars form opts cb]\n  (let [the-ns     (or (:ns opts) 'cljs.user)\n        bound-vars (cond-> (merge bound-vars {:*cljs-ns* the-ns})\n                     (:source-map opts) (assoc :*sm-data* (sm-data)))]\n    (binding [env/*compiler*         (:*compiler* bound-vars)\n              *eval-fn*              (:*eval-fn* bound-vars)\n              ana/*cljs-ns*          (:*cljs-ns* bound-vars)\n              *ns*                   (create-ns (:*cljs-ns* bound-vars))\n              r/*data-readers*       (:*data-readers* bound-vars)\n              comp/*source-map-data* (:*sm-data* bound-vars)]\n      (let [aenv (ana/empty-env)\n            aenv (cond-> (assoc aenv :ns (ana/get-namespace ana/*cljs-ns*))\n                   (:context opts) (assoc :context (:context opts))\n                   (:def-emits-var opts) (assoc :def-emits-var true))\n            res  (try\n                   {:value (ana/analyze aenv form nil opts)}\n                   (catch :default cause\n                     (wrap-error\n                       (ana/error aenv\n                         (str \"Could not eval \" form) cause))))]\n        (if (:error res)\n          (cb res)\n          (let [ast (:value res)]\n            (if (= :ns (:op ast))\n              (ns-side-effects true bound-vars aenv ast opts\n                (fn [res]\n                  (if (:error res)\n                    (cb res)\n                    (let [src (str \"goog.provide(\\\"\" (munge (:name ast)) \"\\\")\")]\n                      (cb (*eval-fn* {:source src}))))))\n              (let [src (with-out-str (comp/emit ast))]\n                (cb (*eval-fn* {:source src}))))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [464 495]},
 :full-name "cljs.js/eval*",
 :full-name-encode "cljs.js/evalSTAR",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/eval*"]))
```

-->
