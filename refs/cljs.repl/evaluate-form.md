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

---





Source docstring:

```
Evaluate a ClojureScript form in the JavaScript environment. Returns a
string which is the ClojureScript return value. This string may or may
not be readable by the Clojure reader.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/repl.clj#L59-L92):

```clj
(defn evaluate-form
  ([repl-env env filename form]
     (evaluate-form repl-env env filename form identity))
  ([repl-env env filename form wrap]
     (try
       (let [ast (ana/analyze env form)
             js (comp/emit-str ast)
             wrap-js (comp/emit-str (binding [ana/*cljs-warn-on-undeclared* false
                                              ana/*cljs-warn-on-redef* false
                                              ana/*cljs-warn-on-dynamic* false
                                              ana/*cljs-warn-on-fn-var* false
                                              ana/*cljs-warn-fn-arity* false]
                                   (ana/analyze env (wrap form))))]
         (when (= (:op ast) :ns)
           (load-dependencies repl-env (into (vals (:requires ast))
                                             (distinct (vals (:uses ast))))))
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
                          #(prn "Error evaluating:" form :as js))
             :success (:value ret))))
       (catch Throwable ex
         (.printStackTrace ex)
         (println (str ex))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:59-92](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/repl.clj#L59-L92)</ins>
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
             "[repl-env env filename form wrap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/evaluate-form",
 :source {:code "(defn evaluate-form\n  ([repl-env env filename form]\n     (evaluate-form repl-env env filename form identity))\n  ([repl-env env filename form wrap]\n     (try\n       (let [ast (ana/analyze env form)\n             js (comp/emit-str ast)\n             wrap-js (comp/emit-str (binding [ana/*cljs-warn-on-undeclared* false\n                                              ana/*cljs-warn-on-redef* false\n                                              ana/*cljs-warn-on-dynamic* false\n                                              ana/*cljs-warn-on-fn-var* false\n                                              ana/*cljs-warn-fn-arity* false]\n                                   (ana/analyze env (wrap form))))]\n         (when (= (:op ast) :ns)\n           (load-dependencies repl-env (into (vals (:requires ast))\n                                             (distinct (vals (:uses ast))))))\n         (when *cljs-verbose*\n           (print js))\n         (let [ret (-evaluate repl-env filename (:line (meta form)) wrap-js)]\n           (case (:status ret)\n             ;;we eat ns errors because we know goog.provide() will throw when reloaded\n             ;;TODO - file bug with google, this is bs error\n             ;;this is what you get when you try to 'teach new developers'\n             ;;via errors (goog/base.js 104)\n             :error (display-error ret form)\n             :exception (display-error ret form\n                          #(prn \"Error evaluating:\" form :as js))\n             :success (:value ret))))\n       (catch Throwable ex\n         (.printStackTrace ex)\n         (println (str ex))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1513",
          :filename "src/clj/cljs/repl.clj",
          :lines [59 92]},
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
