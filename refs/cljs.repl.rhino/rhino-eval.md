## cljs.repl.rhino/rhino-eval



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__rhino-eval__ {:keys \[scope\], :as repl-env} filename line js)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/repl/rhino.clj#L72-L87):

```clj
(defn rhino-eval
  [{:keys [scope] :as repl-env} filename line js]
  (try
    (let [linenum (or line Integer/MIN_VALUE)]
      {:status :success
       :value (eval-result (-eval js repl-env filename linenum))})
    (catch Throwable ex
      ;; manually set *e
      (let [top-level (-> scope
                        (ScriptableObject/getProperty "cljs")
                        (ScriptableObject/getProperty "core"))]
        (ScriptableObject/putProperty top-level "_STAR_e"
          (Context/javaToJS ex scope))
        {:status :exception
         :value (.toString ex)
         :stacktrace (stacktrace ex)}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[rhino.clj:72-87](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/clojure/cljs/repl/rhino.clj#L72-L87)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/rhino-eval` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/rhino-eval.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/rhino-eval.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "rhino-eval",
 :type "function",
 :signature ["[{:keys [scope], :as repl-env} filename line js]"],
 :source {:code "(defn rhino-eval\n  [{:keys [scope] :as repl-env} filename line js]\n  (try\n    (let [linenum (or line Integer/MIN_VALUE)]\n      {:status :success\n       :value (eval-result (-eval js repl-env filename linenum))})\n    (catch Throwable ex\n      ;; manually set *e\n      (let [top-level (-> scope\n                        (ScriptableObject/getProperty \"cljs\")\n                        (ScriptableObject/getProperty \"core\"))]\n        (ScriptableObject/putProperty top-level \"_STAR_e\"\n          (Context/javaToJS ex scope))\n        {:status :exception\n         :value (.toString ex)\n         :stacktrace (stacktrace ex)}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [72 87]},
 :full-name "cljs.repl.rhino/rhino-eval",
 :full-name-encode "cljs.repl.rhino/rhino-eval",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/rhino-eval"]))
```

-->
