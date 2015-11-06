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





repl specials table @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/repl.clj#L134-L143):

```clj
(def default-special-fns
  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]
    {'in-ns (fn [_ quoted-ns]
              (let [ns-name (second quoted-ns)]
                (when-not (ana/get-namespace ns-name)
                  (swap! env/*compiler* update-in [::ana/namespaces ns-name] {:name ns-name}))
                (set! ana/*cljs-ns* ns-name)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:134-143](https://github.com/clojure/clojurescript/blob/r2027/src/clj/cljs/repl.clj#L134-L143)</ins>
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
 :source {:code "(def default-special-fns\n  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]\n    {'in-ns (fn [_ quoted-ns]\n              (let [ns-name (second quoted-ns)]\n                (when-not (ana/get-namespace ns-name)\n                  (swap! env/*compiler* update-in [::ana/namespaces ns-name] {:name ns-name}))\n                (set! ana/*cljs-ns* ns-name)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))",
          :title "repl specials table",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/clj/cljs/repl.clj",
          :lines [134 143]},
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
