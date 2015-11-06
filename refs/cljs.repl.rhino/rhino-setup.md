## cljs.repl.rhino/rhino-setup



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__rhino-setup__ repl-env)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl/rhino.clj#L95-L110):

```clj
(defn rhino-setup [repl-env]
  (let [env {:context :statement :locals {} :ns (@comp/namespaces comp/*cljs-ns*)}
        scope (:scope repl-env)]
    (repl/load-file repl-env "cljs/core.cljs")
    (swap! loaded-libs conj "cljs.core")
    (repl/evaluate-form repl-env
                        env
                        "<cljs repl>"
                        '(ns cljs.user))
    (ScriptableObject/putProperty scope
                                  "out"
                                  (Context/javaToJS System/out scope))
    (repl/evaluate-form repl-env
                        env
                        "<cljs repl>"
                        '(set! *print-fn* (fn [x] (.print js/out x))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:95-110](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/repl/rhino.clj#L95-L110)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/rhino-setup` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/rhino-setup.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/rhino-setup.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "rhino-setup",
 :type "function",
 :signature ["[repl-env]"],
 :source {:code "(defn rhino-setup [repl-env]\n  (let [env {:context :statement :locals {} :ns (@comp/namespaces comp/*cljs-ns*)}\n        scope (:scope repl-env)]\n    (repl/load-file repl-env \"cljs/core.cljs\")\n    (swap! loaded-libs conj \"cljs.core\")\n    (repl/evaluate-form repl-env\n                        env\n                        \"<cljs repl>\"\n                        '(ns cljs.user))\n    (ScriptableObject/putProperty scope\n                                  \"out\"\n                                  (Context/javaToJS System/out scope))\n    (repl/evaluate-form repl-env\n                        env\n                        \"<cljs repl>\"\n                        '(set! *print-fn* (fn [x] (.print js/out x))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [95 110]},
 :full-name "cljs.repl.rhino/rhino-setup",
 :full-name-encode "cljs.repl.rhino/rhino-setup",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/rhino-setup"]))
```

-->
