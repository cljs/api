## cljs.repl/default-special-fns



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-993"><img valign="middle" alt="[+] 0.0-993" title="Added in 0.0-993" src="https://img.shields.io/badge/+-0.0--993-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2014/src/clj/cljs/repl.clj#L134-L143):

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
clojurescript @ r2014
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:134-143](https://github.com/clojure/clojurescript/blob/r2014/src/clj/cljs/repl.clj#L134-L143)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/default-special-fns` @ crossclj](http://crossclj.info/fun/cljs.repl/default-special-fns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/default-special-fns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "default-special-fns",
 :type "var",
 :source {:code "(def default-special-fns\n  (let [load-file-fn (fn [repl-env file] (load-file repl-env file))]\n    {'in-ns (fn [_ quoted-ns]\n              (let [ns-name (second quoted-ns)]\n                (when-not (ana/get-namespace ns-name)\n                  (swap! env/*compiler* update-in [::ana/namespaces ns-name] {:name ns-name}))\n                (set! ana/*cljs-ns* ns-name)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace (fn [repl-env ns] (load-namespace repl-env ns))}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/clj/cljs/repl.clj",
          :lines [134 143]},
 :full-name "cljs.repl/default-special-fns",
 :full-name-encode "cljs.repl/default-special-fns",
 :history [["+" "0.0-993"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/default-special-fns"]))
```

-->
