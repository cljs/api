## cljs.repl.nashorn/repl-env\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3030"><img valign="middle" alt="[+] 0.0-3030" title="Added in 0.0-3030" src="https://img.shields.io/badge/+-0.0--3030-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-env\*__ {:keys \[debug\], :as opts})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/nashorn.clj#L219-L223):

```clj
(defn repl-env* [{:keys [debug] :as opts}]
  (let [engine (create-engine opts)]
    (merge
      (NashornEnv. engine debug)
      opts)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:219-223](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl/nashorn.clj#L219-L223)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/repl-env*` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/repl-env*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/repl-envSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "repl-env*",
 :type "function",
 :signature ["[{:keys [debug], :as opts}]"],
 :source {:code "(defn repl-env* [{:keys [debug] :as opts}]\n  (let [engine (create-engine opts)]\n    (merge\n      (NashornEnv. engine debug)\n      opts)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [219 223]},
 :full-name "cljs.repl.nashorn/repl-env*",
 :full-name-encode "cljs.repl.nashorn/repl-envSTAR",
 :history [["+" "0.0-3030"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/repl-env*"]))
```

-->
