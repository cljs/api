## load-file (repl)



 <table border="1">
<tr>
<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/load-file</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/load-file)
</td>
</tr>
</table>


 <samp>
(__load-file__ filename)<br>
</samp>

---

Only usable from a REPL.

Load file at `filename`, then compiles and evaluates its code.



---

###### Examples:

```clj
(load-file "path/to/foo.cljs")
```



---





repl specials table @ [github](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/repl.clj#L133-L162):

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
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:133-162](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/repl.clj#L133-L162)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/load-file` @ clojuredocs](http://clojuredocs.org/clojure.core/load-file)<br>
[`clojure.core/load-file` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/load-file/)<br>
[`clojure.core/load-file` @ crossclj](http://crossclj.info/fun/clojure.core/load-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl/load-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Only usable from a REPL.\n\nLoad file at `filename`, then compiles and evaluates its code.",
 :ns "specialrepl",
 :name "load-file",
 :signature ["[filename]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl/load-file",
 :source {:code "(defn repl\n  \"Note - repl will reload core.cljs every time, even if supplied old repl-env\"\n  [repl-env & {:keys [verbose warn-on-undeclared]}]\n  (prn \"Type: \" :cljs/quit \" to quit\")\n  (binding [comp/*cljs-ns* 'cljs.user\n            *cljs-verbose* verbose\n            comp/*cljs-warn-on-undeclared* warn-on-undeclared]\n    (let [env {:context :statement :locals {}}]\n      (-setup repl-env)\n      (loop []\n        (print (str \"ClojureScript:\" comp/*cljs-ns* \"> \"))\n        (flush)\n        (let [{:keys [status form]} (read-next-form)]\n          (cond\n           (= form :cljs/quit) :quit\n           \n           (= status :error) (recur)\n           \n           (and (seq? form) (= (first form) 'in-ns))\n           (do (set! comp/*cljs-ns* (second (second form))) (newline) (recur))\n           \n           (and (seq? form) ('#{load-file clojure.core/load-file} (first form)))\n           (do (load-file repl-env (second form)) (newline) (recur))\n           \n           (and (seq? form) ('#{load-namespace} (first form)))\n           (do (load-namespace repl-env (second form)) (newline) (recur))\n           \n           :else\n           (do (eval-and-print repl-env env form) (recur)))))\n      (-tear-down repl-env))))",
          :title "repl specials table",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/clj/cljs/repl.clj",
          :lines [133 162]},
 :examples [{:id "0903c5",
             :content "```clj\n(load-file \"path/to/foo.cljs\")\n```"}],
 :full-name "specialrepl/load-file",
 :clj-symbol "clojure.core/load-file"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/load-file"]))
```

-->
