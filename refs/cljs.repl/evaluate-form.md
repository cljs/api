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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/repl.clj#L161-L221):

```clj
(defn evaluate-form
  ([repl-env env filename form]
    (evaluate-form repl-env env filename form identity))
  ([repl-env env filename form wrap]
    (evaluate-form repl-env env filename form wrap nil))
  ([repl-env env filename form wrap opts]
    (try
      (binding [ana/*cljs-file* filename]
        (let [ast (ana/analyze env form opts)
              js (comp/emit-str ast)
              wrap-js
              ;; TODO: check opts as well - David
              (if (:source-map repl-env)
                (binding [comp/*source-map-data*
                          (atom {:source-map (sorted-map)
                                 :gen-col 0
                                 :gen-line 0})]
                  (let [js (comp/emit-str (ana/no-warn (ana/analyze env (wrap form) opts)))
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
                             :file  (str "repl-" t ".js")
                             :sources-content
                                    [(or (:source (meta form))
                                       ;; handle strings / primitives without metadata
                                       (with-out-str (pr form)))]})
                          "UTF-8")))))
                (comp/emit-str (ana/no-warn (ana/analyze env (wrap form) opts))))]
          (when (= (:op ast) :ns)
            (load-dependencies repl-env
              (into (vals (:requires ast))
                (distinct (vals (:uses ast))))
              opts))
          (when *cljs-verbose*
            (print js))
          (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]
            (case (:status ret)
              ;;we eat ns errors because we know goog.provide() will throw when reloaded
              ;;TODO - file bug with google, this is bs error
              ;;this is what you get when you try to 'teach new developers'
              ;;via errors (goog/base.js 104)
              :error (display-error ret form)
              :exception (display-error ret form
                           (if (:repl-verbose opts)
                             #(prn "Error evaluating:" form :as js)
                             (constantly nil)))
              :success (:value ret)))))
      (catch Throwable ex
        (.printStackTrace ex)
        (println (str ex))
        (flush)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:161-221](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/repl.clj#L161-L221)</ins>
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
 :source {:code "(defn evaluate-form\n  ([repl-env env filename form]\n    (evaluate-form repl-env env filename form identity))\n  ([repl-env env filename form wrap]\n    (evaluate-form repl-env env filename form wrap nil))\n  ([repl-env env filename form wrap opts]\n    (try\n      (binding [ana/*cljs-file* filename]\n        (let [ast (ana/analyze env form opts)\n              js (comp/emit-str ast)\n              wrap-js\n              ;; TODO: check opts as well - David\n              (if (:source-map repl-env)\n                (binding [comp/*source-map-data*\n                          (atom {:source-map (sorted-map)\n                                 :gen-col 0\n                                 :gen-line 0})]\n                  (let [js (comp/emit-str (ana/no-warn (ana/analyze env (wrap form) opts)))\n                        t (System/currentTimeMillis)]\n                    (str js\n                      \"\\n//# sourceURL=repl-\" t \".js\"\n                      \"\\n//# sourceMappingURL=data:application/json;base64,\"\n                      (DatatypeConverter/printBase64Binary\n                        (.getBytes\n                          (sm/encode\n                            {(str \"repl-\" t \".cljs\")\n                             (:source-map @comp/*source-map-data*)}\n                            {:lines (+ (:gen-line @comp/*source-map-data*) 3)\n                             :file  (str \"repl-\" t \".js\")\n                             :sources-content\n                                    [(or (:source (meta form))\n                                       ;; handle strings / primitives without metadata\n                                       (with-out-str (pr form)))]})\n                          \"UTF-8\")))))\n                (comp/emit-str (ana/no-warn (ana/analyze env (wrap form) opts))))]\n          (when (= (:op ast) :ns)\n            (load-dependencies repl-env\n              (into (vals (:requires ast))\n                (distinct (vals (:uses ast))))\n              opts))\n          (when *cljs-verbose*\n            (print js))\n          (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]\n            (case (:status ret)\n              ;;we eat ns errors because we know goog.provide() will throw when reloaded\n              ;;TODO - file bug with google, this is bs error\n              ;;this is what you get when you try to 'teach new developers'\n              ;;via errors (goog/base.js 104)\n              :error (display-error ret form)\n              :exception (display-error ret form\n                           (if (:repl-verbose opts)\n                             #(prn \"Error evaluating:\" form :as js)\n                             (constantly nil)))\n              :success (:value ret)))))\n      (catch Throwable ex\n        (.printStackTrace ex)\n        (println (str ex))\n        (flush)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/repl.clj",
          :lines [161 221]},
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
