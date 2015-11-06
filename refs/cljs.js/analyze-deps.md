## cljs.js/analyze-deps



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__analyze-deps__ bound-vars ana-env lib deps cb)<br>
</samp>
 <samp>
(__analyze-deps__ bound-vars ana-env lib deps opts cb)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L261-L298):

```clj
(defn analyze-deps
  ([bound-vars ana-env lib deps cb]
   (analyze-deps bound-vars ana-env lib deps nil cb))
  ([bound-vars ana-env lib deps opts cb]
   (let [compiler @(:*compiler* bound-vars)]
     (binding [ana/*cljs-dep-set* (vary-meta (conj (:*cljs-dep-set* bound-vars) lib)
                                    update-in [:dep-path] conj lib)]
       (assert (every? #(not (contains? (:*cljs-dep-set* bound-vars) %)) deps)
         (str "Circular dependency detected "
           (-> (:*cljs-dep-set* bound-vars) meta :dep-path)))
       (if (seq deps)
         (let [dep (first deps)]
           (try
             ((:*load-fn* bound-vars) {:name dep :path (ns->relpath dep)}
              (fn [resource]
                (assert (or (map? resource) (nil? resource))
                  "*load-fn* may only return a map or nil")
                (if resource
                  (let [{:keys [name lang source]} resource]
                    (condp = lang
                      :clj (analyze* bound-vars source name opts
                             (fn [res]
                               (if-not (:error res)
                                 (analyze-deps bound-vars ana-env lib (next deps) opts cb)
                                 (cb res))))
                      :js (analyze-deps bound-vars ana-env lib (next deps) opts cb)
                      (wrap-error
                        (ana/error ana-env
                          (str "Invalid :lang specified " lang ", only :clj or :js allowed")))))
                  (cb (wrap-error
                        (ana/error ana-env
                          (ana/error-message :undeclared-ns
                            {:ns-sym dep :js-provide (name dep)})))))))
             (catch :default cause
               (cb (wrap-error
                     (ana/error ana-env
                       (str "Could not analyze dep " dep) cause))))))
         (cb {:value nil}))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:261-298](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/cljs/cljs/js.cljs#L261-L298)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/analyze-deps` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/analyze-deps.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/analyze-deps.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "analyze-deps",
 :type "function",
 :signature ["[bound-vars ana-env lib deps cb]"
             "[bound-vars ana-env lib deps opts cb]"],
 :source {:code "(defn analyze-deps\n  ([bound-vars ana-env lib deps cb]\n   (analyze-deps bound-vars ana-env lib deps nil cb))\n  ([bound-vars ana-env lib deps opts cb]\n   (let [compiler @(:*compiler* bound-vars)]\n     (binding [ana/*cljs-dep-set* (vary-meta (conj (:*cljs-dep-set* bound-vars) lib)\n                                    update-in [:dep-path] conj lib)]\n       (assert (every? #(not (contains? (:*cljs-dep-set* bound-vars) %)) deps)\n         (str \"Circular dependency detected \"\n           (-> (:*cljs-dep-set* bound-vars) meta :dep-path)))\n       (if (seq deps)\n         (let [dep (first deps)]\n           (try\n             ((:*load-fn* bound-vars) {:name dep :path (ns->relpath dep)}\n              (fn [resource]\n                (assert (or (map? resource) (nil? resource))\n                  \"*load-fn* may only return a map or nil\")\n                (if resource\n                  (let [{:keys [name lang source]} resource]\n                    (condp = lang\n                      :clj (analyze* bound-vars source name opts\n                             (fn [res]\n                               (if-not (:error res)\n                                 (analyze-deps bound-vars ana-env lib (next deps) opts cb)\n                                 (cb res))))\n                      :js (analyze-deps bound-vars ana-env lib (next deps) opts cb)\n                      (wrap-error\n                        (ana/error ana-env\n                          (str \"Invalid :lang specified \" lang \", only :clj or :js allowed\")))))\n                  (cb (wrap-error\n                        (ana/error ana-env\n                          (ana/error-message :undeclared-ns\n                            {:ns-sym dep :js-provide (name dep)})))))))\n             (catch :default cause\n               (cb (wrap-error\n                     (ana/error ana-env\n                       (str \"Could not analyze dep \" dep) cause))))))\n         (cb {:value nil}))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [261 298]},
 :full-name "cljs.js/analyze-deps",
 :full-name-encode "cljs.js/analyze-deps",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/analyze-deps"]))
```

-->
