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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1934/src/clj/cljs/repl.clj#L152-L181):

```clj
(defn repl
  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]
  (prn "Type: " :cljs/quit " to quit")
  (binding [ana/*cljs-ns* 'cljs.user
            *cljs-verbose* verbose
            ana/*cljs-warnings* (assoc ana/*cljs-warnings*
                                  :undeclared warn-on-undeclared)
            ana/*cljs-static-fns* static-fns]
    (when analyze-path
      (analyze-source analyze-path))
    (let [env {:context :expr :locals {}}
          special-fns (merge default-special-fns special-fns)
          is-special-fn? (set (keys special-fns))]
      (-setup repl-env)
      (loop []
        (print (str "ClojureScript:" ana/*cljs-ns* "> "))
        (flush)
        (let [{:keys [status form]} (read-next-form)]
          (cond
           (= form :cljs/quit) :quit

           (= status :error) (recur)

           (and (seq? form) (is-special-fn? (first form)))
           (do (apply (get special-fns (first form)) repl-env (rest form)) (newline) (recur))

           :else
           (do (eval-and-print repl-env env form) (recur)))))
      (-tear-down repl-env))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1934
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:152-181](https://github.com/clojure/clojurescript/blob/r1934/src/clj/cljs/repl.clj#L152-L181)</ins>
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
 :source {:code "(defn repl\n  [repl-env & {:keys [analyze-path verbose warn-on-undeclared special-fns static-fns]}]\n  (prn \"Type: \" :cljs/quit \" to quit\")\n  (binding [ana/*cljs-ns* 'cljs.user\n            *cljs-verbose* verbose\n            ana/*cljs-warnings* (assoc ana/*cljs-warnings*\n                                  :undeclared warn-on-undeclared)\n            ana/*cljs-static-fns* static-fns]\n    (when analyze-path\n      (analyze-source analyze-path))\n    (let [env {:context :expr :locals {}}\n          special-fns (merge default-special-fns special-fns)\n          is-special-fn? (set (keys special-fns))]\n      (-setup repl-env)\n      (loop []\n        (print (str \"ClojureScript:\" ana/*cljs-ns* \"> \"))\n        (flush)\n        (let [{:keys [status form]} (read-next-form)]\n          (cond\n           (= form :cljs/quit) :quit\n\n           (= status :error) (recur)\n\n           (and (seq? form) (is-special-fn? (first form)))\n           (do (apply (get special-fns (first form)) repl-env (rest form)) (newline) (recur))\n\n           :else\n           (do (eval-and-print repl-env env form) (recur)))))\n      (-tear-down repl-env))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/clj/cljs/repl.clj",
          :lines [152 181]},
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
