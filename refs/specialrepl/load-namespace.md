## load-namespace (repl)



 <table border="1">
<tr>
<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-namespace__ name)<br>
</samp>

---

Only usable from a REPL.

Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once
and only once.



---

###### Examples:

```clj
(load-namespace 'clojure.set)
```



---





repl specials table @ [github](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/repl.clj#L132-L161):

```clj
(defn repl
  "Note - repl will reload core.cljs every time, even if supplied old repl-env"
  [repl-env & {:keys [verbose warn-on-undeclared]}]
  (prn "Type: " :cljs/quit " to quit")
  (binding [comp/*cljs-ns* 'cljs.user
            *cljs-verbose* verbose
            comp/*cljs-warn-on-undeclared* warn-on-undeclared]
    (let [env {:context :statement :locals {}}]
      (-setup repl-env)
      (loop []
        (print (str "ClojureScript:" comp/*cljs-ns* "> "))
        (flush)
        (let [{:keys [status form]} (read-next-form)]
          (cond
           (= form :cljs/quit) :quit
           
           (= status :error) (recur)
           
           (and (seq? form) (= (first form) 'in-ns))
           (do (set! comp/*cljs-ns* (second (second form))) (newline) (recur))
           
           (and (seq? form) ('#{load-file clojure.core/load-file} (first form)))
           (do (load-file repl-env (second form)) (newline) (recur))
           
           (and (seq? form) ('#{load-namespace} (first form)))
           (do (load-namespace repl-env (second form)) (newline) (recur))
           
           :else
           (do (eval-and-print repl-env env form) (recur)))))
      (-tear-down repl-env))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:132-161](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/repl.clj#L132-L161)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl/load-namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nLoad a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once\nand only once.",
 :ns "specialrepl",
 :name "load-namespace",
 :signature ["[name]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl/load-namespace",
 :source {:code "(defn repl\n  \"Note - repl will reload core.cljs every time, even if supplied old repl-env\"\n  [repl-env & {:keys [verbose warn-on-undeclared]}]\n  (prn \"Type: \" :cljs/quit \" to quit\")\n  (binding [comp/*cljs-ns* 'cljs.user\n            *cljs-verbose* verbose\n            comp/*cljs-warn-on-undeclared* warn-on-undeclared]\n    (let [env {:context :statement :locals {}}]\n      (-setup repl-env)\n      (loop []\n        (print (str \"ClojureScript:\" comp/*cljs-ns* \"> \"))\n        (flush)\n        (let [{:keys [status form]} (read-next-form)]\n          (cond\n           (= form :cljs/quit) :quit\n           \n           (= status :error) (recur)\n           \n           (and (seq? form) (= (first form) 'in-ns))\n           (do (set! comp/*cljs-ns* (second (second form))) (newline) (recur))\n           \n           (and (seq? form) ('#{load-file clojure.core/load-file} (first form)))\n           (do (load-file repl-env (second form)) (newline) (recur))\n           \n           (and (seq? form) ('#{load-namespace} (first form)))\n           (do (load-namespace repl-env (second form)) (newline) (recur))\n           \n           :else\n           (do (eval-and-print repl-env env form) (recur)))))\n      (-tear-down repl-env))))",
          :title "repl specials table",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/clj/cljs/repl.clj",
          :lines [132 161]},
 :examples [{:id "0b1a1d",
             :content "```clj\n(load-namespace 'clojure.set)\n```"}],
 :full-name "specialrepl/load-namespace"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/load-namespace"]))
```

-->
