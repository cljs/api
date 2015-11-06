## cljs.repl/load-namespace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-namespace__ repl-env sym)<br>
</samp>

---





Source docstring:

```
Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once and
only once.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/clj/cljs/repl.clj#L37-L52):

```clj
(defn load-namespace
  [repl-env sym]
  (let [sym (if (and (seq? sym)
                     (= (first sym) 'quote))
              (second sym)
              sym)
        deps (->> (cljsc/add-dependencies (env->opts repl-env)
                                          {:requires [(name sym)] :type :seed})
                  (remove (comp #{["goog"]} :provides))
                  (remove (comp #{:seed} :type))
                  (map #(select-keys % [:provides :url])))]
    (doseq [{:keys [url provides]} deps]
      (-load repl-env provides url))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:37-52](https://github.com/clojure/clojurescript/blob/r2075/src/clj/cljs/repl.clj#L37-L52)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/load-namespace` @ crossclj](http://crossclj.info/fun/cljs.repl/load-namespace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/load-namespace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "load-namespace",
 :signature ["[repl-env sym]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/load-namespace",
 :source {:code "(defn load-namespace\n  [repl-env sym]\n  (let [sym (if (and (seq? sym)\n                     (= (first sym) 'quote))\n              (second sym)\n              sym)\n        deps (->> (cljsc/add-dependencies (env->opts repl-env)\n                                          {:requires [(name sym)] :type :seed})\n                  (remove (comp #{[\"goog\"]} :provides))\n                  (remove (comp #{:seed} :type))\n                  (map #(select-keys % [:provides :url])))]\n    (doseq [{:keys [url provides]} deps]\n      (-load repl-env provides url))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/clj/cljs/repl.clj",
          :lines [37 52]},
 :full-name "cljs.repl/load-namespace",
 :docstring "Load a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once and\nonly once."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-namespace"]))
```

-->
