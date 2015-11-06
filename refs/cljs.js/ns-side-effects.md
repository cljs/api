## ~~cljs.js/ns-side-effects~~



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.28"><img valign="middle" alt="[×] 1.7.28" title="Removed in 1.7.28" src="https://img.shields.io/badge/×-1.7.28-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__ns-side-effects__ bound-vars ana-env ast opts cb)<br>
</samp>
 <samp>
(__ns-side-effects__ load bound-vars ana-env {:keys \[op\], :as ast} opts cb)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L317-L377):

```clj
(defn ns-side-effects
  ([bound-vars ana-env ast opts cb]
    (ns-side-effects false bound-vars ana-env ast opts cb))
  ([load bound-vars ana-env {:keys [op] :as ast} opts cb]
   (when (:verbose opts)
     (debug-prn "Namespace side effects for" (:name ast)))
   (if (= :ns op)
     (let [{:keys [deps uses requires require-macros use-macros reload reloads]} ast
           env (:*compiler* bound-vars)]
       (letfn [(check-uses-and-load-macros [res]
                 (if (:error res)
                   (cb res)
                   (let [res (try
                               (when (and (:*analyze-deps* bound-vars) (seq uses))
                                 (when (:verbose opts) (debug-prn "Checking uses"))
                                 (ana/check-uses uses env)
                                 {:value nil})
                               (catch :default cause
                                 (wrap-error
                                   (ana/error ana-env
                                     (str "Could not parse ns form " (:name ast)) cause))))]
                     (if (:error res)
                       (cb res)
                       (if (:*load-macros* bound-vars)
                         (do
                           (when (:verbose opts) (debug-prn "Processing :use-macros for" (:name ast)))
                           (load-macros bound-vars :use-macros use-macros reload reloads opts
                             (fn [res]
                               (if (:error res)
                                 (cb res)
                                 (do
                                   (when (:verbose opts) (debug-prn "Processing :require-macros for" (:name ast)))
                                   (load-macros bound-vars :require-macros require-macros reloads reloads opts
                                     (fn [res]
                                       (if (:error res)
                                         (cb res)
                                         (let [res (try
                                                     (when (seq use-macros)
                                                       (when (:verbose opts) (debug-prn "Checking :use-macros for" (:name ast)))
                                                       (ana/check-use-macros use-macros env))
                                                     {:value nil}
                                                     (catch :default cause
                                                       (wrap-error
                                                         (ana/error ana-env
                                                           (str "Could not parse ns form " (:name ast)) cause))))]
                                           (if (:error res)
                                             (cb res)
                                             (cb {:value ast})))))))))))
                        (cb {:value ast}))))))]
         (cond
           (and load (seq deps))
           (load-deps bound-vars ana-env (:name ast) deps (dissoc opts :macros-ns)
             check-uses-and-load-macros)

           (and (not load) (:*analyze-deps* bound-vars) (seq deps))
           (analyze-deps bound-vars ana-env (:name ast) deps (dissoc opts :macros-ns)
             check-uses-and-load-macros)

           :else
           (check-uses-and-load-macros {:value nil}))))
     (cb {:value ast}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:317-377](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L317-L377)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/ns-side-effects` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/ns-side-effects.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/ns-side-effects.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "ns-side-effects",
 :signature ["[bound-vars ana-env ast opts cb]"
             "[load bound-vars ana-env {:keys [op], :as ast} opts cb]"],
 :history [["+" "1.7.10"] ["-" "1.7.28"]],
 :type "function",
 :full-name-encode "cljs.js/ns-side-effects",
 :source {:code "(defn ns-side-effects\n  ([bound-vars ana-env ast opts cb]\n    (ns-side-effects false bound-vars ana-env ast opts cb))\n  ([load bound-vars ana-env {:keys [op] :as ast} opts cb]\n   (when (:verbose opts)\n     (debug-prn \"Namespace side effects for\" (:name ast)))\n   (if (= :ns op)\n     (let [{:keys [deps uses requires require-macros use-macros reload reloads]} ast\n           env (:*compiler* bound-vars)]\n       (letfn [(check-uses-and-load-macros [res]\n                 (if (:error res)\n                   (cb res)\n                   (let [res (try\n                               (when (and (:*analyze-deps* bound-vars) (seq uses))\n                                 (when (:verbose opts) (debug-prn \"Checking uses\"))\n                                 (ana/check-uses uses env)\n                                 {:value nil})\n                               (catch :default cause\n                                 (wrap-error\n                                   (ana/error ana-env\n                                     (str \"Could not parse ns form \" (:name ast)) cause))))]\n                     (if (:error res)\n                       (cb res)\n                       (if (:*load-macros* bound-vars)\n                         (do\n                           (when (:verbose opts) (debug-prn \"Processing :use-macros for\" (:name ast)))\n                           (load-macros bound-vars :use-macros use-macros reload reloads opts\n                             (fn [res]\n                               (if (:error res)\n                                 (cb res)\n                                 (do\n                                   (when (:verbose opts) (debug-prn \"Processing :require-macros for\" (:name ast)))\n                                   (load-macros bound-vars :require-macros require-macros reloads reloads opts\n                                     (fn [res]\n                                       (if (:error res)\n                                         (cb res)\n                                         (let [res (try\n                                                     (when (seq use-macros)\n                                                       (when (:verbose opts) (debug-prn \"Checking :use-macros for\" (:name ast)))\n                                                       (ana/check-use-macros use-macros env))\n                                                     {:value nil}\n                                                     (catch :default cause\n                                                       (wrap-error\n                                                         (ana/error ana-env\n                                                           (str \"Could not parse ns form \" (:name ast)) cause))))]\n                                           (if (:error res)\n                                             (cb res)\n                                             (cb {:value ast})))))))))))\n                        (cb {:value ast}))))))]\n         (cond\n           (and load (seq deps))\n           (load-deps bound-vars ana-env (:name ast) deps (dissoc opts :macros-ns)\n             check-uses-and-load-macros)\n\n           (and (not load) (:*analyze-deps* bound-vars) (seq deps))\n           (analyze-deps bound-vars ana-env (:name ast) deps (dissoc opts :macros-ns)\n             check-uses-and-load-macros)\n\n           :else\n           (check-uses-and-load-macros {:value nil}))))\n     (cb {:value ast}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [317 377]},
 :full-name "cljs.js/ns-side-effects",
 :removed {:in "1.7.28", :last-seen "1.7.10"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/ns-side-effects"]))
```

-->
