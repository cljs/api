## cljs.repl.rhino/rhino-eval



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__rhino-eval__ repl-env filename line js)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2234/src/clj/cljs/repl/rhino.clj#L56-L65):

```clj
(defn rhino-eval
  [repl-env filename line js]
  (try
    (let [linenum (or line Integer/MIN_VALUE)]
      {:status :success
       :value (eval-result (-eval js repl-env filename linenum))})
    (catch Throwable ex
      {:status :exception
       :value (.toString ex)
       :stacktrace (stacktrace ex)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2234
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:56-65](https://github.com/clojure/clojurescript/blob/r2234/src/clj/cljs/repl/rhino.clj#L56-L65)</ins>
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
 :signature ["[repl-env filename line js]"],
 :source {:code "(defn rhino-eval\n  [repl-env filename line js]\n  (try\n    (let [linenum (or line Integer/MIN_VALUE)]\n      {:status :success\n       :value (eval-result (-eval js repl-env filename linenum))})\n    (catch Throwable ex\n      {:status :exception\n       :value (.toString ex)\n       :stacktrace (stacktrace ex)})))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [56 65]},
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
