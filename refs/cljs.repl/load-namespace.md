## cljs.repl/load-namespace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-namespace__ repl-env ns)<br>
</samp>
 <samp>
(__load-namespace__ repl-env ns opts)<br>
</samp>

---





Source docstring:

```
Load a namespace and all of its dependencies into the evaluation environment.
The environment is responsible for ensuring that each namespace is loaded once and
only once.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/repl.cljc#L166-L200):

```clj
(defn load-namespace
  ([repl-env ns] (load-namespace repl-env ns nil))
  ([repl-env ns opts]
   (let [ns (if (and (seq? ns)
                     (= (first ns) 'quote))
               (second ns)
               ns)
         ;; TODO: add pre-condition to source-on-disk, the
         ;; source must supply at least :url - David
         sources (cljsc/add-dependencies
                   (merge (env->opts repl-env) opts)
                   {:requires [(name ns)]
                    :type :seed
                    :url (:uri (cljsc/source-for-namespace
                                 ns env/*compiler*))})
         deps (->> sources
                (remove (comp #{["goog"]} :provides))
                (remove (comp #{:seed} :type))
                (map #(select-keys % [:provides :url])))]
     (if (:output-dir opts)
       ;; REPLs that read from :output-dir just need to add deps,
       ;; environment will handle actual loading - David
       (doseq [source (->> sources
                        (remove (comp #{:seed} :type))
                        (map #(cljsc/source-on-disk opts %)))]
         (when (:repl-verbose opts)
           (println "Loading:" (:provides source)))
         (-evaluate repl-env "<cljs repl>" 1
           (cljsc/add-dep-string opts source)))
       ;; REPLs that stream must manually load each dep - David
       (doseq [{:keys [url provides]} deps]
         (-load repl-env provides url))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:166-200](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/repl.cljc#L166-L200)</ins>
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
 :signature ["[repl-env ns]" "[repl-env ns opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/load-namespace",
 :source {:code "(defn load-namespace\n  ([repl-env ns] (load-namespace repl-env ns nil))\n  ([repl-env ns opts]\n   (let [ns (if (and (seq? ns)\n                     (= (first ns) 'quote))\n               (second ns)\n               ns)\n         ;; TODO: add pre-condition to source-on-disk, the\n         ;; source must supply at least :url - David\n         sources (cljsc/add-dependencies\n                   (merge (env->opts repl-env) opts)\n                   {:requires [(name ns)]\n                    :type :seed\n                    :url (:uri (cljsc/source-for-namespace\n                                 ns env/*compiler*))})\n         deps (->> sources\n                (remove (comp #{[\"goog\"]} :provides))\n                (remove (comp #{:seed} :type))\n                (map #(select-keys % [:provides :url])))]\n     (if (:output-dir opts)\n       ;; REPLs that read from :output-dir just need to add deps,\n       ;; environment will handle actual loading - David\n       (doseq [source (->> sources\n                        (remove (comp #{:seed} :type))\n                        (map #(cljsc/source-on-disk opts %)))]\n         (when (:repl-verbose opts)\n           (println \"Loading:\" (:provides source)))\n         (-evaluate repl-env \"<cljs repl>\" 1\n           (cljsc/add-dep-string opts source)))\n       ;; REPLs that stream must manually load each dep - David\n       (doseq [{:keys [url provides]} deps]\n         (-load repl-env provides url))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [166 200]},
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
