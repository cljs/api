## cljs.repl.rhino/goog-require



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__goog-require__ repl-env rule)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2202/src/clj/cljs/repl/rhino.clj#L67-L84):

```clj
(defn goog-require [repl-env rule]
  (when-not (contains? @(:loaded-libs repl-env) rule)
    (let [repl-env @current-repl-env
          path (string/replace (comp/munge rule) \. java.io.File/separatorChar)
          cljs-path (str path ".cljs")
          js-path (str "goog/"
                       (-eval (str "goog.dependencies_.nameToPath['" rule "']")
                              repl-env
                              "<cljs repl>"
                              1))]
      (if-let [res (io/resource cljs-path)]
        (binding [ana/*cljs-ns* 'cljs.user]
          (repl/load-stream repl-env cljs-path res))
        (if-let [res (io/resource js-path)]
          (with-open [reader (io/reader res)]
            (-eval reader repl-env js-path 1))
          (throw (Exception. (str "Cannot find " cljs-path " or " js-path " in classpath")))))
      (swap! (:loaded-libs repl-env) conj rule))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2202
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:67-84](https://github.com/clojure/clojurescript/blob/r2202/src/clj/cljs/repl/rhino.clj#L67-L84)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/goog-require` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/goog-require.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/goog-require.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "goog-require",
 :type "function",
 :signature ["[repl-env rule]"],
 :source {:code "(defn goog-require [repl-env rule]\n  (when-not (contains? @(:loaded-libs repl-env) rule)\n    (let [repl-env @current-repl-env\n          path (string/replace (comp/munge rule) \\. java.io.File/separatorChar)\n          cljs-path (str path \".cljs\")\n          js-path (str \"goog/\"\n                       (-eval (str \"goog.dependencies_.nameToPath['\" rule \"']\")\n                              repl-env\n                              \"<cljs repl>\"\n                              1))]\n      (if-let [res (io/resource cljs-path)]\n        (binding [ana/*cljs-ns* 'cljs.user]\n          (repl/load-stream repl-env cljs-path res))\n        (if-let [res (io/resource js-path)]\n          (with-open [reader (io/reader res)]\n            (-eval reader repl-env js-path 1))\n          (throw (Exception. (str \"Cannot find \" cljs-path \" or \" js-path \" in classpath\")))))\n      (swap! (:loaded-libs repl-env) conj rule))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [67 84]},
 :full-name "cljs.repl.rhino/goog-require",
 :full-name-encode "cljs.repl.rhino/goog-require",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/goog-require"]))
```

-->
