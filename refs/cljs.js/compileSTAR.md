## ~~cljs.js/compile\*~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__compile\*__ bound-vars source name opts cb)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L532-L578):

```clj
(defn compile* [bound-vars source name opts cb]
  (let [rdr        (rt/indexing-push-back-reader source 1 name)
        eof        (js-obj)
        aenv       (ana/empty-env)
        sb         (StringBuffer.)
        the-ns     (or (:ns opts) 'cljs.user)
        bound-vars (cond-> (merge bound-vars {:*cljs-ns* the-ns})
                     (:source-map opts) (assoc :*sm-data* (sm-data)))]
    ((fn compile-loop []
       (binding [env/*compiler*         (:*compiler* bound-vars)
                 *eval-fn*              (:*eval-fn* bound-vars)
                 ana/*cljs-ns*          (:*cljs-ns* bound-vars)
                 *ns*                   (create-ns (:*cljs-ns* bound-vars))
                 r/*data-readers*       (:*data-readers* bound-vars)
                 comp/*source-map-data* (:*sm-data* bound-vars)]
         (let [res (try
                     {:value (r/read {:eof eof :read-cond :allow :features #{:cljs}} rdr)}
                     (catch :default cause
                       (wrap-error
                         (ana/error aenv
                           (str "Could not compile " name) cause))))]
           (if (:error res)
             (cb res)
             (let [form (:value res)]
               (if-not (identical? eof form)
                 (let [aenv (cond-> (assoc aenv :ns (ana/get-namespace ana/*cljs-ns*))
                              (:context opts) (assoc :context (:context opts))
                              (:def-emits-var opts) (assoc :def-emits-var true))
                       ast  (try
                              (ana/analyze aenv form nil opts)
                              (catch :default cause
                                (wrap-error
                                  (ana/error aenv
                                    (str "Could not compile " name) cause))))]
                   (.append sb (with-out-str (comp/emit ast)))
                   (if (= :ns (:op ast))
                     (ns-side-effects bound-vars aenv ast opts
                       (fn [res]
                         (if (:error res)
                           (cb res)
                           (compile-loop))))
                     (recur)))
                 (do
                   (when (:source-map opts)
                     (append-source-map env/*compiler*
                       name source sb @comp/*source-map-data* opts))
                   (cb {:value (.toString sb)})))))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:532-578](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L532-L578)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/compile*` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/compile*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/compileSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "compile*",
 :signature ["[bound-vars source name opts cb]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/compileSTAR",
 :source {:code "(defn compile* [bound-vars source name opts cb]\n  (let [rdr        (rt/indexing-push-back-reader source 1 name)\n        eof        (js-obj)\n        aenv       (ana/empty-env)\n        sb         (StringBuffer.)\n        the-ns     (or (:ns opts) 'cljs.user)\n        bound-vars (cond-> (merge bound-vars {:*cljs-ns* the-ns})\n                     (:source-map opts) (assoc :*sm-data* (sm-data)))]\n    ((fn compile-loop []\n       (binding [env/*compiler*         (:*compiler* bound-vars)\n                 *eval-fn*              (:*eval-fn* bound-vars)\n                 ana/*cljs-ns*          (:*cljs-ns* bound-vars)\n                 *ns*                   (create-ns (:*cljs-ns* bound-vars))\n                 r/*data-readers*       (:*data-readers* bound-vars)\n                 comp/*source-map-data* (:*sm-data* bound-vars)]\n         (let [res (try\n                     {:value (r/read {:eof eof :read-cond :allow :features #{:cljs}} rdr)}\n                     (catch :default cause\n                       (wrap-error\n                         (ana/error aenv\n                           (str \"Could not compile \" name) cause))))]\n           (if (:error res)\n             (cb res)\n             (let [form (:value res)]\n               (if-not (identical? eof form)\n                 (let [aenv (cond-> (assoc aenv :ns (ana/get-namespace ana/*cljs-ns*))\n                              (:context opts) (assoc :context (:context opts))\n                              (:def-emits-var opts) (assoc :def-emits-var true))\n                       ast  (try\n                              (ana/analyze aenv form nil opts)\n                              (catch :default cause\n                                (wrap-error\n                                  (ana/error aenv\n                                    (str \"Could not compile \" name) cause))))]\n                   (.append sb (with-out-str (comp/emit ast)))\n                   (if (= :ns (:op ast))\n                     (ns-side-effects bound-vars aenv ast opts\n                       (fn [res]\n                         (if (:error res)\n                           (cb res)\n                           (compile-loop))))\n                     (recur)))\n                 (do\n                   (when (:source-map opts)\n                     (append-source-map env/*compiler*\n                       name source sb @comp/*source-map-data* opts))\n                   (cb {:value (.toString sb)})))))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [532 578]},
 :full-name "cljs.js/compile*",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/compile*"]))
```

-->
