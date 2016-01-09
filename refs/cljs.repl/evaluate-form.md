## cljs.repl/evaluate-form



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__evaluate-form__ repl-env env filename form)<br>
</samp>
 <samp>
(__evaluate-form__ repl-env env filename form wrap)<br>
</samp>
 <samp>
(__evaluate-form__ repl-env env filename form wrap opts)<br>
</samp>

---





Source docstring:

```
Evaluate a ClojureScript form in the JavaScript environment. Returns a
string which is the ClojureScript return value. This string may or may
not be readable by the Clojure reader.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl.cljc#L430-L496):

```clj
(defn evaluate-form
  ([repl-env env filename form]
    (evaluate-form repl-env env filename form identity))
  ([repl-env env filename form wrap]
    (evaluate-form repl-env env filename form wrap *repl-opts*))
  ([repl-env env filename form wrap opts]
   (binding [ana/*cljs-file* filename]
     (let [ast (ana/analyze env form nil opts)
           js (comp/emit-str ast)
           def-emits-var (:def-emits-var opts)
           wrap-js
           ;; TODO: check opts as well - David
           (if (:source-map repl-env)
             (binding [comp/*source-map-data*
                       (atom {:source-map (sorted-map)
                              :gen-col 0
                              :gen-line 0})]
               (let [js (comp/emit-str
                          (ana/no-warn
                            (ana/analyze (assoc env :repl-env repl-env :def-emits-var def-emits-var)
                              (wrap form) nil opts)))
                     t (System/currentTimeMillis)]
                 (str js
                   "\n//# sourceURL=repl-" t ".js"
                   "\n//# sourceMappingURL=data:application/json;base64,"
                   (DatatypeConverter/printBase64Binary
                     (.getBytes
                       (sm/encode
                         {(str "repl-" t ".cljs")
                          (:source-map @comp/*source-map-data*)}
                         {:lines (+ (:gen-line @comp/*source-map-data*) 3)
                          :file (str "repl-" t ".js")
                          :sources-content
                          [(or (:source (meta form))
                             ;; handle strings / primitives without metadata
                             (with-out-str (pr form)))]})
                       "UTF-8")))))
             (comp/emit-str
               (ana/no-warn
                 (ana/analyze (assoc env :repl-env repl-env :def-emits-var def-emits-var)
                   (wrap form) nil opts))))]
       (when (= (:op ast) :ns)
         (load-dependencies repl-env
           (into (vals (:requires ast))
             (distinct (vals (:uses ast))))
           opts))
       (when *cljs-verbose*
         (err-out (println js)))
       (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]
         (case (:status ret)
           :error (throw
                    (ex-info (:value ret)
                      {:type :js-eval-error
                       :error ret
                       :repl-env repl-env
                       :form form}))
           :exception (throw
                        (ex-info (:value ret)
                          {:type :js-eval-exception
                           :error ret
                           :repl-env repl-env
                           :form form
                           :js js}))
           :success (:value ret)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:430-496](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl.cljc#L430-L496)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/evaluate-form` @ crossclj](http://crossclj.info/fun/cljs.repl/evaluate-form.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/evaluate-form.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "evaluate-form",
 :signature ["[repl-env env filename form]"
             "[repl-env env filename form wrap]"
             "[repl-env env filename form wrap opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/evaluate-form",
 :source {:code "(defn evaluate-form\n  ([repl-env env filename form]\n    (evaluate-form repl-env env filename form identity))\n  ([repl-env env filename form wrap]\n    (evaluate-form repl-env env filename form wrap *repl-opts*))\n  ([repl-env env filename form wrap opts]\n   (binding [ana/*cljs-file* filename]\n     (let [ast (ana/analyze env form nil opts)\n           js (comp/emit-str ast)\n           def-emits-var (:def-emits-var opts)\n           wrap-js\n           ;; TODO: check opts as well - David\n           (if (:source-map repl-env)\n             (binding [comp/*source-map-data*\n                       (atom {:source-map (sorted-map)\n                              :gen-col 0\n                              :gen-line 0})]\n               (let [js (comp/emit-str\n                          (ana/no-warn\n                            (ana/analyze (assoc env :repl-env repl-env :def-emits-var def-emits-var)\n                              (wrap form) nil opts)))\n                     t (System/currentTimeMillis)]\n                 (str js\n                   \"\\n//# sourceURL=repl-\" t \".js\"\n                   \"\\n//# sourceMappingURL=data:application/json;base64,\"\n                   (DatatypeConverter/printBase64Binary\n                     (.getBytes\n                       (sm/encode\n                         {(str \"repl-\" t \".cljs\")\n                          (:source-map @comp/*source-map-data*)}\n                         {:lines (+ (:gen-line @comp/*source-map-data*) 3)\n                          :file (str \"repl-\" t \".js\")\n                          :sources-content\n                          [(or (:source (meta form))\n                             ;; handle strings / primitives without metadata\n                             (with-out-str (pr form)))]})\n                       \"UTF-8\")))))\n             (comp/emit-str\n               (ana/no-warn\n                 (ana/analyze (assoc env :repl-env repl-env :def-emits-var def-emits-var)\n                   (wrap form) nil opts))))]\n       (when (= (:op ast) :ns)\n         (load-dependencies repl-env\n           (into (vals (:requires ast))\n             (distinct (vals (:uses ast))))\n           opts))\n       (when *cljs-verbose*\n         (err-out (println js)))\n       (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]\n         (case (:status ret)\n           :error (throw\n                    (ex-info (:value ret)\n                      {:type :js-eval-error\n                       :error ret\n                       :repl-env repl-env\n                       :form form}))\n           :exception (throw\n                        (ex-info (:value ret)\n                          {:type :js-eval-exception\n                           :error ret\n                           :repl-env repl-env\n                           :form form\n                           :js js}))\n           :success (:value ret)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [430 496]},
 :full-name "cljs.repl/evaluate-form",
 :docstring "Evaluate a ClojureScript form in the JavaScript environment. Returns a\nstring which is the ClojureScript return value. This string may or may\nnot be readable by the Clojure reader."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/evaluate-form"]))
```

-->
