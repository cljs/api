## cljs.repl/repl



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl__ repl-env & {:keys \[analyze-path verbose warn-on-undeclared special-fns static-fns\]})<br>
</samp>

---





Source docstring:

```
Note - repl will reload core.cljs every time, even if supplied old repl-env
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/repl.clj#L154-L199):

```clj
(defn repl
  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]
  (print "To quit, type: ")
  (prn :cljs/quit)
  (env/with-compiler-env
    (or (::env/compiler repl-env) (env/default-compiler-env))
    (binding [ana/*cljs-ns* 'cljs.user
              *cljs-verbose* verbose
              ana/*cljs-warnings* (assoc ana/*cljs-warnings*
                                    :undeclared-var warn-on-undeclared
                                    :undeclared-ns warn-on-undeclared
                                    :undeclared-ns-form warn-on-undeclared)
              ana/*cljs-static-fns* static-fns]
      (when analyze-path
        (analyze-source analyze-path))
      (let [env {:context :expr :locals {}}
            special-fns (merge default-special-fns special-fns)
            is-special-fn? (set (keys special-fns))
            read-error (Object.)]
        (-setup repl-env)
        (loop [forms (ana/forms-seq *in* "NO_SOURCE_FILE")]
          (print (str "ClojureScript:" ana/*cljs-ns* "> "))
          (flush)
          (let [form (try
                       (binding [*data-readers* tags/*cljs-data-readers*]
                         (if (seq forms)
                           (first forms)
                           :cljs/quit))
                       (catch Exception e
                         (println (.getMessage e))
                         read-error))]
            (cond
             (identical? form read-error) (recur (ana/forms-seq *in* "NO_SOURCE_FILE"))
             
             (= form :cljs/quit) :quit

             (and (seq? form) (is-special-fn? (first form)))
             (do (apply (get special-fns (first form)) repl-env (rest form))
                 (newline)
                 (recur (rest forms)))

             :else
             (do (eval-and-print repl-env env form)
                 (recur (rest forms))))))
        (-tear-down repl-env)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:154-199](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/repl.clj#L154-L199)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl` @ crossclj](http://crossclj.info/fun/cljs.repl/repl.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl",
 :signature ["[repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/repl",
 :source {:code "(defn repl\n  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]\n  (print \"To quit, type: \")\n  (prn :cljs/quit)\n  (env/with-compiler-env\n    (or (::env/compiler repl-env) (env/default-compiler-env))\n    (binding [ana/*cljs-ns* 'cljs.user\n              *cljs-verbose* verbose\n              ana/*cljs-warnings* (assoc ana/*cljs-warnings*\n                                    :undeclared-var warn-on-undeclared\n                                    :undeclared-ns warn-on-undeclared\n                                    :undeclared-ns-form warn-on-undeclared)\n              ana/*cljs-static-fns* static-fns]\n      (when analyze-path\n        (analyze-source analyze-path))\n      (let [env {:context :expr :locals {}}\n            special-fns (merge default-special-fns special-fns)\n            is-special-fn? (set (keys special-fns))\n            read-error (Object.)]\n        (-setup repl-env)\n        (loop [forms (ana/forms-seq *in* \"NO_SOURCE_FILE\")]\n          (print (str \"ClojureScript:\" ana/*cljs-ns* \"> \"))\n          (flush)\n          (let [form (try\n                       (binding [*data-readers* tags/*cljs-data-readers*]\n                         (if (seq forms)\n                           (first forms)\n                           :cljs/quit))\n                       (catch Exception e\n                         (println (.getMessage e))\n                         read-error))]\n            (cond\n             (identical? form read-error) (recur (ana/forms-seq *in* \"NO_SOURCE_FILE\"))\n             \n             (= form :cljs/quit) :quit\n\n             (and (seq? form) (is-special-fn? (first form)))\n             (do (apply (get special-fns (first form)) repl-env (rest form))\n                 (newline)\n                 (recur (rest forms)))\n\n             :else\n             (do (eval-and-print repl-env env form)\n                 (recur (rest forms))))))\n        (-tear-down repl-env)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/clj/cljs/repl.clj",
          :lines [154 199]},
 :full-name "cljs.repl/repl",
 :docstring "Note - repl will reload core.cljs every time, even if supplied old repl-env"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl"]))
```

-->
