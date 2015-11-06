## cljs.repl.browser/repl-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env__ & {:as opts})<br>
</samp>

---





Source docstring:

```
Create a browser-connected REPL environment.

Options:

port:           The port on which the REPL server will run. Defaults to 9000.
working-dir:    The directory where the compiled REPL client JavaScript will
                be stored. Defaults to ".repl".
serve-static:   Should the REPL server attempt to serve static content?
                Defaults to true.
static-dir:     List of directories to search for static content. Defaults to
                ["." "out/"].
preloaded-libs: List of namespaces that should not be sent from the REPL server
                to the browser. This may be required if the browser is already
                loading code and reloading it would cause a problem.
optimizations:  The level of optimization to use when compiling the client
                end of the REPL. Defaults to :simple.

```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L347-L380):

```clj
(defn repl-env
  [& {:as opts}]
  (let [opts (merge {:port          9000
                     :optimizations :simple
                     :working-dir   ".repl"
                     :serve-static  true
                     :static-dir    ["." "out/"]
                     :preloaded-libs   []}
                    opts)]
    (do (reset! preloaded-libs (set (concat (always-preload) (map str (:preloaded-libs opts)))))
        (reset! loaded-libs @preloaded-libs)
        (swap! server-state
               (fn [old] (assoc old :client-js
                               (future (create-client-js-file
                                        opts
                                        (io/file (:working-dir opts) "client.js"))))))
        opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:347-380](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L347-L380)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/repl-env` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/repl-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/repl-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "repl-env",
 :signature ["[& {:as opts}]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/repl-env",
 :source {:code "(defn repl-env\n  [& {:as opts}]\n  (let [opts (merge {:port          9000\n                     :optimizations :simple\n                     :working-dir   \".repl\"\n                     :serve-static  true\n                     :static-dir    [\".\" \"out/\"]\n                     :preloaded-libs   []}\n                    opts)]\n    (do (reset! preloaded-libs (set (concat (always-preload) (map str (:preloaded-libs opts)))))\n        (reset! loaded-libs @preloaded-libs)\n        (swap! server-state\n               (fn [old] (assoc old :client-js\n                               (future (create-client-js-file\n                                        opts\n                                        (io/file (:working-dir opts) \"client.js\"))))))\n        opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [347 380]},
 :full-name "cljs.repl.browser/repl-env",
 :docstring "Create a browser-connected REPL environment.\n\nOptions:\n\nport:           The port on which the REPL server will run. Defaults to 9000.\nworking-dir:    The directory where the compiled REPL client JavaScript will\n                be stored. Defaults to \".repl\".\nserve-static:   Should the REPL server attempt to serve static content?\n                Defaults to true.\nstatic-dir:     List of directories to search for static content. Defaults to\n                [\".\" \"out/\"].\npreloaded-libs: List of namespaces that should not be sent from the REPL server\n                to the browser. This may be required if the browser is already\n                loading code and reloading it would cause a problem.\noptimizations:  The level of optimization to use when compiling the client\n                end of the REPL. Defaults to :simple.\n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/repl-env"]))
```

-->
