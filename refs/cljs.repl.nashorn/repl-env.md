## cljs.repl.nashorn/repl-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env__ & {debug :debug, :as opts})<br>
</samp>

---





Source docstring:

```
Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript and as the
:repl-env argument to piggieback/cljs-repl. Opts has the following extra parameters:

:output-dir  the directory of the compiled files, e.g. "resources/public/my-app" (mandatory).
:output-to   load this file initially into Nashorn, relative to output-dir.
             Use a minimal bootstrapped cljs.core environment if not specified.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/nashorn.clj#L161-L173):

```clj
(defn repl-env 
  [& {debug :debug :as opts}]
  (let [engine (create-engine)
        compiler-env (env/default-compiler-env)]
    (merge (NashornEnv. engine debug)
      {:cljs.env/compiler compiler-env}  ; required by cider middleware ?
      opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2816
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:161-173](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/nashorn.clj#L161-L173)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/repl-env` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/repl-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/repl-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-env",
 :signature ["[& {debug :debug, :as opts}]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl.nashorn/repl-env",
 :source {:code "(defn repl-env \n  [& {debug :debug :as opts}]\n  (let [engine (create-engine)\n        compiler-env (env/default-compiler-env)]\n    (merge (NashornEnv. engine debug)\n      {:cljs.env/compiler compiler-env}  ; required by cider middleware ?\n      opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [161 173]},
 :full-name "cljs.repl.nashorn/repl-env",
 :docstring "Create a Nashorn repl-env for use with the repl/repl* method in Clojurescript and as the\n:repl-env argument to piggieback/cljs-repl. Opts has the following extra parameters:\n\n:output-dir  the directory of the compiled files, e.g. \"resources/public/my-app\" (mandatory).\n:output-to   load this file initially into Nashorn, relative to output-dir.\n             Use a minimal bootstrapped cljs.core environment if not specified."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-env"]))
```

-->
